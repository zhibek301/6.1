package com.company;

public class Magical extends Player{
    private String MagicalDamage;
    private String BossHealth;
    private String BossHeal;

    public String getMagicalDamage() {
        return MagicalDamage;
    }

    public void setMagicalDamage(String magicalDamage) {
        MagicalDamage = magicalDamage;
    }

    public String getBossHealth() {
        return BossHealth;
    }

    public void setBossHealth(String bossHealth) {
        BossHealth = bossHealth;
    }

    public String getBossHeal() {
        return BossHeal;
    }

    public void setBossHeal(String bossHeal) {
        BossHeal = bossHeal;
    }
}
