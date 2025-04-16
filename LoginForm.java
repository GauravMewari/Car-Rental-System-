package com.carrental.gui;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
    public LoginForm() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Username:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Password:"));
        panel.add(new JPasswordField());
        panel.add(new JButton("Login"));
        panel.add(new JButton("Exit"));

        add(panel);
        setVisible(true);
    }
}