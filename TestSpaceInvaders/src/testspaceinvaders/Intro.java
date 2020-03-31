/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

/**
 *
 * @author tonin
 */
public class Intro extends Space {

    private int i = 0;
    private BufferStrategy strategy;

    void run() throws InterruptedException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();
        

        for (i = 100; i >= 10; i -= 1) {
            System.out.println("i: " + i);
            this.paint();
            Thread.sleep(40);
        }

    }

    public void paint() {
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        g.setBackground(Color.BLACK);
        g.fillRect(0, 0, 800, 500);
        g.setColor(Color.yellow);
        g.setFont(new Font("Bold", Font.CENTER_BASELINE, 50 + i));
        g.drawString("SPACE-INVADER", 100 + i, 100 + i);
        g.setFont(new Font("Bold", Font.PLAIN, 10 + i));
        g.drawString("By Maiella Stefano 4C informatica G.Peano", 110 + i + i, 110 + i + i);
        g.dispose();
        strategy.show();
    }

}