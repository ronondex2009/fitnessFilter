package org.ronondex2009;

import java.util.Scanner;

/**
 * Main entry point. Command-Line interface, and driver.
 * @author Ronan Kai Guin Adkins
 */
public class App {
    /*private void helpMessage() {
        System.out.println("Usage: fitnessFilter "); // TODO complete
    }*/

    public static void main(String[] args) {
        // parse input arguments
        // TODO add arguments and help message
        double fitnessThreshold = 14.0d;

        WordFitness wordFitness;
        wordFitness = new WordFitness().FromQuadgramFrequencies();

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                if (wordFitness.getFitness(nextLine) < fitnessThreshold) {
                    System.out.println(nextLine);
                }
            }
        }
    }
}
