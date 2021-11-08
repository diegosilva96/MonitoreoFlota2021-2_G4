package monitoreo.modelos.impl;

import java.text.DateFormat;
import monitoreo.modelos.File;
import monitoreo.modelos.InfoLog;
import monitoreo.modelos.interfaces.ILogBuilder;

public class InfoLogBuilder implements ILogBuilder {

    private InfoLog log;
    
    public InfoLog getLog() {
        return log;
    }

    @Override
    public void instanceLog()  {
        if (log == null)    {
            log = new InfoLog();
        }
    }

    @Override
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
