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
public class ListaLigada<T> {
     private Nodo<T> inicio;

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
    
    public void insertarInicio(T dato){
        Nodo<T> t= new Nodo<>(dato);
        t.setLiga(inicio);
        inicio=t;
    }

    public void insertarFinal(T dato) {
        Nodo<T> nuevo= new Nodo<T>(dato);
        Nodo<T> aux = inicio;
        if (inicio == null) {
            inicio = nuevo;
        } else {
            while (aux.getLiga() != null) {
                aux = aux.getLiga();
            }
            aux.setLiga(nuevo);
            }
    }
    
    public void borrar(int index){
        Nodo<T> aux=inicio;
        Nodo<T> aux2=inicio.getLiga().getLiga();
        int cont=1;
        if(index==0){borrarInicio();}else{
        while(cont !=index){
                aux=aux.getLiga();
                aux2=aux2.getLiga();
                cont++;
            }
        aux.setLiga(aux2);}
    }
    
    public void borrarInicio(){
         
            inicio = inicio.getLiga();
    }
    
    public void borrarFinal(){
         Nodo<T> aux = inicio;
        Nodo<T> anterior = null;
        while (aux.getLiga() != null) {
                anterior = aux;
                aux = aux.getLiga();
            }
            anterior.setLiga(null);
    }
    
    public void mostrar(){
        Nodo<T> aux=inicio;
        while(aux!=null){
            System.out.println(aux.getInfo());
            aux=aux.getLiga();
        }
    }
    
    public ListaLigada<T> invertirLista(){
        ListaLigada<T> respuesta=new ListaLigada<> ();
        Nodo<T> aux=inicio;
        while(aux!=null){
            respuesta.insertarInicio(aux.getInfo());
            aux=aux.getLiga();
        }
        return respuesta;
    }
    
    public boolean buscar(T dato){
        boolean resultado=false;
        Nodo<T> aux=inicio;
        while(aux!=null){
            if(aux.getInfo().equals(dato)){
                resultado=true;
            }
            aux=aux.getLiga();
        }
        return resultado;
    }
    
    public void insertarAntesde(T dato, T nuevo){
        Nodo<T> actual = inicio;
        Nodo<T> anterior = null;
        boolean band = false;
        while (actual!=null && !band) {
            if (!actual.getInfo().equals(dato)) {
                anterior = actual;
                actual = actual.getLiga();
            } else {
                band = true;
            }

        }
        if (band) {
            Nodo<T> nodo = new Nodo<>(nuevo);
            
                anterior.setLiga(nodo);
                nodo.setLiga(actual);
            
    }
    }
    
    
    
    public ListaLigada<T> dividir(int opcion){
        ListaLigada<T> lista= new ListaLigada<>();
        int elementos=1;
        Nodo<T> aux=inicio;
        while (aux.getLiga()!=null){
            elementos++;
            aux=aux.getLiga();        
        }
        elementos=(elementos % 2)==0?elementos/2:elementos/2+1;
        aux=inicio;
        int i=1;
        if(opcion==1){
            while(i<=elementos){
                lista.insertarFinal(aux.getInfo());
                aux=aux.getLiga();
                i++;
            }
        }else{
            while (aux!=null){
             if(i>elementos){
                 lista.insertarFinal(aux.getInfo());
             }       
             aux=aux.getLiga();
             i++;
        }
        }
        return lista;
    }
    
    public void quitarDuplicados(){
        Nodo<T> aux=inicio;
        Nodo<T> aux2=null;
        T dato=null;
        while(aux.getLiga()!=null){
            dato=aux.getInfo();
            aux2=inicio;
            int indice=0;
            boolean duplicado=false;
            while(aux2!=null){
                if(dato.equals(aux2.getInfo())){
                    if(!duplicado){
                        duplicado=true;
                        aux2=aux2.getLiga();
                        indice++;
                    }else{
                        aux2=aux2.getLiga();
                        borrar(indice);
                        indice++;
                    }
                }else{
                    indice++;
                    aux2=aux2.getLiga();
                }
            }aux=aux.getLiga();
        }
    }
    
    public void ordenar(char direccion){
        T aux=null;
        Nodo<T> nodoActual=inicio;
        Nodo<T> aux2=null;
        
        while(nodoActual.getLiga()!=null){
            aux2=nodoActual.getLiga();
            while(aux!=null){
                
            }
        }
    }
    
    public ListaLigada<T> intercalar(int mitad){
        ListaLigada<T> lista= new ListaLigada<>();
        boolean agregar=mitad==1?true:false;
        Nodo<T> aux= inicio;
        while(aux!=null){
            if(agregar){
                lista.insertarFinal(aux.getInfo());
                aux=aux.getLiga();
                agregar=false;
            }else{
                aux=aux.getLiga();
                agregar=true;
            }
        }
        
        return lista;
    }
}
