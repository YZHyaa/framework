package com.yzh.demo.myproxy;

import com.yzh.demo.Customer;
import com.yzh.demo.Person;

public class MyProxyTest {

    public static void main(String[] args) {
        try {
			Person obj = (Person)new MyMeipo().getInstance(new Customer());
			obj.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
