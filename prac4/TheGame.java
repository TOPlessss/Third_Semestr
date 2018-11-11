package prac4;

import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;

public class TheGame implements ActionListener
{
    int countRed = 0;
    int countBlue = 0;

    JPanel labelPanel = new JPanel();
    JPanel scorePanel = new JPanel();
    JPanel buttonsPanel = new JPanel();
    JLabel redTeam = new JLabel("HORDE");
    JLabel blueTeam = new JLabel("ALLIANCE!");
    JLabel redScore = new JLabel("" + countRed);
    JLabel blueScore = new JLabel("" + countBlue);
    JButton redButton = new JButton("For the Horde");
    JButton blueButton = new JButton("For the Alliance");
    JButton resetButton = new JButton("Reforge");

    public JPanel createTotalPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        labelPanel.setLayout(null);
        labelPanel.setBounds(10,0, 250, 30);
        panel.add(labelPanel);

        scorePanel.setLayout(null);
        scorePanel.setBounds(10,40, 260, 30);
        panel.add(scorePanel);

        buttonsPanel.setLayout(null);
        buttonsPanel.setBounds(10,80,260,70);
        panel.add(buttonsPanel);

        redTeam.setHorizontalAlignment(0);
        redTeam.setForeground(Color.RED);
        redTeam.setBounds(0,0,120,30);
        labelPanel.add(redTeam);

        blueTeam.setHorizontalAlignment(0);
        blueTeam.setForeground(Color.BLUE);
        blueTeam.setBounds(130,0,120,30);
        labelPanel.add(blueTeam);

        redScore.setHorizontalAlignment(0);
        redScore.setBounds(0,0,120,30);
        scorePanel.add(redScore);

        blueScore.setHorizontalAlignment(0);
        blueScore.setBounds(130,0,120,30);
        scorePanel.add(blueScore);

        redButton.setLocation(0, 0);
        redButton.setSize(120, 30);
        redButton.addActionListener(this);
        buttonsPanel.add(redButton);

        blueButton.setBounds(130, 0, 130, 30);
        blueButton.addActionListener(this);
        buttonsPanel.add(blueButton);

        resetButton.setBounds(0, 40, 260, 30);
        resetButton.addActionListener(this);
        buttonsPanel.add(resetButton);

        panel.setOpaque(true);
        return panel;
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == redButton)
        {
            countRed += 1;
            redScore.setText("" + countRed);
        }
        else if (e.getSource() == blueButton)
        {
            countBlue += 1;
            blueScore.setText("" + countBlue);
        }
        else if (e.getSource() == resetButton)
        {
            countRed = 0;
            countBlue = 0;
            redScore.setText("" + countRed);
            blueScore.setText("" + countBlue);
        }
    }

    public static void createFrame()
    {
        JFrame frame = new JFrame("The Game");

        TheGame game = new TheGame();
        frame.setContentPane(game.createTotalPanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        createFrame();
    }
}