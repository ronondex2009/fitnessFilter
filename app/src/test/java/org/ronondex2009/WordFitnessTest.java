package org.ronondex2009;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class WordFitnessTest {
    WordFitness fromSample;
    WordFitness fromFrequencies;

    public WordFitnessTest() throws FileNotFoundException {
        this.fromSample = new WordFitness().FromSample(new Scanner(new File("src/test/resources/testSampleText.txt")));
        this.fromFrequencies = new WordFitness().FromSample(new Scanner(new File("src/test/resources/testSampleText.txt")));
    }

    @Test
    public void testTotalS() throws FileNotFoundException { Assert.assertEquals(17, fromSample.getTotalQuadgrams()); }
    @Test
    public void testTotalF() throws FileNotFoundException { Assert.assertEquals(17, fromFrequencies.getTotalQuadgrams()); }

    @Test
    public void testFitnessS() throws FileNotFoundException { Assert.assertEquals(2.833213344, fromSample.getFitness("sample"), 0.5); }
    @Test
    public void testFitnessF() throws FileNotFoundException { Assert.assertEquals(2.833213344, fromFrequencies.getFitness("sample"), 0.5); }

    @Test
    public void testFromSampleTextEqualsFromFrequencies() throws FileNotFoundException {
        Assert.assertEquals(fromFrequencies.getQuadgramAppearances().equals(fromSample.getQuadgramAppearances()), true);
    }
}
