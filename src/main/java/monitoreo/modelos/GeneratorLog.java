package monitoreo.modelos;

import monitoreo.modelos.interfaces.ILogBuilder;

public class GeneratorLog {
    
    public void generateInfoLog(ILogBuilder infoLog, String mensaje) {
        infoLog.instanceLog();
        infoLog.setLog(mensaje);
        infoLog.printLog();
    }
    
    public void generateErrorLog(ILogBuilder errorLog, String mensaje) {
        errorLog.instanceLog();
        errorLog.setLog(mensaje);
        errorLog.registerLog();
        errorLog.printLog();
    }
    
    public void generateDebugLog(ILogBuilder debugLog, String mensaje) {
        debugLog.instanceLog();
        debugLog.setLog(mensaje);
        debugLog.printLog();
    }
}
