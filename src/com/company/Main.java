package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] ABC = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int r = (int) (Math.random() * 26);
//        System.out.print(r + "\t");
//        System.out.println("Poryadkoviy nomer bukvi");
        int i = r;
        System.out.print(ABC[i] + "\t"); //Zagadannoe chislo
        System.out.print("Vipavshaya bukva");
        System.out.println();
        System.out.println("Vvedite bukvu:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);
        if (ABC[i].equals(input)) {
            System.out.println("You are win");
        } else for (int j = 0; j < ABC.length; j++) {
            if (ABC[j].equals(input)) {
                if (j > i) {
                    System.out.println("Try once more,the letter above");
                    break;
                } else if (j < i) {
                    System.out.println("Try once more,the letter below");
                    break;
                }
            }
        }
    }
}