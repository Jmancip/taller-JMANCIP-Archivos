import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class Operacion {
    public static void main(String[] args) {
        File file = new File("D:\\\\workspaceintellij2024\\\\test.txt");
        System.out.println("Se valida que el archivo exista");
        System.out.println(file.exists());
        System.out.println("--------------------");
        String ruta = "D:\\\\workspaceintellij2024\\\\test.txt";
        calculoPromedio(ruta);
    }

    private static void calculoPromedio(String ruta) {
        double suma = 0;
        int cont = 0;

        //Clase  Como extraer datos
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;

            // Leer línea del archivo
            while ((linea = br.readLine()) != null) {
                // Separar la línea en elementos
                String[] elementos = linea.split("\\s+");
                for (String elemento : elementos) {
                    try {
                        //convertir elemento a numero
                        double numero = Double.parseDouble(elemento);
                        suma += numero;
                        cont++;
                    } catch (NumberFormatException e) {
                        // Ignorar si el elemento no es un número
                    }
                }
            }
            // Calcular el promedio
            if (cont > 0) {
                double promedio = suma / cont;
                System.out.println("El promedio de los números en el archivo es: " + promedio);
            } else {
                System.out.println("No se encontraron números en el archivo.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}