
package colas.circulares;

import java.util.Scanner;


public class ColasCirculares {

    //Atributos 
    private int n;
    private int rear;
    private int front;
    private Object cc[];
    //Constructor sin pase de parametros
    public ColasCirculares()
    {
        this.n=10;
        this.rear=0;
        this.front=0;
        this.cc=new Object[this.n];
    }
    
    //Metodos por defecto get y set
     public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
        this.cc=new Object[this.n];
    }

    public int getFront() {
        return this.front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return this.rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }
    public boolean esVacia()
    {
        if(this.front==this.rear)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean esLlena()
    {
        if (((this.rear +1) % this.n)==this.front)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void insertar(Object elem)
    {
        if(((this.rear +1)%this.n)==this.front)
        {
            System.out.println("COLA CIRCULAR LLENA");
        }
        else
        {
            this.rear=(this.rear+1)%this.n;
            this.cc[this.rear]=elem;
        }
    }
    public Object eliminar()
    {
        Object elem;
        if(this.front==this.rear)
        {
            System.out.println("COLA CIRCULAR VACIA");
            return null;
        }
        else
        {
            this.front=(this.front +1)%this.n;
            elem=this.cc[this.front];
            return elem;
        }
    }
    public int NumElem()
    {
        if(this.rear >=this.front)
        {
            return (this.rear-this.front);
        }
        else
        {
            return(this.n+this.rear-this.front);
        }
    }
    public void Inicializar(int x)
    {
        this.front=x;
        this.rear=x;
    }
    public String Mostrar()
    {
        ColasCirculares caux =new ColasCirculares();
        String cad="";
        int ne, f,i;
        Object elem;
        f=getFront();
        ne=NumElem();
        caux.setFront(f);
        caux.setRear(f);
        for(i=1;i<=ne;i++)
        {
            elem=eliminar();
            cad=cad + "[" + elem + "]";
            caux.insertar(elem);
            
        }
        setFront(f);
        setRear(f);
        for(i=1;i<=ne;i++)
        {
            elem=caux.eliminar();
            insertar(elem);
        }
        return cad;
    }

     public int MultiplosDeTres()
     {
        ColasCirculares caux =new ColasCirculares();
        caux.setN(this.n);
        int ne,i,f,x,c=0;
        Object elem;
        String cad;
        ne=NumElem();
        f=getFront();
        caux.Inicializar(f);
        for(i=1;i<=ne;i++)
        {
           elem=eliminar();
           cad=elem.toString();
           x=Integer.parseInt(cad);
           if(x%3==0)
           {
               c=c+1;
           }
           caux.insertar(elem);
        }
        Inicializar(f);
        for(i=1;i<=ne;i++)
        {
            elem=caux.eliminar();
            insertar(elem);
        }
         return c;
     } 
    
     public void EliminarNegativos()
    {
       ColasCirculares caux =new ColasCirculares();
        caux.setN(this.n);
        Object elem;
        String cad;
        int x;
        while(esVacia()==false)
        {
           elem=eliminar();
           cad=elem.toString();
           x=Integer.parseInt(cad);
           if(x>0)
           {
               caux.insertar(elem);
           }
        }
        while(caux.esVacia()==false)
        {
            elem=caux.eliminar();
            insertar(elem);
      
        }
    }
        
    
    
     
    
    public static void main(String[] args) {
        ColasCirculares cc=new ColasCirculares();
        Object elem ;
        int n,ne,op;
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println("NOEMI CANAVIRI MAYTA - CI :14181958");
            System.out.println("1.Establecer dimension");
            System.out.println("2.Insertar un elemento");
            System.out.println("3.Eliminar un elemento");
            System.out.println("4.Numero de elementos");
            System.out.println("5.Contar multiplos de 3");
            System.out.println("6.Eliminar negativos");
            System.out.println("7.Salir");
            System.out.println("Ingrese la opcion");
            op= sc.nextInt();
           
            switch (op)
            {
                case 1:System.out.println("ingrese la dimension");
                       n= sc.nextInt();
                       cc.setN(n);
                       break;
                case 2:System.out.println("Ingrese un elemento");
                       elem= sc.next();
                       cc.insertar(elem);
                       System.out.println(cc.Mostrar());
                       break;
                case 3:elem=cc.eliminar();               
                       System.out.println(cc.Mostrar());
                       System.out.println("Se elimino:"+ elem);
                       break;
                case 4:ne=cc.NumElem();
                       System.out.println("La cantidad de elementos es:"+ ne);
                       break;
                case 5: System.out.println("La cantidad multiplos de 3 son:" + cc.MultiplosDeTres());
                       break;
                case 6: cc.EliminarNegativos();
                       System.out.println(cc.Mostrar());
                       break;
                
                
            }
        }while(op !=7);
        
        
        
        // TODO code application logic here
    }
    
}
