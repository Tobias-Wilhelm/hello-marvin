package com.company.Events;

import com.company.Character.Hero.*;
import com.company.Environment.Board;
import com.nivram.Console.Input;

public class ProfessionEvent extends Event
{
    private Board boardTemp;

    public ProfessionEvent(Hero hero, Board board)
    {
        super(hero);
        boardTemp=board;
    }

    public void start(int clearedDungeonRooms)
    {
        String text = ("Choose your fighter:" +
                "\n1. Warrior" +
                "\n2. Mage" +
                "\n3. Thief");
        Runnable[] choices = new Runnable[]{this::chooseWarrior, this::chooseMage, this::chooseThief};

        Input.choiceSwitch(text, choices, this::chooseLooser);
    }

    private void chooseWarrior()
    {
        boardTemp.hero = new Warrior(AttributeConfig.warrior);
    }

    private void chooseMage()
    {
        boardTemp.hero = new Mage(AttributeConfig.mage);
    }

    private void chooseThief()
    {
        boardTemp.hero = new Thief(AttributeConfig.thief);
    }

    private void chooseLooser()
    {
        boardTemp.hero = new Looser(AttributeConfig.looser);
    }
}
