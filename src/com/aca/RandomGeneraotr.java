package com.aca;

import java.util.Scanner;

public class RandomGeneraotr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letter");
        char letter = scanner.nextLine().charAt(0);

        switch (letter) {
            case 'A':
                System.out.println("Vowel");
                break;

            case 'E':
                System.out.println("Vowel");
                break;

            case'I':
                System.out.println("Vowel");
                break;

            case 'O':
                System.out.println("Vowel");
                break;

            case 'U':
                System.out.println("Vowel");
                break;

            case'Y':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Vowel");
                break;


        }
    }

}



