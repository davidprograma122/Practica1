package vista;



/**
 *
 * @author david
 */
public class Main {
    //1.- METODO TRADUCTOR O INTERPRETE 
    public static void main(String[] args) {
        //DECLARACIÓN DE LISTA
        String[] listaDatos=new String[4];
        //VARIABLES 
        System.out.println("LOS DATOS DEL USUARIO 1 SON: ");
        String nombre= "David";
        String apellido="Puetate";
        char inicial ='D';
        String direccion = "Ibarra";
        String correoElectronico = "dpcf@gmail.com";
        
        listaDatos[0]=nombre;
        listaDatos[1]=apellido;
        listaDatos[2]=direccion;
        listaDatos[3]=correoElectronico;
        
        System.out.println("1) "+listaDatos[0]);
        System.out.println("2) "+listaDatos[1]);
        System.out.println("3) "+listaDatos[2]);
        System.out.println("4) "+listaDatos[3]);
        
        
        System.out.println("LOS DATOS DEL USUARIO 2 SON: ");
        String nombre1= "Pepe";
        String apellido1="Lopez";
        char inicial1 ='P';
        String direccion1 = "Ibarra";
        String correoElectronico1 = "pepe@gmail.com";
        
        
        
    }
}
