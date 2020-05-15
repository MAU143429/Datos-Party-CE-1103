package EstructurasDatos;

public class SimpleNode {
    protected Object valor;
    protected SimpleNode next;
    protected int pos;

    public SimpleNode (Object valor){
        this.valor = valor;
        this.next = null;
        this.pos = 0;
    }
    public Object getValor (){
        return this.valor;
    }
    public void setValor (Object valor){
        this.valor = valor;
    }

    public int getPos (){
        return this.pos;
    }
}
