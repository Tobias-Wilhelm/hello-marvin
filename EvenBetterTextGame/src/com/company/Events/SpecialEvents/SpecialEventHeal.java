package com.company.Events.SpecialEvents;

import com.company.Character.Hero.Hero;
import com.company.Environment.Board;
import com.nivram.Console.Input;

import java.util.Random;

public class SpecialEventHeal extends SpecialEvent
{
    public SpecialEventHeal(Hero hero)
    {
        super(hero);
    }

    @Override
    public void start(int clearedDungeonRooms)
    {
        String text = ("\nYou enter a room filled with wooden furniture." +
                "\nThere is some stale bread in the middle of the room." +
                "\n\nWhat do you want to do?" +
                "\n1. Examine it" +
                "\n2. Eat it" +
                "\n3. Ignore it");
        Runnable[] choices = new Runnable[]{this::case1, this::case2, this::case3};

        Input.choiceSwitch(text, choices, this::casedefault);
    }

    private void case1()
    {
        hero.attributes.strength++;
        System.out.println("\n>This bread seems to be pretty hard. In fact, it is so hard, you could use it as a weapon." +
                "\n\t >> Strength +1 << ");
    }

    private void case2()
    {
        hero.health = hero.maxHealth;
        System.out.println("\n>You decide to eat this bread." +
                "\n>It does not taste amazing, but you feel refreshed." +
                "\n\t >> Fully healed << ");
    }

    private void case3()
    {
        hero.health = hero.maxHealth;
        System.out.println("\n>You decide not to pay any attention to the bread and continue your journey.");
    }

    private void casedefault()
    {
        System.out.println("\n>You.. You did not choose any valid option. You must be really busy.. Or stupid.. Go on!");
    }
}
