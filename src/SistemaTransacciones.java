// 1. Clase para registrar la transacción
import java.time.LocalDate;
class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaEntrega;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaEntrega = LocalDate.now().plusDays(15);
    }
    public void imprimirTicket() {
        System.out.println("Libro: " + libro.getNombre() + " | Usuario: " + usuario.getNombre());
        System.out.println("Fecha límite de devolución: " + fechaEntrega);
    }
}
// 2. Clase principal de transacciones
public class SistemaTransacciones {

    public void procesarPrestamo(Libro libro, Usuario usuario) {
        if (libro.getEstados().equalsIgnoreCase("Disponible")) {
            libro.setEstados("Prestado"); 
            Prestamo transaccion = new Prestamo(libro, usuario);
            
            System.out.println("--- PROCESANDO PRÉSTAMO ---");
            transaccion.imprimirTicket();
        } else {
            System.out.println("¡ERROR! El libro '" + libro.getNombre() + "' no está disponible.");
        }
    }

    public void procesarDevolucion(Libro libro) {
        if (libro.getEstados().equalsIgnoreCase("Prestado")) {
            libro.setEstados("Disponible");
            System.out.println("--- DEVOLUCIÓN EXITOSA ---");
            System.out.println("El libro '" + libro.getNombre() + "' está disponible nuevamente.");
        } else {
            System.out.println("AVISO: El libro ya estaba en la biblioteca.");
        }
    }
}
