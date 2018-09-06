package com.company.Spells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;

public interface ISpell
{
    void use(Hero hero, Enemy enemy);
}
