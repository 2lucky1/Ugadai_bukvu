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

    /**
     * Create alphabet
     * @return array with alphabet
     */
    public static String[] arrayABC() {
        String[] ABC = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        return ABC;
    }

    /**
     * Choose an index of winning letter
     * @return a pseudorandom {@code int} from 0 to 25 which is equivalent of letter index from alphabet
     */
    public static int indexOfWinningLetter() {
        return (int) (Math.random() * 26);
    }

    /**
     * Enter of a letter by user
     */
    public static String enter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        return scanner.next();
    }

    /**
     * Compute the index of the letter from user
     * @param letterFromUser letter which was entered by user
     * @param alphabet array with all letters of alphabet
     * @return index of entered letter (int from 0 to 25) or -1 if user has entered incorrect symbol
     */
    public static int indexOfLetterFromUser(String letterFromUser, String[] alphabet) {
        for (int i = 0; i < alphabet.length; i++) {
            if (letterFromUser.equals(alphabet[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Check user answer and display an appropriate message
     */
    public static void check(String letterFromUser, String[] alphabet, int index) {
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

    /**
     * Restart check method
     */
    public static void restart(String[] alphabet, int index) {
        check(enter(), alphabet, index);
    }
}