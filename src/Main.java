import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("|----------------------|");
        System.out.println("|------- \033[34mMENU\033[0m ---------|");
        System.out.println("|----------------------|");
        System.out.println(" ");
        System.out.println("[1] - Crear un archivo o directorio");
        System.out.println("[2] - Leer el contenido de un archivo de texto");
        System.out.println("[3] - Escribir contenido en un archivo de texto existente");
        System.out.println("[4] - Eliminar un archivo o directorio");
        System.out.println("[5] - Comprobar si un archivo o directorio existe en la ruta proporcionada");
        System.out.println("[6] - Listar el contenido de un directorio");


        int opcion = scanner.nextInt();

        scanner.nextLine(); // limpiar buffer

        switch (opcion) {
            case 1 -> {

            }
            case 2 -> {

            }
            case 3 -> {
                System.out.print("Indica la ruta de la carpeta: ");
                String ruta = scanner.nextLine();
                File carpeta = new File(ruta);

                if (carpeta.exists() && carpeta.isDirectory()) {
                    File[] archivos = carpeta.listFiles();
                    if (archivos != null && archivos.length > 0) {
                        System.out.println("Archivos en la carpeta " + ruta + ":");
                        for (File archivo : archivos) {
                            if (archivo.isFile()) {
                                System.out.println(archivo.getName());
                            }
                        }
                    } else {
                        System.out.println("La carpeta está vacía o no se pudieron listar los archivos.");
                    }
                } else {
                    System.out.println("La ruta no existe o no es una carpeta.");
                }
            }
            case 4 -> {
                System.out.print("Indica la ruta del archivo a borrar: ");
                String rutaArchivo = scanner.nextLine();
                File archivo = new File(rutaArchivo);

                if (archivo.exists() && archivo.isFile()) {
                    if (archivo.delete()) {
                        System.out.println("Archivo borrado correctamente: " + archivo.getName());
                    } else {
                        System.out.println("No se pudo borrar el archivo.");
                    }
                } else {
                    System.out.println("El archivo no existe.");
                }
            }
            default -> System.out.println("Opción no válida.");
        }

    }
}
