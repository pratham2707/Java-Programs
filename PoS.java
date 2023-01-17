import java.util.*;

class PoS{
public static void main(String[] arg){

int i = 0;

Scanner s = new Scanner(System.in);

for(i=0; i<5; i++){
System.out.println("Enter The marks of student " + (i+1) + " out of 100");
float a = s.nextFloat();
float b = s.nextFloat();
float c = s.nextFloat();
float d = s.nextFloat();
float e = s.nextFloat();

float percentage = ((a + b + c + d + e)/500)*100;

System.out.println("Percentage of Student " + (i+1) + " : " + percentage);
}
}
}