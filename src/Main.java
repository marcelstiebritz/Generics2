public class Main {
    public static void main(String[] args) {
        Socke recht = new Socke();
        Socke links = new Socke();
        Genpaar<Socke> SockenPaar = new Genpaar<>(links,recht);
        System.out.println(SockenPaar.getLinks().toString());
        System.out.println(SockenPaar.getRechts().toString());

        Ohrringe rechter = new Ohrringe();
        Ohrringe linker = new Ohrringe();
        Genpaar<Ohrringe>  Ohringpaar = new Genpaar<>(linker,rechter);
        System.out.println(Ohringpaar.getRechts().toString());
        System.out.println(Ohringpaar.getLinks().toString());
    }
}
