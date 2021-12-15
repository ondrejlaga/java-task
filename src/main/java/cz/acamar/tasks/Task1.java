package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        //when input is null return 0
        if (str==null) {
            return 0;
        }

        //when no words return 0
        String[] wordArray = str.split("\\s+");
        if (wordArray.length == 0) {
            return 0;
        }

        //return length of the last word
        String lastWord = wordArray[wordArray.length - 1];
        return lastWord.length();
    }
}
