package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithoutHook extends CaffineBeverageWithHook {

    public void brew() {
        System.out.println("Steep tea in boiling water");
    }

    public void addCondiments() {
        System.out.println("Add Lemon");
    }
}

