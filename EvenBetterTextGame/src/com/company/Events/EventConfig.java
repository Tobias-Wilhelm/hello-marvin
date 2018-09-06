package com.company.Events;

import java.util.Random;

public class EventConfig
{
    final public static double fightEventProb = 0.8;

    final public static double specialEventGoldProb = 0.45;
    final public static double specialEventGameEndProb = 0.01;
    final public static double specialEventHealProb = 0.35;
    final public static double specialEventLvlUpProb = 0.19;

    final static int difficultyUp = 20;
    final static int difficultyMax = 3;


    public static int getDifficulty(int clearedDungeonRooms)
    {
        int a = clearedDungeonRooms % difficultyUp;
        int b = (clearedDungeonRooms - a) / difficultyUp;
        if (b >= difficultyMax)
        {
            return 2;
        }
        return b;
    }

    public static boolean nextEventIsFight()
    {
        return new Random().nextDouble() < fightEventProb;
    }
}