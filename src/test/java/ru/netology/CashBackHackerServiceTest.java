package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackerServiceTest {
    @Test
    public void testRemainWhenAmountIs900() {
        CashBackHackerService service = new CashBackHackerService();
        int result = service.remain(900);
        Assert.assertEquals(result, 100);
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        CashBackHackerService service = new CashBackHackerService();
        int result = service.remain(1000);
        Assert.assertEquals(result, 0);
    }
}

