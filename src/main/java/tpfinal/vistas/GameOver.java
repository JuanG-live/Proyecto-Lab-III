package tpfinal.vistas;

import tpfinal.graficos.SpritesSheet;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Dibuja la ventana de finalizacion de juego como perdedor.
 */
public class GameOver implements VentanaJuego {
    private int ancho = 800;
    private  int alto = 600;
    private final Color COLOR_BARRA_ESTADO;
    private final Color COLOR_DETALLE;
    private final Rectangle BARRA_ESTADO;
    private final Rectangle DETALLE;
    private SpritesSheet hojaSprite;
    private BufferedImage imagen;

    public GameOver(){
        COLOR_BARRA_ESTADO = new Color(240,63,63);
        COLOR_DETALLE = new Color(206,217,193);
        BARRA_ESTADO = new Rectangle(0,0, ancho, 20);
        DETALLE = new Rectangle(0, BARRA_ESTADO.height, ancho, alto);
        this.hojaSprite = new SpritesSheet("Recursos/GameOver/gameover.png",alto, ancho, false);
        imagen = hojaSprite.obtenerSprite(0).getImagen();
    }

    @Override
    public void actualizar() {

    }

    @Override
    public void dibujar(Graphics grafico){
        grafico.setColor(COLOR_BARRA_ESTADO);
        grafico.fillRect(BARRA_ESTADO.x, BARRA_ESTADO.y, BARRA_ESTADO.width, BARRA_ESTADO.height);
        grafico.setColor(COLOR_DETALLE);
        grafico.fillRect(DETALLE.x, DETALLE.y, DETALLE.width, DETALLE.height);
        grafico.drawImage(imagen, DETALLE.x, DETALLE.y, null);

    }

}
