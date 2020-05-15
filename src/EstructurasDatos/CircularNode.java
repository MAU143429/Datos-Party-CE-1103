package EstructurasDatos;

public class CircularNode extends SimpleNode{
    protected CircularNode next;
    protected boolean last;

    public CircularNode (Object valor){
        super (valor);
        this.last = false;
    }

}