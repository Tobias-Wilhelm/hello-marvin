package com.company.Character.Hero;

import com.company.Character.Attributes;
import com.company.Spells.SpellConfig;
import com.company.Spells.Spells;

public class Mage extends Hero
{
    public Mage(Attributes attributes)
    {
        super("Mage", attributes,"Spells");
        spells = new Spells(SpellConfig.mageSpells);
    }
}
