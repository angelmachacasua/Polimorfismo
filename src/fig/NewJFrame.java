package fig;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author
 */
public class NewJFrame extends javax.swing.JFrame {

    static List<Figure2D> vector = new CopyOnWriteArrayList<Figure2D>();

    public NewJFrame() {
        initComponents();
        llenar_vector();
        setTitle("FIGURAS UTILIZANDO POLIMORFISMO");
    }

    public void llenar_vector() {
        //vector.add(new Circle(20, 50, 200, Color.blue));
        //vector.add(new Circle(120, 150, 100, Color.ORANGE));
        //vector.add(new Rectangle(200, 250, 100, 200, Color.ORANGE));
        int N = 300;
        int h = this.getHeight();
        int w = this.getWidth();
        for (int i = 0; i < N; i++) {
            if ((int) (Math.random() * 2) == 0) {
                Color color = new Color((int) (Math.random() * 250), (int) (Math.random() * 250), (int) (Math.random() * 250));
                int radio = (int) (Math.random() * 30);
                vector.add(new Circle((int) (Math.random() * w), (int) (Math.random() * h), radio, color));
                int lado = (int)(Math.random()*30);
                int izq = (int)(Math.random()*30);
                int der = (int)(Math.random()*30);
                
                vector.add(new Triangle((int) (Math.random() *w), (int)(Math.random() * h), lado, izq, der, color));
            } else {
                int ancho = (int) (Math.random() * 30);
                int alto = (int) (Math.random() * 30);
                Color color = new Color((int) (Math.random() * 250), (int) (Math.random() * 250), (int) (Math.random() * 250));
                vector.add(new Rectangle((int) (Math.random() * w), (int) (Math.random() * h), ancho, alto, color));
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g. setFont(new Font ("Taahoma", Font.PLAIN, 25));
        g. drawString("",50, 100);
        int xpoints [] = {60, 100,20,60 };
        int ypoints [] = {120,190,190,120 };
        int npoints = 4;
        g. setColor(Color.orange);
        g.drawPolygon (xpoints,ypoints,npoints);
        g.fillPolygon (xpoints,ypoints,npoints);
                
        for (Figure2D d : vector) {
            d.pintar(g);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
