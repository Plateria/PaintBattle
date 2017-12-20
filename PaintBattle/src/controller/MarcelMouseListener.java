package controller;

import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MarcelMouseListener extends MouseInputAdapter{

    private Point start;
    private Point end;
    private static ArrayList<Point> allPoints = new ArrayList<>();
    private static ArrayList<Point> freehand;

    private MouseListenerInterface callback;

    public MarcelMouseListener(MouseListenerInterface callback) {
        this.callback = callback;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        freehand.add(e.getPoint());
        callback.repaint(freehand);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        freehand = new ArrayList<>();
        freehand.add(e.getPoint());
        addAndPaint(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        freehand.add(e.getPoint());
        callback.repaint(freehand);
    }

    private void addAndPaint(MouseEvent e) {

        callback.repaint(freehand);
    }

}
