/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Asullom
 */
public class Triangle extends Figure2D {

    private int lado;//base
    private int izq;
    private int dere;

    public Triangle(int x, int y, int lado, Color color) {
        super(x, y, color, Color.red);
        this.lado = lado;
        this.izq = lado;
        this.dere = lado;
    }

    public Triangle(int x, int y, int lado, int izq, int dere, Color color) {
        super(x, y, color, Color.red);
        this.lado = lado;
        this.izq = izq;
        this.dere = dere;
    }

    /* 
     public void drawTriangle (Graphics g)
     {
          g.setColor (color);
          int [] xList = {x-20, x, x+20};
          int [] yList = {y, y-20, y};
          poly = new Polygon (xList, yList, 3);
          g.fillPolygon (poly);
     } */
    public void pintar(Graphics g) {

        g.setColor(getColorFondo());
        int[] xList = {getX() - izq, getX(), getX() + dere};
        int[] yList = {getY(), getY() - lado , getY()};
        Polygon poly = new Polygon(xList, yList, 3);

        g.fillPolygon(poly);
        g.setColor(getColorBorde());
        g.drawPolygon(poly);
    }

}