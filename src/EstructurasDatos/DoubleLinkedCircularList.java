package EstructurasDatos;

/**
 * Clase DoubleLinkedCircularList
 * Estructura de Datos lIneal
 * Esta clase se encarga de crear una DoubleLinkedCircularList y todos los metodos de ella.
 *
 * @author Jose A. , Mauricio C.
 */
public class DoubleLinkedCircularList extends List{
    protected int length;
    protected DoubleLinkedCircularNode head;
    protected DoubleLinkedCircularNode tail;
    /**
     * Constructor de la DoubleLinkedCircularList
     * Asigna valores al head tail y null
     * @author Jose A., Mauricio C.
     */
    public DoubleLinkedCircularList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }
    /**
     * Metodo add
     * Permite agregar un nuevo nodo a la DoubleLinkedCircularList
     * @param valor
     * @author Jose A.
     */
    @Override
    public void add (Object valor){
        if (this.head == null){
            this.head = new DoubleLinkedCircularNode(valor);
            this.head.prev = this.head;
            this.tail = this.head;
            this.tail.next = this.head;
        }else{
            this.tail.last = false;
            this.tail.next = new DoubleLinkedCircularNode(valor);
            this.tail.next.prev = this.tail;
            this.tail = this.tail.next;
            this.head.prev = this.tail;
            this.tail.next = this.head;
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
     * @author Jose A.
     */
    @Override
    public Object getPos (int pos){
        DoubleLinkedCircularNode tmp = this.head;
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
     * @author Jose A.
     */
    @Override
    public int getLength (){
        return this.length;
    }
}
