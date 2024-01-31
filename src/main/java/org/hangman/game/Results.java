package org.hangman.game;

public class Results {

    protected boolean validateAnswer(String word, char guess) {

        for (int i = 0; i < word.length(); i++) {

            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(guess)) {
                return true;
            }
        }
        return false;

    }

    protected void updateUnderscores(String word, char[] placeholders, char guess) {

        for (int i = 0; i < word.length(); i++) {

            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(guess)) {
                placeholders[i] = guess;
            }
        }
    }


    protected void printUnderscores(char[] placeholders) {
        for (char placeholder : placeholders) {
            System.out.print(" " + placeholder);
        }
        System.out.print("\n");
    }


    protected void printMisses(char[] misses) {
        for (char miss : misses) {
            System.out.print(miss);
        }
    }

}
