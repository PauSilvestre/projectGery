import java.io.*;
import java.util.*;
import java.io.File;



public class CrearDirectorio {
        File nuevoDirectorio = new File("MiNuevaCarpeta");
        if (nuevoDirectorio.mkdir()) {
            System.out.println("Directorio creado: " + nuevoDirectorio.getName());
        } else {
            System.out.println("El directorio ya existe o no se pudo crear.");
        }
}

public class Listar{

    String rutaDirectorio = "";
    File directorio = new File(rutaDirectorio);

        if (directorio.exists() && directorio.isDirectory()) {
        File[] archivos = directorio.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                System.out.println(archivo.getName() + (archivo.isDirectory()));
            }
        } else {
            System.out.println("No se pudo leer el contenido del directorio, fiera, crack, fenomeno");
        }
    } else {
        System.out.println("El directorio no existe o no es valido, peste");
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("----------------------");
        System.out.println("------- \033[34mMENU\033[0m ---------");
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

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
        }
    }
}