package com.techprimers.testing;

import org.junit.jupiter.api.*;

class FizzBuzzTest {

    public FizzBuzz fB;

    @BeforeEach
    public void setUp() {
        fB = new FizzBuzz();
    }

    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play();
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }



}