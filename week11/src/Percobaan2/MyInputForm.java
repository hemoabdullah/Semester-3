package Percobaan2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyInputForm extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton calculateButton;
    private JButton addButton;
    private JPanel panel;

    public MyInputForm() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A");
        bLabel = new JLabel("Nilai B");
        cLabel = new JLabel("Nilai C");
        dLabel = new JLabel("Nilai D");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton() {
        calculateButton = new JButton("Calculate");
        class AddInterestListener implements ActionListener {

            String opt = "kali";

            public AddInterestListener(String opt) {
                this.opt = opt;
            }

            public AddInterestListener() {
            }

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (this.opt.equalsIgnoreCase("kali")) {
                    int a = Integer.parseInt(aField.getText());
                    int b = Integer.parseInt(bField.getText());
                    int c = a * b;
                    cLabel.setText("Hasil: " + c);
                } else if (this.opt.equalsIgnoreCase("tambah")) {
                    int d = Integer.parseInt(aField.getText());
                    int e = Integer.parseInt(bField.getText());
                    int f = d + e;
                    dLabel.setText("Hasil: " + f);
                }
            }
        }
        ActionListener listener = new AddInterestListener();
        calculateButton.addActionListener(listener);

        addButton = new JButton("Hitung +");
        ActionListener listener2 = new AddInterestListener("tambah");
        addButton.addActionListener(listener2);
    }

    private void createPanel() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(calculateButton);
        panel.add(cLabel);
        panel.add(addButton);
        panel.add(dLabel);
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
