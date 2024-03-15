package GameGUI;

import GameGUI.InterfaceMechanics.BattleInterfaceMechanics;
import GameGUI.InterfaceMechanics.HeroCreateMechanics;
import GameMechanics.Tower;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TowerBattleGUI extends JFrame {

    public static TowerBattleGUI frame;
    private JButton HEROCREATEButton;
    private JButton RESTARTButton;
    public JTextField inputs;
    private JLabel inputsLabel;
    private JButton inputButton;
    private JButton strButton;
    private JButton sklButton;
    private JButton mgkButton;
    private JButton cureButton;
    public JTextArea hLifeValue;

    public void sethLifeValue(Double value) {
        this.hLifeValue.setText(String.valueOf(value));
    }

    private JPanel towerFrame;
    private JPanel menuFrame;
    private JPanel contestantFrame;
    private JPanel actionPanel;
    private JPanel inputsFrame;
    private JPanel heroFrame;
    private JPanel heroStats;
    private JPanel enemyFrame;
    private JPanel enemyStats;
    private JPanel heroName;
    private JPanel enemyName;
    private JPanel towerStats;
    private JTextPane titleFrame;
    private JTextPane hName;

    public void setHeroName(String value) {
        this.hName.setText(value);
    }

    private JTextPane eName;

    public void setEnemyName(String value) {
        this.eName.setText(value);
    }

    private JTextArea hStrValue;

    public void sethStrValue(Integer value) {
        this.hStrValue.setText(String.valueOf(value));
    }

    private JTextArea hSklValue;

    public void sethSklValue(Integer value) {
        this.hSklValue.setText(String.valueOf(value));
    }

    private JTextArea hMgkValue;

    public void sethMgkValue(Integer value) {
        this.hMgkValue.setText(String.valueOf(value));
    }

    public JTextArea eLifeValue;

    public void seteLifeValue(Double value) {
        this.eLifeValue.setText(String.valueOf(value));
    }

    private JTextArea eStrValue;

    public void seteStrValue(Integer value) {
        this.eStrValue.setText(String.valueOf(value));
    }

    private JTextArea eSklValue;

    public void seteSklValue(Integer value) {
        this.eSklValue.setText(String.valueOf(value));
    }

    private JTextArea eMgkValue;

    public void seteMgkValue(Integer value) {
        this.eMgkValue.setText(String.valueOf(value));
    }

    private JTextArea turnNumber;

    public void setTurnNumber(Integer value) {
        this.turnNumber.setText(String.valueOf(value));
    }

    private JTextArea towerLevel;
    private  JLabel heroImg;
    private  JLabel enemyImg;
    private JTextPane madeBy;

    private JScrollPane gameConsolePane;
    private JTextArea gameConsole;
    private JPanel madeByPanel;
    private Container TowerFrame;

    public  void setGameConsole(String log){
        SwingUtilities.invokeLater(()-> {
            this.gameConsole.append(log+"\n");
        });
    }

    public TowerBattleGUI() {
        strButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BattleInterfaceMechanics.sethActionSelected(1);
            }
        });
        sklButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BattleInterfaceMechanics.sethActionSelected(2);

            }
        });
        mgkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BattleInterfaceMechanics.sethActionSelected(3);

            }
        });
        cureButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BattleInterfaceMechanics.sethActionSelected(4);

            }
        });
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HeroCreateMechanics.setInputValue(inputs.getText());
                inputs.setText("");

            }
        });
        HEROCREATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        RESTARTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tower.setTowerRestart(1);

            }
        });
    }

    public static void guiInit() {
        SwingUtilities.invokeLater(() -> {
            frame = new TowerBattleGUI();
            frame.setContentPane(frame.towerFrame);
            frame.setTitle("ToZ Alpha");
            frame.setSize(1100, 900);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }

    public static void updateHeroImg(TowerBattleGUI tower,String path){
        SwingUtilities.invokeLater(() ->{
            tower.heroImg.setIcon(new ImageIcon(TowerBattleGUI.class.getResource(path)));;
            tower.repaint();
        });
    }


    public static void updateEnemyImg(TowerBattleGUI tower,String path){
        SwingUtilities.invokeLater(() ->{
            tower.enemyImg.setIcon(new ImageIcon(TowerBattleGUI.class.getResource(path)));;
            tower.repaint();
        });
    }
    
    public static void updateNames(String hName, String eName) {
        BattleInterfaceMechanics.setNames(frame, hName, eName);
    }

    public static void updateGui(double hlife, int hstr, int hskl, int hmgk, double elife, int estr, int eskl, int emgk, int turn) {
        BattleInterfaceMechanics.updateHeroStats(frame, hlife, hstr, hskl, hmgk);
        BattleInterfaceMechanics.updateEnemyStats(frame, elife, estr, eskl, emgk);
        BattleInterfaceMechanics.updateTurnCounter(frame, turn);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TowerBattleGUI");
        frame.setContentPane(new TowerBattleGUI().towerFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}