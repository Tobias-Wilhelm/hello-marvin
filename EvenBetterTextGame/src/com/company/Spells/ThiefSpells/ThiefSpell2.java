package com.company.Spells.ThiefSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class ThiefSpell2 extends Spell
{
    public ThiefSpell2()
{
    name = SpellConfig.thiefNames[1];
}

    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.tS2ManaCost)
        {
            int damageDealt = SpellConfig.tS2Damage;
            enemy.health -= damageDealt;
            hero.mana -= SpellConfig.tS2ManaCost;
            Info.printThiefSpell2();
        }
    }
}
