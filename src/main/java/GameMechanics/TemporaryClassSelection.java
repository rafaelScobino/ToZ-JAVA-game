package GameMechanics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TemporaryClassSelection {

    private static String classSelected;

    public static String selectionMethod() {
        JFrame classSelectorFrame = new JFrame("Class Selector");
        classSelectorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        classSelectorFrame.setSize(300, 200);
        classSelectorFrame.setLocationRelativeTo(null);
        Container cont = classSelectorFrame.getContentPane();

        JRadioButton r1 = new JRadioButton("WARRIOR: Life:80 Str:7 Skl:3 Mgk:0");
        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                classSelected = "warrior";
            }
        });

        JRadioButton r2 = new JRadioButton("RANGER: Life:60 Str:6 Skl:4 Mgk:2");
        r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                classSelected = "ranger";
            }
        });

        JRadioButton r3 = new JRadioButton("FIGHTER: Life:70 Str:4 Skl:6 Mgk:1");
        r3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                classSelected = "fighter";
            }
        });

        JRadioButton r4 = new JRadioButton("WIZARD: Life:50 Str:3 Skl:7 Mgk:3");
        r4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                classSelected = "wizard";
            }
        });

        JButton okB = new JButton("Select");
        okB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (classSelected != null) {
                    String selector = classSelected;
                    JOptionPane.showMessageDialog(classSelectorFrame, "You selected: " + classSelected);
                    classSelectorFrame.dispose();
                    System.out.println(classSelected);
                } else {
                    JOptionPane.showMessageDialog(classSelectorFrame, "Please select a class.");
                }
            }
        });

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);

        cont.setLayout(new GridLayout(0, 1));
        cont.add(new JLabel("Please choose your class:"));
        cont.add(r1);
        cont.add(r2);
        cont.add(r3);
        cont.add(r4);
        cont.add(okB);

        classSelectorFrame.setVisible(true);

        while (classSelected == null){
            DelayGambi.delay(100);
        }

        return classSelected;
    }

    public static void main(String[] args){
        selectionMethod();
    }

}

