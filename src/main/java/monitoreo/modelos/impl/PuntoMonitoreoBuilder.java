package monitoreo.modelos.impl;

import com.esri.arcgisruntime.symbology.SimpleMarkerSymbol;

import monitoreo.modelos.interfaces.IPuntoMonitoreo;

public class PuntoMonitoreoBuilder implements IPuntoMonitoreo {
    
    private String tipoPunto;
    private Double latitud;
    private Double longitud;
    private SimpleMarkerSymbol.Style estilo;
    private int color;
    private int tamano;
    private String nombrerepartidor;
    private String placaVehiculo;

    public PuntoMonitoreoBuilder(String tipoPunto)  {
        this.tipoPunto = tipoPunto;
    }

    public PuntoMonitoreoBuilder withSimbolo(SimpleMarkerSymbol.Style estilo, int color, int tamano)  {
        this.estilo = estilo;
        this.color = color;
        this.tamano = tamano;
        return this;
    }

    public PuntoMonitoreoBuilder withUbicacion(Double latitud, Double longitud)  {
        this.latitud = latitud;
        this.longitud = longitud;
        return this;
    }
    public PuntoMonitoreoBuilder withRepartidor(String nombre,String placa){
        this.nombrerepartidor=nombre;
        this.placaVehiculo=placa;
        return this;
    }

    @Override
    public Punto build() {

        Punto punto = new Punto();
        punto.setTipoPunto(this.tipoPunto);
        punto.setColor(this.color);
        punto.setEstilo(this.estilo);
        punto.setLatitud(this.latitud);
        punto.setLongitud(this.longitud);
        punto.setTamano(this.tamano);
        punto.setnombreRepartidor(this.nombrerepartidor);
        punto.setplacaVehiculo(this.placaVehiculo);
        punto.generaPunto();
        return punto;
    }

}
