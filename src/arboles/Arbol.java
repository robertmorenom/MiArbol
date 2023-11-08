package arboles;

public class Arbol<T> {

    public Nodo raiz = null;

    public Arbol() {

    }
    
    //Esto es un decorador
    public boolean buscarElemento(T data){
        if (raiz.getData().equals(data)) {
          return true;  
        }
        return buscarElemento(this.raiz, data);
    }
    
    //Método funcional o invocado por el decorador
    private boolean buscarElemento(Nodo<T> actual, T data){
        if (actual == null) {
          return false;  
        }
        if (data.equals(actual.getData())) {
            return true;
        }
        return buscarElemento(actual.getLeft(), data) || buscarElemento(actual.getRight(), data);
    }
    
    //Une dos arboles que ya están creados, creando una raíz con el dato que me pasen
    public void construir(T dataRaiz, Arbol <T> arbolIzquierdo, Arbol<T> arbolDerecho){
     this.raiz = new Nodo(dataRaiz);
     this.raiz.setLeft((new Nodo(arbolIzquierdo.getRaiz())));
     this.raiz.setRight((new Nodo(arbolDerecho.getRaiz())));
    }
    
    public T getRaiz(){
     return (T) raiz.getData();
    }
    

    public void insert(T data) {
        if(this.raiz == null) this.raiz = new Nodo(data);
        else this.insertData(this.raiz, data);
    }

    private void insertData(Nodo<T> actual, T data) {
        if (((Comparable) data).compareTo(actual.getData()) < 0) {
            if (actual.getLeft() == null) {
                actual.setLeft(new Nodo<T>(data));
            } else {
                insertData(actual.getLeft(), data);
            }
        } else {
            if (actual.getRight() == null) {
                actual.setRight(new Nodo<T>(data));
            } else {
                insertData(actual.getRight(), data);
            }

        }

    }
    
    
    
}
