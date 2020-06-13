package EstructurasDatos;
/**
 * Clase CircularNode
 * Estructura de Datos lineal
 * Esta clase se encarga de crear los nodos para una lista CircularNode
 *
 * @author Jose A. , Mauricio C.
 */
public class CircularNode extends SimpleNode{
    protected CircularNode next;
    protected boolean last;

    /**
     * Constructor de la CircularNode
     * Asigna valores al prev
     * @param valor
     * @author Jose A., Mauricio C.
     */
    public CircularNode (Object valor){
        super (valor);
        this.last = false;
    }

}