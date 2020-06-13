package EstructurasDatos;
/**
 * Clase DoubleLinkedNode
 * Estructura de Datos lineal
 * Esta clase se encarga de crear los nodos para una lista DoubleLinkedNode
 *
 * @author Jose A. , Mauricio C.
 */
public class DoubleLinkedNode extends SimpleNode {
    protected DoubleLinkedNode next;
    protected DoubleLinkedNode prev;
    /**
     * Constructor de la DoubleLinkedNode
     * Asigna valores al prev
     * @param valor
     * @author Jose A., Mauricio C.
     */
    public DoubleLinkedNode(Object valor) {
        super(valor);
        this.prev = null;
    }
}
