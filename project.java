//ABHISHEK SHARMA



import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.io.*;


public class project extends JFrame{
	
	public static void main(String []args) throws Exception{
		
		new project();
	
	}
	project(){
		
		
		//JFrame f=new JFrame("Data Entry");
		JTabbedPane t1=new JTabbedPane();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		String s1,s2,s3,s4,s5,s6;
		p1.setBackground(new java.awt.Color(180,140,240));
		p2.setBackground(new java.awt.Color(180,140,240));
		s1=new String();
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent w){
				System.exit(0);

			}});
		
		
		JLabel l1,l2,l3,l4,l5,l6,l14;
	//panel1:ug  /////////////////////////////////////////////////////////////

		l1=new JLabel("Name :");
		l1.setBounds(50,50,100,50);
		l2=new JLabel("Roll No. :");
		l2.setBounds(50,110,100,50);
		l3=new JLabel("Stream :");
		l3.setBounds(50,170,100,50);
		l4=new JLabel("Semester :");
		l4.setBounds(50,230,100,50);
		l5=new JLabel("Year :");
		l5.setBounds(50,290,100,50);
		l6=new JLabel("College :");
		l6.setBounds(50,350,100,50);
		l14=new JLabel("Data stored in UG_Data.dat");
		l14.setBounds(200,500,600,50);
		JTextField f1,f2,f3,f4,f5,f6;
		f1=new JTextField();
		f1.setBounds(180,50,300,50);
		f2=new JTextField();
		f2.setBounds(180,110,300,50);
		f3=new JTextField();
		f3.setBounds(180,170,300,50);
		f4=new JTextField();
		f4.setBounds(180,230,300,50);
		f5=new JTextField();
		f5.setBounds(180,290,300,50);
		f6=new JTextField();
		f6.setBounds(180,350,300,50);
		p1.add(l1);
		p1.add(f1);
		p1.add(l2);
		p1.add(f2);
		p1.add(l3);
		p1.add(f3);
		p1.add(l4);
		p1.add(f4);
		p1.add(l5);
		p1.add(f5);
		p1.add(l6);
		p1.add(f6);
		p1.setLayout(null);
		JButton b1,b2,b3;
		//b1=new JButton("ENTER");
		b2=new JButton("DONE");
		b3=new JButton("CLEAR");
		//b1.setBounds(100,450,100,50);
		//p1.add(b1);		
		b2.setBackground(new java.awt.Color(120,240,150));
		b3.setBackground(new java.awt.Color(120,240,150));
				
		b2.setBounds(150,450,100,50);
		p1.add(b2);		

		b3.setBounds(400,450,100,50);
		p1.add(b3);		
		p1.add(l14);
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				String s1,s2,s3,s4,s5,s6;
				s1=new String();
				s2=new String();
				s3=new String();
				s4=new String();
				s5=new String();
				s6=new String();
				s1=f1.getText();
				s2=f2.getText();
				s3=f3.getText();
				s4=f4.getText();
				s5=f5.getText();
				s6=f6.getText();
				f1.setText("");
				f2.setText("");
				f3.setText("");
				f4.setText("");
				f5.setText("");
				f6.setText("");
		try{
		RandomAccessFile file=new RandomAccessFile("UG_Dataset.dat","rw");
		file.seek(file.length());
		String s="Name: "+s1+"  Roll no.: "+s2+"  Stream: "+s3+"  Semester: "+s4+"  Year: "+s5+"  College: "+s6+"\n";
		byte b[]=s.getBytes();  
		file.write(b);
			
		 }
		catch(IOException ioe){System.out.println(ioe);}
				JOptionPane box=new JOptionPane();
				JFrame frame=new JFrame("Message");
				box.showMessageDialog(frame,"Registered Successfully.");
		
				box.setSize(200,150);

				box.setVisible(true);

				}
		});
	
	
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f1.setText("");
				f2.setText("");
				f3.setText("");
				f4.setText("");
				f5.setText("");
				f6.setText("");

			}
		});
		/////////////////////////////////////////////////////
		String s7,s8,s9,s10,s11,s12;
		JLabel l7,l8,l9,l10,l11,l12,l13;
		JTextField f7,f8,f9,f10,f11,f12;
		l7=new JLabel("Name :");
		l7.setBounds(50,50,100,50);
		l8=new JLabel("Roll No. :");
		l8.setBounds(50,110,100,50);
		l9=new JLabel("Stream :");
		l9.setBounds(50,170,100,50);
		l10=new JLabel("Semester :");
		l10.setBounds(50,230,100,50);
		l11=new JLabel("Specialization :");
		l11.setBounds(50,290,100,50);
		l12=new JLabel("University :");
		l12.setBounds(50,350,100,50);
		//JTextField f7,f8,f9,f10,f11,f12;
		f7=new JTextField();
		f7.setBounds(180,50,300,50);
		f8=new JTextField();
		f8.setBounds(180,110,300,50);
		f9=new JTextField();
		f9.setBounds(180,170,300,50);
		f10=new JTextField();
		f10.setBounds(180,230,300,50);
		f11=new JTextField();
		f11.setBounds(180,290,300,50);
		f12=new JTextField();
		f12.setBounds(180,350,300,50);
		l13=new JLabel("Data stored in PG_Data.dat");
		l13.setBounds(200,500,600,50);
		p2.add(l7);
		p2.add(f7);
		p2.add(l8);
		p2.add(f8);
		p2.add(l9);
		p2.add(f9);
		p2.add(l10);
		p2.add(f10);
		p2.add(l11);
		p2.add(f11);
		p2.add(l12);
		p2.add(f12);
		
		p2.setLayout(null);
		JButton b4,b5,b6;
		//b4=new JButton("ENTER");
		b5=new JButton("DONE");
		b6=new JButton("CLEAR");
	//	b4.setBounds(100,450,100,50);
	//	p2.add(b4);		
		b5.setBackground(new java.awt.Color(120,240,150));
		b6.setBackground(new java.awt.Color(120,240,150));
		
		b5.setBounds(150,450,100,50);
		p2.add(b5);		

		b6.setBounds(400,450,100,50);
		p2.add(b6);	
		p2.add(l13);	
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s7,s8,s9,s10,s11,s12;
				s7=new String();
				s8=new String();
				s9=new String();
				s10=new String();
				s11=new String();
				s12=new String();
				s7=f7.getText();
				s8=f8.getText();
				s9=f9.getText();
				s10=f10.getText();
				s11=f11.getText();
				s12=f12.getText();
				f7.setText("");
				f8.setText("");
				f9.setText("");
				f10.setText("");
				f11.setText("");
				f12.setText("");
		try{
		RandomAccessFile file2=new RandomAccessFile("PG_Dataset.dat","rw");
		file2.seek(file2.length());
		String st="Name: "+s7+"  Roll no.: "+s8+"  Stream: "+s9+"  Semester: "+s10+"  Specialization: "+s11+"  University: "+s12+"\n";
		byte b2[]=st.getBytes();  
		file2.write(b2);
		
		
		}
		
		catch(IOException ioe){System.out.println(ioe);}
			JOptionPane box=new JOptionPane();
				JFrame frame=new JFrame("Message");
				box.showMessageDialog(frame,"Registered Successfully.");
				box.setSize(200,150);
				box.setVisible(true);
	
			}
		});
	
	
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f7.setText("");
				f8.setText("");
				f9.setText("");
				f10.setText("");
				f11.setText("");
				f12.setText("");

			}
		});
		
		t1.addTab("UG ",p1);
		t1.addTab("PG ",p2);
		add(t1);
		setVisible(true);
		setSize(600,600);

	}
	}