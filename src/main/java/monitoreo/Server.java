package monitoreo;

import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;

import monitoreo.modelos.RegistroLog;
import monitoreo.modelos.Ventana;

import javafx.application.Application;
import monitoreo.modelos.GeneratorLog;
import monitoreo.modelos.InfoLog;
import monitoreo.modelos.impl.DebugLogBuilder;
import monitoreo.modelos.impl.ErrorLogBuilder;
import monitoreo.modelos.impl.InfoLogBuilder;

public class Server {

    public static void main(String[] args) {

        RegistroLog.getInstance().log("Iniciando servidor...");
        
        //Log info
        GeneratorLog generator = new GeneratorLog();
        InfoLogBuilder info = new InfoLogBuilder();
        String mensaje = "Este es el primer log de info";
        generator.generateInfoLog(info, mensaje);
        
        //Log error
        GeneratorLog generator2 = new GeneratorLog();
        ErrorLogBuilder error = new ErrorLogBuilder();
        String mensaje2 = "Este es el primer log de error";
        generator.generateErrorLog(error, mensaje2);
        
        //Log info
        GeneratorLog generator3 = new GeneratorLog();
        DebugLogBuilder debug = new DebugLogBuilder();
        String mensaje3 = "Este es el primer log de debug";
        generator.generateDebugLog(info, mensaje);

        ArcGISRuntimeEnvironment.setInstallDirectory("C://Aplicaciones//arcgis-runtime-sdk-java-100.9.0");
        //ArcGISRuntimeEnvironment.setInstallDirectory("/opt/Apps/arcgis-runtime-sdk-java-100.9.0");

        Application.launch(Ventana.class, args);
    }

}
