package com.company;

import com.sun.imageio.plugins.common.InputStreamAdapter;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffineBeverageWithHook {

    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public boolean coustmerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")) {
            return true;
        }
        else {
            return false;
        }

    }

    public String getUserInput() {
        String answer = null;

        System.out.println("Would u like milk and sugar with coffee");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error tring to read your answer");
        }

        if(answer == null)
            return "no";

        return answer;
    }
}


