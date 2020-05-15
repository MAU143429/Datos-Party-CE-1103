package EstructurasDatos;

public class DoubleLinkedList extends List{
    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;
    private int length;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    @Override
    public void add(Object valor) {
        if (this.head == null) {
            this.head = new DoubleLinkedNode (valor);
            this.tail = this.head;
        }else {
            DoubleLinkedNode tmp = this.tail;
            this.tail.next = new DoubleLinkedNode (valor);
            this.tail = this.tail.next;
            this.tail.prev = tmp;
        }
        this.tail.pos = this.length;
        this.length++;
    }

    @Override
    public Object getPos(int pos) {
        DoubleLinkedNode tmp = this.head;
        if (pos == 0){
            return this.head.getValor();
        }else{
            while (tmp.next.pos != pos){
                tmp = tmp.next;
            }
        }
        return tmp.next.getValor();
    }

    @Override
    public int getLength() {
        return this.length;
    }
}
