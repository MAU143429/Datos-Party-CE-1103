package EstructurasDatos;

public class DoubleLinkedCircularNode extends CircularNode {
    protected DoubleLinkedCircularNode prev;
    protected DoubleLinkedCircularNode next;

    public DoubleLinkedCircularNode (Object valor){
        super(valor);
        this.prev = null;
    }
}
