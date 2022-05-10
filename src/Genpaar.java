public class Genpaar <T> {
    private T links;
    private T rechts;

    public Genpaar (T links, T rechts ){
        this.links=links;
        this.rechts=rechts;
    }

    public T getLinks(){
        return links;
    }
    public T getRechts(){
        return rechts;
    }
}
