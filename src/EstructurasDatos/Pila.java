package EstructurasDatos;

public class Pila {
    private final int maxSize;
    private SimpleNode top;
    private SimpleNode bottom;

    public Pila (int size){
        this.maxSize = size;
        this.top = null;
        this.bottom = null;
    }
    public void push (Object valor){
        if (isEmpty()){
            this.top = new SimpleNode (valor);
            this.top.pos = 1;
            this.bottom = this.top;
        }else if (this.top.getPos() < this.maxSize){
            SimpleNode tmp = top;
            this.top.next = new SimpleNode (valor);
            this.top = top.next;
            this.top.pos = tmp.getPos() + 1;
        }
    }
    public Object pop (){
        if (isEmpty ()){
            throw new IllegalStateException ("Stack is empty");
        }else if (this.bottom == this.top){
            Object valor = this.top.getValor();
            this.top = null;
            this.bottom = null;
            return valor;
        }else{
            Object valor = this.top.getValor();
            SimpleNode tmp = this.bottom;
            while (tmp.next != this.top){
                tmp = tmp.next;
            }
            tmp.next = null;
            top = tmp;
            return valor;
        }
    }
    public Object lastobj (){
        if (isEmpty ()){
            throw new IllegalStateException ("Stack is empty");
        }else{
            return this.top.getValor();
        }
    }
    public Pila mezclar (){
        if (this.isEmpty()){
            throw new IllegalStateException ("Stack is empty");
        }
        SimpleList tmp = new SimpleList();
        Pila aux = new Pila (this.getMaxSize());
        while (this.isEmpty() == false){
            tmp.add(this.pop());
        }
        tmp = tmp.mezclar();
        for (int i = 0; i < tmp.getLength(); i++){
            aux.push(tmp.getPos(i));
        }
        return aux;
    }
    public boolean isEmpty (){return this.top == null;}
    public int getMaxSize(){return this.maxSize;}
}
