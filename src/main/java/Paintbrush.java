/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
/**
 *
 * @author DANIC
 */
public class Paintbrush {
    private Graphics g;
    private static final Color COLOR_BROWN = new Color(34,27,21);
    private static final Color COLOR_TRUNK_TREE = new Color(50,27,30);
    private static final Color COLOR_TREE = new Color(16,46,60);
  
    
    public Paintbrush(Graphics g){
       this.g = g;
   }
   
   public void drawSky() {
       g.setColor(new Color (127,233,245));
       g.fillRect(0,0, 400, 100);
       g.setColor(Color.YELLOW);
       g.fillOval(40, 40, 20, 20);
   }
   
   public void drawMountains() {
        Polygon triangle = new Polygon();
        triangle.addPoint(15,120);
        triangle.addPoint(100,40);
        triangle.addPoint(180,130);
       
        g.setColor(COLOR_BROWN);
        g.fillPolygon(triangle);
        int vectorX [] = {230, 200, 277};
        int vectorY [] = {60, 115, 108};
        g.fillPolygon(vectorX, vectorY, 3);
        
        int vectorX1 [] = {150, 107, 205};
        int vectorY1 [] = {263, 297, 297};
        g.fillPolygon(vectorX1, vectorY1, 3);
        
        g.setColor(Color.GREEN);
        int vectorX2 [] = {153, 128, 180};
        int vectorY2 [] = {32, 67, 80};
        g.fillPolygon(vectorX2, vectorY2, 3);
    }

    public void drawTree() {
        int start = 200;
        int top = 50;

        // draw trunk
        g.setColor(COLOR_TRUNK_TREE);
        g.fillRect(start-10, top+110, 26, 40);

        g.setColor(COLOR_TREE);
        for(int i=0; i < 5; i++ ){
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;

            triangle.addPoint(start, top + (spacing * i));
            triangle.addPoint(start - (width/2), top + height + (spacing*i));
            triangle.addPoint(start + (width/2), top + height + (spacing*i));

            g.fillPolygon(triangle);
        }
    }

}
