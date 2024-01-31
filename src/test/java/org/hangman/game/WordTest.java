package org.hangman.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    Word testWord = new Word();

    @Test
    @DisplayName("checks if generated words are random")
    void getRandomWord() {

      String word1 = testWord.getRandomWord();
        String word2 = testWord.getRandomWord();

        assertNotSame(word1, word2);


    }
}