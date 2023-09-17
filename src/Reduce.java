public class Reduce {

    public static void main(String[] args) {

        int count = 1;
        int i = 100;

        while(i != 0){

            if(i % 2 == 0){
                i /= 2;

            } else{

                i -= 1;
            }
            count++;
        }
        System.out.println("The number of steps need to take to reduce to 0 is: " +count);
    }
}
