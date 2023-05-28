package ans4;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MARKET implements ActionListener{

	JTextField phone = new JTextField(10);
	JTextField cid = new JTextField(10);
	JTextField item_no = new JTextField(5);
	JTextField kg = new JTextField(5);
	JTextField am = new JTextField(20);
	
	JButton check=new JButton("Check cid ");
	JRadioButton rb1 = new JRadioButton("Discount 30%");
	JButton Bill = new JButton("Bill");
	
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	HashMap<Integer,Double>	item= new HashMap<Integer,Double>();
	
	void add_coll()
	{
		hm.put("9741278570",121);
		hm.put("9900726035",122);
		hm.put("9901155574",123);
	}
	
	void add_item()
	{
		item.put(1,150.0);
		item.put(2,60.0);
	}
	
	
	MARKET() {
		
		JFrame f1=new JFrame("CUSTOMER INFORMATION");
		
		String uname=JOptionPane.showInputDialog(null,"Enter USERNAME: ");
		String psw=JOptionPane.showInputDialog(null,"Enter PASSWORD: ");
		add_coll();
		add_item();
		
		if(uname.equals("msrit")&& psw.equals("exam")) {
			
			JOptionPane.showMessageDialog(null, "LOGIN VALID");
			
			f1.setSize(200,200);
			f1.setVisible(true);
			f1.setLayout(new FlowLayout());
			
			f1.add(new JLabel("Customer Phone "));
			f1.add(phone);
			f1.add(check);
			f1.add(new JLabel("Enter customer id"));
			f1.add(cid);
			check.addActionListener(this);
			
			f1.add(new JLabel("#1  APPLE 150rs/Kg   #2 Orange 60rs/kg"));
			f1.add(new JLabel("Enter item number you want to purchase: "));
			f1.add(item_no);
			
			f1.add(new JLabel("Quantity kg "));
			f1.add(kg);
			
			f1.add(rb1);
			f1.add(Bill);
			Bill.addActionListener(this);
			f1.add(am);
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "LOGIN INVALID");
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MARKET ob=new MARKET();	
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==check)
		{
			String p1=phone.getText();
			if(hm.containsKey(p1))
			{
				JOptionPane.showMessageDialog(null, "Your Customer ID: "+hm.get(p1));
				cid.setText(Integer.toString(hm.get(p1)));
			}
			else
			{
				hm.put(p1,124);
				JOptionPane.showMessageDialog(null, "New Customer id: " + "124");
				cid.setText(Integer.toString(hm.get(p1)));
			}
		}
		else
		{
			double amount=0;
			if(item_no.getText().equals("1"))
				amount=150*Integer.parseInt(kg.getText());
			if(item_no.getText().equals("2"))
				amount=60*Integer.parseInt(kg.getText());
			if(rb1.isSelected())
				amount-= (amount*0.30);
			am.setText("After discount: "+amount);
			
		}
	}
	
}
