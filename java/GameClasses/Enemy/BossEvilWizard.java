package GameClasses.Enemy;

public class BossEvilWizard extends Enemy {
    public BossEvilWizard() {
        this("Boss Zanas",
                900.0,
                2,
                10,
                5,
                0,
                new String[]{"/enemy/wizard/wizardAttack.gif","/enemy/wizard/wizardHeal.gif","/enemy/wizard/wizardMgk.gif",
                        "/enemy/wizard/wizardIdle.gif",
                        "/enemy/wizard/wizardRun.gif",
                        "/enemy/wizard/wizardDamage.gif",
                        "/enemy/wizard/wizardJump.gif",
                        "/enemy/wizard/wizardDie.gif"});
    }

    public BossEvilWizard(String name, double life, int str, int skl, int mgk, int atktype, String[] gifs) {
        super(name, life, str,skl,mgk,atktype,gifs);
    }
}
