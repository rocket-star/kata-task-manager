package com.company.tests;

import com.company.fake.FakeIHM;
import org.junit.Before;
import org.junit.Test;


import static org.testng.AssertJUnit.assertEquals;

public class IHMTests {
    private FakeIHM fakeIHM;

    @Before
    public void before() throws Exception {
        fakeIHM = new FakeIHM();
    }

    @Test
    public void testInput() throws Exception {
        String input = "+ Learn Python";
        fakeIHM.write(input);
        assertEquals("+ Learn Python", fakeIHM.getPrintedWords().get(0));
    }
}
