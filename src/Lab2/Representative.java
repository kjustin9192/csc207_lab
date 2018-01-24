package Lab2;

public class Representative extends Person{

    Representative(String firstName, String lastName, String title){
        super(firstName, lastName, title);
    }

    @Override
    public String getHonorific() {
        return "The Right Honourable";
    }

    public static void main(String[] args) {
        System.out.println(new Representative("Jaisie", "Sin", "Ms.").getHonorific());
    }
}
