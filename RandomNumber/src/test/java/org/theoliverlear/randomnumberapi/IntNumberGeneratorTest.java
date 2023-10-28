package org.theoliverlear.randomnumberapi;

import org.junit.jupiter.api.Test;
import org.theoliverlear.randomnumber.generator.IntNumberGenerator;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntNumberGeneratorTest {
    IntNumberGenerator testIntGen = new IntNumberGenerator();
    @Test
    public void testIntNumberGeneratorMin() {
        this.testIntGen.formulateNumber();
        assertTrue(this.testIntGen.getRandomNumber() >= this.testIntGen.getMin());
    }
    @Test
    public void testIntNumberGeneratorMax() {
        this.testIntGen.formulateNumber();
        assertTrue(this.testIntGen.getRandomNumber() <= this.testIntGen.getMax());
    }
}
