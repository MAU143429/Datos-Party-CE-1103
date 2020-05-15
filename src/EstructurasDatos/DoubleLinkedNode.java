package EstructurasDatos;

public class DoubleLinkedNode extends SimpleNode {
    protected DoubleLinkedNode next;
    protected DoubleLinkedNode prev;

    public DoubleLinkedNode(Object valor) {
        super(valor);
        this.prev = null;
    }
}
