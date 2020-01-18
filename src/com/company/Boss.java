package com.company;

public class Boss extends Player {
    private String  BossDamage;
    private String BossHealth;
    private String BossHeal;

    public String getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(String bossDamage) {
        BossDamage = bossDamage;
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
