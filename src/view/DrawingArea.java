package view;

import controller.MarcelMouseListener;
import controller.MouseListenerInterface;
import model.PaintBattle;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class DrawingArea extends JPanel implements MouseListenerInterface {

    private static int width = PaintBattle.getWindowWidth();
    private static int height = PaintBattle.getWindowHeight() - Timer.returnHeight();

    private static ArrayList<Point> painted;
    private static MarcelMouseListener mouseListener;
    public static int counter = 0;
    public static Color drawingColor = Color.black;
    int k = 2;

    public DrawingArea() {
        painted = new ArrayList<>();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBackground(Color.white);
        this.addMouseListener(mouseListener = new MarcelMouseListener(this));
        this.addMouseMotionListener(mouseListener);
        this.setSize(width, height);
        this.setLocation(0, 100);
        this.setVisible(true);
    }

    @Override
    public void setColor(Color color) {
        drawingColor = color;
    }
    @Override
    public Dimension getPreferredSize() {
        // TODO Auto-generated method stub
        return super.getPreferredSize();
    }

    public void paint(double x, double y) {
        addPainted(new Point((int) x, (int) y));
        this.setBackground(Color.red);
        repaint();
    }

    @Override
    public void repaint(ArrayList<Point> allPoints) {
        for (int i = 0; i < allPoints.size() - 1; i++) {
            Point p1 = allPoints.get(i);
            Point p2 = allPoints.get(i + 1);
            Graphics2D g2 = (Graphics2D) getGraphics();
            g2.setStroke(new BasicStroke(10));  //Set thickness
            g2.setColor(drawingColor);
            g2.draw(new Line2D.Float((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y));
            //getGraphics().drawLine((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y);
        }
    }

    @Override
    protected void paintComponent(Graphics arg0) {
        super.paintComponent(arg0);
    }

    public ArrayList<Point> getPainted() {
        return painted;
    }

    public void addPainted(Point value) {
        painted.add(value);
    }
}
