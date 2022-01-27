package com.javasolutions.codewars.codewars;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class FilterListTest {
    
    @Test
    @DisplayName("Should remove strings from list with success")
    public void should_removeStrings_WithSuccess(){        
        assertEquals(
                Arrays.asList(1,2),
                FilterList.filterList(Arrays.asList(1, 2, "a", "b")),
                "All strings should be removed");
        assertEquals(Arrays.asList(1,2,0,15), FilterList.filterList(
                Arrays.asList(1, 2, "a", "b", 0, 15)),
                "All strings should be removed");
        assertEquals(Arrays.asList(1, 2, 231), FilterList.filterList(
                Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)),
                "All strings should be removed");
    }

    @Test
    @DisplayName("Should not accept negative integers with success")
    public void shouldNot_acceptNegativeIntegers_WithSuccess() {
        assertNull(FilterList.filterList(Arrays.asList(-1, -2, 3, "a", "b")), "Should be null for negative integers. Not allowed.");
    }

    @Test
    @DisplayName("Should accept only non-negative integers and/or string with success")
    public void should_acceptNonNegativeIntegersAndString_WithSuccess() {
        assertEquals(null, FilterList.filterList(Arrays.asList(true, 2, 3, "a", "b")));
        assertEquals(null, FilterList.filterList(Arrays.asList(4.1, 2, 3, "a", "b")));
        assertEquals(Arrays.asList(2, 3, 9, 7), FilterList.filterList(Arrays.asList(2, 3, 9, 7)));
        assertEquals(Arrays.asList(), FilterList.filterList(Arrays.asList("a", "b")));
    }

    @Test
    @DisplayName("Should accept empty list with success")
    public void should_acceptEmptyList_WithSuccess() {
        assertEquals(Arrays.asList(), FilterList.filterList(Arrays.asList()));
    }


}
