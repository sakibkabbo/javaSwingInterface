/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import javax.swing.JFrame;

/**
 *
 * @author Muhtasim
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        main ggui = new main();
        ggui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel myPanel = new MyDrawPanel();
        frame.getContentPane().add(myPanel);
        frame.setSize(1500, 1000);
        frame.setVisible(true);
    }
}
