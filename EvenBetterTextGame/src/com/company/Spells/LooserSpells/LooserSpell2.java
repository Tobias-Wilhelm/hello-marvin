package com.company.Spells.LooserSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class LooserSpell2 extends Spell
{
    public LooserSpell2()
{
    name = SpellConfig.looserNames[1];
}

    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.lSManaCost)
        {
            Info.printLooserSpell();
        }
    }
}