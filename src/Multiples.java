public class Multiples {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 1000; i++){
            boolean d3 = i % 3 == 0;
            boolean d5 = i % 5 == 0;

            if (d3 || d5) {

                count++;

            }
        }
        System.out.println("The number of integers below 1000 that are multiples of 3 or 5 is: " + count);
    }
}



