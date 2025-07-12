
package nodo;

public class lista_simple {
    //Atributo
    private Nodo p;
    private Nodo f=null;
    //Constructor sin pase a parametros
    public lista_simple() {
        this.p=null;
    }
    //Constructor con pase a parametros
    public lista_simple(Nodo p) {
        this.p = p;
    }
    //Metodos por defecto

    public Nodo getP() {
        return this.p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }
    //Metodos particuares
    //Metodos para  verificar si una lista esta vacia
    public boolean esVacia()
    {
        if(this.p==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //Metodo  para insertar un nodo como primer nodo
    public void InsertarAlInicio(Object dato)
    {
        Nodo nuevo =new Nodo(dato, this.p);
        this.p=nuevo;
    }
   public Nodo UltimoNodo()
   {
       Nodo aux=this.p;
       while(aux.getSiguiente()!=null)
       {
           aux=aux.getSiguiente();
       }
       return aux;
   }
    public int numNodo()
    {
        Nodo aux=this.p;
        int cont=0;
        while(aux!=null)
                {
                    cont++;
                    aux=aux.getSiguiente();
                }
        return cont;
    }
    public String Mostrar()
    {
        Nodo aux=this.p;
        String cad="";
        while(aux!=null)
        {
            cad=cad+"[ "+aux.getDato() +" ] →";
            aux =aux.getSiguiente();
        }
        return cad;
        
    }
    public Object EliminarPrimerNodo()
    {
        Object elem;
        Nodo aux =this.p;
        if(this.p==null)
        {
            return null;
        }
        else
        {
            this.p=(this.p).getSiguiente();
            aux.setSiguiente(null);
            elem=aux.getDato();
            return elem;
        }
    }
    public void InsertarAlFinal(Object dato)    
    {
     	Nodo nuevo=new Nodo();
       nuevo.setDato(dato);
       if(esVacia()) {
           this.p=nuevo;
       }
       else
       {
           Nodo aux=this.p;
           while(aux.getSiguiente() != null)
           {
                aux = aux.getSiguiente();
           }
           aux.setSiguiente(nuevo);
       } 
	  
    }
   
}

         

