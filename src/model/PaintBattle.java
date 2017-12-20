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
        frame.setSize(w, h);
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());
        container.add(new DrawingArea());
        container.add(new Timer());
        container.add(new Topic());
        frame.add(container);
        frame.setVisible(true);
    }

    public static int getWindowWidth() {
        return windowWidth;
    }

    public static int getWindowHeight() {
        return windowHeight;
    }
}
