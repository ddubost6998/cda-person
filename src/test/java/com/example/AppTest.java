package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AppTest {
    @Test
    public void testConvertToJson() {
        Person person = new Person("damien", "dubost");
        String json = person.convertToJson(person);
        String expectedJson = "{\"firstName\":\"damien\",\"lastName\":\"dubost\"}";
        assertEquals(json, expectedJson);
    }

    @Test
    public void testCapitalizeString() {
        String str = "coucou toi";
        String capitalized = new Person().capitalizeString(str);
        String expected = "Coucou toi";
        assertEquals(capitalized, expected);
    }
}
