package com.company;

public class Mental extends Player{
    private String  MentalDamage;
    private String MentalHealth;
    private String MentalHeal;

    public String getMentalDamage() {
        return MentalDamage;
    }

    public void setMentalDamage(String mentalDamage) {
        MentalDamage = mentalDamage;
    }

    public String getMentalHealth() {
        return MentalHealth;
    }

    public void setMentalHealth(String mentalHealth) {
        MentalHealth = mentalHealth;
    }

    public String getMentalHeal() {
        return MentalHeal;
    }

    public void setMentalHeal(String mentalHeal) {
        MentalHeal = mentalHeal;
    }
}
