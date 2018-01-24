package Lab2;

public class Person {
    private String firstName;
    private String lastName;
    private String title;

    Person(){}

    Person(String firstName, String lastName, String title){
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    public String getHonorific(){
        return this.title;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }
}
