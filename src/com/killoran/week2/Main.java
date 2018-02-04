package com.killoran.week2;

/**
 * Created by MK on 1/22/2018.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Week 2!");
        System.out.println("Week 2 test");

        boolean result = true && true;
        System.out.println("true && true: " + result);

        result = true && false;
        System.out.println("true && false: " + result);

        result = false && true;
        System.out.println("false && true: " + result);

        result = false && false;
        System.out.println("false && false: " + result);


        //The four combinations with logical inclusive OR
        result = true | true;
        System.out.println("true | true: " + result);

        result = true | false;
        System.out.println("true | false: " + result);

        result = false | true;
        System.out.println("false | true: " + result);

        result = false | false;
        System.out.println("false | false: " + result);

    }
}
