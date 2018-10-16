/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vrishab
 */
public class Start {
    public static void main(String[] args) throws InterruptedException {
        Login w = new Login();
        Logo l = new Logo();
        l.setVisible(true);
        Thread.sleep(20000);
        l.setVisible(false);
        w.setVisible(true);
                   
    }
}
