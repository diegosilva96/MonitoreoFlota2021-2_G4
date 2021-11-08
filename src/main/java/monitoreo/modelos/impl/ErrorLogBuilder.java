package monitoreo.modelos.impl;

import java.text.DateFormat;
import monitoreo.modelos.ErrorLog;
import monitoreo.modelos.File;
import monitoreo.modelos.interfaces.ILogBuilder;

public class ErrorLogBuilder implements ILogBuilder {

    private ErrorLog log;
    
    public ErrorLog getLog() {
        return log;
    }

    @Override
    public void instanceLog() {
       if (log == null)    {
            log = new ErrorLog();
        }
    }
    
    @Override
    public void registerLog() {
        File file = new File();
        file.insert(log.getMensaje());
    }
    
    public void setLog(String mensaje) {
        log.setMensaje(DateFormat.getDateInstance().format(System.currentTimeMillis()) + " - " + mensaje);
    }

    @Override
    public void printLog() {
        System.out.println(log.getMensaje());
    }
}
