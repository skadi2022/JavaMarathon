package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private int magicAtt;

    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        physDef = 20;
        magicDef = 20;
    }

    @Override
    public void healHimself() {

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health = hero.health + 30;
        if (hero.health > MAX_HEALTH)
            hero.health = MAX_HEALTH;
    }

    @Override
    public void magicalAttack(Hero hero) {

    }


    @Override
    public String toString() {
        return "Shaman{" + "health=" + health + "}";
    }
}
