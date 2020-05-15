package EstructurasDatos;

public class CircularList extends List{
    private int length;
    private CircularNode head;
    private CircularNode tail;

    public CircularList (){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

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

    @Override
    public int getLength (){
        return this.length;
    }
}
