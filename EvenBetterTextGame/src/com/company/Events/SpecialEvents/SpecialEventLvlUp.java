package com.company.Events.SpecialEvents;

import com.company.Character.Hero.AttributeConfig;
import com.company.Character.Hero.Hero;
import com.company.Environment.Board;
import com.nivram.Console.Input;

public class SpecialEventLvlUp extends SpecialEvent
{
    public SpecialEventLvlUp(Hero hero)
    {
        super(hero);
    }

    @Override
    public void start(int clearedDungeonRooms)
    {
        String text = ("\nYou enter a suspicious looking room." +
                "\nYou can see a cage in the room. Inside this cage, there is a little boy suffering from bad wounds." +
                "\nWhat do you want to do with him?" +
                "\n1. Kill him" +
                "\n2. Spare him");
        Runnable[] choices = new Runnable[]{this::case1, this::case2};

        Input.choiceSwitch(text, choices, this::casedefault);
    }

    private void case1()
    {
        System.out.println("\n>Very careful, you draw closer to the cage." +
                "\n>As you reach it, you kill the boy with your dagger." +
                "\n\t >> Level up! << ");

        hero.level++;
        hero.setMaxExp();
        hero.attributes.investSkillPoints(AttributeConfig.skillPointsPerLvl);
        hero.health = hero.maxHealth;
        hero.mana = hero.maxMana;
        hero.resetMaxHealth();
        hero.resetMaxMana();
    }

    private void case2()
    {
        System.out.println("\n>You decide to spare the boy and continue your journey.");
    }

    private void casedefault()
    {
        System.out.println("\n>You.. You did not choose any valid option. You must be really busy.. Or stupid.. Go on!");
    }
}