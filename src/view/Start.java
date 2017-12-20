package view;

import controller.MarcelButtonListener;

import javax.swing.*;

public class Start extends JButton {

    public Start () {
        this.setName("Ja ich bims");
        this.setLocation(100,100);
        this.setSize(100,100);
        this.addMouseListener(new MarcelButtonListener());
        this.setVisible(true);
    }

}
