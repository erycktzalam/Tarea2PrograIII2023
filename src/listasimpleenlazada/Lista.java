package listasimpleenlazada;

public class Lista {

    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista insertarNodoInicio(int numero) {
        Nodo nuevo;
        nuevo = new Nodo(numero);
        nuevo.setSiguiente(primero);
        primero = nuevo;
        return this;
    }
    
    public void imprimir() {
        Nodo n;
        //int k = 0;

        n = primero;
        while (n != null) {
            System.out.print(n.getDato() + " ");
            n = n.getSiguiente();
            //k++;
        }
    }
}
