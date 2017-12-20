package controller;

import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public interface MouseListenerInterface {

    void repaint(ArrayList<Point> allPoints);

}
