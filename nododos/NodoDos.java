/*
Solorzano Trejo Brandon Uriel
3S11
Nodo dos Eliminar primer y ultimo nodo
 */
package nododos;
import java.util.Scanner;
public class NodoDos {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in); 
        int opt = 0;
        String dato;
        Nodo n = new Nodo();
        
        do {
        System.out.println("\n<<<<<Opciones>>>>>");
        System.out.println("1. Agrega un dato");
        System.out.println("2. Mostrar los datos");
        System.out.println("3. Eliminar primer dato");
        System.out.println("4. Eliminar ultimo dato");
        System.out.println("5. Salir");
        
        switch (opt = sc.nextInt()) {
        case 1:
        n.agregar();
        break;

        case 2:
        n.mostrar();
        break;
                    
        case 3:
        n.eliminarP();
        break;
        
        case 4:
        n.eliminarU();
        }
        } while (opt != 5);
        System.out.println("Vuelva Pronto*-*");        
        }
        }
