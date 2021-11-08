package monitoreo.modelos;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    public void insert(String texto) {
        try {
            FileWriter archivo = new FileWriter("log.txt", true);
            archivo.write(texto + "\r\n");
            archivo.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
