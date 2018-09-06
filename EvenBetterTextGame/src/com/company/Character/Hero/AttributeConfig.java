package com.company.Character.Hero;

import com.company.Character.Attributes;

public class AttributeConfig
{
    final public static Attributes warrior = new Attributes(10, 10, 0, 2, 2);
    final public static Attributes mage = new Attributes(10, 1, 10, 2, 2);
    final public static Attributes thief = new Attributes(10, 5, 0, 6, 6);
    final public static Attributes looser = new Attributes(25, 0, 0, 0, 0);

    final public static int skillPointsPerLvl = 3;
}
