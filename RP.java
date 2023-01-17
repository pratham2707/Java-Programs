import java.awt.*;

class RP{
RP(){
Frame f = new Frame();
Label L1 = new Label("User ID");
TextField T1 = new TextField();
Label L2 = new Label("Password");
TextField T2 = new TextField();
Button B = new Button("Register");
L1.setBounds(20, 80, 80, 30);
T1.setBounds(20, 100, 80, 30);
L2.setBounds(20, 120, 80, 30);
T2.setBounds(20, 140, 80, 30);
B.setBounds(20, 160, 80, 30);
f.add(L1);
f.add(T1);
f.add(L2);
f.add(T2);
f.add(B);
f.setSize(200, 200);
f.setTitle("Registration Page");
f.setLayout(null);
f.setVisible(true);
}
public static void main(String[] arg){
RP AWT = new RP();
}
}