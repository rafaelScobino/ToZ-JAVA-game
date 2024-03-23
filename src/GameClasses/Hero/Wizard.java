package GameClasses.Hero;

public class Wizard extends Hero {

    public Wizard() {
        this("",50.0, 3, 7, 3,0, new String[]
                {"/hero/wizard/atk1.gif",
                        "/hero/wizard/idle.gif",
                        "/hero/wizard/atk1.gif",
                        "/hero/wizard/idle.gif",
                        "/hero/wizard/run.gif",
                        "/hero/wizard/hit.gif",
                        "/hero/wizard/jump.gif",
                        "/hero/wizard/die.gif",
                        "/hero/wizard/atk2.gif"});;
    }

    public Wizard(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType, String[] gifs) {
        super(name, life, strength, skill, magicka, atkType, gifs);
    }
}
