package org.hangman.game;


public class Word {


    private final String[] wordArray = new String[]{"Rocket", "Wisdom", "Marvel", "Impact", "Tunnel", "Spirit", "Guitar", "Camera", "Window", "Purple",
                "Anchor", "Castle", "Banana", "Silver", "Pillow", "Pocket", "Forest", "Bumble", "Potato", "Orange",
                "Circle", "Candle", "Cookie", "Coffee", "Dragon", "Planet", "Socket", "Purple", "Bottle", "Cheese"};


    protected String getRandomWord() {
        int lengthOfWordsArray = wordArray.length;
        double randomDoubleNumber = Math.random();
        int arrayIndex = (int) (randomDoubleNumber * lengthOfWordsArray);
        return wordArray[arrayIndex];
    }
}
