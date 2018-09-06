package com.company.Spells.WarriorSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class WarriorSpell1 extends Spell
{
    public WarriorSpell1()
    {
    name = SpellConfig.warriorNames[0];
    }

    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.wS1ManaCost)
        {
            int damageDealt = SpellConfig.wS1Damage;
            enemy.health -= damageDealt;
            hero.mana -= SpellConfig.wS1ManaCost;
            Info.printWarriorSpell1();
        }
    }
}