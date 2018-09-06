package com.company.Character;

public interface ICharacter
{
    int calculateArmor();
    void attack(ICharacter target);
    void defend(int enemyDamage);
}
