package lab5_6;

import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;

public class Paint
{
    DrawArea panelForDrow = new DrawArea();
    JPanel panelForTools = new JPanel(new GridLayout(6, 1, 10, 10));
    JButton red = new JButton();
    JButton green = new JButton();
    JButton yellow = new JButton();
    JButton blue = new JButton();
    JButton black = new JButton();
    JButton clear = new JButton("CLEAR");

    ActionListener actionListener = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == clear) {
                panelForDrow.clear();
            } else if (e.getSource() == black) {
                panelForDrow.black();
            } else if (e.getSource() == blue) {
                panelForDrow.blue();
            } else if (e.getSource() == green) {
                panelForDrow.green();
            } else if (e.getSource() == red) {
                panelForDrow.red();
            } else if (e.getSource() == yellow) {
                panelForDrow.yellow();
            }
        }
    };

    public JPanel createTotalPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(1, 1));


        panelForTools.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        panelForTools.setPreferredSize(new Dimension(100, 0));
        panel.add(panelForTools, BorderLayout.LINE_START);


        panelForDrow.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
        panel.add(panelForDrow, BorderLayout.CENTER);

        panelForTools.add(red);
        red.setBackground(Color.RED);
        red.addActionListener(actionListener);

        panelForTools.add(yellow);
        yellow.setBackground(Color.YELLOW);
        yellow.addActionListener(actionListener);

        panelForTools.add(blue);
        blue.setBackground(Color.BLUE);
        blue.addActionListener(actionListener);

        panelForTools.add(green);
        green.setBackground(Color.GREEN);
        green.addActionListener(actionListener);

        panelForTools.add(black);
        black.setBackground(Color.BLACK);
        black.addActionListener(actionListener);

        panelForTools.add(clear);
        clear.addActionListener(actionListener);

        panel.setOpaque(true);
        return panel;
    }

    public static void createFrame()
    {
        JFrame frame = new JFrame("Paint");

        Paint paint  = new Paint();
        frame.setContentPane(paint.createTotalPanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 100);
        //frame.setLocationRelativeTo(null);
        frame.setSize(1000, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        createFrame();
    }
}
