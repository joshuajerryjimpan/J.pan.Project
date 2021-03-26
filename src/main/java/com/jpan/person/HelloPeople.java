package com.jpan.person;

public class HelloPeople {
        String id;
        String name;
        int chinese;
        int english;
        int math;
        public HelloPeople(String id, String name, int chinese, int english, int math){
            this.id = id;
            this.name = name;
            this.chinese = chinese;
            this.english = english;
            this.math = math;
        }
        public void print(){
            System.out.println(id+"\t"+name+"\t"+chinese+"\t"+english+"\t"+math);
        }
    }