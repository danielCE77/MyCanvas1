/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
/**
 *
 * @author DANIC
 */
public class swing01 {
    public static void main(String args[]){
        
        JFrame window = new JFrame("Swing");
        MyCanvas canvas = new MyCanvas();
 
       window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       window.setSize(400, 300);
       window.add(canvas);
       window.pack();
       window.setResizable(false);
       window.setLocationRelativeTo(null);
       window.setVisible(true);
   }

}

