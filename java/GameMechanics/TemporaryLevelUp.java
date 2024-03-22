package GameMechanics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemporaryLevelUp {

    private static String levelSelected;
    private static String selector;

    public static String selectionMethod()  {
        JFrame classSelectorFrame = new JFrame("LevelUp");
        classSelectorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        classSelectorFrame.setSize(300, 200);
        classSelectorFrame.setLocationRelativeTo(null);
        Container cont = classSelectorFrame.getContentPane();

        JRadioButton r1 = new JRadioButton("LIFE + 10");
        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                levelSelected = "life";
            }
        });

        JRadioButton r2 = new JRadioButton("STRENGTH + 2");
        r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                levelSelected = "strength";
            }
        });

        JRadioButton r3 = new JRadioButton("SKILL + 2");
        r3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                levelSelected = "skill";
            }
        });

        JRadioButton r4 = new JRadioButton("MAGICKA + 1");
        r4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                levelSelected = "magicka";
            }
        });

        JButton okB = new JButton("Select");
        okB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (levelSelected != null) {
                     selector = levelSelected;
                    JOptionPane.showMessageDialog(classSelectorFrame, "You selected: " + levelSelected);
                    classSelectorFrame.dispose();
                    System.out.println(levelSelected);
                } else {
                    JOptionPane.showMessageDialog(classSelectorFrame, "Please select levelUp.");
                }
            }
        });

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);

        cont.setLayout(new GridLayout(0, 1));
        cont.add(new JLabel("Please choose your Level UP:"));
        cont.add(r1);
        cont.add(r2);
        cont.add(r3);
        cont.add(r4);
        cont.add(okB);

        classSelectorFrame.setVisible(true);

        while (selector == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String selected = selector;
            selector = null;
            levelSelected = null;
        return selected;
    }


}

