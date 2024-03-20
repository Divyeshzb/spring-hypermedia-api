package com.baeldung.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CartIsPurchasedTest {

    private Cart cart;

    @Before
    public void setUp() throws Exception {
        cart = new Cart();
    }

    @Test
    public void testIsPurchasedReturnsTrueOnPurchase() {
        cart.setPurchased(true);

        boolean result = cart.isPurchased();

        assertTrue(result);
    }

    @Test
    public void testIsPurchasedReturnsFalseOnNonPurchase() {
        cart.setPurchased(false);

        boolean result = cart.isPurchased();

        assertFalse(result);
    }

    @Test
    public void testIsPurchasedReturnsLastSetValue() {
        cart.setPurchased(true);
        cart.setPurchased(false);
        cart.setPurchased(true);

        boolean result = cart.isPurchased();

        assertTrue(result);
    }
}
