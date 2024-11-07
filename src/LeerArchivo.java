import java.io.BufferedReader;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {

        String ruta = "D:\\\\workspaceintellij2024\\\\";
        String nombreArchivo = "test.txt";
        //Clase   Como extraer datos

        try (FileReader fr = new FileReader(ruta + nombreArchivo)) {
            //Clase para leer el contenido
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
