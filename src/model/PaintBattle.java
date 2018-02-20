package model;

import view.DrawingArea;
import view.Start;
import view.Timer;
import view.Topic;

import javax.swing.*;
import java.awt.*;

public class PaintBattle {

    private static int windowWidth;
    private static int windowHeight;

    public PaintBattle(int h, int w) {
        windowHeight = h;
        windowWidth = w;
        createAndShowGui(windowHeight, windowWidth);
    }

    public static void createAndShowGui(int h, int w) {
        JFrame frame = new JFrame("Paint Battle 2.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(w, h);
        JPanel pane = new JPanel(new GridBagLayout());
        pane.add(new Topic(), buildConstraint(0,0, 0.7, 0.2, 1, 1, 0, 0));
        pane.add(new Timer(), buildConstraint(1,0, 0.3, 0.2, 1, 1, 13, 0));
        pane.add(new DrawingArea(), buildConstraint(0,1, 0, 0.8, 2, 2, windowHeight-105, 0));
        frame.add(pane);
        frame.setVisible(true);
    }

    public static GridBagConstraints buildConstraint(int gridx, int gridy, double weightx, double weighty, int gridwidth, int gridheight,
     int ipady, int ipadx) {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = weightx;
        c.weighty = weighty;
        c.ipadx = ipadx;
        c.ipady = ipady;
        c.gridwidth = gridwidth;
        c.gridheight = gridheight;

        c.gridx = gridx;
        c.gridy = gridy;
        return c;


    }

    public static int getWindowWidth() {
        return windowWidth;
    }

    public static int getWindowHeight() {
        return windowHeight;
    }
}
