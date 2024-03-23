package GameClasses.Enemy;

public class TutorialSlime extends Enemy {

    public TutorialSlime(){
        this("Tutorial Slime",
                30.0,
                4,
                4,
                2,
                0,
                new String[]{"/enemy/TutorialSlime/Slime.gif","/enemy/TutorialSlime/Slime.gif","/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif"});
    }
    public TutorialSlime(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkTyp, String[] gifs) {
        super(name, life, strength, skill, magicka, atkTyp, gifs);
    }
}
