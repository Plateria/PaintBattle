package controller;

import view.Timer;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MarcelButtonListener extends MouseInputAdapter {

    @Override
    public void mousePressed(MouseEvent e) {
        Timer.startTimer(Timer.MAXTIME);
    }
}
