package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{

    public Paladin() {
        physAtt = 15;
        physDef = 50;
        magicDef = 20;
    }

    @Override
    public void healHimself() {
        health += 25;
        if (health > MAX_HEALTH)
            health = MAX_HEALTH;
    }

    @Override
    public void healTeammate(Hero hero) {

    }

    @Override
    public String toString() {
        return "Paladin{" + "health=" + health + "}";
    }
}
