package org.example.task2;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
        processText();
    }

    private void processText() {
        numberOfVowels = 0;
        numberOfConsonants = 0;
        numberOfLetters = 0;
        numberOfSentences = 0;
        longestWord = "";

        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                numberOfLetters++;
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    numberOfVowels++;
                } else {
                    numberOfConsonants++;
                }
            } else if (".!?".indexOf(c) != -1) {
                numberOfSentences++;
            }
        }
    }

    public String getFileName() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfVowels() {
        return numberOfVowels;
    }

    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public int getNumberOfSentences() {
        return numberOfSentences;
    }

    public String getLongestWord() {
        return longestWord;
    }

    @Override
    public String toString() {
        return "TextData{" +
                "fileName='" + fileName + '\'' +
                ", numberOfVowels=" + numberOfVowels +
                ", numberOfConsonants=" + numberOfConsonants +
                ", numberOfLetters=" + numberOfLetters +
                ", numberOfSentences=" + numberOfSentences +
                ", longestWord='" + longestWord + '\'' +
                '}';
    }
}

