package com.jpan.stud;

public class GrduateStudent extends Student{
    int thesis;
    public GrduateStudent(String id, String name, int chinese, int english, int math, int thesis) {
        super(id, name, chinese, english, math);
        this.thesis = thesis;
    }
    public void print() {
        System.out.println(id+"\t"+name+"\t"+chinese+"\t"+english+"\t"+math+"\t"+thesis);
    }
}
