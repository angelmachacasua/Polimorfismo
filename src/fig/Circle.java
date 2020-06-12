package fig;

import java.awt.*;

public class Circle extends Figure2D {

    int radio;

    public Circle(int x, int y, int radio, Color color) {
        super(x, y, color, Color.red);
        this.radio = radio;
    }

    public void pintar(Graphics g) {
        g.setColor(getColorFondo());
        g.fillRoundRect(getX(), getY(), radio, radio, radio, radio);
        g.setColor(getColorBorde());
        g.drawRoundRect(getX(), getY(), radio, radio, radio, radio);
    }
}
