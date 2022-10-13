package Snake;

import javax.swing.*;

public class CasillaDeJuego extends JFrame {

    CasillaDeJuego(){
        this.add(new PanelDeJuego());
        this.setTitle("Viborita");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
