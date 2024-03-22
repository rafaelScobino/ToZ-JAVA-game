package GameMechanics;

import GameClasses.Enemy.*;
import GameClasses.Hero.*;
import GameGUI.BattleScreen;
import GameGUI.InterfaceMechanics.HeroCreateMechanics;

import java.util.Timer;

import static GameMechanics.DelayGambi.delay;

public class Mechanics {

    private static int enemyCounter=0;
    public static int dice(){
        return (int) (Math.random() * 11);
    }

    public static Hero myHero(){
        while (HeroCreateMechanics.getSelectionMethodString() == null){
            delay(15);
        }
        String selected = HeroCreateMechanics.getSelectionMethodString();
        return switch (selected) {
            case "warrior" -> new Warrior();
            case "wizard" -> new Wizard();
            case "ranger" -> new Ranger();
            case "fighter" -> new Fighter();
//            default -> new Custom();
            default -> throw new IllegalStateException("Unexpected value: " + selected);
        };
    }

    public static void levelUp(Hero hero ){
        String selected = TemporaryLevelUp.selectionMethod();
         switch (selected) {
            case "life":
                hero.defaultLife+=10.0;
                break;
            case "strength":
                hero.defaultStrength+=2;
                break;
            case "skill":
                hero.defaultSkill+=2;
                break;
            case "magicka" :
                hero.defaultMagicka+=1;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selected);
        }

    }

    public static void heroImgSetter(BattleScreen tower, String url){
        BattleScreen.updateHeroImg(tower,url);
    }

    public static void enemyImgSetter(BattleScreen tower, String url){

        BattleScreen.updateEnemyImg(tower,url);

    }

    private static Enemy[] enemyList = {new TutorialSlime(), new EvilWizard(), new StrengthSlime(),new EvilWizard(),new SkillSlime(),new BossEvilWizard() };

    public static Enemy[] getEnemyList() {
        return enemyList;
    }

    public static Enemy myEnemy(){
        int ec = enemyCounter;
        enemyCounter++;
        return enemyList[ec];
    }




}

