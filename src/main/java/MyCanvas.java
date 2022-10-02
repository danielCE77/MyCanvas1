/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author DANIC
 */
public class MyCanvas extends JPanel{
    public MyCanvas () {
       setPreferredSize(new Dimension(400,300));
       setBackground(Color.GRAY);
   }
   @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintbrush= new Paintbrush(g);
        paintbrush.drawSky();
        paintbrush.drawMountains();
        paintbrush.drawTree();
    }

}
