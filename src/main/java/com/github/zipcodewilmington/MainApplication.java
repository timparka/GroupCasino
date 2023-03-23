package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccountManager;

import com.github.zipcodewilmington.casino.games.Klondike;

import java.io.FileNotFoundException;

import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;

import com.github.zipcodewilmington.casino.games.Klondike;

import java.io.FileNotFoundException;



public class MainApplication {
    public static void main(String[] args) throws FileNotFoundException {
        Casino main = new Casino();

        main.read();
    main.mainMenu();


    }
}