package fig;

import java.awt.*;

public class Rectangle extends Figure2D {

    int ancho, alto;

    public Rectangle(int x, int y, int ancho, int alto, Color color) {
        super(x, y, color, Color.blue);
        this.ancho = ancho;
        this.alto = alto;
    }

    public void pintar(Graphics g) {
        g.setColor(getColorFondo());
        g.fillRect(getX(), getY(), alto, ancho);
        g.setColor(getColorBorde());
        g.drawRect(getX(), getY(), alto, ancho);
    }
}
