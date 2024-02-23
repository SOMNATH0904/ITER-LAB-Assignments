//In this Question for the number of characters we have to use that much number of loops(i.e. if we are giving input as three characters then we have to use three loops for that)

public class Q4 {

    public static void main(String[] args) {

        char[] c = {'C','A','R'};
        int count = 0;
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c.length; j++) {
                for(int k = 0; k < c.length; k++) {
                    if((i != j) && (i != k) && (j != k)) {
                        System.out.println(c[i]+" "+c[j]+" "+c[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println(count+" possibilities are found.");
    }

}