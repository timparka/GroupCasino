package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 7/21/2020.
 */
public class ApplicationRunnerTest {


    @Test
    void deposit() {
        //given
        CasinoAccount hiep = new CasinoAccount("ZipCode", "rocks", 1000);

        //when
        hiep.deposit(500);
        int expected = 1500;

        //then
        Assert.assertEquals(expected, hiep.getBalance());

    }

    @Test
    void getUserName() {
        //given
        CasinoAccount hiep = new CasinoAccount("ZipCode", "rocks", 1000);

        //when

        //then
    }

    @Test
    void getPassword() {
    }

    @Test
    void getAccount() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void setBalance() {
    }

}
