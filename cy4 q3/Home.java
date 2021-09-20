import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;

 public class Home extends Applet implements ActionListener
 {
   Button color1,color2;
   Label bcolor;
   String str;
public void init()
        {
			
            Button color1 = new Button("Red");    
            Button color2= new Button("Blue");
             
            add(color1);                  
            add(color2);
			
            color1.addActionListener(this); 
            color2.addActionListener(this);
			
			
        }
        public void actionPerformed(ActionEvent ae)
        {
			
            str = ae.getActionCommand();
            repaint();      
        }
	 public void paint(Graphics g)
	 {
			
		 int a[]={150, 300, 225};   
		 int b[]={150, 150, 25};
		 g.setColor(Color.gray);
		 g.fillRect(150, 150, 150, 200);
		 		 
		 if(str.equals("Red"))
		 {
		 g.setColor(Color.red);
		 g.fillRect(190,220,70,130);
		 }
		 
		  if(str.equals("Blue"))
		 {
		 g.setColor(Color.blue);
		 g.fillRect(190,220,70,130);
		 }
		 
		 g.setColor(Color.red);
		 g.fillPolygon(a,b,3);
		 
	 }
 }