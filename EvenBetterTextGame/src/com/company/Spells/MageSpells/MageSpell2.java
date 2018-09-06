package com.company.Spells.MageSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class MageSpell2 extends Spell
{
    public MageSpell2()
    {
        name = SpellConfig.mageNames[1];
    }

    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.mS2ManaCost)
        {
            int damageDealt = SpellConfig.mS2Damage;
            enemy.health -= damageDealt;
            hero.mana -= SpellConfig.mS2ManaCost;
            Info.printMageSpell2();
        }
    }
}
