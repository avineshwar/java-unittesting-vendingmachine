package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.IllegalFormatCodePointException;

import static org.junit.Assert.*;

/**
 * Created by avine on 03-Sep-16.
 */
public class BinTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    private Bin bin;

    @Before
    public void setUp() throws Exception {
        bin = new Bin(20);
    }

    @Test
    public void getItemPrice() throws Exception {
        assertEquals(0, bin.getItemPrice());
    }

    @Test
    //"(expected = IllegalArgumentException.class)" is replace by the rule annotation.
    public void restock() throws Exception {
        // This is used over the previously used (commented above) testing methodology because the message about array overload is being dynamically generated and this serves better for dynamic catching of that.
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("There are only 20 spots left");

        bin.restock("Doritos", 5000, 50, 60);
    }

}