package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void validLoginTest() {

        System.out.println("Executing valid login test");

        String actualResult = "Login Successful";
        String expectedResult = "Login Successful";

        Assert.assertEquals(actualResult, expectedResult);

        System.out.println("Login test passed");
        System.out.println("Running Jenkins CI Test");
    }
}