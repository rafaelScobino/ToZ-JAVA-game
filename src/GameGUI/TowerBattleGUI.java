package GameGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GameGUI.InterfaceMechanics.*;

public class TowerBattleGUI extends JFrame {

    private static TowerBattleGUI frame;
    private JButton HEROCREATEButton;
    private JButton RESTARTButton;
    private JTextField inputs;
    private JLabel inputsLabel;
    private JButton inputButton;
    private JButton strButton;
    private JButton sklButton;
    private JButton mgkButton;
    private JButton cureButton;
    private  JTextArea hLifeValue;
        public void sethLifeValue(Double value){
            this.hLifeValue.setText(String.valueOf(value));
        }

    private JPanel towerFrame;
    private JPanel menuFrame;
    private JPanel contestantFrame;
    private JPanel actionFrame;
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
    private JTextPane eName;
    private JTextArea hStrValue;

    public  void sethStrValue(Integer value){
        this.hStrValue.setText(String.valueOf(value));
    }
    private  JTextArea hSklValue;

    public  void sethSklValue(Integer value){
        this.hSklValue.setText(String.valueOf(value));
    }
    private  JTextArea hMgkValue;

    public  void sethMgkValue(Integer value){
        this.hMgkValue.setText(String.valueOf(value));
    }
    private  JTextArea eLifeValue;

    public  void seteLifeValue(Double value){
        this.eLifeValue.setText(String.valueOf(value));
    }
    private  JTextArea eStrValue;

    public  void seteStrValue(Integer value) {
        this.eStrValue.setText(String.valueOf(value));
    }

    private  JTextArea eSklValue;

    public void seteSklValue(Integer value){
        this.eSklValue.setText(String.valueOf(value));
    }
    private  JTextArea eMgkValue;

    public  void seteMgkValue(Integer value){
        this.eMgkValue.setText(String.valueOf(value));
    }
    private JTextArea turnNumber;
    private JTextArea towerLevel;
    private JLabel heroImg;
    private JLabel enemyHero;
    private JTextPane madeBy;
    private  Container TowerFrame;


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

            }
        });
    }

    public static void guiInit(){
        javax.swing.SwingUtilities.invokeLater(() -> {
             frame = new TowerBattleGUI();
            BattleInterfaceMechanics.updateHeroStats(frame, 80.0, 7, 3, 0);
            BattleInterfaceMechanics.updateEnemyStats(frame, 50.0, 2, 8, 3);
            frame.setContentPane(frame.towerFrame);
            frame.setTitle("ToZ Alpha");
            frame.setSize(1100, 750);
            frame.setVisible(true);
            System.out.println("hLife: " + frame.hLifeValue.getText() + " eLife: " + frame.eLifeValue.getText());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }

    public static void main(String[] args) {
       guiInit();
       Integer change = Integer.parseInt(JOptionPane.showInputDialog("Teste change"));
        javax.swing.SwingUtilities.invokeLater(() -> {
            if (change == 1){
            BattleInterfaceMechanics.updateHeroStats(frame, 60.0, 5, 5, 3);
            BattleInterfaceMechanics.updateEnemyStats(frame, 70.0, 8, 6, 5);}
            System.out.println("hLife: " + frame.hLifeValue.getText() + " eLife: " + frame.eLifeValue.getText());
        });

    }

}
