package view;

import model.PaintBattle;

import java.awt.*;

import javax.swing.*;

public class Timer extends JPanel {

    private static int width = 300;
    private static int height = 100;
    private static int time = 0;
    public static final int MAXTIME = 200;
    private static JLabel timeLabel = new JLabel();

    public Timer () {
        this.setLocation(PaintBattle.getWindowWidth()-width,0);
        this.setSize(width,height);
        this.setBackground(Color.orange);
        setTimeLabel();
        this.add(timeLabel);
        this.setVisible(true);
        startTimer(200);
    }

    private void setTimeLabel() {
        timeLabel.setFont(new Font("WIESOBBRAUCHEICHDAS", 2, 20));
    }


    public static void startTimer(int length) {
        new Thread(()-> {
            while (length >= time) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                timeLabel.setText("Time left: " + (length - time++));
            }

        }).start();
    }

    public static int returnWidth() {
        return width;
    }

    public static int returnHeight() {
        return height;
    }
}
