package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner kbin = new Scanner(System.in);
        System.out.println("Please enter which type of data you will input (RGB, HTML, HEX)");
        String type = kbin.nextLine();
        System.out.println("Please enter the type of data associated with your parameter");
        String value = kbin.nextLine();
        if(type.equalsIgnoreCase("RGB")){


        }
        else if (type.equalsIgnoreCase("HTML")){


        }
        else if (type.equalsIgnoreCase("HEX")){

        }
        else
            System.out.println("Sorry, thats an incorrect input");
    }
}