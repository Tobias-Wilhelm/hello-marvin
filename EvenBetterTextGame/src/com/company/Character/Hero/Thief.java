package com.company.Character.Hero;

import com.company.Character.Attributes;
import com.company.Spells.SpellConfig;
import com.company.Spells.Spells;

public class Thief extends Hero
{
    public Thief(Attributes attributes)
    {
        super("Thief", attributes,"Skill");
        spells = new Spells(SpellConfig.thiefSpells);
    }
}
