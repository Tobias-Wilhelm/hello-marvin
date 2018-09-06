package com.company.Events;

import com.company.Character.Hero.Hero;
import com.company.Environment.Board;
import com.nivram.Console.Input;

public class ShopEvent extends Event
{
    public ShopEvent(Hero hero)
    {
        super(hero);
    }

    public void start(int clearedDungeonRooms)
    {
        String text = ("\nYou reach an room with a weird looking guy in it." +
                "\nIt looks like he want to sell something to you." +
                "\n\nDo you want to buy a health potion for 30 gold?" +
                "\nYour gold: " + hero.gold +
                "\n1. Yes" +
                "\n2. No");
        Runnable[] choices = new Runnable[]{this::caseBuy, this::caseLeave};

        Input.choiceSwitch(text, choices, this::caseDefault);
    }

    private void caseBuy()
    {
        if (hero.gold>=30)
        {
            hero.gold-=30;
            hero.healthPotions++;
            System.out.println("\n>You pay for the health potion and continue your journey." +
                    "\n\t >> Health potions +1 << ");
        }
        else
        {
            System.out.println("\n>A quick look into your empty bag tells you, that you wont be able to pay for the health potion." +
                    "\n>You continue your journey.");
        }
    }

    private void caseLeave()
    {
        System.out.println("\n>You decide not to buy anything from the salesman and continue your journey.");
    }

    private void caseDefault()
    {
        System.out.println("\n>You.. You did not choose any valid option. You must be really busy.. Or stupid.. Go on!");
    }


}
