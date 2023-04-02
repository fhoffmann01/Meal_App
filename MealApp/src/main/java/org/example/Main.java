package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        showMenu();
        String userInput = keyboardInput();
        System.out.println("Here is your input: " + userInput);

    }

    public static void showMenu(){
        System.out.println("----------------------------------------\n" +
                "------------------Menu------------------\n"+
                "----------------------------------------\n"+
                "1. Create a meal\n" +
                "2. Query meal\n" +
                "3. Show all meals\n");
        System.out.println("Here is your input: "+ keyboardInput());
    }

    
    public static String keyboardInput(){
        String input="";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            br.close();
        }catch (IOException e) {
            System.out.println("IOException occurred!");;
        }
        return input;
    }
}