package com.company.Spells.ThiefSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class ThiefSpell1 extends Spell
{
    public ThiefSpell1()
{
    name = SpellConfig.thiefNames[0];
}

    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.tS1ManaCost)
        {
            hero.attributes.agility+=3;
            hero.mana-=SpellConfig.tS1ManaCost;
            Info.printThiefSpell1();
        }
    }
}
