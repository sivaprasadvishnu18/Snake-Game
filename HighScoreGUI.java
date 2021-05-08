package view;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;


public class HighScoreGUI extends JFrame implements ActionListener {
    JFrame mainFrame;
    JPanel mainPanel;
    JButton playButton;
    JLabel title;
    JButton optionButton;
    JButton highScore;

    public HighScoreGUI() {

        this.mainFrame = new JFrame("High scores");

        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainPanel = new JPanel();
        this.mainPanel.setPreferredSize(new Dimension(1000, 800));
        //this.mainPanel.setLayout(new BoxLayout(this.mainPanel,BoxLayout.PAGE_AXIS));
        this.mainPanel.setLayout(null);

        Color a = new Color(0, 0, 0);
        this.mainPanel.setBackground(a);

        this.title = new JLabel("High Scores");
        this.title.setBounds(500-150, 0, 500, 300);
        Font titleFont = new Font("Monospaced", Font.BOLD + Font.ITALIC, 50);
        this.title.setForeground(Color.WHITE);
        this.title.setFont(titleFont);
        this.mainPanel.add(this.title);

        Font scorefont = new Font("Monospaced", Font.BOLD + Font.ITALIC, 30);
        this.title = new JLabel("1. 1234567");
        this.title.setBounds(500-150, 100, 500, 300);
        this.title.setForeground(Color.WHITE);
        this.title.setFont(scorefont);
        this.mainPanel.add(this.title);

        this.title = new JLabel("2. 12345");
        this.title.setBounds(500-150, 125, 500, 300);
        this.title.setForeground(Color.WHITE);
        this.title.setFont(scorefont);
        this.mainPanel.add(this.title);

        this.title = new JLabel("3. 1234");
        this.title.setBounds(500-150, 150, 500, 300);
        this.title.setForeground(Color.WHITE);
        this.title.setFont(scorefont);
        this.mainPanel.add(this.title);

        this.title = new JLabel("4. 123");
        this.title.setBounds(500-150, 175, 500, 300);
        this.title.setForeground(Color.WHITE);
        this.title.setFont(scorefont);
        this.mainPanel.add(this.title);

        this.title = new JLabel("5. 12");
        this.title.setBounds(500-150, 200, 500, 300);
        this.title.setForeground(Color.WHITE);
        this.title.setFont(scorefont);
        this.mainPanel.add(this.title);

        this.optionButton = new JButton("Menu");
        this.optionButton.addActionListener(this);
        this.optionButton.setBounds(500 - 120 / 2, 600, 120, 50);
        this.mainPanel.add(this.optionButton);

        this.mainFrame.add(this.mainPanel);
        this.mainFrame.pack();
        this.mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void setHighScore(){
        System.out.println("setHighScore");
    }
    public void getHighScore(){
        System.out.println("getHighScore");
    }
}
