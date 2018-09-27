package verce;

public class cat extends Animal {


public int stripes;



 public cat(int stripes, String name, String breed, String food){
     super(food,breed,name);
     this.stripes=stripes;

 }

 @Override

 public String name(){

     return "This is " + name + "He has " + stripes + "stripes on hs back";


































































}
}
