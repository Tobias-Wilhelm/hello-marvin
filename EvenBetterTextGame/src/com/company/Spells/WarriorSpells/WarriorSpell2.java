package com.company.Spells.WarriorSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class WarriorSpell2 extends Spell
{
    public WarriorSpell2()
    {
        name = SpellConfig.warriorNames[1];
    }

    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.wS2ManaCost)
        {
            hero.health += SpellConfig.ws2Heal;
            hero.mana -= SpellConfig.wS2ManaCost;
            Info.printWarriorSpell2();
        }
    }
}
