package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] alphabet = arrayABC();
        int index = indexOfWinningLetter();
        String winningLetter = alphabet[index];
        System.out.println(winningLetter);
        restart(alphabet,index);
    }

    public static String[] arrayABC() {
        String[] ABC = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        return ABC;
    }

    public static int indexOfWinningLetter() {
        int r = (int) (Math.random() * 26);
        int i = r;
        return i;
    }

    public static String enter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        return scanner.next();
    }

    public static int indexOfLetterFromUser(String letterFromUser, String[] alphabet) {
        for (int i = 0; i < alphabet.length; i++) {
            if (letterFromUser.equals(alphabet[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void chek(String letterFromUser, String[] alphabet, int index) {
        int usersIndex = indexOfLetterFromUser(letterFromUser, alphabet);
        if (usersIndex == index) {
            System.out.println("You are win");
        } else if (usersIndex > index) {
            System.out.println("Try once more,the letter above");
            restart(alphabet,index);
        } else if (usersIndex < index&&usersIndex!=-1) {
            System.out.println("Try once more,the letter below");
            restart(alphabet,index);
        } else if (usersIndex == -1) {
            System.out.println("Incorrect symbol, enter a letter");
            restart(alphabet,index);
        }
    }

    public static void restart(String[] alphabet, int index) {
        chek(enter(), alphabet, index);
    }
}