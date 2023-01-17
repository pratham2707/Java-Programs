class Animal{
void display(){
System.out.println("Animal!");
}
}

class Dog extends Animal{
void display(){
System.out.println("Dog!");
}
}

class SIMO{
public static void main(String[] arg){
Dog D = new Dog();
D.display();
}
}