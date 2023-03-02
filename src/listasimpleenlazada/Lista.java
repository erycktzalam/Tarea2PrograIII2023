package listasimpleenlazada;

public class Lista {

    private Nodo primero;

    public Lista() {
        primero = null;
    }

    //metodo para insetar los datos al principio de la lista
    public Lista insertarNodoInicio(int numero) {
        Nodo nuevo;
        nuevo = new Nodo(numero);
        nuevo.setSiguiente(primero);
        primero = nuevo;
        return this;
    }

    public Lista insertarNodoFinal(int numero) {
        Nodo nuevo;
        nuevo = new Nodo(numero, null);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        return this;
    }

    //metodo para imprimir valores de la lista
    public void imprimir() {
        Nodo n = primero;

        while (n.getSiguiente() != null) {
            System.out.print(n.getDato() + " ");
            n = n.getSiguiente();
        }
        System.out.println(n.getDato());
    }
}
