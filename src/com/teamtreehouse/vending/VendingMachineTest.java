package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by avine on 03-Sep-16.
 */
public class VendingMachineTest {

    VendingMachine vendingMachine;

    @Before
    public void setUp() throws Exception {
        Notifier notifier = new NotifierSub();
        vendingMachine = new VendingMachine(notifier, 10, 10, 10);
        vendingMachine.restock("B1", "Doritos", 10, 50, 60);
    }

    @Test
    public void ProperVendWhenPossible() throws Exception {
        vendingMachine.addMoney(100);
        Item item = vendingMachine.vend("B1");
        assertEquals("B1", item);
    }

    public class NotifierSub implements Notifier {

        @Override
        public void onSale(Item item) {
            return;
        }
    }
}