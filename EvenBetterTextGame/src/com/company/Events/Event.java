package com.company.Events;

import com.company.Character.Hero.Hero;
import com.company.Environment.Board;
import com.company.Outputs.Info;

public class Event
{
    public Hero hero;

    public Event(Hero hero)
    {
        this.hero = hero;
    }

    public void start(int clearedDungeonRooms)
    {

    }

    public void gameOver(int clearedDungeonRooms)
    {
        hero.health = 0;
        Info.printGameOver(clearedDungeonRooms);
    }
}
