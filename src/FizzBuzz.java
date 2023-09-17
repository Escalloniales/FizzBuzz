/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main() {

        for (int i = 1; i < 100; i++) {

            doFizzBuzz(i);
        }
    }

    private static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}

class FizzBuzz2 {
    public static void main(String[] args) {

        int i = 1;

        while (i < 100) {
            boolean d3 = i % 3 == 0;
            boolean d5 = i % 5 == 0;

            if (d3 && d5) {

                System.out.println("Fizz Buzz");

            } else if (d3) {

                System.out.println("Fizz");

            } else if (d5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);
            }
            
            i++;

        }
    }
}