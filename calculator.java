package yogamurugan;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class calculator implements ActionListener{

	JTextField l1;
	JButton bhis,bac,bper,bdel,bdiv,bmul,bsub,badd,bdot,beq,b0,b00,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	calculator()
	{
		JFrame f=new JFrame("Calculator");
		f.setBackground(Color.black);
		
		l1=new JTextField("0");
		l1.setBounds(0,30,500,150);
	    l1.setFont(new Font("Arial", Font.PLAIN, 30)); 
		
		bhis=new JButton("...");
		bhis.setBounds(460,0,20,20);
		bhis.addActionListener(this);
		
		bac=new JButton("AC");
		bac.setBounds(10,180,100,50);
		bac.addActionListener(this);
		bac.setFont(new Font("Georgia", Font.PLAIN, 30));
		
		bper=new JButton("%");
		bper.setBounds(130,180,100,50);
		bper.addActionListener(this);
		bper.setFont(new Font("Arial", Font.PLAIN, 30));
		
	    bdel=new JButton("Del");
		bdel.setBounds(250,180,100,50);
		bdel.addActionListener(this);
		bdel.setFont(new Font("Georgia", Font.PLAIN, 30));
		
		bdiv=new JButton("/");
		bdiv.setBounds(370,180,100,50);
		bdiv.addActionListener(this);
		bdiv.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b7=new JButton("7");
		b7.setBounds(10,250,100,50);
		b7.addActionListener(this);
		b7.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b8=new JButton("8");
		b8.setBounds(130,250,100,50);
		b8.addActionListener(this);
		b8.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b9=new JButton("9");
		b9.setBounds(250,250,100,50);
		b9.addActionListener(this);
		b9.setFont(new Font("Arial", Font.PLAIN, 30));
		
		bmul=new JButton("*");
		bmul.setBounds(370,250,100,50);
		bmul.addActionListener(this);
		bmul.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b4=new JButton("4");
		b4.setBounds(10,320,100,50);
		b4.addActionListener(this);
		b4.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b5=new JButton("5");
		b5.setBounds(130,320,100,50);
		b5.addActionListener(this);
		b5.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b6=new JButton("6");
		b6.setBounds(250,320,100,50);
		b6.addActionListener(this);
		b6.setFont(new Font("Arial", Font.PLAIN, 30));
		
		bsub=new JButton("-");
		bsub.setBounds(370,320,100,50);
		bsub.addActionListener(this);
		bsub.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b1=new JButton("1");
		b1.setBounds(10,390,100,50);
		b1.addActionListener(this);
		b1.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b2=new JButton("2");
		b2.setBounds(130,390,100,50);
		b2.addActionListener(this);
		b2.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b3=new JButton("3");
		b3.setBounds(250,390,100,50);
		b3.addActionListener(this);
		b3.setFont(new Font("Arial", Font.PLAIN, 30));
		
	    badd=new JButton("+");
		badd.setBounds(370,390,100,50);
		badd.addActionListener(this);
		badd.setFont(new Font("Arial", Font.PLAIN, 30));
		
	    b00=new JButton("00");
		b00.setBounds(10,460,100,50);
		b00.addActionListener(this);
		b00.setFont(new Font("Arial", Font.PLAIN, 30));
		
		b0=new JButton("0");
		b0.setBounds(130,460,100,50);
		b0.addActionListener(this);
		b0.setFont(new Font("Arial", Font.PLAIN, 30));
		
		bdot=new JButton(".");
		bdot.setBounds(250,460,100,50);
		bdot.addActionListener(this);
		bdot.setFont(new Font("Arial", Font.PLAIN, 30));
		
		beq=new JButton("=");
		beq.setBounds(370,460,100,50);
		beq.addActionListener(this);
		beq.setFont(new Font("Arial", Font.PLAIN, 30));
		beq.setBackground(Color.orange);
		
		f.add(l1);
		f.add(bhis);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b00);
		f.add(b0);
		f.add(bdot);
		f.add(bac);
		f.add(bper);
		f.add(bdel);
		f.add(bdiv);
		f.add(bmul);
		f.add(bsub);
		f.add(badd);
		f.add(beq);
		
		f.setSize(500,600);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
			
		}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String expression=l1.getText();
			expression+="1";
			l1.setText(expression);
		}
		
		
		if(e.getSource()==b2)
		{
			String expression=l1.getText();
			expression+="2";
			l1.setText(expression);
		}
		if(e.getSource()==b3)
		{
			String expression=l1.getText();
			expression+="3";
			l1.setText(expression);
		}
		if(e.getSource()==b4)
		{
			String expression=l1.getText();
			expression+="4";
			l1.setText(expression);
		}
		if(e.getSource()==b5)
		{
			String expression=l1.getText();
			expression+="5";
			l1.setText(expression);
		}
		if(e.getSource()==b6)
		{
			String expression=l1.getText();
			expression+="6";
			l1.setText(expression);
		}
		if(e.getSource()==b7)
		{
			String expression=l1.getText();
			expression+="7";
			l1.setText(expression);
		}
		if(e.getSource()==b8)
		{
			String expression=l1.getText();
			expression+="8";
			l1.setText(expression);
		}
		if(e.getSource()==b9)
		{
			String expression=l1.getText();
			expression+="9";
			l1.setText(expression);
		}
		if(e.getSource()==b0)
		{
			String expression=l1.getText();
			expression+="0";
			l1.setText(expression);
		}
		if(e.getSource()==b00)
		{
			String expression=l1.getText();
			expression+="00";
			l1.setText(expression);
		}
		
		
		if(e.getSource()==badd)
		{
			String expression=l1.getText();
			expression+="+";
			l1.setText(expression);
		}
		
		if(e.getSource()==bsub)
		{
			String expression=l1.getText();
			expression+="-";
			l1.setText(expression);
		}
		
		if(e.getSource()==bmul)
		{
			String expression=l1.getText();
			expression+="*";
			l1.setText(expression);
		}
		
		if(e.getSource()==bdiv)
		{
			String expression=l1.getText();
			expression+="/";
			l1.setText(expression);
		}
		
		if(e.getSource()==bper)
		{
			String expression=l1.getText();
			expression+="%";
			l1.setText(expression);
		}
		if(e.getSource()==bdel)
		{
			l1.setText("0");
		}
	
		
		
		
		if(e.getSource()==beq)
		{
			int a,b,i;
			char operator='+';
			String expression=l1.getText();
			String tempA="";
			String tempB="";
			
			
			for(i=0;i<expression.length();i++)
			{
				if(Character.isDigit(expression.charAt(i)))
				{
					tempA+=expression.charAt(i);
				}
				else
				{
					operator=expression.charAt(i);
					break;
				}
			}
			
			tempB=expression.substring(i+1).trim();
			a=Integer.parseInt(tempA.trim());
			b=Integer.parseInt(tempB);
			int result=0;
			
		switch(operator)
		{
		case'+':
			result=a+b;
			break;
		case'-':
			result=a-b;
			break;
		case'*':
			result=a*b;
			break;
		case'/':
			result=a/b;
			break;
			
		} 
		l1.setText(String.valueOf(result));
		}
		
	}
	
	public static void main(String[] args) {
	
       new calculator();
	}
}
