package org.hangman.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultsTest {

    Results results = new Results();
    String word = "hangman";



    @Test
    @DisplayName("validate correct lowercase answer is successful")
    void validate_correct_lowercase_answer() {


            char guess = 'a';
            assertTrue(results.validateAnswer(word, guess));


    }

    @Test
    @DisplayName("validate incorrect lowercase answer is successful")
    void validate_incorrect_lowercase_answer() {

        char guess = 'b';
        assertFalse(results.validateAnswer(word, guess));


    }


    @Test
    @DisplayName("validate correct uppercase answer is successful")
    void validate_correct_uppercase_answer() {


        char guess = 'A';
        assertTrue(results.validateAnswer(word, guess));


    }

    @Test
    @DisplayName("validate incorrect uppercase answer is successful")
    void validate_incorrect_uppercase_answer() {


        char guess = 'B';
        assertFalse(results.validateAnswer(word, guess));


    }
}