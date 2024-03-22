package GameClasses.Hero;

public class Warrior extends Hero {

   public Warrior(){
       this( "",80.0,7,3,0,0, new String[]
               {"/hero/warrior/warriorAttack.gif",
                       "/hero/warrior/warriorHeal.gif",
                       "/hero/warrior/warriorMgk.gif",
                       "/hero/warrior/warriorIdle.gif",
                       "/hero/warrior/warriorRun.gif",
                       "/hero/warrior/warriorDamage.gif",
                       "/hero/warrior/warriorJump.gif",
                       "/hero/warrior/warriorDie.gif"});
   }

    public Warrior(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType, String[] gifs) {
        super(name, life, strength, skill, magicka, atkType, gifs);
    }
}
