/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Tonin
 */


public class SpaceInvaders extends JFrame {
    private Space space = new Space();

    public SpaceInvaders() throws InterruptedException {
        super("Space Invaders 101"); 
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   
        this.setResizable(false);
        setIgnoreRepaint(true);

        

        Intro intro = new Intro();
        this.add(intro);

        this.pack();
        this.setVisible(true);


        intro.run();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        new SpaceInvaders();
    }
    
}

class Space extends Canvas {

    Space() {
       System.out.println("Setting canvas background and dimentions ");

       setBackground (Color.BLACK);
       setSize(800, 600);
    }
    
}

class Intro extends Space {
    private int i = 0;
    private BufferStrategy strategy;
        
    void run() throws InterruptedException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();
        for(i=100;i>=0;i-=1) {
            System.out.println("i: " + i);
            disegna();
            Thread.sleep(10);
        }
        //Thread.sleep(100);
        for(i=0;i<10;i+=1) {
            System.out.println("i: " + i);
            disegna();
            //Thread.sleep(10);
        }
    }

    
    void disegna() {
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        g.setColor(Color.black);
        g.fillRect(0,0,800,600);
         
        // scrivi nel buffer la scritta in Rosso 
        g.setColor(Color.red);
        g.setFont(new Font("Bold", Font.PLAIN, 40+i));
        g.drawString("Space Invaders", 100+i, 100+i);
        g.setFont(new Font("Bold", Font.PLAIN, 10+i));
        g.drawString("          by Matteo Palitto", 110+i+i, 110+i+i);

        g.dispose(); 

        strategy.show(); 
    }

}
