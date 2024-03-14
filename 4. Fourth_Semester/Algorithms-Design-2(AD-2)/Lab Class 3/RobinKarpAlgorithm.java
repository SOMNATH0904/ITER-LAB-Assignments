public class RobinKarpAlgorithm {

    public static int robinkarp(String textIn, String patternIn) {
        char[] text = textIn.toCharArray();
        char[] pattern = patternIn.toCharArray();
        int n = text.length;
        int m = pattern.length;
        int i, j;
        int prime = 101;
        int powm = 1;
        int TextHash = 0, PatternHash= 0;
        if (m == 0 || m > n) {
            return -1;
        }
        for(i=0; i < m-1; i++) {
            powm = (powm << 1) % prime;
        }
        for(i = 0; i < m; i++) {
            PatternHash = ((PatternHash << 1) + pattern[i]) % prime;
            TextHash = ((TextHash << 1) + text[i]) % prime;
        }
        for (i = 0; i <= (n-m); i++) {
            if (TextHash == PatternHash) {
                for( j = 0; j < m; j++) {
                    if (text[i+j] != pattern[j]) {
                        break;
                    }
                }
                if(j == m) return i;
            }
            if(i < n-m)
                TextHash = (((TextHash - text[i] * powm) << 1)+ text[i+m]) % prime;
            if(TextHash < 0) {
                TextHash = (TextHash + prime);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String st1 = "Hello World !";
        String st2 = "World";
        System.out.println("Using Brute Force Search pattern found at index : "+robinkarp(st1, st2));
    }
}
