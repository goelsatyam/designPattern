package com.company;

import java.rmi.Naming;

public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("//localhost/RmiServer");

            String s = service.sayHello();
            System.out.println(s);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
