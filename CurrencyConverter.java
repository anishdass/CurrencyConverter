import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Test2 extends JFrame{
Container c;
JLabel l1,l2,l3;
JTextField t1,t2;
JComboBox c1,c2;
JPanel p1,p2,p3;
JButton b1;

Test2(){
	c=getContentPane();
	c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
	
	p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
	String[] from={"USD (U.S.)","RMB (China)","YEN (Japan)","EURO (Germany)","INR (India)"};
	String[] to={"USD (U.S.)","RMB (China)","YEN (Japan)","EURO (Germany)","INR (India)"};
	c1=new JComboBox(from);
	c2=new JComboBox(to);
	l1=new JLabel("From");
	l2=new JLabel("To");
	p1.add(l1);
	p1.add(c1);
	p1.add(l2);
	p1.add(c2);
	c.add(p1);
	
	p2=new JPanel(new FlowLayout(FlowLayout.CENTER));
	l3=new JLabel("Enter Value");
	t1=new JTextField(10);
	p2.add(l3);
	p2.add(t1);
	c.add(p2);
	
	p3=new JPanel(new FlowLayout(FlowLayout.CENTER));
	b1=new JButton("Convert");
	p3.add(b1);
	c.add(p3);
	b1.addActionListener(new L1());
}
class L1 implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		if(t1.getText().equals("")){
			JOptionPane.showMessageDialog(c, "Please Enter a valid value");
			t1.requestFocus();	
		}
		else{
			try{
			if(c1.getSelectedIndex()==0){
				switch(c2.getSelectedIndex()){
					case 0: double value=0;
							JOptionPane.showMessageDialog(c, "Same currency."); break;
							
					case 1: double convert1=Double.parseDouble(t1.getText());
							double value1=convert1*6.61;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value1); break;
							
					case 2: double convert2=Double.parseDouble(t1.getText());
							double value2=convert2*112.2;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value2); break;
							
					case 3: double convert3=Double.parseDouble(t1.getText());
							double value3=convert3*0.85;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value3); break;
							
					case 4: double convert4=Double.parseDouble(t1.getText());
							double value4=convert4*64.08;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value4); break;
							
					
				}
			}
			
			if(c1.getSelectedIndex()==1){
				switch(c2.getSelectedIndex()){
					case 0: double convert=Double.parseDouble(t1.getText());
							double value=convert*0.15;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value); break;
							
					case 1: double value1=0;
							JOptionPane.showMessageDialog(c, "Same currency."); break;
							
					case 2: double convert2=Double.parseDouble(t1.getText());
							double value2=convert2*16.98;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value2); break;
							
					case 3: double convert3=Double.parseDouble(t1.getText());
							double value3=convert3*0.13;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value3); break;
							
					case 4: double convert4=Double.parseDouble(t1.getText());
							double value4=convert4*9.70;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value4); break;
							
					
				}
			}
			
			if(c1.getSelectedIndex()==2){
				switch(c2.getSelectedIndex()){
					case 0: double convert=Double.parseDouble(t1.getText());
							double value=convert*0.0089;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value); break;
							
					case 1: double convert1=Double.parseDouble(t1.getText());
							double value1=convert1*0.059;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value1); break;
							
					case 2: double value2=0;
							JOptionPane.showMessageDialog(c, "Same currency."); break;
							
					case 3: double convert3=Double.parseDouble(t1.getText());
							double value3=convert3*0.0076;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value3); break;
							
					case 4: double convert4=Double.parseDouble(t1.getText());
							double value4=convert4*0.57;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value4); break;
							
					
				}
			}
			
			if(c1.getSelectedIndex()==3){
				switch(c2.getSelectedIndex()){
					case 0: double convert=Double.parseDouble(t1.getText());
							double value=convert*1.18;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value); break;
							
					case 1: double convert1=Double.parseDouble(t1.getText());
							double value1=convert1*7.79;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value1); break;
							
					case 2: double convert2=Double.parseDouble(t1.getText());
							double value2=convert2*132.25;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value2); break;
							
					case 3: double value3=0;
							JOptionPane.showMessageDialog(c, "Same currency."); break;
							
					case 4: double convert4=Double.parseDouble(t1.getText());
							double value4=convert4*75.57;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value4); break;
							
					
				}
			}
			
			if(c1.getSelectedIndex()==4){
				switch(c2.getSelectedIndex()){
					case 0: double convert=Double.parseDouble(t1.getText());
							double value=convert*0.016;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value); break;
							
					case 1: double convert1=Double.parseDouble(t1.getText());
							double value1=convert1*0.10;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value1); break;
							
					case 2: double convert2=Double.parseDouble(t1.getText());
							double value2=convert2*1.75;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value2); break;
							
					case 3: double convert3=Double.parseDouble(t1.getText());
							double value3=convert3*0.013;
							JOptionPane.showMessageDialog(c, "The conversion is: "+value3); break;
							
					case 4: double value4=0;
							JOptionPane.showMessageDialog(c, "Same currency."); break;
							
					
				}
			}
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(c, "Enter Valid Integer!");
				t1.setText("");
				t1.requestFocus();
				
			}
			
		}
		
	}
	
}

public static void main(String args[]){
	Test2 f=new Test2();
	f.setSize(500,150);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setTitle("Currency Converter");
	f.setLocation(300,300);
	f.setResizable(false);
	
}
}