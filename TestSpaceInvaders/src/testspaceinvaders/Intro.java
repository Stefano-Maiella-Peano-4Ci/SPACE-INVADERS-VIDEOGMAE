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
    
    
    
    @Override
    public void paint (Graphics g){
        g.setColor(Color.yellow);
        g.setFont(new Font("Bold", Font.CENTER_BASELINE, 50));
        g.drawString("SPACE-INVADERS", 200, 200);
        g.setFont(new Font("Bold", Font.PLAIN, 40));
        g.drawString("by Maiella Stefano 4C informatica G.Peano", 110, 110);
    }
    
    void run(){
        this.repaint();
    }
    
}
