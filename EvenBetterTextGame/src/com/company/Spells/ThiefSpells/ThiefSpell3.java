package com.company.Spells.ThiefSpells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.company.Outputs.Info;
import com.company.Spells.Spell;
import com.company.Spells.SpellConfig;

public class ThiefSpell3 extends Spell
{
    public ThiefSpell3()
{
    name = SpellConfig.thiefNames[2];
}

    @Override
    public void use(Hero hero, Enemy enemy)
    {
        if (hero.mana >= SpellConfig.tS3ManaCost)
        {
            int damageDealt = SpellConfig.tS3Damage;
            enemy.health -= damageDealt;
            hero.mana -= SpellConfig.tS3ManaCost;
            hero.attributes.agility--;
            Info.printThiefSpell3();
        }
    }
}
