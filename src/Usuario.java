public class Usuario{
    private String nombre_Alum;
    private String dni;
    public Usuario(String Nombre_Alum,String dni){
        this.Nombre_Alum=Nombre_Alum;
        this.dni=dni;
    }
    public String getNombre_Alum(){
        return nombre_Alum;
    }
}