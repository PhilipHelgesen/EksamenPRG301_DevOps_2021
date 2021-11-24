package com.pgr301.exam;

import com.pgr301.exam.model.Account;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class AccountTest {

    @Test
    public void testGetAccount(){
        Account account = new Account();
        assertEquals(account.getCurrency(), "NOK");
    }

    @Test
    public void testGetBalance(){
        Account account = new Account();
        assertEquals(account.getBalance(), BigDecimal.valueOf(0));
    }
}
