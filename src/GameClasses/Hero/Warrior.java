package GameClasses.Hero;

public class Warrior extends Hero {

   public Warrior(){
       this( "",80.0,7,3,0,0, new String[]
               {"/hero/warrior/atk1.gif",
                       "/hero/warrior/idle.gif",
                       "/hero/warrior/atk1.gif",
                       "/hero/warrior/idle.gif",
                       "/hero/warrior/run.gif",
                       "/hero/warrior/hit.gif",
                       "/hero/warrior/jump.gif",
                       "/hero/warrior/die.gif",
                       "/hero/warrior/atk2.gif"});
   }

    public Warrior(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType, String[] gifs) {
        super(name, life, strength, skill, magicka, atkType, gifs);
    }
}
