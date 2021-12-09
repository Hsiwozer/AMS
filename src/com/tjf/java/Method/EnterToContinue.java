package com.tjf.java.Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterToContinue {
    public void enterToContinue() throws IOException {
        System.out.println("按回车键继续...");
        new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}
