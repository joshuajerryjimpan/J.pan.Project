package com.jpan.cust;

import com.jpan.stud.Student;

public class Customer {
    String id;
    String name;
    int amount;
    public Customer(String id, String name, int amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
    public int total() {
        return amount;
    }
    public void print(){
        System.out.println(id+"\t"+name+"\t"+amount);
    }
}