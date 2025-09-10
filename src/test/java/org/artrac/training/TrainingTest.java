package org.artrac.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TrainingTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1, 50000001})
    void isPrimeFalseTest(int number){
        boolean result = Training.isPrime(number);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {11})
    void isPrimeTrueTest(int number){
        boolean result = Training.isPrime(number);
        Assertions.assertTrue(result);
    }

}