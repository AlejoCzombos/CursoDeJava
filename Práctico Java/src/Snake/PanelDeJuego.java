package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class PanelDeJuego extends JPanel implements ActionListener {

    static final int ANCHO_PANTALLA = 600;
    static final int ALTURA_PANTALLA = 600;
    static final int TAMAÑO_UNIDAD = 25;
    static final int UNIDAD_JUEGO = (ANCHO_PANTALLA * ALTURA_PANTALLA) / TAMAÑO_UNIDAD;
    static final int DELAY = 100;
    final int x[] = new int[UNIDAD_JUEGO];
    final int y[] = new int[UNIDAD_JUEGO];
    private int tamañoSerpiente = 6;
    private int manzanasComidas = 0;
    private int manzanaX;
    private int manzanaY;
    private char direccion = 'R';
    private boolean seEstaMoviendo = false;
    private Timer timer;
    private Random random;
    PanelDeJuego(){
        random = new Random();
        this.setPreferredSize(new Dimension(ANCHO_PANTALLA, ALTURA_PANTALLA));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new Controles());
        IniciarJuego();
    }
    public void IniciarJuego(){
        nuevaManzana();
        seEstaMoviendo = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujar(g);
    }
    public void dibujar(Graphics g){
        if(seEstaMoviendo) {
            g.setColor(Color.red);
            g.fillOval(manzanaX, manzanaY, TAMAÑO_UNIDAD, TAMAÑO_UNIDAD);
            for (int i = 0; i < tamañoSerpiente; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], TAMAÑO_UNIDAD, TAMAÑO_UNIDAD);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    g.setColor(new Color(random.nextInt(200),random.nextInt(200), random.nextInt(200)));
                    g.fillRect(x[i], y[i], TAMAÑO_UNIDAD, TAMAÑO_UNIDAD);
                }
            }
            g.setColor(Color.red);
            g.setFont(new Font("BOLD ITALIC 1", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Puntos : " + manzanasComidas, (ANCHO_PANTALLA - metrics.stringWidth("Puntos : " + manzanasComidas))/2, g.getFont().getSize());
        }else {
            gameOver(g);
        }
    }
    public void mover(){
        for (int i = tamañoSerpiente; i > 0; i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch (direccion){
            case 'R':
                x[0] = x[0] + TAMAÑO_UNIDAD;
                break;
            case 'L':
                x[0] = x[0] - TAMAÑO_UNIDAD;
                break;
            case 'U':
                y[0] = y[0] - TAMAÑO_UNIDAD;
                break;
            case 'D':
                y[0] = y[0] + TAMAÑO_UNIDAD;
                break;
        }
    }
    public void nuevaManzana(){
        manzanaX = random.nextInt((int)(ANCHO_PANTALLA / TAMAÑO_UNIDAD)) * TAMAÑO_UNIDAD;
        manzanaY = random.nextInt((int)(ALTURA_PANTALLA / TAMAÑO_UNIDAD)) * TAMAÑO_UNIDAD;
    }
    public void comprobarManzana(){
        if ((x[0] == manzanaX) && (y[0] == manzanaY)){
            nuevaManzana();
            manzanasComidas++;
            tamañoSerpiente++;
        }
    }
    public void comprobarColisiones(){
        //Verificar que la cabeza colisiona con el cuerpo
        for(int i = tamañoSerpiente; i > 0; i--){
            if ((x[0] == x[i]) && (y[0] == y[i])){
                seEstaMoviendo = false;
            }
        }
        //Verificar que la cabeza colisiona con la pared izquierda
        if(x[0] < 0){
            seEstaMoviendo = false;
        }
        //Verificar que la cabeza colisiona con la pared derecha
        if(x[0] > ANCHO_PANTALLA){
            seEstaMoviendo = false;
        }
        //Verificar que la cabeza colisiona con la pared de arriba
        if (y[0] < 0){
            seEstaMoviendo = false;
        }
        //Verificar que la cabeza colisiona con la pared de abajo
        if (y[0] > ALTURA_PANTALLA){
            seEstaMoviendo = false;
        }

        if (!seEstaMoviendo) {
            timer.stop();
        }
    }
    public void gameOver(Graphics g){
        //Puntos
        g.setColor(Color.red);
        g.setFont(new Font("BOLD ITALIC 1", Font.BOLD, 40));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Puntos : " + manzanasComidas, (ANCHO_PANTALLA - metrics.stringWidth("Puntos : " + manzanasComidas))/2, g.getFont().getSize());
        //Texto de game Over
        g.setColor(Color.red);
        g.setFont(new Font("BOLD ITALIC 1", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Perdiste Pibe", (ANCHO_PANTALLA - metrics2.stringWidth("Perdiste Pibe"))/2, ALTURA_PANTALLA / 2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (seEstaMoviendo){
            mover();
            comprobarColisiones();
            comprobarManzana();
        }
        repaint();
    }
    public class Controles extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if (direccion!= 'R'){
                        direccion = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direccion!= 'L'){
                        direccion = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direccion!= 'D'){
                        direccion = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direccion!= 'U'){
                        direccion = 'D';
                    }
                    break;
            }
        }
    }
}
