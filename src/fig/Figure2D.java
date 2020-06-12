package fig;

import java.awt.*;

/**
 * ******************************************************
 */
/* LA CLASE FIGURA ES ABSTRACTA O SEA QUE NO SE PUEDEN   */
 /* CREAR OBJETOS DE DICHA CLASE ,Y SIRBE PARA AGRUPAR    */
 /* METODOS Y ATRIBUTOS COMUNES PARA LAS CLASES HIJAS     */
 /* EN ESTE CASO TODAS LAS CLASES HIJAS DEBEN IMPLEMENTAR */
 /* EL METOD PINTAR                                       */
/**
 * *****************************************************
 */
abstract class Figure2D {

    private int x, y;
    private Color colorFondo, colorBorde;

    public Figure2D() {
    }

    public Figure2D(int x, int y, Color colorFondo, Color colorBorde) {
        this.x = x;
        this.y = y;
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    //****************************************************
    // METODO ABSTRACTO QUE DEBE SER IMPLEMENTADO POR
    // TODAS LAS CLASES CONCRETAS QUE HEREDEN DE FIGURA
    //****************************************************	
    abstract void pintar(Graphics g);

}
