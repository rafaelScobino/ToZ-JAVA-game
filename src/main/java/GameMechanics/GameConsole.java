package GameMechanics;

import GameGUI.TowerBattleGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameConsole {

    public static void warningSetter(String msg) {

        TowerBattleGUI.frame.setGameConsole(msg);
    }
}
