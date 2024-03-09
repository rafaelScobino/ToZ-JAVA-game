package GameClasses.Enemy;

import GameClasses.Contestant;
import Mechanics.Mechanics;

public class Enemy extends Contestant {

    public Enemy(){
        this("Placement Zanas",50.0,2,8,3);
    }

    public Enemy(String name, Double life, Integer strength,
                Integer skill, Integer magicka) {
        super( name, life, strength, skill, magicka);
    }

}
