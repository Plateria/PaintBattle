package controller;

import model.PaintBattle;

import java.awt.*;

public class Main {

    public static void main(String... args) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        PaintBattle battle = new PaintBattle((int)screenSize.getHeight()/2, (int)screenSize.getWidth()/2);
    }
}
