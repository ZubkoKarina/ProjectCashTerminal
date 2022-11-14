package com.mycompany.projectcashterminal;

import javax.swing.JDialog;
import javax.swing.JLabel;
 

public class NotDialog extends JDialog {

    public NotDialog() {
        JLabel pageLabel = new JLabel("Your number is not approved", JLabel.CENTER);
        add(pageLabel);

        setVisible(false);

        setSize(200, 400);

        setLocationRelativeTo(null);
    }
}