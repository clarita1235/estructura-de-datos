
package nodo;

public class Nodo {

   //Atributos
    private Object dato;
    private Nodo siguiente;
    
    //Constructor sin pase de parametros
    
    public Nodo() {
        this.dato=null;
        this.siguiente=null;
        
    }
    //Constructor con pase de parametros
    public Nodo(Object dato, Nodo siguiente)
    {
        this.dato=dato;
        this.siguiente=siguiente;
    }
    public Nodo(Object dato){
        dato=dato;
        siguiente=siguiente;
    }
    //Metods por defecto
    public Object getDato()
    {
        return this.dato;
    }
    public void setDato(Object dato)
    {
        this.dato=dato;
    }
    public Nodo getSiguiente()
    {
        return this.siguiente;
    }
    public void setSiguiente(Nodo siguiente )
    {
        this.siguiente=siguiente;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
