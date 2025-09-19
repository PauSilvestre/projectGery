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

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
        }
    }
}