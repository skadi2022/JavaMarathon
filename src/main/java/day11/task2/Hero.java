package day11.task2;

public abstract class Hero implements PhysAttack {
    protected int health, physDef, magicDef, physAtt;
    protected Hero hero;
    protected final int MIN_HEALTH = 0, MAX_HEALTH = 100;

    public Hero() {
       health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - (physAtt * hero.physDef) / 100);
        if (hero.health < MIN_HEALTH)
            hero.health = MIN_HEALTH;
    }
}
