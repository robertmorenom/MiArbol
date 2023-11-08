
package arboles;

public class Cliente {
    public static void main(String[] args) {
      Arbol<Integer> arbol1 = new Arbol<>();
      arbol1.insert(9);
      arbol1.insert(1);
      arbol1.insert(15);
      System.out.println(arbol1.buscarElemento(7));
      
      System.out.println(arbol1.raiz.getData());
      System.out.println(arbol1.raiz.getLeft().getData());
      System.out.println(arbol1.raiz.getRight().getData());
    }
}
