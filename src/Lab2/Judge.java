package Lab2;

public class Judge extends Person{
    public Judge(String firstName, String lastName, String title) {
        super(firstName, lastName, title);
    }

    @Override
    public String getHonorific() {
        return "The Honourable";
    }

    public static void main(String[] args) {
        System.out.println(new Judge("Jaisie", "Sin", "Ms.").getHonorific());
    }
}
