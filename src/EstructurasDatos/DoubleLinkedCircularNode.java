package EstructurasDatos;

/**
 * Clase DoubleLinkedCircularNode
 * Estructura de Datos lineal
 * Esta clase se encarga de crear los nodos para una lista DoubleLinkedCircularNode
 *
 * @author Jose A. , Mauricio C.
 */
public class DoubleLinkedCircularNode extends CircularNode {
    protected DoubleLinkedCircularNode prev;
    protected DoubleLinkedCircularNode next;
    /**
     * Constructor de la DoubleLinkedCircularNode
     * Asigna valores al prev
     * @param valor
     * @author Jose A.
     */
    public DoubleLinkedCircularNode (Object valor){
        super(valor);
        this.prev = null;
    }
}
