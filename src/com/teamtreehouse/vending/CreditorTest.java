package com.teamtreehouse.vending;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by avine on 03-Sep-16.
 */
public class CreditorTest {

    private Creditor creditor;

    @BeforeMethod
    public void setUp() throws Exception {
        // To minimize the repeating task of creating class objects.

        creditor = new Creditor(); // Arrange.
    }

    @Test
    public void AssertAvailableFunds() throws Exception {

        // IT IS IMPORTANT TO KNOW THAT IT IS CONSIDERED AS A "CODE SMELL" TO GENERALLY WRITE MORE THAN 1 ASSERT IN A TEST (METHOD).

        // Applying the AAA (Arrange, Act, Assert) concept of testing.
        // Arrange - Before anything else, i.e., before anything we can actually do that relates to testing, we need to arrange (like creating object for class, et cetera..).
        // Act - Here, we cause the behaviour that is to be tested, i.e., producing a result/situation/action/etc that should be tested.
        // Assert - Here, we verify that the acted behaviour actually occured.

        creditor.addFunds(22); // Act.
        assertEquals(22, creditor.getAvailableFunds()); // Assert.

    }


    @Test
    public void AssertRefundFunctionality() throws Exception {
        // Apply "AAA" principle, again.

        creditor.addFunds(13);
        int refund = creditor.refund();
        assertEquals(13, refund);

        // It would be even better to check for the current available balance (it should be 0) here, however, it will be considered as code smell.
        // What if the code is simply exiting at test 1 and test isn't happening at all?. So generally, it isn't a good idea at all (in most of the cases).
    }
}