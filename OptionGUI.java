package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionGUI {
    int diffculty = 1;
    JFrame mainFrame;
    JPanel mainPanel;
    JLabel title;
    JButton optionButton1;
    JButton optionButton2;
    JButton optionButton3;

    public OptionGUI() {
        this.mainFrame = new JFrame("Options");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainPanel = new JPanel();
        this.mainPanel.setPreferredSize(new Dimension(1000, 800));
        this.mainPanel.setLayout(null);
        this.mainPanel.setBackground(Color.BLACK);

        this.title = new JLabel("Options");
        this.title.setBounds(500 - 120, 0, 300, 300);
        Font titleFont = new Font("Monospaced", Font.BOLD + Font.ITALIC, 70);
        this.title.setFont(titleFont);
        this.mainPanel.add(this.title);

        this.optionButton1 = new JButton("Easy");
        this.optionButton1.setBounds(300,300,100,100);
        this.optionButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                diffculty=1;
                System.out.println(diffculty);
            }
        });

        this.mainPanel.add(this.optionButton1);

        this.optionButton2 = new JButton("Medium");
        this.optionButton2.setBounds(450,300,100,100);
        this.optionButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                diffculty=2;
                System.out.println(diffculty);
            }
        });
        this.mainPanel.add(this.optionButton2);

        this.optionButton3 = new JButton("Hard");
        this.optionButton3.setBounds(600,300,100,100);
        this.optionButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                diffculty=3;
                System.out.println(diffculty);
            }
        });
        this.mainPanel.add(this.optionButton3);

        this.mainFrame.add(this.mainPanel);
        this.mainFrame.pack();
        this.mainFrame.setVisible(true);

    }

    public void setOption(){
        System.out.println("setOption");
    }


    }

