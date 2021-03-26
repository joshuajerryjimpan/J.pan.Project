package com.jpan.person;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        int[] scores = {50, 80, 35, 90};
        int[] grades = new int[5];
        HelloPeople[] students = {
                new HelloPeople("0209", "Yunyeh", 70, 90, 80),
                new HelloPeople("2002", "Angle", 60, 100, 100),
                new HelloPeople("1124", "Jpan", 100, 90, 50),
                new HelloPeople("2001", "Joshua", 90, 80, 70),
        };
        for(int i=0; i<students.length; i++){
            students[i].print();
        }
    }
}
