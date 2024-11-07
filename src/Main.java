import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File("D:\\\\workspaceintellij2024\\\\test.txt");
        System.out.println(file.exists());  // Validar si existe el archivo en la ruta se comporta como un booleano tru o false

    }
}