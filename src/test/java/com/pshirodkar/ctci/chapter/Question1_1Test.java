package com.pshirodkar.ctci.chapter;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Unit tests for the class {@link Question1_1}.
 *
 * @author pshirodkar
 */
@Test
public class Question1_1Test {

    private Question1_1 question1_1;

    @BeforeMethod
    public void setUp() throws Exception {
        question1_1 = new Question1_1();
    }

    @Test(dataProvider = "getValidInput")
    public void testHasUniqueCharacters(String s, boolean expectedUnique) throws Exception {

        assertEquals(question1_1.hasUniqueCharacters(s), expectedUnique);
    }

    @Test(dataProvider = "getInvalidInput", expectedExceptions = IllegalArgumentException.class)
    public void testInvalidInput(String s) {
        question1_1.hasUniqueCharacters(s);
    }

    @DataProvider(name = "getInvalidInput")
    private Object[][] getInvalidInput() {
        return new Object[][]{
                {null},
                {""}
        };
    }

    @DataProvider(name = "getValidInput")
    private Object[][] getValidInput() {
        return new Object[][]{
                {"a", true},
                {"abc", true},
                {"asbca", false},
                {RandomStringUtils.random(Question1_1.DEFAULT_CHARACTER_SET_LENGTH + 1), false}
        };
    }
}