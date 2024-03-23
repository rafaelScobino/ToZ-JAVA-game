package GameGUI;

import GameGUI.InterfaceMechanics.HeroCreateMechanics;
import GameMechanics.Tower;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class HeroCreationScreen extends JPanel {
    public JPanel heroCreateScreen;
    public JTextArea gameTitle;
    public JTextPane hcTitle;
    public JPanel titlePanel;
    public JLabel heroImg;
    public JPanel heroPanel;
    public JPanel heroStats;
    public JPanel heroClass;
    public JTextPane lifeTextPane;
    public JPanel lifePanel;
    public JPanel strPanel;
    public JPanel sklPanel;
    public JPanel mgkPanel;
    public JRadioButton warriorRadioButton;
    public JRadioButton rangerRadioButton;
    public JRadioButton wizardRadioButton;
    public JRadioButton fighterRadioButton;
    public JTextField nameInput;
    public JPanel nameImg;
    public JPanel namePanel;
    public JPanel blank;
    public JButton startBtn;
    public JPanel starPanel;
    public JTextPane strValueTextPane;
    public JTextPane skillValuTextPane;
    public JTextPane magkValueTextPane;

    public HeroCreationScreen() {
        warriorRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HeroCreateMechanics.setClassSelected("warrior");
                HeroCreateMechanics.setClassDisplay(HeroCreationScreen.this);
            }
        });
        rangerRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HeroCreateMechanics.setClassSelected("ranger");
                HeroCreateMechanics.setClassDisplay(HeroCreationScreen.this);
            }
        });
        wizardRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HeroCreateMechanics.setClassSelected("wizard");
                HeroCreateMechanics.setClassDisplay(HeroCreationScreen.this);
            }
        });
        fighterRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HeroCreateMechanics.setClassSelected("fighter");
                HeroCreateMechanics.setClassDisplay(HeroCreationScreen.this);
            }
        });
        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HeroCreateMechanics.setInputValue(nameInput.getText());
                HeroCreateMechanics.selectionMethod();
                Tower.setGameState("battle");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HeroCreationScreen");
        frame.setContentPane(new HeroCreationScreen().heroCreateScreen);
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
        heroCreateScreen = new JPanel();
        heroCreateScreen.setLayout(new BorderLayout(0, 0));
        heroCreateScreen.setBackground(new Color(-16777216));
        heroCreateScreen.setDoubleBuffered(false);
        heroCreateScreen.setMaximumSize(new Dimension(1100, 900));
        heroCreateScreen.setMinimumSize(new Dimension(1100, 900));
        heroCreateScreen.setPreferredSize(new Dimension(1100, 900));
        titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout(0, 0));
        titlePanel.setBackground(new Color(-16777216));
        titlePanel.setMaximumSize(new Dimension(1100, 200));
        titlePanel.setMinimumSize(new Dimension(1100, 200));
        titlePanel.setPreferredSize(new Dimension(1100, 200));
        heroCreateScreen.add(titlePanel, BorderLayout.NORTH);
        gameTitle = new JTextArea();
        gameTitle.setBackground(new Color(-16777216));
        gameTitle.setEditable(false);
        gameTitle.setFocusable(false);
        Font gameTitleFont = this.$$$getFont$$$("Castellar", Font.BOLD, 20, gameTitle.getFont());
        if (gameTitleFont != null) gameTitle.setFont(gameTitleFont);
        gameTitle.setForeground(new Color(-28339));
        gameTitle.setMargin(new Insets(20, 450, 0, 0));
        gameTitle.setMaximumSize(new Dimension(1100, 50));
        gameTitle.setMinimumSize(new Dimension(1100, 50));
        gameTitle.setPreferredSize(new Dimension(1100, 50));
        gameTitle.setText("Tower Of Zanas");
        titlePanel.add(gameTitle, BorderLayout.CENTER);
        hcTitle = new JTextPane();
        hcTitle.setBackground(new Color(-16777216));
        hcTitle.setEditable(false);
        hcTitle.setFocusable(false);
        Font hcTitleFont = this.$$$getFont$$$("Castellar", Font.BOLD, 28, hcTitle.getFont());
        if (hcTitleFont != null) hcTitle.setFont(hcTitleFont);
        hcTitle.setForeground(new Color(-28339));
        hcTitle.setMargin(new Insets(60, 420, 3, 3));
        hcTitle.setMaximumSize(new Dimension(1100, 150));
        hcTitle.setMinimumSize(new Dimension(1100, 150));
        hcTitle.setName("classSelect");
        hcTitle.setPreferredSize(new Dimension(1100, 150));
        hcTitle.setText("Hero Creation");
        titlePanel.add(hcTitle, BorderLayout.SOUTH);
        heroPanel = new JPanel();
        heroPanel.setLayout(new BorderLayout(0, 0));
        heroPanel.setBackground(new Color(-16777216));
        heroPanel.setMaximumSize(new Dimension(1100, 500));
        heroPanel.setMinimumSize(new Dimension(1100, 500));
        heroPanel.setPreferredSize(new Dimension(1100, 500));
        heroCreateScreen.add(heroPanel, BorderLayout.CENTER);
        heroStats = new JPanel();
        heroStats.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        heroStats.setBackground(new Color(-16777216));
        heroStats.setForeground(new Color(-28339));
        heroStats.setMaximumSize(new Dimension(400, 500));
        heroStats.setMinimumSize(new Dimension(400, 500));
        heroStats.setPreferredSize(new Dimension(400, 500));
        heroPanel.add(heroStats, BorderLayout.WEST);
        lifePanel = new JPanel();
        lifePanel.setLayout(new BorderLayout(0, 0));
        lifePanel.setBackground(new Color(-16777216));
        lifePanel.setFocusable(false);
        lifePanel.setMaximumSize(new Dimension(400, 115));
        lifePanel.setMinimumSize(new Dimension(400, 115));
        lifePanel.setOpaque(true);
        lifePanel.setPreferredSize(new Dimension(400, 115));
        heroStats.add(lifePanel);
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-16777216));
        Font label1Font = this.$$$getFont$$$("Castellar", Font.BOLD, 24, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-28339));
        label1.setHorizontalAlignment(4);
        label1.setHorizontalTextPosition(0);
        label1.setMaximumSize(new Dimension(200, 115));
        label1.setMinimumSize(new Dimension(200, 115));
        label1.setPreferredSize(new Dimension(200, 115));
        label1.setText("Life:");
        lifePanel.add(label1, BorderLayout.WEST);
        lifeTextPane = new JTextPane();
        lifeTextPane.setBackground(new Color(-16777216));
        lifeTextPane.setEditable(false);
        lifeTextPane.setFocusable(false);
        Font lifeTextPaneFont = this.$$$getFont$$$("Castellar", Font.BOLD, 18, lifeTextPane.getFont());
        if (lifeTextPaneFont != null) lifeTextPane.setFont(lifeTextPaneFont);
        lifeTextPane.setForeground(new Color(-16711681));
        lifeTextPane.setMargin(new Insets(48, 15, 3, 3));
        lifeTextPane.setMaximumSize(new Dimension(100, 115));
        lifeTextPane.setMinimumSize(new Dimension(100, 115));
        lifeTextPane.setPreferredSize(new Dimension(100, 115));
        lifeTextPane.setText("LifeValu");
        lifePanel.add(lifeTextPane, BorderLayout.CENTER);
        strPanel = new JPanel();
        strPanel.setLayout(new BorderLayout(0, 0));
        strPanel.setBackground(new Color(-16777216));
        strPanel.setFocusable(false);
        strPanel.setMaximumSize(new Dimension(400, 115));
        strPanel.setMinimumSize(new Dimension(400, 115));
        strPanel.setOpaque(true);
        strPanel.setPreferredSize(new Dimension(400, 115));
        heroStats.add(strPanel);
        final JLabel label2 = new JLabel();
        label2.setBackground(new Color(-16777216));
        Font label2Font = this.$$$getFont$$$("Castellar", Font.BOLD, 24, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-28339));
        label2.setHorizontalAlignment(4);
        label2.setHorizontalTextPosition(0);
        label2.setMaximumSize(new Dimension(200, 115));
        label2.setMinimumSize(new Dimension(200, 115));
        label2.setPreferredSize(new Dimension(200, 115));
        label2.setText("Strength:");
        strPanel.add(label2, BorderLayout.WEST);
        strValueTextPane = new JTextPane();
        strValueTextPane.setBackground(new Color(-16777216));
        strValueTextPane.setEditable(false);
        strValueTextPane.setFocusable(false);
        Font strValueTextPaneFont = this.$$$getFont$$$("Castellar", Font.BOLD, 18, strValueTextPane.getFont());
        if (strValueTextPaneFont != null) strValueTextPane.setFont(strValueTextPaneFont);
        strValueTextPane.setForeground(new Color(-16711681));
        strValueTextPane.setMargin(new Insets(48, 15, 3, 3));
        strValueTextPane.setMaximumSize(new Dimension(100, 115));
        strValueTextPane.setMinimumSize(new Dimension(100, 115));
        strValueTextPane.setPreferredSize(new Dimension(100, 115));
        strValueTextPane.setText("StrValue");
        strPanel.add(strValueTextPane, BorderLayout.CENTER);
        sklPanel = new JPanel();
        sklPanel.setLayout(new BorderLayout(0, 0));
        sklPanel.setBackground(new Color(-16777216));
        sklPanel.setFocusable(false);
        sklPanel.setMaximumSize(new Dimension(400, 115));
        sklPanel.setMinimumSize(new Dimension(400, 115));
        sklPanel.setOpaque(true);
        sklPanel.setPreferredSize(new Dimension(400, 115));
        heroStats.add(sklPanel);
        final JLabel label3 = new JLabel();
        label3.setBackground(new Color(-16777216));
        Font label3Font = this.$$$getFont$$$("Castellar", Font.BOLD, 24, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-28339));
        label3.setHorizontalAlignment(4);
        label3.setHorizontalTextPosition(0);
        label3.setMaximumSize(new Dimension(200, 115));
        label3.setMinimumSize(new Dimension(200, 115));
        label3.setPreferredSize(new Dimension(200, 115));
        label3.setText("Skill:");
        sklPanel.add(label3, BorderLayout.WEST);
        skillValuTextPane = new JTextPane();
        skillValuTextPane.setBackground(new Color(-16777216));
        skillValuTextPane.setEditable(false);
        skillValuTextPane.setFocusable(false);
        Font skillValuTextPaneFont = this.$$$getFont$$$("Castellar", Font.BOLD, 18, skillValuTextPane.getFont());
        if (skillValuTextPaneFont != null) skillValuTextPane.setFont(skillValuTextPaneFont);
        skillValuTextPane.setForeground(new Color(-16711681));
        skillValuTextPane.setMargin(new Insets(48, 15, 3, 3));
        skillValuTextPane.setMaximumSize(new Dimension(100, 115));
        skillValuTextPane.setMinimumSize(new Dimension(100, 115));
        skillValuTextPane.setPreferredSize(new Dimension(100, 115));
        skillValuTextPane.setText("SkillValu");
        sklPanel.add(skillValuTextPane, BorderLayout.CENTER);
        mgkPanel = new JPanel();
        mgkPanel.setLayout(new BorderLayout(0, 0));
        mgkPanel.setBackground(new Color(-16777216));
        mgkPanel.setFocusable(false);
        mgkPanel.setMaximumSize(new Dimension(400, 115));
        mgkPanel.setMinimumSize(new Dimension(400, 115));
        mgkPanel.setOpaque(true);
        mgkPanel.setPreferredSize(new Dimension(400, 115));
        heroStats.add(mgkPanel);
        final JLabel label4 = new JLabel();
        label4.setBackground(new Color(-16777216));
        Font label4Font = this.$$$getFont$$$("Castellar", Font.BOLD, 24, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-28339));
        label4.setHorizontalAlignment(4);
        label4.setHorizontalTextPosition(0);
        label4.setMaximumSize(new Dimension(200, 115));
        label4.setMinimumSize(new Dimension(200, 115));
        label4.setPreferredSize(new Dimension(200, 115));
        label4.setText("Magick:");
        mgkPanel.add(label4, BorderLayout.WEST);
        magkValueTextPane = new JTextPane();
        magkValueTextPane.setBackground(new Color(-16777216));
        magkValueTextPane.setEditable(false);
        magkValueTextPane.setFocusable(false);
        Font magkValueTextPaneFont = this.$$$getFont$$$("Castellar", Font.BOLD, 18, magkValueTextPane.getFont());
        if (magkValueTextPaneFont != null) magkValueTextPane.setFont(magkValueTextPaneFont);
        magkValueTextPane.setForeground(new Color(-16711681));
        magkValueTextPane.setMargin(new Insets(48, 15, 3, 3));
        magkValueTextPane.setMaximumSize(new Dimension(100, 115));
        magkValueTextPane.setMinimumSize(new Dimension(100, 115));
        magkValueTextPane.setPreferredSize(new Dimension(100, 115));
        magkValueTextPane.setText("MagkValue");
        mgkPanel.add(magkValueTextPane, BorderLayout.CENTER);
        heroClass = new JPanel();
        heroClass.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        heroClass.setBackground(new Color(-16777216));
        heroClass.setForeground(new Color(-28339));
        heroClass.setMaximumSize(new Dimension(400, 500));
        heroClass.setMinimumSize(new Dimension(400, 500));
        heroClass.setPreferredSize(new Dimension(400, 500));
        heroPanel.add(heroClass, BorderLayout.EAST);
        warriorRadioButton = new JRadioButton();
        warriorRadioButton.setBackground(new Color(-16777216));
        Font warriorRadioButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 22, warriorRadioButton.getFont());
        if (warriorRadioButtonFont != null) warriorRadioButton.setFont(warriorRadioButtonFont);
        warriorRadioButton.setForeground(new Color(-28339));
        warriorRadioButton.setHideActionText(false);
        warriorRadioButton.setHorizontalAlignment(0);
        warriorRadioButton.setHorizontalTextPosition(11);
        warriorRadioButton.setMaximumSize(new Dimension(400, 115));
        warriorRadioButton.setMinimumSize(new Dimension(400, 115));
        warriorRadioButton.setName("classSelect");
        warriorRadioButton.setPreferredSize(new Dimension(400, 115));
        warriorRadioButton.setText("Warrior");
        heroClass.add(warriorRadioButton);
        rangerRadioButton = new JRadioButton();
        rangerRadioButton.setBackground(new Color(-16777216));
        Font rangerRadioButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 22, rangerRadioButton.getFont());
        if (rangerRadioButtonFont != null) rangerRadioButton.setFont(rangerRadioButtonFont);
        rangerRadioButton.setForeground(new Color(-28339));
        rangerRadioButton.setHideActionText(false);
        rangerRadioButton.setHorizontalAlignment(0);
        rangerRadioButton.setHorizontalTextPosition(11);
        rangerRadioButton.setMaximumSize(new Dimension(400, 115));
        rangerRadioButton.setMinimumSize(new Dimension(400, 115));
        rangerRadioButton.setName("classSelect");
        rangerRadioButton.setPreferredSize(new Dimension(400, 115));
        rangerRadioButton.setText("Ranger");
        heroClass.add(rangerRadioButton);
        wizardRadioButton = new JRadioButton();
        wizardRadioButton.setBackground(new Color(-16777216));
        Font wizardRadioButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 22, wizardRadioButton.getFont());
        if (wizardRadioButtonFont != null) wizardRadioButton.setFont(wizardRadioButtonFont);
        wizardRadioButton.setForeground(new Color(-28339));
        wizardRadioButton.setHideActionText(false);
        wizardRadioButton.setHorizontalAlignment(0);
        wizardRadioButton.setHorizontalTextPosition(11);
        wizardRadioButton.setMaximumSize(new Dimension(400, 115));
        wizardRadioButton.setMinimumSize(new Dimension(400, 115));
        wizardRadioButton.setName("classSelect");
        wizardRadioButton.setPreferredSize(new Dimension(400, 115));
        wizardRadioButton.setText("Wizard");
        heroClass.add(wizardRadioButton);
        fighterRadioButton = new JRadioButton();
        fighterRadioButton.setBackground(new Color(-16777216));
        Font fighterRadioButtonFont = this.$$$getFont$$$("Castellar", Font.BOLD, 22, fighterRadioButton.getFont());
        if (fighterRadioButtonFont != null) fighterRadioButton.setFont(fighterRadioButtonFont);
        fighterRadioButton.setForeground(new Color(-28339));
        fighterRadioButton.setHideActionText(false);
        fighterRadioButton.setHorizontalAlignment(0);
        fighterRadioButton.setHorizontalTextPosition(11);
        fighterRadioButton.setMaximumSize(new Dimension(400, 115));
        fighterRadioButton.setMinimumSize(new Dimension(400, 115));
        fighterRadioButton.setName("classSelect");
        fighterRadioButton.setPreferredSize(new Dimension(400, 115));
        fighterRadioButton.setText("Fighter");
        heroClass.add(fighterRadioButton);
        nameImg = new JPanel();
        nameImg.setLayout(new BorderLayout(0, 0));
        nameImg.setBackground(new Color(-16777216));
        heroPanel.add(nameImg, BorderLayout.CENTER);
        heroImg = new JLabel();
        heroImg.setBackground(new Color(-16777216));
        heroImg.setDoubleBuffered(true);
        heroImg.setFocusable(false);
        heroImg.setHorizontalAlignment(0);
        heroImg.setHorizontalTextPosition(0);
        heroImg.setInheritsPopupMenu(true);
        heroImg.setMaximumSize(new Dimension(300, 300));
        heroImg.setMinimumSize(new Dimension(300, 300));
        heroImg.setPreferredSize(new Dimension(300, 300));
        heroImg.setText("");
        nameImg.add(heroImg, BorderLayout.CENTER);
        namePanel = new JPanel();
        namePanel.setLayout(new BorderLayout(0, 0));
        namePanel.setBackground(new Color(-16777216));
        namePanel.setForeground(new Color(-28339));
        namePanel.setMaximumSize(new Dimension(300, 100));
        namePanel.setMinimumSize(new Dimension(300, 100));
        namePanel.setPreferredSize(new Dimension(300, 100));
        nameImg.add(namePanel, BorderLayout.NORTH);
        final JLabel label5 = new JLabel();
        label5.setBackground(new Color(-16777216));
        label5.setFocusable(false);
        Font label5Font = this.$$$getFont$$$("Castellar", Font.BOLD, 16, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-28339));
        label5.setHorizontalAlignment(0);
        label5.setHorizontalTextPosition(0);
        label5.setMaximumSize(new Dimension(300, 50));
        label5.setMinimumSize(new Dimension(300, 50));
        label5.setPreferredSize(new Dimension(300, 50));
        label5.setText("Your Name");
        namePanel.add(label5, BorderLayout.NORTH);
        nameInput = new JTextField();
        nameInput.setBackground(new Color(-16777216));
        nameInput.setCaretColor(new Color(-28339));
        nameInput.setDisabledTextColor(new Color(-28339));
        Font nameInputFont = this.$$$getFont$$$("Castellar", Font.BOLD, 16, nameInput.getFont());
        if (nameInputFont != null) nameInput.setFont(nameInputFont);
        nameInput.setForeground(new Color(-16711681));
        nameInput.setMaximumSize(new Dimension(300, 50));
        nameInput.setMinimumSize(new Dimension(300, 50));
        nameInput.setPreferredSize(new Dimension(300, 50));
        nameInput.setSelectedTextColor(new Color(-28339));
        nameInput.setSelectionColor(new Color(-28339));
        nameInput.setText("");
        namePanel.add(nameInput, BorderLayout.CENTER);
        blank = new JPanel();
        blank.setLayout(new GridBagLayout());
        blank.setBackground(new Color(-16777216));
        blank.setMaximumSize(new Dimension(300, 80));
        blank.setMinimumSize(new Dimension(300, 80));
        blank.setPreferredSize(new Dimension(300, 80));
        nameImg.add(blank, BorderLayout.SOUTH);
        starPanel = new JPanel();
        starPanel.setLayout(new GridBagLayout());
        starPanel.setBackground(new Color(-16777216));
        starPanel.setMaximumSize(new Dimension(1100, 200));
        starPanel.setMinimumSize(new Dimension(1100, 200));
        starPanel.setPreferredSize(new Dimension(1100, 200));
        heroCreateScreen.add(starPanel, BorderLayout.SOUTH);
        startBtn = new JButton();
        startBtn.setBackground(new Color(-15132304));
        startBtn.setFocusable(false);
        Font startBtnFont = this.$$$getFont$$$("Castellar", Font.BOLD, 22, startBtn.getFont());
        if (startBtnFont != null) startBtn.setFont(startBtnFont);
        startBtn.setForeground(new Color(-28339));
        startBtn.setHorizontalTextPosition(0);
        startBtn.setMaximumSize(new Dimension(550, 150));
        startBtn.setMinimumSize(new Dimension(550, 150));
        startBtn.setPreferredSize(new Dimension(550, 150));
        startBtn.setText("Climb Tower!");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        starPanel.add(startBtn, gbc);
        label1.setLabelFor(lifeTextPane);
        label2.setLabelFor(strValueTextPane);
        label3.setLabelFor(skillValuTextPane);
        label4.setLabelFor(magkValueTextPane);
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rangerRadioButton);
        buttonGroup.add(wizardRadioButton);
        buttonGroup.add(fighterRadioButton);
        buttonGroup.add(warriorRadioButton);
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
        return heroCreateScreen;
    }

}
