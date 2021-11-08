package monitoreo.modelos.impl;

import java.text.DateFormat;
import monitoreo.modelos.DebugLog;
import monitoreo.modelos.File;
import monitoreo.modelos.interfaces.ILogBuilder;

public class DebugLogBuilder implements ILogBuilder {
    
    private DebugLog log;

    public DebugLog getLog() {
        return log;
    }

    @Override
    public void instanceLog() {
        if (log == null)    {
            log = new DebugLog();
        }
    }
    
    public void setLog(String mensaje) {
        log.setMensaje(DateFormat.getDateInstance().format(System.currentTimeMillis()) + " - " + mensaje);
    }

    @Override
    public void registerLog() {
        File file = new File();
        file.insert(log.getMensaje());
    }

    @Override
    public void printLog() {
        System.out.println(log.getMensaje());
    }

}
