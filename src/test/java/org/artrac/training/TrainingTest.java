package org.artrac.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TrainingTest {

    @ParameterizedTest
    @ValueSource(doubles = {1 , 1.5})
    void isPositiveTest(double number){
        boolean result = Training.isPositive(number);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1, -0.5, 0})
    void isFalseTest(double number){
        boolean result = Training.isPositive(number);
        Assertions.assertFalse(result);
    }

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