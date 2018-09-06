package com.company.Character.Hero;

import com.company.Character.Attributes;
import com.company.Spells.SpellConfig;
import com.company.Spells.Spells;

public class Looser extends Hero
{
    public Looser(Attributes attributes)
    {
        super("Looser", attributes,"Fart");
        spells = new Spells(SpellConfig.looserSpells);
    }
}
