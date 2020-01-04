/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author BRACU\14101055
 */
public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        //Color myColor = new Color(0,0,0);
        Color sky = new Color(51, 204, 255);
        g.setColor(sky);
        g.fillRect(0, 0, 1500, 500);
        Color v = new Color(153, 0, 255);
        Color i = new Color(0, 102, 255);
        Color dg = new Color(0, 153, 102);
        g.setColor(Color.red);
        g.fillOval(50, 150, 700, 700);
        g.setColor(Color.ORANGE);
        g.fillOval(100, 200, 600, 600);
        g.setColor(Color.yellow);
        g.fillOval(150, 250, 500, 500);
        g.setColor(Color.green);
        g.fillOval(200, 300, 400, 400);
        g.setColor(Color.blue);
        g.fillOval(250, 350, 300, 300);
        g.setColor(i);
        g.fillOval(300, 400, 200, 200);
        g.setColor(v);
        g.fillOval(350, 450, 100, 100);
        g.setColor(sky);
        g.fillOval(375, 478, 50, 50);
        g.setColor(dg);
        g.fillRect(0, 500, 1500, 500);
        g.setColor(Color.red);
        int[] x = {800, 1100, 1400};
        int[] y = {400, 200, 400};
        g.fillPolygon(x, y, 3);
        g.setColor(Color.ORANGE);
        g.fillRect(850, 400, 500, 500);
        Color brn = new Color(153, 102, 0);
        g.setColor(brn);
        g.fillRect(850, 475, 50, 110);
        g.fillRect(1020, 475, 50, 110);
        g.fillRect(1200, 475, 100, 100);
        g.fillRect(1250, 475, 10, 10);
        g.fillRect(1025, 600, 150, 300);
        g.setColor(Color.BLACK);
        g.fillRect(1247, 475, 6, 100);
        g.setColor(Color.darkGray);
        g.fillOval(1135, 720, 30, 30);
        Image image = new ImageIcon("win.png").getImage();
        g.drawImage(image, 900, 475, this);
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(300, 300, Color.red, 301, 100, Color.YELLOW);
        g2d.setPaint(gradient);
        g2d.fillOval(1300, -200, 500, 500);
        GradientPaint gradient2 = new GradientPaint(80, 100, Color.blue, 101, 51, Color.GRAY, true);
        g2d.setPaint(gradient2);
        g2d.fillOval(500, 600, 150, 100);
        g2d.fillOval(600, 600, 200, 90);
        g2d.fillOval(550, 800, 150, 100);
        g2d.fillOval(570, 830, 200, 90);
        GradientPaint gradient3 = new GradientPaint(80, 100, Color.GRAY, 101, 51, Color.WHITE, true);
        g2d.setPaint(gradient3);
        g2d.fillOval(600, 50, 400, 100);
        g2d.fillOval(750, 100, 300, 90);
        g2d.fillOval(580, 90, 300, 90);
        g2d.fillOval(820, 40, 300, 90);
        Image image2 = new ImageIcon("edtree.png").getImage();
        g.drawImage(image2, 60, 500, this);
    }
}
