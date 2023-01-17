class Person{
private int age;

int getAge(){
return age;
}

void setAge(int Age){
age = Age;
}
}

class DE{
public static void main(String[] arg){
Person P1 = new Person();

P1.setAge(20);

System.out.println("Age : " + P1.getAge());
}
}