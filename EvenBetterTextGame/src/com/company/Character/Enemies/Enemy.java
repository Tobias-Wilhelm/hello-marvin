package com.company.Character.Enemies;

import com.company.Character.Attributes;
import com.company.Character.Character;
import com.company.Character.ICharacter;

import java.util.Random;

public class Enemy extends Character
{
    public Enemy(String name, Attributes attributes, int level)
    {
        super(name, attributes);
        initAttributes(level);

        gold = new Random().nextInt(level * 10);
    }

    void initAttributes(int level)
    {
        this.level = level;
        attributes.agility += level;
        attributes.constitution += level;
        attributes.luck += level;
        attributes.magicPower += level;
        attributes.strength += level;
    }

    @Override
    public int calculateArmor()
    {
        return level;
    }
}