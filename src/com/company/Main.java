package com.company;

public class Main {

    public static void main(String[] args) {
        zadanko();

    }
    public static void zadanko(){

        for (int i = 1; i <=50; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("HelloWorld");
            else if (i % 3 == 0) System.out.println("Hello");
            else if (i % 5 == 0) System.out.println("World");
            else System.out.println(i);
        }



    }
}

