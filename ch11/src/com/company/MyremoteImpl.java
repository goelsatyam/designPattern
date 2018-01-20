package com.company;

import com.sun.org.apache.regexp.internal.RE;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;

public class MyremoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionID = 1L;

    public String sayHello() {
        return "Server say Hello";
    }

    public MyremoteImpl() throws RemoteException {}

    public static void main(String[] args){
        try {
            MyRemote service = new MyremoteImpl();
            Naming.rebind("//localhost/RmiServer", service);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
