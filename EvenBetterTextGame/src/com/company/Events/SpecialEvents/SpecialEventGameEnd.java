package com.company.Events.SpecialEvents;

import com.company.Character.Hero.Hero;
import com.nivram.Console.Input;

public class SpecialEventGameEnd extends SpecialEvent
{
    private int clearedDungeonRooms;
    public SpecialEventGameEnd(Hero hero)
    {
        super(hero);
    }

    @Override
    public void start(int clearedDungeonRooms)
    {
        this.clearedDungeonRooms =clearedDungeonRooms;
        String text = ("\nYou enter a little cave inside the Dungeon." +
                "\nYou can see a woman, laying on the ground and think about your next step.\n" +
                "\n1. Help her" +
                "\n2. Ignore her" +
                "\n3. Kill her" +
                "\n4. Steal her money and her cloak");
        Runnable[] choices = new Runnable[]{this::case1, this::case2, this::case3, this::case4};

        Input.choiceSwitch(text, choices, this::casedefault);
    }

    private void case1()
    {
        System.out.println("\n>You kneel down next to her and want to check, if she is still alive." +
                "\nThe moment, you try to touch her face, she jumps up and cut your throat with her dagger.");
        gameOver(clearedDungeonRooms);
    }

    private void case2()
    {
        System.out.println("\n>You do not pay any attention to her, deciding to continue on your adventure." +
                "\nThe moment, you pass the woman, she jumps up and splits your head with a huge battleaxe, you did not recognize before.");
        gameOver(clearedDungeonRooms);
    }

    private void case3()
    {
        System.out.println("\n>You decide, that it is to dangerous to spare her and grab your sword to end her suffer." +
                "\nThe moment, you reach the woman, she jumps up and throws her spear right into your heart.");
        gameOver(clearedDungeonRooms);
    }

    private void case4()
    {
        System.out.println("\n>You think, that a dead woman wont need any money or clothing, so you walk towards her, to take it with you" +
                "\nThe moment, you reach the woman, you suddenly feel a big pain in your chest and you die due to a heart attack.");
        gameOver(clearedDungeonRooms);
    }

    private void casedefault()
    {
        System.out.println("\n>You.. You did not choose any valid option.. You must be really busy.. Or stupid.. Go on!");
    }
}
