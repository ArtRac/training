package org.artrac.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class TrainingTest {

    @ParameterizedTest
    @CsvSource({"543, 1234"})
    void twoElementsTest(int x, int y){
        int result = Training.twoElements(x, y);
        Assertions.assertEquals(result, x+y);
    }

    @ParameterizedTest
    @CsvSource({"5, 3, 10, 10"})
    void biggestNumberTest(int x, int y, int z){
        int result = Training.biggestNumber(x, y, z);
        Assertions.assertSame(result, 10);
    }

}