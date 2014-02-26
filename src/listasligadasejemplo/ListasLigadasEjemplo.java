/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadasejemplo;

/**
 *
 * @author Alumnos
 */
public class ListasLigadasEjemplo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaLigada<Integer> lista=new ListaLigada<>();
        
        lista.insertarInicio(3);
        lista.insertarInicio(2);
        lista.insertarInicio(3);
        lista.insertarInicio(4);
        lista.insertarInicio(5);
        lista.insertarInicio(6);
        lista.insertarInicio(4);
        lista.insertarInicio(8);
        lista.mostrar();
        System.out.println("-------------------------------------------------------------");
        ListaLigada<Integer> lista2=lista.intercalar(2);
        lista2.mostrar();
        
    }
    
    
    
    
}
