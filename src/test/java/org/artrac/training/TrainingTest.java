package org.artrac.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrainingTest {

    @Test
    void isPrimeTestNegOne(){
        Training training = new Training();
        boolean result = Training.isPrime(-1);

        Assertions.assertEquals(false, result);
    }

    @Test
    void isPrimeTestZero(){
        Training training = new Training();
        boolean result = Training.isPrime(0);

        Assertions.assertEquals(false, result);
    }

    @Test
    void isPrimeTestPosOne(){
        Training training = new Training();
        boolean result = Training.isPrime(1);

        Assertions.assertEquals(false, result);
    }

    @Test
    void isPrimeTestEleven(){
        Training training = new Training();
        boolean result = Training.isPrime(11);

        Assertions.assertEquals(true, result);
    }

    @Test
    void isPrimeTestFiveMilOne(){
        Training training = new Training();
        boolean result = Training.isPrime(50000001);

        Assertions.assertEquals(false, result);
    }

}