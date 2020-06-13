package EstructurasDatos;


/**
 * Clase CircularList
 * Estructura de Datos lIneal
 * Esta clase se encarga de crear una listaCircular y todos los metodos de ella.
 *
 * @author Jose A. , Mauricio C.
 */
public class CircularList extends List{
    private int length;
    private CircularNode head;
    private CircularNode tail;

    /**
     * Constructor de la Lista Circular
     * Asigna valores al head tail y null
     * @author Jose A., Mauricio C.
     */
    public CircularList (){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * Metodo add
     * Permite agregar un nuevo nodo a la lista circular
     * @param valor
     * @author Jose A., Mauricio C.
     */
    @Override
    public void add (Object valor){
        if (this.head == null){
            this.head = new CircularNode (valor);
            this.tail = this.head;
        }else{
            this.tail.last = false;
            this.tail.next = new CircularNode (valor);
            this.tail = this.tail.next;
            this.tail.next = this.head;
            this.tail.pos = this.length;
        }
        this.tail.pos = this.length;
        this.tail.last = true;
        this.length++;
    }

    /**
     * Metodo getPos
     * Permite obtener la posicion del nodo
     * @param pos
     * @return tmp.getValor
     * @author Jose A. Mauricio C.
     */
    @Override
    public Object getPos (int pos){
        CircularNode tmp = this.head;
        if (pos == 0){
            return tmp.getValor();
        }else if (this.length > pos){
            while (tmp.next.getPos() != pos){
                tmp = tmp.next;
            }
        }else{
            throw new IllegalArgumentException ("Indice fuera de rango");
        }
        return tmp.next.getValor();
    }


    /**
     * Metodo getLength
     * Permite obtener el largo de la lista
     * @return length
     * @author Jose A. Mauricio C.
     */
    @Override
    public int getLength (){
        return this.length;
    }
}
