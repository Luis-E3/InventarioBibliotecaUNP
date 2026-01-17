import java.util;
import java.time;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main (String[]args){
        Main ap;
        ArrayList<Libro> biblioteca;
        ap = new Main();
        biblioteca=ap.ingresarLibro();
    }
    //Metodo para agregar una lista
    public ArrayList<Libro> ingresarLibro(){
        ArrayList <Libro> biblio;
        Scanner teclado;
        int cantidad;
        Libro lib;
        biblio = new ArrayList<>();
        teclado = new Scanner(System.in);
        System.out.print("¿Cuántos libros desea ingresar?: ");
        cantidad = teclado.nextInt();
        for (int i = 0; i < cantidad; i++) {    
            lib = ingresarLibro(); 
            biblio.add(lib);
        }
        return biblio;
    }
    //Metodo para ingresar los datos del libro
    public Libro ingresar(){
        Libro nuev_libro;
        String titulo;
        String autor;
        String edit;
        String codigo;
        Scanner leer;
        leer=new Scanner(System.in);
        //Ingreso de titulo
        System.out.print("Título: ");
        titulo = leer.nextLine();
        //Ingreso de auto  
        System.out.print("Autor: ");
        autor= leer.nextLine();
        //Ingreso de Editorial
        System.out.print("Editorial: ");
        edit = leer.nextLine();
        //Ingreso de Editorial
        System.out.print("Codigo: ");
        codigo= leer.nextLine();
        nuev_libro= new Libro(titulo,autor,edit,codigo,"DISPONIBLE");
        return nuev_libro;
    }
}