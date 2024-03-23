package GameGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import javax.swing.*;

import GameGUI.InterfaceMechanics.BattleInterfaceMechanics;


public class BattleScreenO extends JFrame {

    public static BattleScreenO frame;

    private JButton HEROCREATEButton;
    public JButton RESTARTButton;
    public JButton strengthBtn;
    public JButton sklButton;

    public JButton mgkButton;
    public JButton cureButton;
    public JTextArea hLifeValue;

    public void sethLifeValue(Double value) {
        this.hLifeValue.setText(String.valueOf(value));
    }

    public JPanel towerFrame;
    private JPanel menuFrame;
    private JPanel contestantFrame;
    private JPanel actionPanel;
    private JPanel inventoryPanel;
    private JPanel heroFrame;
    private JPanel heroStats;
    private JPanel enemyFrame;
    private JPanel enemyStats;
    private JPanel heroName;
    private JPanel enemyName;
    private JPanel towerStats;
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

    public JTextArea hMgkValue;

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

    public JTextArea eMgkValue;

    public void seteMgkValue(Integer value) {
        this.eMgkValue.setText(String.valueOf(value));
    }

    private JTextArea turnNumber;

    public void setTurnNumber(Integer value) {
        this.turnNumber.setText(String.valueOf(value));
    }

    private JTextArea towerLevel;
    private JLabel heroImg;
    private JLabel enemyImg;
    private JTextArea eNextRoll;
    public JLabel heroRoll;
    public JLabel enemyRoll;
    public JPanel turnPanel;
    public JPanel towerLevelPanel;
    public JTextPane levelName;
    public JScrollPane gameConsolePane;
    private Container TowerFrame;
    private JLabel lblNewLabel;
    private JTextArea gameConsole;

    public void seteNextRoll(String value) {
        SwingUtilities.invokeLater(() -> {
            this.eNextRoll.setText(value);
        });

    }

    public void setGameConsole(String log) {
        SwingUtilities.invokeLater(() -> {
            this.gameConsole.append(log + "\n");
        });
    }


    public static void updateHeroImg(BattleScreenO tower, String path) {
        SwingUtilities.invokeLater(() -> {
            tower.heroImg.setIcon(new ImageIcon(BattleScreenO.class.getResource(path)));
            tower.repaint();
        });
    }

    public static void updateEnemyImg(BattleScreenO tower, String path) {
        SwingUtilities.invokeLater(() -> {
            tower.enemyImg.setIcon(new ImageIcon(BattleScreenO.class.getResource(path)));
            tower.repaint();
        });
    }

    public static void updateNames(BattleScreenO tower, String hName, String eName) {
        BattleInterfaceMechanics.setNames(tower, hName, eName);
    }

    public static void updateGui(BattleScreenO tower, double hlife, int hstr, int hskl, int hmgk, double elife, int estr, int eskl, int emgk, int turn) {
        BattleInterfaceMechanics.updateHeroStats(tower, hlife, hstr, hskl, hmgk);
        BattleInterfaceMechanics.updateEnemyStats(tower, elife, estr, eskl, emgk);
        BattleInterfaceMechanics.updateTurnCounter(tower, turn);
    }

    public BattleScreenO() {
        $$$setupUI$$$();
        strengthBtn.addActionListener(new ActionListener() {
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
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("BattleScreen");
        frame.setContentPane(new BattleScreenO().towerFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        towerFrame = new JPanel();
        towerFrame.setLayout(new GridBagLayout());
        towerFrame.setAutoscrolls(true);
        towerFrame.setBackground(new Color(-16777216));
        towerFrame.setEnabled(false);
        Font towerFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, towerFrame.getFont());
        if (towerFrameFont != null) towerFrame.setFont(towerFrameFont);
        towerFrame.setForeground(new Color(-28339));
        towerFrame.setMaximumSize(new Dimension(1100, 900));
        towerFrame.setMinimumSize(new Dimension(1100, 900));
        towerFrame.setPreferredSize(new Dimension(1100, 900));
        towerFrame.setVisible(true);
        menuFrame = new JPanel();
        menuFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        menuFrame.setAlignmentY(0.0f);
        menuFrame.setBackground(new Color(-16777216));
        Font menuFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, menuFrame.getFont());
        if (menuFrameFont != null) menuFrame.setFont(menuFrameFont);
        menuFrame.setForeground(new Color(-28339));
        menuFrame.setMaximumSize(new Dimension(1090, 30));
        menuFrame.setMinimumSize(new Dimension(1090, 30));
        menuFrame.setPreferredSize(new Dimension(1090, 30));
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        towerFrame.add(menuFrame, gbc);
        HEROCREATEButton = new JButton();
        HEROCREATEButton.setBackground(new Color(-15132304));
        HEROCREATEButton.setFocusable(false);
        Font HEROCREATEButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, HEROCREATEButton.getFont());
        if (HEROCREATEButtonFont != null) HEROCREATEButton.setFont(HEROCREATEButtonFont);
        HEROCREATEButton.setForeground(new Color(-28339));
        HEROCREATEButton.setText("HERO CREATE");
        menuFrame.add(HEROCREATEButton);
        RESTARTButton = new JButton();
        RESTARTButton.setBackground(new Color(-15132304));
        RESTARTButton.setFocusable(false);
        Font RESTARTButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, RESTARTButton.getFont());
        if (RESTARTButtonFont != null) RESTARTButton.setFont(RESTARTButtonFont);
        RESTARTButton.setForeground(new Color(-28339));
        RESTARTButton.setText("RESTART");
        menuFrame.add(RESTARTButton);
        levelName = new JTextPane();
        levelName.setAutoscrolls(true);
        levelName.setBackground(new Color(-16777216));
        levelName.setEditable(false);
        levelName.setFocusable(false);
        Font levelNameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, levelName.getFont());
        if (levelNameFont != null) levelName.setFont(levelNameFont);
        levelName.setForeground(new Color(-28339));
        levelName.setMargin(new Insets(3, 150, 3, 3));
        levelName.setMaximumSize(new Dimension(600, 2147483647));
        levelName.setMinimumSize(new Dimension(600, 26));
        levelName.setPreferredSize(new Dimension(600, 30));
        levelName.setText("Tower Entrance");
        menuFrame.add(levelName);
        contestantFrame = new JPanel();
        contestantFrame.setBackground(new Color(-16777216));
        Font contestantFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, contestantFrame.getFont());
        if (contestantFrameFont != null) contestantFrame.setFont(contestantFrameFont);
        contestantFrame.setForeground(new Color(-28339));
        contestantFrame.setMaximumSize(new Dimension(1090, 500));
        contestantFrame.setMinimumSize(new Dimension(1090, 500));
        contestantFrame.setPreferredSize(new Dimension(1090, 500));
        contestantFrame.setLayout(null);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        towerFrame.add(contestantFrame, gbc);
        contestantFrame.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-28339)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        heroFrame = new JPanel();
        heroFrame.setOpaque(false);
        heroFrame.setBounds(1, 1, 534, 482);
        heroFrame.setLayout(new BorderLayout(0, 0));
        heroFrame.setBackground(new Color(-16777216));
        heroFrame.setDoubleBuffered(true);
        heroFrame.setEnabled(true);
        heroFrame.setFocusable(false);
        Font heroFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, heroFrame.getFont());
        if (heroFrameFont != null) heroFrame.setFont(heroFrameFont);
        heroFrame.setForeground(new Color(-28339));
        contestantFrame.add(heroFrame);
        heroName = new JPanel();
        heroName.setLayout(new BorderLayout(0, 0));
        heroName.setBackground(new Color(-16777216));
        heroName.setForeground(new Color(-28339));
        heroName.putClientProperty("html.disable", Boolean.FALSE);
        heroFrame.add(heroName, BorderLayout.NORTH);
        hName = new JTextPane();
        hName.setBackground(new Color(-16777216));
        hName.setEditable(false);
        Font hNameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hName.getFont());
        if (hNameFont != null) hName.setFont(hNameFont);
        hName.setForeground(new Color(-16711681));
        hName.setMargin(new Insets(12, 130, 3, 3));
        hName.setText("hero name");
        hName.putClientProperty("html.disable", Boolean.FALSE);
        heroName.add(hName, BorderLayout.CENTER);
        heroStats = new JPanel();
        heroStats.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        heroStats.setBackground(new Color(-16777216));
        Font heroStatsFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, heroStats.getFont());
        if (heroStatsFont != null) heroStats.setFont(heroStatsFont);
        heroStats.setForeground(new Color(-28339));
        heroStats.setMaximumSize(new Dimension(545, 32767));
        heroStats.setMinimumSize(new Dimension(545, 32));
        heroStats.setPreferredSize(new Dimension(545, 32));
        heroFrame.add(heroStats, BorderLayout.SOUTH);
        heroStats.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-28339)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-16777216));
        Font label1Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-28339));
        label1.setHorizontalAlignment(2);
        label1.setText("Life:");
        heroStats.add(label1);
        hLifeValue = new JTextArea();
        hLifeValue.setBackground(new Color(-16777216));
        hLifeValue.setColumns(0);
        hLifeValue.setEditable(false);
        Font hLifeValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hLifeValue.getFont());
        if (hLifeValueFont != null) hLifeValue.setFont(hLifeValueFont);
        hLifeValue.setForeground(new Color(-16711681));
        hLifeValue.setMargin(new Insets(0, 0, 0, 20));
        hLifeValue.setText("5");
        heroStats.add(hLifeValue);
        final JLabel label2 = new JLabel();
        label2.setBackground(new Color(-16777216));
        Font label2Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-28339));
        label2.setText("Strenght:");
        heroStats.add(label2);
        hStrValue = new JTextArea();
        hStrValue.setBackground(new Color(-16777216));
        hStrValue.setColumns(0);
        hStrValue.setEditable(false);
        Font hStrValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hStrValue.getFont());
        if (hStrValueFont != null) hStrValue.setFont(hStrValueFont);
        hStrValue.setForeground(new Color(-16711681));
        hStrValue.setMargin(new Insets(0, 0, 0, 20));
        hStrValue.setText("5");
        heroStats.add(hStrValue);
        final JLabel label3 = new JLabel();
        label3.setBackground(new Color(-16777216));
        Font label3Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-28339));
        label3.setText("Skill:");
        heroStats.add(label3);
        hSklValue = new JTextArea();
        hSklValue.setBackground(new Color(-16777216));
        hSklValue.setColumns(0);
        hSklValue.setEditable(false);
        Font hSklValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hSklValue.getFont());
        if (hSklValueFont != null) hSklValue.setFont(hSklValueFont);
        hSklValue.setForeground(new Color(-16711681));
        hSklValue.setMargin(new Insets(0, 0, 0, 20));
        hSklValue.setText("5");
        heroStats.add(hSklValue);
        final JLabel label4 = new JLabel();
        label4.setBackground(new Color(-16777216));
        Font label4Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-28339));
        label4.setText("Magicka:");
        heroStats.add(label4);
        hMgkValue = new JTextArea();
        hMgkValue.setBackground(new Color(-16777216));
        hMgkValue.setColumns(0);
        hMgkValue.setEditable(false);
        Font hMgkValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hMgkValue.getFont());
        if (hMgkValueFont != null) hMgkValue.setFont(hMgkValueFont);
        hMgkValue.setForeground(new Color(-16711681));
        hMgkValue.setMargin(new Insets(0, 0, 0, 20));
        hMgkValue.setText("5");
        heroStats.add(hMgkValue);
        heroImg = new JLabel();
        heroImg.setAlignmentY(0.0f);
        heroImg.setDoubleBuffered(true);
        heroImg.setText("");
        heroImg.setVerticalAlignment(3);
        heroImg.setVerticalTextPosition(3);
        heroFrame.add(heroImg, BorderLayout.WEST);
        heroRoll = new JLabel();
        heroRoll.setHorizontalAlignment(2);
        heroRoll.setHorizontalTextPosition(2);
        heroRoll.setText("");
        heroFrame.add(heroRoll, BorderLayout.CENTER);
        enemyFrame = new JPanel();
        enemyFrame.setOpaque(false);
        enemyFrame.setBounds(565, 1, 534, 482);
        enemyFrame.setLayout(new BorderLayout(0, 0));
        enemyFrame.setBackground(new Color(-16777216));
        enemyFrame.setFocusable(false);
        Font enemyFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, enemyFrame.getFont());
        if (enemyFrameFont != null) enemyFrame.setFont(enemyFrameFont);
        enemyFrame.setForeground(new Color(-28339));
        enemyFrame.setMaximumSize(new Dimension(545, 2147483647));
        enemyFrame.setMinimumSize(new Dimension(545, 78));
        enemyFrame.setPreferredSize(new Dimension(545, 78));
        enemyFrame.putClientProperty("html.disable", Boolean.FALSE);
        contestantFrame.add(enemyFrame);
        enemyName = new JPanel();
        enemyName.setLayout(new BorderLayout(0, 0));
        enemyName.setBackground(new Color(-16777216));
        enemyName.setForeground(new Color(-28339));
        enemyFrame.add(enemyName, BorderLayout.NORTH);
        final JLabel label5 = new JLabel();
        label5.setBackground(new Color(-16777216));
        Font label5Font = this.$$$getFont$$$("Castellar", Font.BOLD, 12, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-28339));
        label5.setText("Next roll:");
        label5.putClientProperty("html.disable", Boolean.FALSE);
        enemyName.add(label5, BorderLayout.WEST);
        eNextRoll = new JTextArea();
        eNextRoll.setBackground(new Color(-16777216));
        eNextRoll.setColumns(20);
        eNextRoll.setEditable(false);
        Font eNextRollFont = this.$$$getFont$$$("Castellar", Font.BOLD, 14, eNextRoll.getFont());
        if (eNextRollFont != null) eNextRoll.setFont(eNextRollFont);
        eNextRoll.setForeground(new Color(-16711681));
        eNextRoll.setMargin(new Insets(14, 5, 0, 0));
        eNextRoll.setPreferredSize(new Dimension(340, 33));
        eNextRoll.setText("Enemy Next Roll");
        eNextRoll.putClientProperty("html.disable", Boolean.FALSE);
        enemyName.add(eNextRoll, BorderLayout.CENTER);
        eName = new JTextPane();
        eName.setBackground(new Color(-16777216));
        eName.setEditable(false);
        Font eNameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eName.getFont());
        if (eNameFont != null) eName.setFont(eNameFont);
        eName.setForeground(new Color(-28339));
        eName.setMargin(new Insets(12, 5, 3, 10));
        eName.setMaximumSize(new Dimension(200, 46));
        eName.setMinimumSize(new Dimension(200, 46));
        eName.setPreferredSize(new Dimension(250, 46));
        eName.setText("PLACEMENT HERO");
        enemyName.add(eName, BorderLayout.EAST);
        enemyStats = new JPanel();
        enemyStats.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        enemyStats.setBackground(new Color(-16777216));
        Font enemyStatsFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, enemyStats.getFont());
        if (enemyStatsFont != null) enemyStats.setFont(enemyStatsFont);
        enemyStats.setForeground(new Color(-28339));
        enemyStats.putClientProperty("html.disable", Boolean.FALSE);
        enemyFrame.add(enemyStats, BorderLayout.SOUTH);
        enemyStats.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-28339)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JLabel label6 = new JLabel();
        label6.setBackground(new Color(-16777216));
        Font label6Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setForeground(new Color(-28339));
        label6.setHorizontalAlignment(2);
        label6.setHorizontalTextPosition(2);
        label6.setText("Life:");
        label6.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(label6);
        eLifeValue = new JTextArea();
        eLifeValue.setBackground(new Color(-16777216));
        eLifeValue.setColumns(0);
        eLifeValue.setEditable(false);
        Font eLifeValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eLifeValue.getFont());
        if (eLifeValueFont != null) eLifeValue.setFont(eLifeValueFont);
        eLifeValue.setForeground(new Color(-16711681));
        eLifeValue.setMargin(new Insets(0, 0, 0, 20));
        eLifeValue.setText("5");
        eLifeValue.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(eLifeValue);
        final JLabel label7 = new JLabel();
        label7.setBackground(new Color(-16777216));
        Font label7Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setForeground(new Color(-28339));
        label7.setText("Strenght:");
        label7.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(label7);
        eStrValue = new JTextArea();
        eStrValue.setBackground(new Color(-16777216));
        eStrValue.setColumns(0);
        eStrValue.setEditable(false);
        Font eStrValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eStrValue.getFont());
        if (eStrValueFont != null) eStrValue.setFont(eStrValueFont);
        eStrValue.setForeground(new Color(-16711681));
        eStrValue.setMargin(new Insets(0, 0, 0, 20));
        eStrValue.setText("5");
        eStrValue.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(eStrValue);
        final JLabel label8 = new JLabel();
        label8.setBackground(new Color(-16777216));
        Font label8Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label8.getFont());
        if (label8Font != null) label8.setFont(label8Font);
        label8.setForeground(new Color(-28339));
        label8.setText("Skill:");
        label8.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(label8);
        eSklValue = new JTextArea();
        eSklValue.setBackground(new Color(-16777216));
        eSklValue.setColumns(0);
        eSklValue.setEditable(false);
        Font eSklValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eSklValue.getFont());
        if (eSklValueFont != null) eSklValue.setFont(eSklValueFont);
        eSklValue.setForeground(new Color(-16711681));
        eSklValue.setMargin(new Insets(0, 0, 0, 20));
        eSklValue.setText("5");
        eSklValue.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(eSklValue);
        final JLabel label9 = new JLabel();
        label9.setBackground(new Color(-16777216));
        Font label9Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label9.getFont());
        if (label9Font != null) label9.setFont(label9Font);
        label9.setForeground(new Color(-28339));
        label9.setText("Magicka:");
        label9.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(label9);
        eMgkValue = new JTextArea();
        eMgkValue.setBackground(new Color(-16777216));
        eMgkValue.setColumns(0);
        eMgkValue.setEditable(false);
        Font eMgkValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eMgkValue.getFont());
        if (eMgkValueFont != null) eMgkValue.setFont(eMgkValueFont);
        eMgkValue.setForeground(new Color(-16711681));
        eMgkValue.setMargin(new Insets(0, 0, 0, 20));
        eMgkValue.setText("5");
        eMgkValue.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(eMgkValue);
        enemyImg = new JLabel();
        enemyImg.setDoubleBuffered(true);
        enemyImg.setHorizontalAlignment(2);
        enemyImg.setHorizontalTextPosition(2);
        enemyImg.setText("");
        enemyFrame.add(enemyImg, BorderLayout.EAST);
        enemyRoll = new JLabel();
        enemyRoll.setHorizontalAlignment(4);
        enemyRoll.setHorizontalTextPosition(4);
        enemyRoll.setText("");
        enemyFrame.add(enemyRoll, BorderLayout.CENTER);
        actionPanel = new JPanel();
        actionPanel.setBounds(1, 483, 1098, 33);
        actionPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        actionPanel.setBackground(new Color(-16777216));
        Font actionPanelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, actionPanel.getFont());
        if (actionPanelFont != null) actionPanel.setFont(actionPanelFont);
        actionPanel.setForeground(new Color(-28339));
        contestantFrame.add(actionPanel);
        strengthBtn = new JButton();
        strengthBtn.setBackground(new Color(-15132304));
        strengthBtn.setEnabled(true);
        strengthBtn.setFocusPainted(true);
        strengthBtn.setFocusable(false);
        Font strengthBtnFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, strengthBtn.getFont());
        if (strengthBtnFont != null) strengthBtn.setFont(strengthBtnFont);
        strengthBtn.setForeground(new Color(-28339));
        strengthBtn.setName("strBtn");
        strengthBtn.setSelected(false);
        strengthBtn.setText("Strength");
        actionPanel.add(strengthBtn);
        sklButton = new JButton();
        sklButton.setBackground(new Color(-15132304));
        sklButton.setFocusable(false);
        Font sklButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, sklButton.getFont());
        if (sklButtonFont != null) sklButton.setFont(sklButtonFont);
        sklButton.setForeground(new Color(-28339));
        sklButton.setText("Skill");
        actionPanel.add(sklButton);
        mgkButton = new JButton();
        mgkButton.setBackground(new Color(-15132304));
        mgkButton.setFocusable(false);
        Font mgkButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, mgkButton.getFont());
        if (mgkButtonFont != null) mgkButton.setFont(mgkButtonFont);
        mgkButton.setForeground(new Color(-28339));
        mgkButton.setText("Magicka");
        actionPanel.add(mgkButton);
        cureButton = new JButton();
        cureButton.setBackground(new Color(-15132304));
        cureButton.setFocusable(false);
        Font cureButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, cureButton.getFont());
        if (cureButtonFont != null) cureButton.setFont(cureButtonFont);
        cureButton.setForeground(new Color(-28339));
        cureButton.setText("Heal");
        actionPanel.add(cureButton);
        inventoryPanel = new JPanel();
        inventoryPanel.setLayout(new GridBagLayout());
        inventoryPanel.setBackground(new Color(-16777216));
        Font inventoryPanelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, inventoryPanel.getFont());
        if (inventoryPanelFont != null) inventoryPanel.setFont(inventoryPanelFont);
        inventoryPanel.setForeground(new Color(-28339));
        inventoryPanel.setToolTipText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        towerFrame.add(inventoryPanel, gbc);
        inventoryPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-28339)), "Inventory", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JLabel label10 = new JLabel();
        Font label10Font = this.$$$getFont$$$("Castellar", Font.BOLD, 20, label10.getFont());
        if (label10Font != null) label10.setFont(label10Font);
        label10.setForeground(new Color(-28339));
        label10.setText("NOT IMPLEMEMTED");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        inventoryPanel.add(label10, gbc);
        towerStats = new JPanel();
        towerStats.setLayout(new GridBagLayout());
        towerStats.setBackground(new Color(-16777216));
        Font towerStatsFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, towerStats.getFont());
        if (towerStatsFont != null) towerStats.setFont(towerStatsFont);
        towerStats.setForeground(new Color(-28339));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 0, 0, 0);
        towerFrame.add(towerStats, gbc);
        towerStats.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-28339)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        turnPanel = new JPanel();
        turnPanel.setLayout(new BorderLayout(0, 0));
        turnPanel.setBackground(new Color(-16777216));
        turnPanel.setForeground(new Color(-16777216));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        towerStats.add(turnPanel, gbc);
        final JLabel label11 = new JLabel();
        label11.setBackground(new Color(-16777216));
        Font label11Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label11.getFont());
        if (label11Font != null) label11.setFont(label11Font);
        label11.setForeground(new Color(-28339));
        label11.setHorizontalAlignment(4);
        label11.setHorizontalTextPosition(4);
        label11.setMaximumSize(new Dimension(200, 20));
        label11.setMinimumSize(new Dimension(200, 20));
        label11.setPreferredSize(new Dimension(200, 20));
        label11.setText("Current Turn:");
        turnPanel.add(label11, BorderLayout.WEST);
        turnNumber = new JTextArea();
        turnNumber.setBackground(new Color(-16777216));
        turnNumber.setEditable(false);
        Font turnNumberFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, turnNumber.getFont());
        if (turnNumberFont != null) turnNumber.setFont(turnNumberFont);
        turnNumber.setForeground(new Color(-16711681));
        turnNumber.setMargin(new Insets(0, 15, 0, 0));
        turnNumber.setText("0");
        turnPanel.add(turnNumber, BorderLayout.CENTER);
        towerLevelPanel = new JPanel();
        towerLevelPanel.setLayout(new BorderLayout(0, 0));
        towerLevelPanel.setBackground(new Color(-16777216));
        towerLevelPanel.setForeground(new Color(-16777216));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        towerStats.add(towerLevelPanel, gbc);
        final JLabel label12 = new JLabel();
        label12.setBackground(new Color(-16777216));
        Font label12Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label12.getFont());
        if (label12Font != null) label12.setFont(label12Font);
        label12.setForeground(new Color(-28339));
        label12.setHorizontalAlignment(4);
        label12.setHorizontalTextPosition(4);
        label12.setMaximumSize(new Dimension(200, 20));
        label12.setMinimumSize(new Dimension(200, 20));
        label12.setPreferredSize(new Dimension(200, 20));
        label12.setText("Tower Level:");
        towerLevelPanel.add(label12, BorderLayout.WEST);
        towerLevel = new JTextArea();
        towerLevel.setBackground(new Color(-16777216));
        towerLevel.setEditable(false);
        Font towerLevelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, towerLevel.getFont());
        if (towerLevelFont != null) towerLevel.setFont(towerLevelFont);
        towerLevel.setForeground(new Color(-16711681));
        towerLevel.setMargin(new Insets(0, 15, 0, 0));
        towerLevel.setText("0");
        towerLevelPanel.add(towerLevel, BorderLayout.CENTER);
        gameConsolePane = new JScrollPane();
        gameConsolePane.setPreferredSize(new Dimension(2, 200));
        gameConsolePane.setMaximumSize(new Dimension(32767, 200));
        gameConsolePane.setBackground(new Color(-16777216));
        gameConsolePane.setForeground(new Color(-16711681));
        gameConsolePane.setMinimumSize(new Dimension(14, 200));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        towerFrame.add(gameConsolePane, gbc);
        
        gameConsole = new JTextArea();
        gameConsole.setBackground(Color.BLACK);
        gameConsole.setForeground(new Color(0, 255, 255));
        gameConsolePane.setViewportView(gameConsole);
        label1.setLabelFor(hLifeValue);
        label2.setLabelFor(hStrValue);
        label3.setLabelFor(hSklValue);
        label4.setLabelFor(hMgkValue);
        label5.setLabelFor(eLifeValue);
        label6.setLabelFor(eLifeValue);
        label7.setLabelFor(eStrValue);
        label8.setLabelFor(eSklValue);
        label9.setLabelFor(eMgkValue);
        
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Scobinow\\Desktop\\ToZ - Eclipse\\src\\main\\resources\\Tower\\towerlevels\\entrance.gif"));
        lblNewLabel.setBounds(1, 45, 1098, 405);
        contestantFrame.add(lblNewLabel);
        label11.setLabelFor(turnNumber);
        label12.setLabelFor(towerLevel);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return towerFrame;
    }


}