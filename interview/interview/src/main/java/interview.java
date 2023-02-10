public class interview {

    public static void main(String[] args) {
        fizzBuzzLow();
    }

    // count from 1 to 00
    // each line pint the number
    // right of the number  print fizz if three
    // buzz if five
    // fizzbuzz if both

    public static void fizzBuzz(){
        for(int i = 1; i <= 100 ; i++){
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            if( fizz && buzz){
                System.out.println(i + " FizzBuzz");
            } else if(fizz){
                System.out.println(i + " Fizz");
            } else if (buzz){
                System.out.println(i + " Buzz");
            } else{
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzzLow(){
        int fizzNum = 3;
        int buzzNum = 5;

        for(int i = 1; i <= 100 ; i++){

            if(i == fizzNum && i == buzzNum ){
                System.out.println(i + " FizzBuzz");
                fizzNum = fizzNum + 3;
                buzzNum = buzzNum + 5;
            } else if (i == fizzNum){
                System.out.println(i + " Fizz");
                fizzNum = fizzNum + 3;
            } else if(i == buzzNum){
                System.out.println(i + " Buzz");
                buzzNum = buzzNum + 5;
            } else{
                System.out.println(i);
            }

        }
    }
}
