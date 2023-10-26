package com.qa;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        lambdaExample();
    }

    public static void lambdaExample() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

//        add lambda expression
        arrayList.forEach(n -> System.out.println(n));
    }
}
