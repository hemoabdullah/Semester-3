package Percobaan1;

import javax.swing.*;

public class HelloGui {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("Ini Percobaan HelloGui Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLocation(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}