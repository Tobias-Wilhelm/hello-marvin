package com.company.Environment;

import com.company.Character.Hero.Hero;
import com.company.Events.Event;
import com.company.Events.ProfessionEvent;
import com.company.Outputs.Info;

public class Board
{
    public Hero hero;
    public int clearedDungeonRooms = 0;

    private Event event;

    public Board()
    {
        Info.printOpeningText();
        event = new ProfessionEvent(hero,this);
        event.start(clearedDungeonRooms);
        Info.printCharacterDecision(hero);

        Info.printEnterDungeon();

        while (hero.health > 0)
        {
            System.out.println("\n ++ ROOM: " + (clearedDungeonRooms + 1) + " ++ ");
            event = EventGenerator.getNextEvent(clearedDungeonRooms, hero);
            event.start(clearedDungeonRooms);
            clearedDungeonRooms++;
        }
    }
}