package GameClasses.Enemy;

public class SkillSlime extends Enemy {

    public SkillSlime(){
        this("Skill Slime",
                40.0,
                2,
                8,
                1,
                0,
                new String[]{"/enemy/TutorialSlime/Slime.gif","/enemy/TutorialSlime/Slime.gif","/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif",
                        "/enemy/TutorialSlime/Slime.gif"});
    }
    public SkillSlime(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkTyp, String[] gifs) {
        super(name, life, strength, skill, magicka, atkTyp, gifs);
    }
}
