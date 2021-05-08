package view;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;


public class MenuGUI extends JFrame implements ActionListener{
    JFrame mainFrame;
    JPanel mainPanel;
    JButton playButton;
    JLabel title;
    JButton optionButton;
    JButton highScore;

    public MenuGUI(){

        this.mainFrame = new JFrame("Snake");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainPanel = new JPanel();
        this.mainPanel.setPreferredSize(new Dimension(1000, 800));
       //this.mainPanel.setLayout(new BoxLayout(this.mainPanel,BoxLayout.PAGE_AXIS));
        this.mainPanel.setLayout(null);
        this.mainPanel.setBackground(Color.BLACK);

        this.title = new JLabel("Snake");
        this.title.setBounds(500-100,0,300,300);
        Font titleFont = new Font("Monospaced", Font.BOLD+Font.ITALIC,70);
        this.title.setFont(titleFont);
        this.mainPanel.add(this.title);

        this.optionButton = new JButton("Options");
        this.optionButton.addActionListener(this);
        this.optionButton.setBounds(500-120/2,300,120,50);
        this.mainPanel.add(this.optionButton);


        this.playButton = new JButton("Play");
        this.playButton.addActionListener(this);
        this.playButton.setBounds(500-120/2,400,120,50);
        this.mainPanel.add(this.playButton);

        this.highScore = new JButton("High scores");
        this.highScore.addActionListener(this);
        this.highScore.setBounds(500-120/2,500,120,50);
        this.mainPanel.add(this.highScore);



        this.mainFrame.add(this.mainPanel);
        this.mainFrame.pack();
        this.mainFrame.setVisible(true);
       //this.mainFrame.add(submitButton);



}

    @Override
    public void actionPerformed(ActionEvent e) {
//        this.answer.setVisible(true);
//        this.submitButton.setEnabled(false);
//        this.answerField.setEnabled(false);
    }
}


