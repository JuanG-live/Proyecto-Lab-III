package tpfinal.objetos;

/**
 * Clase padre que es heredada por Pocion y Enemy, tiene la posicion en el mapa
 * tanto del eje X como del eje Y y un id de identificacion.
 */
public abstract class Objeto {

    private int id;
    private int posicionX;
    private int posicionY;

    public Objeto(){

    }
    public Objeto(int id, int posicionX, int posicionY){
        this.id = id;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPosicionX() {
        return posicionX;
    }
    public int getPosicionY() {
        return posicionY;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "id=" + id +
                "posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                '}';
    }

}
