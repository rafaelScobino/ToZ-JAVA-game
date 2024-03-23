package GameClasses.Enemy;

public class EvilWizard extends Enemy {
    public EvilWizard() {
        this("Evil Zanas",
                50.0,
                2,
                8,
                3,
                0,
                new String[]{"/enemy/wizard/atk1.gif",
                        "/enemy/wizard/idle.gif",
                        "/enemy/wizard/atk2.gif",
                        "/enemy/wizard/idle.gif",
                        "/enemy/wizard/run.gif",
                        "/enemy/wizard/hit.gif",
                        "/enemy/wizard/jump.gif",
                        "/enemy/wizard/die.gif",
                        "/enemy/wizard/atk2.gif"});
    }

    public EvilWizard(String name, double life, int str, int skl, int mgk, int atktype, String[] gifs) {
        super(name, life, str,skl,mgk,atktype,gifs);
    }
}
