package verce;

public class dog extends Animal {



    public String fetch;



    public dog(String fetch, String name, String breed, String food){
        super(food,breed,name);
        this.fetch=fetch;

    }

    @Override

    public String name() {

        return "This is " + name + " He can fetch " + fetch + " running backwards ";


    }

}
