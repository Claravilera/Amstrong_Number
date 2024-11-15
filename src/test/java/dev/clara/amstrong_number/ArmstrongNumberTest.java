package dev.clara.amstrong_number;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArmstrongNumberTest {
    @Test
    void test371IsAmstrongNumber() {
        AmstrongNumber checker = new AmstrongNumber(371);
        assertTrue(checker.IsAmstrongNumber(), "Number 371 is an Amstrong number.");
    }

    @Test
    void test1634IsAmstrongNumber() {
        
        AmstrongNumber checker = new AmstrongNumber(1634);
        assertTrue(checker.IsAmstrongNumber(), "Number 1634 is an Amstrong number.");
    }

    @Test
    void test351IsAmstrongNumber() {
        AmstrongNumber checker = new AmstrongNumber(351);
        assertFalse(checker.IsAmstrongNumber(), "The number 351 is not an Amstrong number.");
    }

    @Test
    void test2015IsArmStrong() {
        AmstrongNumber checker = new AmstrongNumber(2015);
        assertFalse(checker.IsAmstrongNumber(), "The number 2015 is not an Amstrong number.");
    }
}


    

    