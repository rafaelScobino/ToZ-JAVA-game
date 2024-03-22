package GameClasses.Hero;

public class Fighter extends Hero {

    public Fighter() {
        this("", 70.0, 4, 6, 1, 0, new String[]
                {"/hero/fighter/fighterAttack.gif",
                        "/hero/fighter/fighterHeal.gif",
                        "/hero/fighter/fighterMgk.gif",
                        "/hero/fighter/fighterIdle.gif",
                        "/hero/fighter/fighterRun.gif",
                        "/hero/fighter/fighterDamage.gif",
                        "/hero/fighter/fighterRun.gif",
                        "/hero/fighter/fighterDie.gif"});
    }

    public Fighter(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType, String[] gifs) {
        super(name, life, strength, skill, magicka, atkType, gifs);
    }

}
