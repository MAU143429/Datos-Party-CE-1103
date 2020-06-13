package EstructurasDatos;
/**
 * Clase SimpleNode
 * Estructura de Datos lineal
 * Esta clase se encarga de crear los nodos para una lista SimpleNode
 *
 * @author Jose A. , Mauricio C.
 */
public class SimpleNode {
    protected Object valor;
    protected SimpleNode next;
    protected int pos;
    /**
     * Constructor de la SimpleNode
     * Asigna valores al prev, next y pos
     * @param valor
     * @author Jose A., Mauricio C.
     */
    public SimpleNode (Object valor){
        this.valor = valor;
        this.next = null;
        this.pos = 0;
    }
    /**
     * Metodo getValor
     * Permite obtener el valor
     * @return valor
     * @author Jose A., Mauricio C.
     */
    public Object getValor (){
        return this.valor;
    }

    /**
     * Metodo getPos
     * Permite obtener la posicion
     * @return pos
     * @author Jose A., Mauricio C.
     */
    public int getPos (){
        return this.pos;
    }
}
