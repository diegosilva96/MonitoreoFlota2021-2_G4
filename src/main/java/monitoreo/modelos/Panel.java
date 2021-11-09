package monitoreo.modelos;

import javafx.stage.Stage;
import monitoreo.modelos.interfaces.IPanel;

public class Panel implements IPanel{
    private double ancho;
    private double alto;
    private String titulo;

    public Panel() {
        setAlto(700);
        setAncho(800);
        setTitulo("holamundo");
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Stage getStage() {
        Stage stage = new Stage();
        stage.setTitle(getTitulo());
        stage.setWidth(getAncho());
        stage.setHeight(getAlto());
        return stage;
    }

    public Panel clonar() {
        Panel p=new Panel();
        p.alto=this.alto;
        p.ancho=this.ancho;
        p.titulo=this.titulo;
        return p;

    }

}
