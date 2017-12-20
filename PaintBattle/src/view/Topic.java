package view;

import model.PaintBattle;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class Topic extends JPanel {

    private static int width = PaintBattle.getWindowWidth() - Timer.returnWidth();
    private static int height = Timer.returnHeight();
    private static JLabel topicLabel = new JLabel();
    private static final String topic = "Ich bin ein Thema";

    public Topic () {
        this.setLocation(0,0);
        this.setSize(width,height);
        this.setBackground(Color.green);
        setTopicLabel();
        this.add(topicLabel);
        this.setVisible(true);
    }

    private void setTopicLabel() {
        topicLabel.setFont(new Font("WOFUER", 1, 30));
        topicLabel.setText(topic);
    }

    public static int returnWidth() {
        return width;
    }

    public static int returnHeight() {
        return height;
    }
}
