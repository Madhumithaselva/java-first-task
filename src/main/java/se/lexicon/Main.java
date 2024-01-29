package se.lexicon;

public class Main {
    public static void main(String[] args) {
        /*Creating a new String and printing it
        String firstName="Madhumitha";
        System.out.println("Hello "+ firstName);*/


        /*Creating 2 strings and separating it with space delimiter
        String firstName="Madhumitha";
        String lastName="Selvaraj";
        System.out.println("Hello "+ firstName +" "+lastName);*/

        /*Addition of two variables
        int a=15,b=25,c;
        c=a+b;
        System.out.println("Addition of given 2 no.s are "+c);*/

        //Object
        Car
        System.out.println(getCarInformation());
    }
        //Creating a class called car and defining its attributes
        class Car{
            String carBrand="Tesla";
            String regNumber="ABC123";
            String maxSpeed="200kmph";
            String ownerName="Aditya";
            int price=200000;
            int yearModel=2020;

            public String getCarInformation(){
                return carBrand + "\n " +  regNumber + "\n" +maxspeed + "\n" + ownerName + "\n"+price+"\n"+yearModel;
                            }
        }



}