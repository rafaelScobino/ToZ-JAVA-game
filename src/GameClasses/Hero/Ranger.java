package GameClasses.Hero;

public class Ranger extends Hero {

    public Ranger (){
        this( "",60.0,6,4,2,0, new String[]{
                "/hero/ranger/atk.gif",
                "/hero/ranger/idle.gif",
                "/hero/ranger/atk.gif",
                "/hero/ranger/idle.gif",
                "/hero/ranger/run.gif",
                "/hero/ranger/hit.gif",
                "/hero/ranger/jump.gif",
                "/hero/ranger/die.gif",
                "/hero/ranger/atk.gif"});;
    }

    public Ranger( String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType, String[]gifs) {
        super(name,life, strength,skill,magicka,atkType,gifs);
    }



}
