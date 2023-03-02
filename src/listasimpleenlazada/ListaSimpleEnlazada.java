
package listasimpleenlazada;

public class ListaSimpleEnlazada {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        System.out.println("Se insertan 3 nodos al principio de la lista");
        
        lista.insertarNodoInicio(1);
        lista.insertarNodoInicio(5);
        lista.insertarNodoInicio(8);
        
        lista.imprimir();
        
        System.out.println("Insertamos 3 nodos mas al final de la lista");
        
        lista.insertarNodoFinal(12);
        lista.insertarNodoFinal(17);
        lista.insertarNodoFinal(23);
        
        lista.imprimir();
       
    }
    
}
