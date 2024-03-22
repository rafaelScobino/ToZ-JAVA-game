package GameClasses.Enemy;

public class StrengthSlime extends Enemy {

    public StrengthSlime(){
        this("Strength Slime",
                50.0,
                8,
                2,
                0,
                0,
                new String[]{"/enemy/TutorialSlime/Slime.gif","/enemy/TutorialSlime/Slime.gif","/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif"});
    }
    public StrengthSlime(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkTyp, String[] gifs) {
        super(name, life, strength, skill, magicka, atkTyp, gifs);
    }
}
