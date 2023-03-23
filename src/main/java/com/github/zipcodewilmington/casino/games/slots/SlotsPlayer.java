package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.IGamblerPlayer;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer implements IGamblerPlayer {
    CasinoAccount casinoAccount;

    public SlotsPlayer(CasinoAccount casinoAccount){
        this.casinoAccount = casinoAccount;
    }

    @Override
    public CasinoAccount getCasinoAccount() {
        return this.casinoAccount;
    }
}