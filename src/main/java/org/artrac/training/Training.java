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
    }

}
