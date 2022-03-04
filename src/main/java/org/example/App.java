package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Hello world!
 *
 */
public class App implements ActionListener {
    private static JTextField area;
    private static JButton button;
    private static JLabel label1, label2, label3, label4, label5, label6, label7;
    private static JRadioButton mainroad, guestroom, basement, hotwater, airconditioning, furnishing, prefarea;
    private static JComboBox<Double> bedrooms, bathrooms, stories, parking;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(550, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        label1 = new JLabel("Area: ");
        label1.setBounds(10, 10, 120, 30);
        panel.add(label1);

        area = new JTextField();
        area.setBounds(130, 10, 200, 30);
        panel.add(area);

        label2 = new JLabel("Bedroom numbers:");
        label2.setBounds(10, 50, 120, 30);
        panel.add(label2);

        Double[] vals = { 0.0, 1.0, 2.0, 3.0};
        bedrooms = new JComboBox<>(vals);
        bedrooms.setBounds(130, 50, 200, 30);
        panel.add(bedrooms);

        button = new JButton("Submit");
        button.setBounds(10, 100, 85, 20);
        button.addActionListener(new App());
        panel.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = area.getText();
        String language = (String) bedrooms.getSelectedItem();
        System.out.println(name+" "+name);
    }
}
