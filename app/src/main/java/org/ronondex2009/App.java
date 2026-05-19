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
        // TODO this later
        double fitnessThreshold = 100;

        WordFitness wordFitness;
        wordFitness = new WordFitness().FromSample();

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextLine()) {
                String nextLine = sc.nextLine();
                if (wordFitness.getFitness(nextLine) < 11.5) {
                    System.out.println(nextLine);
                }
            }
        }
    }
}
