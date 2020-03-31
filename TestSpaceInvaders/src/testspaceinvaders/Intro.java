/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testspaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author tonin
 */
public class Intro extends Space {
 
    private int i = 0;

    void run() throws InterruptedException {
        setBackground(Color.BLACK);
        setSize(1000, 1000);

        for (i = 100; i >= 10; i -= 1) {
            System.out.println("i: " + i);
            this.repaint();
            Thread.sleep(40);
        }

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.setFont(new Font("Bold", Font.CENTER_BASELINE, 50+i));
        g.drawString("SPACE-INVADER", 100+i, 100+i);
        g.setFont(new Font("Bold", Font.PLAIN, 20+i));
        g.drawString("By Maiella Stefano 4C informatica G.Peano", 110+i+i, 110+i+i);
    }

}