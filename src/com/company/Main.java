
package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int i =generateRandomAge();

        String weatherOne = weather(i, 3534553);
        System.out.println(weatherOne);


        String weatherTwo = weather(i, 4);
        System.out.println(weatherTwo);

        String weatherThree = weather(i, 20);
        System.out.println(  weatherThree);
        String weatherFour = weather(i, 5);
        System.out.println(weatherFour);
        String weatherFive = weather(i, 0);
        System.out.println(weatherFive);


    }


    public static String weather(int age, int temperature) {

        if (age > 20 && age < 45 || temperature > -20 && temperature < 30) {

            return "Можно идти гулять ";
        } else if (age < 20 || temperature > 0 && temperature < 28) {

            return "Можно идти гять";
        } else if (age > 45 || temperature > -10 && temperature < 25) {

            return "МОжно  гулять";

        } else return "Оставайтесь дома";

    }



    public static int generateRandomAge(){

        Random random=new Random();
        int ages=random.nextInt(100)+2;


        System.out.println("Можно ли идти гулять?");
        System.out.println("-----------------------------------");

        return  ages;
    }

}