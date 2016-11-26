import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUIexa implements ActionListener
{
	JPanel c1 = new JPanel();
	JPanel c2 = new JPanel();
	JPanel c3 = new JPanel();
	JPanel c4 = new JPanel();
	JPanel c5 = new JPanel();
	
	JButton b1 = new JButton("Red");
	JButton b2 = new JButton("Green");
	JButton b3 = new JButton("Blue");
	JButton b4 = new JButton("Yellow");
	JButton b5 = new JButton("Pink");

	JCheckBox cb1 = new JCheckBox("Left");
	JCheckBox cb2 = new JCheckBox("Right");
	JCheckBox cb3 = new JCheckBox("Top");
	JCheckBox cb4 = new JCheckBox("Bottom");
	JCheckBox cb5 = new JCheckBox("Center");
	
	public static void main(String args[])
	{
		JFrame jf = new JFrame();
		jf.setBounds(0,0,400,400);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setName("Frame");
		jf.setTitle("My Frame");
		jf.setVisible(true);
		jf.setCursor(Cursor.HAND_CURSOR);
	
		Container cn = jf.getContentPane();
		GUIexa ad = new GUIexa();
		ad.addComponent(cn);
	}
	
	public void addComponent(Container cn)
	{
		c1.setLayout(new GridLayout(6,1));
		
		c1.add(b1);
		c1.add(b2);
		c1.add(b3);
		c1.add(b4);
		c1.add(b5);
		
		c1.add(cb1);
		c2.add(cb2);
		c3.add(cb5);
		c4.add(cb3);
		c5.add(cb4);
		
		cn.add(c1,BorderLayout.LINE_START);
		cn.add(c2,BorderLayout.LINE_END);
		cn.add(c3,BorderLayout.CENTER);
		cn.add(c4,BorderLayout.PAGE_START);
		cn.add(c5,BorderLayout.PAGE_END);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		 Object source = ae.getSource();
		
		if(source==b1)
		{
			if(cb1.isSelected())
			{
				c1.setBackground(Color.RED);
				b1.setBackground(Color.RED);
				b2.setBackground(Color.RED);
				b3.setBackground(Color.RED);
				b4.setBackground(Color.RED);
				b5.setBackground(Color.RED);
				cb1.setBackground(Color.RED);
			}
			else
			{
				c1.setBackground(Color.WHITE);
				b1.setBackground(Color.WHITE);
				b2.setBackground(Color.WHITE);
				b3.setBackground(Color.WHITE);
				b4.setBackground(Color.WHITE);
				b5.setBackground(Color.WHITE);
				cb1.setBackground(Color.WHITE);
			}
			
			if(cb2.isSelected())
				c2.setBackground(Color.RED);
			else
				c2.setBackground(Color.WHITE);
			
			if(cb3.isSelected())
				c4.setBackground(Color.RED);
			else
				c4.setBackground(Color.WHITE);
			
			if(cb4.isSelected())
				c5.setBackground(Color.RED);
			else
				c5.setBackground(Color.WHITE);
			
			if(cb5.isSelected())
				c3.setBackground(Color.RED);
			else
				c3.setBackground(Color.WHITE);
		}
		else if(source==b2)
		{
			if(cb1.isSelected())
			{
				c1.setBackground(Color.GREEN);
				b1.setBackground(Color.GREEN);
				b2.setBackground(Color.GREEN);
				b3.setBackground(Color.GREEN);
				b4.setBackground(Color.GREEN);
				b5.setBackground(Color.GREEN);
				cb1.setBackground(Color.GREEN);
			}
			else
			{
				c1.setBackground(Color.WHITE);
				b1.setBackground(Color.WHITE);
				b2.setBackground(Color.WHITE);
				b3.setBackground(Color.WHITE);
				b4.setBackground(Color.WHITE);
				b5.setBackground(Color.WHITE);
				cb1.setBackground(Color.WHITE);
			}	
			if(cb2.isSelected())
				c2.setBackground(Color.GREEN);
			else
				c2.setBackground(Color.WHITE);
				
			if(cb3.isSelected())
				c4.setBackground(Color.GREEN);
			else
				c4.setBackground(Color.WHITE);
				
			if(cb4.isSelected())
				c5.setBackground(Color.GREEN);
			else
				c5.setBackground(Color.WHITE);
			
			if(cb5.isSelected())
				c3.setBackground(Color.GREEN);
			else
				c3.setBackground(Color.WHITE);
		}
		else if(source==b3)
		{
			if(cb1.isSelected())
			{
				c1.setBackground(Color.BLUE);
				b1.setBackground(Color.BLUE);
				b2.setBackground(Color.BLUE);
				b3.setBackground(Color.BLUE);
				b4.setBackground(Color.BLUE);
				b5.setBackground(Color.BLUE);
				cb1.setBackground(Color.BLUE);
			}
			else
			{
				c1.setBackground(Color.WHITE);
				b1.setBackground(Color.WHITE);
				b2.setBackground(Color.WHITE);
				b3.setBackground(Color.WHITE);
				b4.setBackground(Color.WHITE);
				b5.setBackground(Color.WHITE);
				cb1.setBackground(Color.WHITE);
			}
			
			if(cb2.isSelected())
				c2.setBackground(Color.BLUE);
			else
				c2.setBackground(Color.WHITE);
				
			if(cb3.isSelected())
				c4.setBackground(Color.BLUE);
			else
				c4.setBackground(Color.WHITE);
				
			if(cb4.isSelected())
				c5.setBackground(Color.BLUE);
			else
				c5.setBackground(Color.WHITE);
		
			if(cb5.isSelected())
				c3.setBackground(Color.BLUE);
			else
				c3.setBackground(Color.WHITE);
		}
		else if(source==b4)
		{
			if(cb1.isSelected())
			{
				c1.setBackground(Color.YELLOW);
				b1.setBackground(Color.YELLOW);
				b2.setBackground(Color.YELLOW);
				b3.setBackground(Color.YELLOW);
				b4.setBackground(Color.YELLOW);
				b5.setBackground(Color.YELLOW);
				cb1.setBackground(Color.YELLOW);
			}
			else
			{
				c1.setBackground(Color.WHITE);
				b1.setBackground(Color.WHITE);
				b2.setBackground(Color.WHITE);
				b3.setBackground(Color.WHITE);
				b4.setBackground(Color.WHITE);
				b5.setBackground(Color.WHITE);
				cb1.setBackground(Color.WHITE);
			}	
			if(cb2.isSelected())
				c2.setBackground(Color.YELLOW);
			else
				c2.setBackground(Color.WHITE);
				
			if(cb3.isSelected())
				c4.setBackground(Color.YELLOW);
			else
				c4.setBackground(Color.WHITE);
				
			if(cb4.isSelected())
				c5.setBackground(Color.YELLOW);
			else
				c5.setBackground(Color.WHITE);
				
			if(cb5.isSelected())
				c3.setBackground(Color.YELLOW);
			else
				c3.setBackground(Color.WHITE);
		}
		else if(source==b5)
		{
			if(cb1.isSelected())
			{
				c1.setBackground(Color.PINK);
				b1.setBackground(Color.PINK);
				b2.setBackground(Color.PINK);
				b3.setBackground(Color.PINK);
				b4.setBackground(Color.PINK);
				b5.setBackground(Color.PINK);
				cb1.setBackground(Color.PINK);
			}
			else
			{
				c1.setBackground(Color.WHITE);
				b1.setBackground(Color.WHITE);
				b2.setBackground(Color.WHITE);
				b3.setBackground(Color.WHITE);
				b4.setBackground(Color.WHITE);
				b5.setBackground(Color.WHITE);
				cb1.setBackground(Color.WHITE);
			}	
			if(cb2.isSelected())
				c2.setBackground(Color.PINK);
			else
				c2.setBackground(Color.WHITE);
				
			if(cb3.isSelected())
				c4.setBackground(Color.PINK);
			else
				c4.setBackground(Color.WHITE);
				
			if(cb4.isSelected())
				c5.setBackground(Color.PINK);
			else
				c5.setBackground(Color.WHITE);
				
			if(cb5.isSelected())
				c3.setBackground(Color.PINK);
			else
				c3.setBackground(Color.WHITE);
		}	
	}
}
