package verce;

public class Animal {

 private String food;

 private String breed;

 protected String name;



public Animal(String food, String breed, String name){

    this.food=food;
    this.breed=breed;
    this.name=name;
}


    public String getFood() {
        return food;
    }

 public void setfood(String food){

    this.food=food;
}

    public void setBreed(String breed){

        this.breed=breed;

    }

 public String name(){

    return "This is " + name;
 }






























}
