class MultiThread extends Thread{
public void run(){
System.out.println("The Current Thread is: " + this.currentThread().getName());
System.out.println("The Priority is: " + this.currentThread().getPriority());
}
}

class MT{
public static void main(String[] arg){
MultiThread T1 = new MultiThread();
T1.setName("First Thread");
T1.setPriority(1);
MultiThread T2 = new MultiThread();
T2.setName("Second Thread");
T2.setPriority(2);
MultiThread T3 = new MultiThread();
T3.setName("Third Thread");
T3.setPriority(3);

T1.start();
T2.start();
T3.start();
}
}