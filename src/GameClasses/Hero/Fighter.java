package GameClasses.Hero;

public class Fighter extends Hero {

    public Fighter() {
        this("", 70.0, 4, 6, 1, 0, new String[]
                {"/hero/fighter/atk1.gif",
                        "/hero/fighter/idle.gif",
                        "/hero/fighter/atk1.gif",
                        "/hero/fighter/idle.gif",
                        "/hero/fighter/run.gif",
                        "/hero/fighter/hit.gif",
                        "/hero/fighter/jump.gif",
                        "/hero/fighter/die.gif",
                        "/hero/fighter/atk2.gif"});
    }

    public Fighter(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType, String[] gifs) {
        super(name, life, strength, skill, magicka, atkType, gifs);
    }

}
