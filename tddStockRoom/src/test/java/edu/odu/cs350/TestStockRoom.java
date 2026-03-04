package edu.odu.cs350;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 * StockRoom test.
 * 
 * Stories:
 *   1. As a stocking clerk, I want to be able to add items that have arrived in a shipment.
 *   2. As a stocking clerk, I want to be able to remove items that have been transferred to the store front.
 *   3. As a stockroom manager, I would like to see a daily report listing kindsof items in stock, # of each item, change
 *        in stock of each item since the last daily report, and the total number of distinct items and total of all 
 *        items in stock.
 */
public class TestStockRoom {
    @Test
    public void DummyTest() {
        assertEquals(2, 1+1);
    }
    
}       