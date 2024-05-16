/**
 * Ques 9 : Write a Java program that processes a large text file using multiple threads. Each thread
should read a portion of the file, process it (e.g., count words, find specific patterns), and then
merge the results to get the final output. The program should use a thread-safe data structure (e.g.,
ConcurrentHashMap) to store intermediate results from each thread. Use synchronization
mechanisms to ensure that each thread processes a unique portion of the file.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public class Q09 {
    private static final int NUM_THREADS = 4;

    public static void main(String[] args) {
        String filePath = "D:\\3rd Semester\\_02.FileManagement\\src\\Q9_File.txt";

        ConcurrentHashMap<String, Integer> wordCountMap = new ConcurrentHashMap<>();

        try {
            long fileSize = getFileSize(filePath);
            long portionSize = fileSize / NUM_THREADS;
            Thread[] threads = new Thread[NUM_THREADS];

            for (int i = 0; i < NUM_THREADS; i++) {
                long start = i * portionSize;
                long end = (i == NUM_THREADS - 1) ? fileSize : (i + 1) * portionSize;
                threads[i] = new Thread(new FileProcessor(filePath, start, end, wordCountMap));
                threads[i].start();
            }

            for (Thread thread : threads) {
                thread.join();
            }

            int totalWords = mergeResults(wordCountMap);
            System.out.println("Total words in file: " + totalWords);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long getFileSize(String filePath) throws IOException {
        try (FileReader fileReader = new FileReader(filePath)) {
            return fileReader.skip(Long.MAX_VALUE) + 1;
        }
    }

    static class FileProcessor implements Runnable {
        private String filePath;
        private long start;
        private long end;
        private ConcurrentHashMap<String, Integer> wordCountMap;

        public FileProcessor(String filePath, long start, long end, ConcurrentHashMap<String, Integer> wordCountMap) {
            this.filePath = filePath;
            this.start = start;
            this.end = end;
            this.wordCountMap = wordCountMap;
        }

        @Override
        public void run() {
            try {
                processFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void processFile() throws IOException {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                reader.skip(start);
                long currentPosition = start;

                String line;
                StringBuilder stringBuilder = new StringBuilder();
                while ((line = reader.readLine()) != null && currentPosition < end) {
                    stringBuilder.append(line).append(" ");
                    currentPosition += line.length() + 1;
                }

                String[] words = stringBuilder.toString().split("\\s+");
                for (String word : words) {
                    wordCountMap.merge(word, 1, Integer::sum);
                }
            }
        }
    }

    private static int mergeResults(ConcurrentHashMap<String, Integer> wordCountMap) {
        return wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
    }
}

/**
 * OUTPUT
 *
 * Total words in file: 89
 */