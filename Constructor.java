class Constructor{
int roll_number;
String name;

Constructor(int a, String b){
roll_number = a;
name = b;
System.out.println(a + " " + b);
}

public static void main(String[] arg){
Constructor C1 = new Constructor(23, "Pratham");
Constructor C2 = new Constructor(22, "Pranav");
}
}