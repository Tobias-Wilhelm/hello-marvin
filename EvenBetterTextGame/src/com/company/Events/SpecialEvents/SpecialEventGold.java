package com.company.Events.SpecialEvents;

import com.company.Character.Hero.Hero;
import com.company.Environment.Board;
import com.nivram.Console.Input;

import java.util.Random;

public class SpecialEventGold extends SpecialEvent
{
    public SpecialEventGold(Hero hero)
    {
        super(hero);
    }

    @Override
    public void start(int clearedDungeonRooms)
    {
        String text = ("\nSuddenly you bump your toes against something pretty hard. " +
                "\n\nWhat do you want to do?" +
                "\n1. Examine it" +
                "\n2. Ignore it");
        Runnable[] choices = new Runnable[]{this::case1, this::case2};

        Input.choiceSwitch(text, choices, this::casedefault);
    }

    private void case1()
    {
        int goldFound = 10 * (new Random().nextInt(5) + 1);
        hero.gold += goldFound;
        System.out.println("\n>As you shine the light of your torch against it, you register this big chest filled with gold." +
                "\n\t >> You received " + goldFound + " Gold << ");
    }

    private void case2()
    {
        System.out.println("\n>You decide not to pay any attention to the mysterious thing and continue your journey.");
    }

    private void casedefault()
    {
        System.out.println("\n>You.. You did not choose any valid option.. You must be really busy.. Or stupid.. Go on!");
    }
}
