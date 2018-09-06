package com.company.Spells;

import com.company.Spells.LooserSpells.LooserSpell1;
import com.company.Spells.LooserSpells.LooserSpell2;
import com.company.Spells.MageSpells.MageSpell1;
import com.company.Spells.MageSpells.MageSpell2;
import com.company.Spells.MageSpells.MageSpell3;
import com.company.Spells.ThiefSpells.ThiefSpell1;
import com.company.Spells.ThiefSpells.ThiefSpell2;
import com.company.Spells.ThiefSpells.ThiefSpell3;
import com.company.Spells.WarriorSpells.WarriorSpell1;
import com.company.Spells.WarriorSpells.WarriorSpell2;
import com.company.Spells.WarriorSpells.WarriorSpell3;

public class SpellConfig
{
    // final public static String[] warriorNames = {"Damage Skill (40 Damage, -30 Mana)",
    //         "Heal Skill (30 Heal, -40 Mana)",
    //         "Buff Skill (Constitution+1 , Strength +1, -60  Mana)"};
    // final public static String[] mageNames = {"Damage Spell (50 Damage, -10 Mana)",
    //         "Damage Spell (80 Damage, -30 Mana)",
    //         "Heal Spell (Full heal, -60 Mana"};
    // final public static String[] thiefNames = {"Buff Skill (Agility +3, -30 Mana)",
    //         "Damage Skill (50 Damage, -50 Mana)",
    //         "Damage Skill (100 Damage, -40 Mana, Agility -1)"};
    // final public static String[] looserNames = {"Fart",
    //         "Weak Fart",
    //         "Shattering Fart"};

    final public static String[] warriorNames = {"Death Wrath (40 Damage, -30 Mana)",
    "Dragon Wave (30 Heal, -40 Mana)",
    "Concentration of Control (Constitution+1 , Strength +1, -60  Mana)"};
    final public static String[] mageNames = {"Sunlight Wave (50 Damage, -10 Mana)",
    "Mage Rocket (80 Damage, -30 Mana)",
    "Spell of the Inferno (Full heal, -60 Mana)"};
    final public static String[] thiefNames = {"Delay of Sight (Agility +3, -30 Mana)",
    "Blessing of Demonic Pacts (50 Damage, -50 Mana)",
    "Feather Fall (100 Damage, -40 Mana, Agility -1)"};
    final public static String[] looserNames = {"Fart",
    "Shattering Fart",
    "Almighty Fart"};

    final public static ISpell[] warriorSpells = new ISpell[]{new WarriorSpell1(), new WarriorSpell2(), new WarriorSpell3()};
    final public static ISpell[] mageSpells = new ISpell[]{new MageSpell1(), new MageSpell2(), new MageSpell3()};
    final public static ISpell[] thiefSpells = new ISpell[]{new ThiefSpell1(), new ThiefSpell2(), new ThiefSpell3()};
    final public static ISpell[] looserSpells = new ISpell[]{new LooserSpell1(), new LooserSpell2()};


    public static int wS1Damage = 40;
    public static int ws2Heal = 30;

    public static int mS1Damage = 50;
    public static int mS2Damage = 80;

    public static int tS2Damage = 50;
    public static int tS3Damage = 100;


    public static int wS1ManaCost = 30;
    public static int wS2ManaCost = 40;
    public static int wS3ManaCost = 60;

    public static int mS1ManaCost = 10;
    public static int mS2ManaCost = 30;
    public static int mS3ManaCost = 60;

    public static int tS1ManaCost = 30;
    public static int tS2ManaCost = 50;
    public static int tS3ManaCost = 40;

    public static int lSManaCost = 10;
}