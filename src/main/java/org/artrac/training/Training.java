package org.artrac.training;

//zrobilem caly kod na swiezo jak co
//podejrzanie proste to cwiczenie tak szczerze, tu nawet nie ma co debugowac

public class Training {

    public static void main(String[] args){

        double number = 1.5d;

        //przykladowy output, nie debug
        if(isPositive(number)){
            System.out.println("liczba wynosi " + number + " i jest dodatnia");
        } else {
            System.out.println("liczba wynosi " + number + " i jest ujemna");
        }

    }

    public static boolean isPositive(double number){
        return number>0;

        /*specjalnie jest to napisane tak, zeby pytaniem bylo "czy jest dodatnie".
        zrobilem tak poniewaz 1. pytanie jest o sprawdzenie czy jest dodatnie i 2. zero nie jest zadnym
        wiec musialbym jako string returnowac zeby miec trzy odpowiedzi */
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
