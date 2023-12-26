package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void amountZero (){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        assertEquals(1000, service.remain(amount) );
    }
    @Test
    public void amountOne (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        assertEquals(999, service.remain(amount) );
    }

    @Test
    public void amountNineHundredNinetyNine (){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        assertEquals(1, service.remain(amount));


    }
    @Test
    public void amountOneThousand (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        assertEquals(0, service.remain(amount));
    }

    @Test
    public void amountOneThousandOne (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        assertEquals(0, service.remain(amount));
    }


}