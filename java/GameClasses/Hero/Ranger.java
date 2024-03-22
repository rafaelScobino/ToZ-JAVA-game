package GameClasses.Hero;

public class Ranger extends Hero {

    public Ranger (){
        this( "",60.0,6,4,2,0, new String[]{
                "/hero/ranger/rangerAttack.gif",
                "/hero/ranger/rangerHeal.gif",
                "/hero/ranger/rangerMgk.gif",
                "/hero/ranger/rangerIdle.gif",
                "/hero/ranger/rangerRun.gif",
                "/hero/ranger/rangerDamage.gif",
                "/hero/ranger/rangerJump.gif",
                "/hero/ranger/rangerDie.gif"});
    }

    public Ranger( String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType, String[]gifs) {
        super(name,life, strength,skill,magicka,atkType,gifs);
    }



}
