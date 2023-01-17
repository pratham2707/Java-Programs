class Student{
void display(String name, int roll_number){
System.out.println("Name: " + name + " Roll Number: " + roll_number);
}
public static void main(String[] args){
Student S1 = new Student();
Student S2 = new Student();

S1.display("Pratham", 23);
S2.display("Pranav", 22);
}
}