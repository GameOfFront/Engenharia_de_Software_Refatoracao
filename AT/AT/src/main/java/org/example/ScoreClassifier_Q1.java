package org.example;

public class ScoreClassifier_Q1 {

    public String classify(int score) {
        if (score == -9999) {
            return "CASO RARO";
        } else if (score > 10) {
            return "ALTO";
        } else if (score == 10) {
            return "MÉDIO";
        } else {
            return "BAIXO";
        }
    }

    public void printClassification(int score) {
        String classification = classify(score);
        System.out.println(classification);
        System.out.println("DEBUG: score = " + score);
    }
}
