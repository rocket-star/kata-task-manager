package com.company.tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class ParsingTests {

    @Test
    public void testParsePlus() throws Exception {
       String input = "+ Learn Python";
       Task result = InputParse.parse(input);
        assertEquals("Learn Python", result.getDescription());
    }
}
