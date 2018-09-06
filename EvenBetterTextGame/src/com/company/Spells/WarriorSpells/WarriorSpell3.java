package com.company.Spells.WarriorSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class WarriorSpell3 extends Spell
{
    public WarriorSpell3()
    {
        name = SpellConfig.warriorNames[2];
    }


    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.wS3ManaCost)
        {
            hero.attributes.strength++;
            hero.attributes.constitution++;
            hero.mana-=SpellConfig.wS3ManaCost;
            Info.printWarriorSpell3();
            hero.resetMaxHealth();
        }
    }
}