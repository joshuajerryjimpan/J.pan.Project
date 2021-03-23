package com.jpan.cust;

public class Test2 {
    public static void main(String[] args){
        Customer cust = new Customer("1124", "Jpan", 111240);
        cust.print();
        VipCustomer vip = new VipCustomer("0209", "Yunyeh", 2090);
        vip.print();
    }
}
