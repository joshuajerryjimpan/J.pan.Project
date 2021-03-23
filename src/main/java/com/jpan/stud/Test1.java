package com.jpan.stud;

public class Test1 {
    public static void main(String[] args){
        Student stud = new Student("1124", "Jpan", 90, 70, 60);
        stud.print();
        GrduateStudent gstu = new GrduateStudent("0209", "Yunyeh", 80, 90, 70, 100);
        gstu.print();
    }
}
