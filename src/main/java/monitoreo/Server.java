package monitoreo;

import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;

import monitoreo.modelos.RegistroLog;
import monitoreo.modelos.Ventana;

import javafx.application.Application;
import monitoreo.modelos.GeneratorLog;
import monitoreo.modelos.InfoLog;
import monitoreo.modelos.impl.InfoLogBuilder;

public class Server {

    public static void main(String[] args) {

        RegistroLog.getInstance().log("Iniciando servidor...");
        
        //Log info
        GeneratorLog generator = new GeneratorLog();
        InfoLogBuilder info = new InfoLogBuilder();
        String mensaje = "Este es el primer log de info";
        generator.generateInfoLog(info, mensaje);

        ArcGISRuntimeEnvironment.setInstallDirectory("C://Aplicaciones//arcgis-runtime-sdk-java-100.9.0");
        //ArcGISRuntimeEnvironment.setInstallDirectory("/opt/Apps/arcgis-runtime-sdk-java-100.9.0");

        Application.launch(Ventana.class, args);
    }

}
