package day11.task2;

public class Warrior extends Hero {

    public Warrior() {
        physAtt = 30;
        physDef = 80;
    }

    @Override
    public String toString() {
        return "Warrior{" + "health=" + health + "}";
    }
}
