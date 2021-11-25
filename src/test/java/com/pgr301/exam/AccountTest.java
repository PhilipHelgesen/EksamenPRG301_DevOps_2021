package com.pgr301.exam;

import com.pgr301.exam.model.Account;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class AccountTest {

    @Test
    public void testGetAccount(){
        Account account = new Account();
        assertNotNull(account);
    }

    @Test
    public void testGetBalance(){
        Account account = new Account();
        assertEquals(account.getBalance(), BigDecimal.valueOf(0));
    }

    @Test
    public void testChangeBalance(){
        Account account = new Account();
        BigDecimal newBalance = BigDecimal.valueOf(2000);
        account.setBalance(newBalance);
        assertEquals(account.getBalance(), newBalance);
    }
}
