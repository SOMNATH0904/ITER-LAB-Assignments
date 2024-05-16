/**
 * Ques 10 : Write a Java program that processes a batch of images concurrently using multiple threads.
Each thread should apply a specific image processing operation (e.g., resizing, filtering) to its
assigned image. Use a thread pool to manage the execution of image processing tasks. Ensure that
each image is processed only once by a single thread to avoid duplication or conflicts.
 */

/**
 * Input and Output files are missing. Once, Updated will give the correct output of this. Till then, wait for the files to get upload in this directory.
 * Don't try to run, as the input and output files are missing.
 */

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

public class Q10 {
    public static void main(String[] args) {
        String inputDir = "input_images";
        String outputDir = "output_images";

        File outputDirFile = new File(outputDir);
        if (!outputDirFile.exists()) {
            outputDirFile.mkdirs();
        }

        File dir = new File(inputDir);
        if (!dir.exists() || !dir.isDirectory()) {
            System.err.println("The input directory does not exist or is not a directory.");
            return;
        }

        File[] imageFiles = dir.listFiles((d, name) -> name.endsWith(".jpg") || name.endsWith(".png"));
        if (imageFiles == null || imageFiles.length == 0) {
            System.err.println("No image files found in the input directory.");
            return;
        }

        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        for (File imageFile : imageFiles) {
            executorService.submit(new ImageProcessingTask(imageFile, outputDir));
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ImageProcessingTask implements Runnable {
    private File imageFile;
    private String outputDir;

    public ImageProcessingTask(File imageFile, String outputDir) {
        this.imageFile = imageFile;
        this.outputDir = outputDir;
    }

    @Override
    public void run() {
        try {
            BufferedImage inputImage = ImageIO.read(imageFile);
            BufferedImage outputImage = resizeImage(inputImage, 200, 200);

            File outputImageFile = new File(outputDir, imageFile.getName());
            ImageIO.write(outputImage, "jpg", outputImageFile);

            System.out.println("Processed: " + imageFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, originalImage.getType());
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        g.dispose();
        return resizedImage;
    }
}
