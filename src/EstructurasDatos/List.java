package EstructurasDatos;

/**
 * Clase Abstracta List
 * Estructura de Datos lIneal
 * Esta clase se encarga de crear una List y todos los metodos de ella.
 *
 * @author Jose A. , Mauricio C.
 */
public abstract class List {
    /**
     * Metodo add
     * Permite agregar un nuevo elemento a una lista
     * @param valor
     * @author Jose A., Mauricio C.
     */
    public abstract void add (Object valor);
    /**
     * Metodo abstracto getPos
     * Permite obtener la posicion de un nodo
     * @param pos
     * @author Jose A., Mauricio C.
     */
    public abstract Object getPos(int pos);
    /**
     * Metodo abstracto getLength
     * Permite obtener el largo de la lista
     * @author Jose A., Mauricio C.
     */
    public abstract int getLength();
}
