import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача №1");
        int age = 19;
        if (age >= 21) {
            System.out.println("если возраст человека " + age + " годиков, он совершеннолетний");
        } else {
            System.out.printf(" если возраст человека " + age + " годиков, то он недостиг совершеннолетия, нужно немного подождать ");
        }
        ;
        System.out.println();
        int temp = 7;
        System.out.println("Задача №2");
        if (temp <= 5) {
            System.out.println("  на улице " + temp + " градусов, нужно надеть шапку ");
        } else {
            System.out.println(" на улице " + temp + " градусов, можно идти без шапки");
        }
        ;
        System.out.println(" Задача №3");
        int speed = 70;
        if (speed >= 60) {
            System.out.println(" Если скорость " + speed + " км/ч, то придется заплатить штраф ");
        } else {
            System.out.println(" если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        ;
        System.out.println(" Задача 4");
        int age1 = 25;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println(" если человеку " + age1 + " годиков, то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println(" если человеку " + age1 + " годиков, то он школьник ");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println(" если человеку " + age1 + " года, то он студент");
        }
        if (age1 > 24) {
            System.out.println(" если человеку " + age1 + " лет, то он работает ");
        }
        ;
        System.out.println("  Задача №5");
        int age2 = 19;
        if (age2 < 5) {
            System.out.println("Если ребенку меньше " + age2 + " лет, то он не может кататься на атракционе ");
        }
        if (age2 > 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " лет, то он может кататься только в сопровождении взрослого ");
        }
        if (age2 > 14) {
            System.out.println(" если возраст ребенка " + age2 + " лет, то ему уже нечего делать на атракцонах");
        }
        ;
        System.out.println("Задача №6 ");
        int standPassengers = 42;
        int seatPassengers = 60;
        int totalLoad = 102;
        int seatPlace = 60;
        int standRoom = totalLoad - seatPlace;
        System.out.println( " Стоячих мест в вагоне " + standRoom + " места");
        int freeSeatsSold = seatPlace - seatPassengers;
        if (seatPlace > seatPassengers ){
            System.out.println( " Если продано мест " + seatPassengers + " то сидячих мест в вагоне осталось " + freeSeatsSold);
        }
        int freeStandingSeatsSold = standRoom - standPassengers;
        if (standRoom > standPassengers){
            System.out.println( " если продано стоячих мест " + standPassengers + " то стоячих мест в вагоне осталось " + freeStandingSeatsSold);
        }
        if (freeSeatsSold==0 && freeStandingSeatsSold == 0){
            System.out.println( "в вагоне мест нет " );
        }else{
            if ( freeSeatsSold > 0){
                System.out.println( "сидячих мест в вагоне осталось " + freeSeatsSold + " мест " );
            }
            if ( freeStandingSeatsSold > 0){
                System.out.println( "стоячих мест в вагоне осталось " + freeStandingSeatsSold + " мест ");
            }
        }
        ;
        System.out.println( " задача №7");
        int one = 3;
        int two = 2;
        int three = 1;
        int max;
        if (one >= two){
            max = one;
        } else {
            max = two;
        }
        if ( three >= max ){
            max = three;

        }
        System.out.println( "максимально число = " + max );










    }

}
















