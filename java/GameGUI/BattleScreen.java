package GameGUI;

import GameGUI.InterfaceMechanics.BattleInterfaceMechanics;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;


public class BattleScreen extends JFrame {

    public static BattleScreen frame;

    private JButton HEROCREATEButton;
    public JButton RESTARTButton;
    public JTextField inputs;
    private JLabel inputsLabel;
    public JButton inputButton;
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
    private JLabel heroImg;
    private JLabel enemyImg;
    private JTextPane madeBy;

    private JScrollPane gameConsolePane;
    private JTextArea gameConsole;
    private JPanel madeByPanel;
    private JTextArea eNextRoll;
    public JLabel heroRoll;
    public JLabel enemyRoll;
    private Container TowerFrame;

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


    public static void updateHeroImg(BattleScreen tower, String path) {
        SwingUtilities.invokeLater(() -> {
            tower.heroImg.setIcon(new ImageIcon(BattleScreen.class.getResource(path)));
            tower.repaint();
        });
    }

    public static void updateEnemyImg(BattleScreen tower, String path) {
        SwingUtilities.invokeLater(() -> {
            tower.enemyImg.setIcon(new ImageIcon(BattleScreen.class.getResource(path)));
            tower.repaint();
        });
    }

    public static void updateNames(BattleScreen tower, String hName, String eName) {
        BattleInterfaceMechanics.setNames(tower, hName, eName);
    }

    public static void updateGui(BattleScreen tower, double hlife, int hstr, int hskl, int hmgk, double elife, int estr, int eskl, int emgk, int turn) {
        BattleInterfaceMechanics.updateHeroStats(tower, hlife, hstr, hskl, hmgk);
        BattleInterfaceMechanics.updateEnemyStats(tower, elife, estr, eskl, emgk);
        BattleInterfaceMechanics.updateTurnCounter(tower, turn);
    }

    public BattleScreen() {
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
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("BattleScreen");
        frame.setContentPane(new BattleScreen().towerFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
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
        towerFrame.setLayout(new GridLayoutManager(6, 1, new Insets(2, 5, 2, 5), -1, -1));
        towerFrame.setAutoscrolls(true);
        towerFrame.setBackground(new Color(-16777216));
        towerFrame.setEnabled(false);
        Font towerFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, towerFrame.getFont());
        if (towerFrameFont != null) towerFrame.setFont(towerFrameFont);
        towerFrame.setForeground(new Color(-28339));
        towerFrame.setVisible(true);
        menuFrame = new JPanel();
        menuFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        menuFrame.setBackground(new Color(-16777216));
        Font menuFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, menuFrame.getFont());
        if (menuFrameFont != null) menuFrame.setFont(menuFrameFont);
        menuFrame.setForeground(new Color(-28339));
        towerFrame.add(menuFrame, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        HEROCREATEButton = new JButton();
        HEROCREATEButton.setBackground(new Color(-15132304));
        Font HEROCREATEButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, HEROCREATEButton.getFont());
        if (HEROCREATEButtonFont != null) HEROCREATEButton.setFont(HEROCREATEButtonFont);
        HEROCREATEButton.setForeground(new Color(-28339));
        HEROCREATEButton.setText("HERO CREATE");
        menuFrame.add(HEROCREATEButton);
        RESTARTButton = new JButton();
        RESTARTButton.setBackground(new Color(-15132304));
        Font RESTARTButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, RESTARTButton.getFont());
        if (RESTARTButtonFont != null) RESTARTButton.setFont(RESTARTButtonFont);
        RESTARTButton.setForeground(new Color(-28339));
        RESTARTButton.setText("RESTART");
        menuFrame.add(RESTARTButton);
        titleFrame = new JTextPane();
        titleFrame.setBackground(new Color(-16777216));
        titleFrame.setEditable(false);
        titleFrame.setEnabled(true);
        Font titleFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 36, titleFrame.getFont());
        if (titleFrameFont != null) titleFrame.setFont(titleFrameFont);
        titleFrame.setForeground(new Color(-28339));
        titleFrame.setInheritsPopupMenu(false);
        titleFrame.setMargin(new Insets(3, 200, 3, 3));
        titleFrame.setMinimumSize(new Dimension(-1, -1));
        titleFrame.setOpaque(true);
        titleFrame.setText("Tower Of Zanas!");
        titleFrame.putClientProperty("JEditorPane.w3cLengthUnits", Boolean.FALSE);
        titleFrame.putClientProperty("caretWidth", new Integer(10));
        titleFrame.putClientProperty("charset", "");
        menuFrame.add(titleFrame);
        contestantFrame = new JPanel();
        contestantFrame.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        contestantFrame.setBackground(new Color(-16777216));
        Font contestantFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, contestantFrame.getFont());
        if (contestantFrameFont != null) contestantFrame.setFont(contestantFrameFont);
        contestantFrame.setForeground(new Color(-28339));
        towerFrame.add(contestantFrame, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(24, 451), null, 0, false));
        heroFrame = new JPanel();
        heroFrame.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 15), -1, -1));
        heroFrame.setBackground(new Color(-16777216));
        heroFrame.setDoubleBuffered(false);
        heroFrame.setEnabled(true);
        Font heroFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, heroFrame.getFont());
        if (heroFrameFont != null) heroFrame.setFont(heroFrameFont);
        heroFrame.setForeground(new Color(-28339));
        contestantFrame.add(heroFrame, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(24, 418), null, 0, false));
        heroFrame.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-28339)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        heroStats = new JPanel();
        heroStats.setLayout(new GridLayoutManager(1, 8, new Insets(0, 0, 0, 0), -1, -1));
        heroStats.setBackground(new Color(-16777216));
        Font heroStatsFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, heroStats.getFont());
        if (heroStatsFont != null) heroStats.setFont(heroStatsFont);
        heroStats.setForeground(new Color(-28339));
        heroFrame.add(heroStats, new GridConstraints(2, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-16777216));
        Font label1Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-28339));
        label1.setText("Life:");
        heroStats.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 3, false));
        hLifeValue = new JTextArea();
        hLifeValue.setBackground(new Color(-16777216));
        hLifeValue.setEditable(false);
        Font hLifeValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hLifeValue.getFont());
        if (hLifeValueFont != null) hLifeValue.setFont(hLifeValueFont);
        hLifeValue.setForeground(new Color(-16711681));
        hLifeValue.setText("");
        heroStats.add(hLifeValue, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 2, false));
        final JLabel label2 = new JLabel();
        label2.setBackground(new Color(-16777216));
        Font label2Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-28339));
        label2.setText("Strenght:");
        heroStats.add(label2, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        hStrValue = new JTextArea();
        hStrValue.setBackground(new Color(-16777216));
        hStrValue.setEditable(false);
        Font hStrValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hStrValue.getFont());
        if (hStrValueFont != null) hStrValue.setFont(hStrValueFont);
        hStrValue.setForeground(new Color(-16711681));
        hStrValue.setText("");
        heroStats.add(hStrValue, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 2, false));
        final JLabel label3 = new JLabel();
        label3.setBackground(new Color(-16777216));
        Font label3Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-28339));
        label3.setText("Skill:");
        heroStats.add(label3, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setBackground(new Color(-16777216));
        Font label4Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-28339));
        label4.setText("Magicka:");
        heroStats.add(label4, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        hMgkValue = new JTextArea();
        hMgkValue.setBackground(new Color(-16777216));
        hMgkValue.setEditable(false);
        Font hMgkValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hMgkValue.getFont());
        if (hMgkValueFont != null) hMgkValue.setFont(hMgkValueFont);
        hMgkValue.setForeground(new Color(-16711681));
        hMgkValue.setText("");
        heroStats.add(hMgkValue, new GridConstraints(0, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 2, false));
        hSklValue = new JTextArea();
        hSklValue.setBackground(new Color(-16777216));
        hSklValue.setEditable(false);
        Font hSklValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hSklValue.getFont());
        if (hSklValueFont != null) hSklValue.setFont(hSklValueFont);
        hSklValue.setForeground(new Color(-16711681));
        hSklValue.setText("");
        heroStats.add(hSklValue, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 2, false));
        heroName = new JPanel();
        heroName.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        heroName.setBackground(new Color(-16777216));
        heroName.setForeground(new Color(-28339));
        heroName.putClientProperty("html.disable", Boolean.FALSE);
        heroFrame.add(heroName, new GridConstraints(0, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        hName = new JTextPane();
        hName.setBackground(new Color(-16777216));
        hName.setEditable(false);
        Font hNameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, hName.getFont());
        if (hNameFont != null) hName.setFont(hNameFont);
        hName.setForeground(new Color(-16711681));
        hName.setMargin(new Insets(3, 130, 3, 3));
        hName.setText("hero name");
        hName.putClientProperty("html.disable", Boolean.FALSE);
        heroName.add(hName, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, -1), null, 0, false));
        final Spacer spacer1 = new Spacer();
        heroFrame.add(spacer1, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        heroImg = new JLabel();
        heroImg.setDoubleBuffered(true);
        heroImg.setText("");
        heroFrame.add(heroImg, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 6, false));
        heroRoll = new JLabel();
        heroRoll.setHorizontalAlignment(2);
        heroRoll.setHorizontalTextPosition(2);
        heroRoll.setText("");
        heroFrame.add(heroRoll, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 7, false));
        enemyFrame = new JPanel();
        enemyFrame.setLayout(new GridLayoutManager(3, 4, new Insets(0, 15, 0, 0), -1, -1));
        enemyFrame.setBackground(new Color(-16777216));
        Font enemyFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, enemyFrame.getFont());
        if (enemyFrameFont != null) enemyFrame.setFont(enemyFrameFont);
        enemyFrame.setForeground(new Color(-28339));
        enemyFrame.putClientProperty("html.disable", Boolean.FALSE);
        contestantFrame.add(enemyFrame, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(24, 418), null, 0, false));
        enemyFrame.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-28339)), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        enemyStats = new JPanel();
        enemyStats.setLayout(new GridLayoutManager(1, 8, new Insets(0, 0, 0, 0), -1, -1));
        enemyStats.setBackground(new Color(-16777216));
        Font enemyStatsFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, enemyStats.getFont());
        if (enemyStatsFont != null) enemyStats.setFont(enemyStatsFont);
        enemyStats.setForeground(new Color(-28339));
        enemyStats.putClientProperty("html.disable", Boolean.FALSE);
        enemyFrame.add(enemyStats, new GridConstraints(2, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setBackground(new Color(-16777216));
        Font label5Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-28339));
        label5.setHorizontalAlignment(2);
        label5.setHorizontalTextPosition(2);
        label5.setText("Life:");
        label5.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(label5, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        eLifeValue = new JTextArea();
        eLifeValue.setBackground(new Color(-16777216));
        eLifeValue.setEditable(false);
        Font eLifeValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eLifeValue.getFont());
        if (eLifeValueFont != null) eLifeValue.setFont(eLifeValueFont);
        eLifeValue.setForeground(new Color(-16711681));
        eLifeValue.setText("");
        eLifeValue.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(eLifeValue, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 1, false));
        final JLabel label6 = new JLabel();
        label6.setBackground(new Color(-16777216));
        Font label6Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setForeground(new Color(-28339));
        label6.setText("Strenght:");
        label6.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(label6, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        eStrValue = new JTextArea();
        eStrValue.setBackground(new Color(-16777216));
        eStrValue.setEditable(false);
        Font eStrValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eStrValue.getFont());
        if (eStrValueFont != null) eStrValue.setFont(eStrValueFont);
        eStrValue.setForeground(new Color(-16711681));
        eStrValue.setText("");
        eStrValue.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(eStrValue, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 1, false));
        final JLabel label7 = new JLabel();
        label7.setBackground(new Color(-16777216));
        Font label7Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setForeground(new Color(-28339));
        label7.setText("Skill:");
        label7.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(label7, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        eSklValue = new JTextArea();
        eSklValue.setBackground(new Color(-16777216));
        eSklValue.setEditable(false);
        Font eSklValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eSklValue.getFont());
        if (eSklValueFont != null) eSklValue.setFont(eSklValueFont);
        eSklValue.setForeground(new Color(-16711681));
        eSklValue.setText("");
        eSklValue.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(eSklValue, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 1, false));
        final JLabel label8 = new JLabel();
        label8.setBackground(new Color(-16777216));
        Font label8Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label8.getFont());
        if (label8Font != null) label8.setFont(label8Font);
        label8.setForeground(new Color(-28339));
        label8.setText("Magicka:");
        label8.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(label8, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        eMgkValue = new JTextArea();
        eMgkValue.setBackground(new Color(-16777216));
        eMgkValue.setEditable(false);
        Font eMgkValueFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eMgkValue.getFont());
        if (eMgkValueFont != null) eMgkValue.setFont(eMgkValueFont);
        eMgkValue.setForeground(new Color(-16711681));
        eMgkValue.setText("");
        eMgkValue.putClientProperty("html.disable", Boolean.FALSE);
        enemyStats.add(eMgkValue, new GridConstraints(0, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 1, false));
        enemyName = new JPanel();
        enemyName.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        enemyName.setBackground(new Color(-16777216));
        enemyName.setForeground(new Color(-28339));
        enemyFrame.add(enemyName, new GridConstraints(0, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        eName = new JTextPane();
        eName.setBackground(new Color(-16777216));
        eName.setEditable(false);
        Font eNameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, eName.getFont());
        if (eNameFont != null) eName.setFont(eNameFont);
        eName.setForeground(new Color(-28339));
        eName.setMargin(new Insets(3, 5, 3, 30));
        eName.setText("PLACEMENT HERO");
        enemyName.add(eName, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 4, false));
        final JLabel label9 = new JLabel();
        label9.setBackground(new Color(-16777216));
        Font label9Font = this.$$$getFont$$$("Castellar", Font.BOLD, 12, label9.getFont());
        if (label9Font != null) label9.setFont(label9Font);
        label9.setForeground(new Color(-28339));
        label9.setText("Next roll:");
        label9.putClientProperty("html.disable", Boolean.FALSE);
        enemyName.add(label9, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        eNextRoll = new JTextArea();
        eNextRoll.setBackground(new Color(-16777216));
        eNextRoll.setColumns(20);
        eNextRoll.setEditable(false);
        Font eNextRollFont = this.$$$getFont$$$("Castellar", Font.BOLD, 12, eNextRoll.getFont());
        if (eNextRollFont != null) eNextRoll.setFont(eNextRollFont);
        eNextRoll.setForeground(new Color(-16711681));
        eNextRoll.setText("Enemy Next Roll");
        eNextRoll.putClientProperty("html.disable", Boolean.FALSE);
        enemyName.add(eNextRoll, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 1, false));
        final Spacer spacer2 = new Spacer();
        enemyFrame.add(spacer2, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        enemyImg = new JLabel();
        enemyImg.setDoubleBuffered(true);
        enemyImg.setText("");
        enemyFrame.add(enemyImg, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, 1, 1, null, null, null, 0, false));
        enemyRoll = new JLabel();
        enemyRoll.setText("");
        enemyFrame.add(enemyRoll, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, 1, 1, new Dimension(64, 64), new Dimension(64, 64), new Dimension(64, 64), 0, false));
        actionPanel = new JPanel();
        actionPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        actionPanel.setBackground(new Color(-16777216));
        Font actionPanelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, actionPanel.getFont());
        if (actionPanelFont != null) actionPanel.setFont(actionPanelFont);
        actionPanel.setForeground(new Color(-28339));
        contestantFrame.add(actionPanel, new GridConstraints(1, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        strengthBtn = new JButton();
        strengthBtn.setBackground(new Color(-15132304));
        strengthBtn.setEnabled(true);
        strengthBtn.setFocusPainted(true);
        Font strengthBtnFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, strengthBtn.getFont());
        if (strengthBtnFont != null) strengthBtn.setFont(strengthBtnFont);
        strengthBtn.setForeground(new Color(-28339));
        strengthBtn.setName("strBtn");
        strengthBtn.setSelected(false);
        strengthBtn.setText("Strength");
        actionPanel.add(strengthBtn);
        sklButton = new JButton();
        sklButton.setBackground(new Color(-15132304));
        Font sklButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, sklButton.getFont());
        if (sklButtonFont != null) sklButton.setFont(sklButtonFont);
        sklButton.setForeground(new Color(-28339));
        sklButton.setText("Skill");
        actionPanel.add(sklButton);
        mgkButton = new JButton();
        mgkButton.setBackground(new Color(-15132304));
        Font mgkButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, mgkButton.getFont());
        if (mgkButtonFont != null) mgkButton.setFont(mgkButtonFont);
        mgkButton.setForeground(new Color(-28339));
        mgkButton.setText("Magicka");
        actionPanel.add(mgkButton);
        cureButton = new JButton();
        cureButton.setBackground(new Color(-15132304));
        Font cureButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, cureButton.getFont());
        if (cureButtonFont != null) cureButton.setFont(cureButtonFont);
        cureButton.setForeground(new Color(-28339));
        cureButton.setText("Heal");
        actionPanel.add(cureButton);
        inputsFrame = new JPanel();
        inputsFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        inputsFrame.setBackground(new Color(-16777216));
        Font inputsFrameFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, inputsFrame.getFont());
        if (inputsFrameFont != null) inputsFrame.setFont(inputsFrameFont);
        inputsFrame.setForeground(new Color(-28339));
        towerFrame.add(inputsFrame, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        inputsLabel = new JLabel();
        inputsLabel.setBackground(new Color(-16777216));
        Font inputsLabelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, inputsLabel.getFont());
        if (inputsLabelFont != null) inputsLabel.setFont(inputsLabelFont);
        inputsLabel.setForeground(new Color(-28339));
        inputsLabel.setText("Enter Your Name to Start");
        inputsFrame.add(inputsLabel);
        inputs = new JTextField();
        inputs.setBackground(new Color(-16777216));
        inputs.setColumns(15);
        Font inputsFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, inputs.getFont());
        if (inputsFont != null) inputs.setFont(inputsFont);
        inputs.setForeground(new Color(-16711681));
        inputs.setHorizontalAlignment(0);
        inputs.setName("input");
        inputs.setText(" ");
        inputs.putClientProperty("caretWidth", new Integer(-1));
        inputsFrame.add(inputs);
        inputButton = new JButton();
        inputButton.setBackground(new Color(-15132304));
        Font inputButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, inputButton.getFont());
        if (inputButtonFont != null) inputButton.setFont(inputButtonFont);
        inputButton.setForeground(new Color(-28339));
        inputButton.setText("OK");
        inputsFrame.add(inputButton);
        towerStats = new JPanel();
        towerStats.setLayout(new GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));
        towerStats.setBackground(new Color(-16777216));
        Font towerStatsFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, towerStats.getFont());
        if (towerStatsFont != null) towerStats.setFont(towerStatsFont);
        towerStats.setForeground(new Color(-28339));
        towerFrame.add(towerStats, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        towerStats.add(spacer3, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        label10.setBackground(new Color(-16777216));
        Font label10Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label10.getFont());
        if (label10Font != null) label10.setFont(label10Font);
        label10.setForeground(new Color(-2104859));
        label10.setText("Current Turn:");
        towerStats.add(label10, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        turnNumber = new JTextArea();
        turnNumber.setBackground(new Color(-16777216));
        turnNumber.setEditable(false);
        Font turnNumberFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, turnNumber.getFont());
        if (turnNumberFont != null) turnNumber.setFont(turnNumberFont);
        turnNumber.setForeground(new Color(-16711681));
        turnNumber.setText("0");
        towerStats.add(turnNumber, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 2, false));
        final JLabel label11 = new JLabel();
        label11.setBackground(new Color(-16777216));
        Font label11Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label11.getFont());
        if (label11Font != null) label11.setFont(label11Font);
        label11.setForeground(new Color(-2104859));
        label11.setText("Tower Level:");
        towerStats.add(label11, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        towerLevel = new JTextArea();
        towerLevel.setBackground(new Color(-16777216));
        towerLevel.setEditable(false);
        Font towerLevelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, towerLevel.getFont());
        if (towerLevelFont != null) towerLevel.setFont(towerLevelFont);
        towerLevel.setForeground(new Color(-16711681));
        towerLevel.setText("0");
        towerStats.add(towerLevel, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 2, false));
        madeByPanel = new JPanel();
        madeByPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        towerFrame.add(madeByPanel, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        madeBy = new JTextPane();
        madeBy.setBackground(new Color(-28339));
        madeBy.setEditable(false);
        Font madeByFont = this.$$$getFont$$$("Monospaced", Font.BOLD, 16, madeBy.getFont());
        if (madeByFont != null) madeBy.setFont(madeByFont);
        madeBy.setForeground(new Color(-16777216));
        madeBy.setText("Made By Rafael Scobino | scorafa.com");
        madeByPanel.add(madeBy, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(150, 50), null, 0, false));
        gameConsolePane = new JScrollPane();
        gameConsolePane.setAutoscrolls(true);
        gameConsolePane.setBackground(new Color(-16777216));
        Font gameConsolePaneFont = this.$$$getFont$$$("Monospaced", Font.BOLD, 14, gameConsolePane.getFont());
        if (gameConsolePaneFont != null) gameConsolePane.setFont(gameConsolePaneFont);
        gameConsolePane.setForeground(new Color(-16711681));
        gameConsolePane.setHorizontalScrollBarPolicy(30);
        towerFrame.add(gameConsolePane, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        gameConsole = new JTextArea();
        gameConsole.setBackground(new Color(-16777216));
        gameConsole.setEditable(false);
        Font gameConsoleFont = this.$$$getFont$$$("Monospaced", Font.PLAIN, 14, gameConsole.getFont());
        if (gameConsoleFont != null) gameConsole.setFont(gameConsoleFont);
        gameConsole.setForeground(new Color(-16711681));
        gameConsole.setLineWrap(true);
        gameConsole.setMargin(new Insets(2, 2, 2, 2));
        gameConsole.setRows(10);
        gameConsole.setText("");
        gameConsole.setWrapStyleWord(false);
        gameConsolePane.setViewportView(gameConsole);
        label1.setLabelFor(hLifeValue);
        label2.setLabelFor(hStrValue);
        label3.setLabelFor(hSklValue);
        label4.setLabelFor(hMgkValue);
        label5.setLabelFor(eLifeValue);
        label6.setLabelFor(eStrValue);
        label7.setLabelFor(eSklValue);
        label8.setLabelFor(eMgkValue);
        label9.setLabelFor(eLifeValue);
        inputsLabel.setLabelFor(inputs);
        label10.setLabelFor(turnNumber);
        label11.setLabelFor(towerLevel);
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