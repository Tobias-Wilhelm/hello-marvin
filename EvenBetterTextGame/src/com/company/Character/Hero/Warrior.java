package com.company.Character.Hero;

import com.company.Character.Attributes;
import com.company.Spells.SpellConfig;
import com.company.Spells.Spells;

public class Warrior extends Hero
{
    public Warrior(Attributes attributes)
    {
        super("Warrior", attributes, "Skill");
        spells = new Spells(SpellConfig.warriorSpells);
    }
}