package EstructurasDatos;

public class DoubleLinkedCircularList extends List{
    protected int length;
    protected DoubleLinkedCircularNode head;
    protected DoubleLinkedCircularNode tail;

    public DoubleLinkedCircularList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

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

    @Override
    public int getLength (){
        return this.length;
    }
}
