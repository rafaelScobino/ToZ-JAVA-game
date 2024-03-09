package GameClasses.Hero;

public class Warrior extends Hero {

   public Warrior(){
       this( "",80.0,7,3,0);
   }

    public Warrior(String name, Double life, Integer strength, Integer skill, Integer magicka) {
        super(name, life, strength,skill,magicka);
    }
}
