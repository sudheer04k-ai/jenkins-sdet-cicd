package tests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class FlakyTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void flakyTest() {

        boolean pass = new Random().nextBoolean();

        System.out.println("Flaky test result: " + pass);

        Assert.assertTrue(
                pass,
                "Intentional flaky test failure for CI analytics"
        );
    }
}