import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main (String[]args){
        Main ap;
        int opcion;
        Usuario persona;
        ArrayList<Libro> biblioteca;
        ap = new Main();
        //----------------
        do { 
            opcion=ap.opcionesbiblio;
            if(opcion==1){
                 //Ingresar Libro al Inventario
                biblioteca=ap.ingresarLibro();    
            }else if(opcion==2){
                persona=ap.ingresarUsuario();
                libro1=ap.ingresarLib_Usuario();
                ap.transaccionLibro(persona,libro1,biblioteca);
            } else{
                ap.procesarDevolucion
             }
        } while (opcion==null);
        biblioteca=ap.ingresarLibro();
        System.out.println("Usuarios registrados");
    }
    public int opcionesBiblio(){
        Scanner teclado;
        teclado= new Scanner(System.in);
        do { 
            System.out.println("INGRESAR LIBRO:1");
            System.out.println("PRESTAMO LIRBO:2");
            opcion=teclado.nextInt();
        } while ((opcion!=2)&&(opcion!=1));
    }
    public Usuario ingresarUsuario(){
        Scanner sc;
        Usuario persona;
        String dni;
        String nombre;
        sc = new Scanner(System.in);
        System.out.print("Nombre del usuario: ");
        nombre = sc.nextLine();
        System.out.print("DNI: ");
        dni = sc.nextLine();
        persona = new Usuario(nombre,dni);
        return persona;
    }
    public Usuario ingresarUsuario(){
        Scanner sc;
        Usuario persona;
        String dni;
        String nombre;
        sc = new Scanner(System.in);
        System.out.print("Nombre del usuario: ");
        nombre = sc.nextLine();
        System.out.print("DNI: ");
        dni = sc.nextLine();
        persona = new Usuario(nombre,dni);
        return persona;
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
<<<<<<< HEAD
    public Libro ingresarLib_Usuario(){
        Scanner teclado;
        String titulo;
        String autor;
        Libro busLibro;
        teclado= new Scanner(System.in);
        System.out.print("INGRESE EL LIBRO QUE BUSCA:");
        titulo=teclado.nextLine();
        System.out.print("INGRESE AUTOR");
        autor=teclado.nextLine();
        busLibro= new Libro(titulo,autor);
        return busLibro;
    }
    public void transaccionLibro(Usuario persona,Libro libro_busqueda , ArrayList<Libro> biblioteca){
        String titulo;
        Prestamo transaccion;
        titulo=libro_busqueda.getAutor();
        for(Libro libro|biblioteca){
            if(libro.getNombre().equals(titulo){
                if (libro.getEstado().equalsIgnoreCase("Disponible")) {
                    libro.setEstado("Prestado"); 
                    transacion= new Prestamo(libro, persona);
                    System.out.println("--- PROCESANDO PRÉSTAMO ---");
                    transaccion.imprimirTicket();
                } else {
                    System.out.println("¡ERROR! El libro '" + libro.getNombre() + "' no está disponible.");
                }
            }
        }
    }
    public void procesarDevolucion(Libro libro_dev,ArrayList<Libro> biblioteca) {
        String titulo ;
        titulo=libro_dev.getNombre();
        for(Libro libro|biblioteca){
            if(libro.getNombre().equals(titulo){
                if (libro.getEstado().equalsIgnoreCase("Prestado")) {
                    libro.setEstado("Disponible"); 
                    transacion= new Prestamo(libro, persona);
            }
        }
    }
}
=======
}
>>>>>>> 9d98d919d97e05842345da4d54d948ee52d797bb
