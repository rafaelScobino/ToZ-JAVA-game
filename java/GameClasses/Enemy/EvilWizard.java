package GameClasses.Enemy;

public class EvilWizard extends Enemy {
    public EvilWizard() {
        this("Evil Zanas",
                50.0,
                2,
                8,
                3,
                0,
                new String[]{"/enemy/wizard/wizardAttack.gif","/enemy/wizard/wizardHeal.gif","/enemy/wizard/wizardMgk.gif",
                        "/enemy/wizard/wizardIdle.gif",
                        "/enemy/wizard/wizardRun.gif",
                        "/enemy/wizard/wizardDamage.gif",
                        "/enemy/wizard/wizardJump.gif",
                        "/enemy/wizard/wizardDie.gif"});
    }

    public EvilWizard(String name, double life, int str, int skl, int mgk, int atktype, String[] gifs) {
        super(name, life, str,skl,mgk,atktype,gifs);
    }
}
