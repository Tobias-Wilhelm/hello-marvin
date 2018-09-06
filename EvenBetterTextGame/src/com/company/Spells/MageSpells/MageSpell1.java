package com.company.Spells.MageSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class MageSpell1 extends Spell
{
    public MageSpell1()
    {
        name = SpellConfig.mageNames[0];
    }

    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.mS1ManaCost)
        {
            int damageDealt = SpellConfig.mS1Damage;
            enemy.health -= damageDealt;
            hero.mana -= SpellConfig.mS1ManaCost;
            Info.printMageSpell1();
        }
    }
}
