package modelo;
/**
 *
 * @author david
 */
public class Usuario {
    //PUBLICOS-> public: Acceso libre
    //PRIVADOS-> private: Acceso solo para mienbros de la clase
    //PROTEGIDOS-> protected:Si soy una sub clase puedo acceder a los datos 
    private String nombre;
    private String apellido;
    private char inicial;
    private String direccion;
    private String correoElectronico;
    //METODO PARA LLENAR O INICIALIZAR DATOS SE LLAMA CONSTRUCCTOR
    //METODO PUEDE SER VACIO O CON ARGUMENTOS
    
    
    //LA SOBRECARGA ES UNA TECNICA 
    public Usuario() {
    }
    //Las variables que estan dentro de los parentecis son variables locales siempre
    //solo se puede usar dentro de las llaves del constructor 
    public Usuario(String nombre, String apellido, char inicial, String direccion, String correoElectronico) {
        //EL this ES UN PUNTERO QUE LO QUE HACE ES QUE COPIE 
        //EL VALOR DE LA VARIABLE DE LO QUE ESTAN APUNTNADO(despues del punto)
        this.nombre = nombre;
        this.apellido = apellido;
        this.inicial = inicial;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getInicial() {
        return inicial;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void imprimir(){
        System.out.println("------------DATOS DEL OBAJETO------------");
        System.out.println("Nombre: "+getNombre()+"\n"+
                "Apellido: "+getApellido()+"\n"+
                "Inicial: "+getInicial()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Correo: "+getCorreoElectronico());
    }
    public String imprimir1(){
            return "Ingrese los datos \n"+
                    "Nombre: "+getNombre()+"\n"+
                    "Apellido: "+getApellido()+"\n"+
                    "Inicial: "+getInicial()+"\n"+
                    "Dirección: "+getDireccion()+"\n"+
                    "Correo: "+getCorreoElectronico();
    }
}
