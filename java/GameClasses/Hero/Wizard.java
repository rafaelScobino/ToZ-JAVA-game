package GameClasses.Hero;

public class Wizard extends Hero {

    public Wizard() {
        this("",50.0, 3, 7, 3,0, new String[]
                {"/hero/wizard/wizardAttack.gif",
                        "/hero/wizard/wizardHeal.gif",
                        "/hero/wizard/wizardMgk.gif",
                        "/hero/wizard/wizardIdle.gif",
                        "/hero/wizard/wizardRun.gif",
                        "/hero/wizard/wizardDamage.gif",
                        "/hero/wizard/wizardJump.gif",
                        "/hero/wizard/wizardDie.gif"});
    }

    public Wizard(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType, String[] gifs) {
        super(name, life, strength, skill, magicka, atkType, gifs);
    }
}
