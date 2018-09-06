package com.company.Spells.MageSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class MageSpell3 extends Spell
{
    public MageSpell3()
    {
        name = SpellConfig.mageNames[2];
    }

    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.mS3ManaCost)
        {
            hero.health = hero.maxHealth;
            hero.mana -= SpellConfig.mS3ManaCost;
            Info.printMageSpell3();
        }
    }
}
