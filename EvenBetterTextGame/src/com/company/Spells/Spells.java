package com.company.Spells;

import com.company.Character.Enemies.Enemy;
import com.company.Character.Hero.Hero;
import com.nivram.Console.Input;

public class Spells
{
    public ISpell[] iSpells;

    public Spells(ISpell[] iSpells)
    {
        this.iSpells = iSpells;
    }

    public void useSpell(Hero hero, Enemy enemy)
    {
        Input.choiceSwitch(getText(hero), getSpells(hero,enemy), caseDefault(hero,enemy));
    }

    private String getText(Hero hero)
    {
        String result = ("\nWhich " + hero.skillOrSpell + " do you want to use?");
        for (int i = 0; i < iSpells.length; i++)
        {
                result = result.concat("\n"+(i+1)+". " + ((Spell) (iSpells[i])).name);
        }
        return result;
    }

    private Runnable[] getSpells(Hero hero, Enemy enemy)
    {
        Runnable[] result = new Runnable[iSpells.length];
        for (int i = 0; i < result.length; i++)
        {
            int finalI = i;
            result[finalI] = () -> iSpells[finalI].use(hero, enemy);
        }
        return result;
    }

    private Runnable caseDefault(Hero hero, Enemy enemy)
    {
        return () -> useSpell(hero, enemy);
    }
}