package org.artrac.training;

//zero ai, cale moje (wiem widac)

public class Training {

    static int number = 1;

    public static void main(String[] args){
        System.out.println("testowa liczba pierwsza:");
        System.out.println(isPrime(7));

        System.out.println("dziesiec kolejnych liczb pierwszych");

        for (int i = 0; i < 10;){
            if (isPrime(number)){
                System.out.println(number);
                i++;
            }
            number++;
        }

    }

    static boolean isPrime(int number) {
        for(int i = 1; i <= number; i++){
            if (number % i == 0 && i != number && i != 1){
                return false;
            } else if(number == 1) {
                return false;
            } else if (i == number && number / i == 1){
                return true;
            }
        }
        //fallback
        return false;
    }

}
