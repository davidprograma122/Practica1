package vista;

import java.util.Scanner;
import modelo.Usuario;

/**
 *
 * @author david
 */
public class Main {
    public static void main(String[] args) {
        Usuario[] listaUsuarios=new Usuario[2];
        
        int num=0;
        Scanner es=new Scanner(System.in);
        Usuario objeto0=new Usuario();
        Usuario objeto1=new Usuario("David", "Puetate", 'D', "Ibarra", "dc@gmail.com");
        Usuario objeto2=new Usuario("Juan", "Lopez", 'J', "Ibarra", "juan@gmail.com");
        Usuario objeto3=new Usuario("Maria", "Alvarez", 'M', "Quito", "maria@gmail.com");
        Usuario objeto4=new Usuario("Martha", "Arias", 'M', "Cuenca", "mAlvarez@gmail.com");
        Usuario objeto5=new Usuario("Jose", "Otavalo", 'J', "Atuntaqui", "joseO@gmail.com");
        
        for (int i = 0; i < listaUsuarios.length; i++) {
            
            Usuario objeto6=new Usuario(es.next(), es.next(),es.next().charAt(0), es.next(), es.next());
            listaUsuarios[i]=objeto0;
            System.out.println("");
            objeto6.imprimir();
            
            objeto6.imprimir1();
                
        }
       
    }
}
