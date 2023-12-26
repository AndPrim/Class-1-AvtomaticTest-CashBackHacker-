package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void amountZero (){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        assertEquals(service.remain(amount), 1000 );
    }
    @Test
    public void amountOne (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        assertEquals(service.remain(amount), 999 );
    }

    @Test
    public void amountNineHundredNinetyNine (){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        assertEquals(service.remain(amount), 1 );


    }
    @Test
    public void amountOneThousand (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        assertEquals(service.remain(amount), 0 );
    }

    @Test
    public void amountOneThousandOne (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        assertEquals(service.remain(amount), 0 );
    }


}