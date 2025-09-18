import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("----------------------");
        System.out.println("------- MENU ---------");
        System.out.println("----------------------");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                //pollita

            case 2:
                //pollita

            case 3:
                System.out.println("Indica la ruta:");
                String ruta = scanner.next();
                System.out.println("Indica el nombre del archivo:");
                Sting nombreArchivo = (ruta + "/" + scanner.next());
                File carpeta = new File(ruta);

                if (carpeta.exists() && carpeta.isDirectory()) {
                    File[] archivos = carpeta.listFiles();
                    if (archivos != null) {
                        System.out.println("Archivos en la carpeta " + ruta + ":");
                        for (File archivo : archivos) {
                            if (archivo.isFile()) {
                                System.out.println(archivo.getName());
                            }
                        }
                    } else {
                        System.out.println("No se pudieron listar los archivos.");
                    }
                } else {
                    System.out.println("La ruta no existe o no es una carpeta.");
                }


        }

    }
}