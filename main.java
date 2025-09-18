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


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
        }
    }
}