public class Paar {

    private Object links;
    private Object rechts;

    public Paar(Object links, Object rechts){
        this.links = links;
        this.rechts = rechts;
    }

    public Object getLinks(){
        return links;
    }

    public Object getRechts(){
        return rechts;
    }
}
