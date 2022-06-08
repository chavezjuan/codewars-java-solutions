package com.javasolutions.codewars.codewars;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class DataReverseTest {

    public void should_reverseData_WithSuccess(){
        assertAll(
                "Reverse number verification",
                () -> assertArrayEquals(
                        new int[]{1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1},
                        DataReverse.DataReverse(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0}),
                        "It's not the reversed data"
                )
        );
    }
}
