package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by avine on 03-Sep-16.
 */
public class AlphaNumericChooserTest {
    private AlphaNumericChooser chooser;

    @Before
    public void setUp() throws Exception {
        chooser = new AlphaNumericChooser(26, 10);
    }

    @Test
    public void ValidInputReturnsProperLocation() throws Exception {
        AlphaNumericChooser.Location location = chooser.locationFromInput("B4");

        assertEquals("Assertion for row", 1, location.getRow());
        assertEquals("Assertion for column", 3, location.getColumn());
    }

    @Test(expected = InvalidLocationException.class)
    public void ChoosingWrongInputIsNotAllowed() throws Exception {
        chooser.locationFromInput("B77");
    }

}