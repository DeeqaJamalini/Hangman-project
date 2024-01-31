package org.hangman.game;

import java.util.Arrays;
import java.util.Scanner;

public class Game {






    public void startGame() {
       Results results = new Results();
        Scanner scan = new Scanner(System.in);

        String[] hangmanDrawing = new Drawing().getHangmanDrawing();

        String word = new Word().getRandomWord();

        char[] underscores = new char[word.length()];
        Arrays.fill(underscores, '_');

        int lives = 0;

        char[] missedGuesses = new char[8];

        while (lives < 8) {
            System.out.print(hangmanDrawing[lives]);

            System.out.print("Word:   ");
            results.printUnderscores(underscores);
            System.out.print("\n");

            System.out.print("Misses:   ");
            results.printMisses(missedGuesses);
            System.out.print("\n\n");

            System.out.print("Guess:   ");
            String guessStr = scan.nextLine();

            if (guessStr.length() != 1 || !Character.isLetter(guessStr.charAt(0))) {
                System.out.println("Enter only a single letter");
                continue;
            }
            char guess = guessStr.charAt(0);
            System.out.print("\n");

            if (results.validateAnswer(word, guess)) {
                results.updateUnderscores(word, underscores, guess);
            } else {
                missedGuesses[lives] = guess;
                lives++;
            }

            if (Arrays.equals(underscores, word.toCharArray())) {
                System.out.print(hangmanDrawing[lives]);
                System.out.print("\nWord:   ");
                results.printUnderscores(underscores);
                System.out.println("\nWell done! You guessed it!");
                break;
            }
        }

        if (lives == 8) {
            System.out.print(hangmanDrawing[8]);
            System.out.println("\nYou were hanged :(");
            System.out.println("\nThe correct word was: " + word + " ");
        }
        scan.close();
    }




}
