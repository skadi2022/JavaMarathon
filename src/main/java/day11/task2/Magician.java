package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        magicDef = 80;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (magicAtt - (magicAtt * hero.magicDef) / 100);
        if (hero.health < MIN_HEALTH)
            hero.health = MIN_HEALTH;
    }

    @Override
    public String toString() {
        return "Magician{" + "health=" + health + "}";
    }
}
