package com.company.Environment;

import com.company.Character.Hero.Hero;
import com.company.Events.Event;
import com.company.Events.EventConfig;
import com.company.Events.FightEvent;
import com.company.Events.ShopEvent;
import com.company.Events.SpecialEvents.SpecialEventGameEnd;
import com.company.Events.SpecialEvents.SpecialEventGold;
import com.company.Events.SpecialEvents.SpecialEventHeal;
import com.company.Events.SpecialEvents.SpecialEventLvlUp;

import java.util.Random;

public class EventGenerator
{


    public static Event getNextEvent(int clearedDungeonRooms, Hero hero)
    {
        if ((clearedDungeonRooms+1)%5==0)
        {
            return new ShopEvent(hero);
        }
        else
        {
            if (EventConfig.nextEventIsFight())
            {
                return new FightEvent(EventConfig.getDifficulty(clearedDungeonRooms), hero);
            }
            return getSpecialEvent(hero);
        }
    }

    public static Event getSpecialEvent(Hero hero)
    {
        double rand = new Random().nextDouble();
        double sum = 0;
        sum += EventConfig.specialEventGoldProb;
        if (rand <= sum)
        {
            return new SpecialEventGold(hero);
        }
        else
        {
            sum += EventConfig.specialEventHealProb;
            if (rand <= sum)
            {
                return new SpecialEventHeal(hero);
            }
            else
            {
                sum += EventConfig.specialEventLvlUpProb;
                if (rand <= sum)
                {
                    return new SpecialEventLvlUp(hero);
                }
                else
                {
                    sum += EventConfig.specialEventGameEndProb;
                    if (rand <= sum)
                    {
                        return new SpecialEventGameEnd(hero);
                    }

                }
            }
        }
        return null;
    }
}
