import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AA extends JFrame //implements ActionListener
{
	Container c;
	JButton bC, bN, bS;
	JButton bN1, bS1;
	JLabel lN1, lS1, lC;
	JPanel pN, pS;
	JTextArea tA;
	JTextField tF1, tF2;
	JScrollPane sP;
	void init(){
		c = getContentPane();
		bC = new JButton("눌러주세요");
		bN = new JButton("눌러주세요");
		bS = new JButton("눌러주세요");
		bN1 = new JButton("입장");
		bS1 = new JButton("Clear");
		
		//lN1 = new JLabel();
		lN1 = new JLabel("My ID");
		//lC = new JLabel();

		tA = new JTextArea();
		tF1 = new JTextField(23);
		tF2 = new JTextField(25);
		sP = new JScrollPane(tA);

		pN = new JPanel();
		pN.add(lN1);
		pN.add(tF1);
		pN.add(bN1);
		pS = new JPanel();
		pS.add(tF2);
		pS.add(bS1);
		//pS.add(tA);
			
		
		//pN.setLayout(new BorderLayout());

		ActionListener listener = (e) -> {
			Object obj = e.getSource();
			if(bS1 == obj)tA.setText("");
			else if(bN1 == obj)bN1.setText("입장");
		
		};
		bS1.addActionListener(listener);

		c.add(sP, BorderLayout.CENTER);
		c.add(pS, BorderLayout.SOUTH);
		c.add(pN, BorderLayout.NORTH);

		setUI();
	}
	void setUI(){
		setTitle("채팅을 시작해볼까요?");
		setSize(400,400);
		//setLocation(200,300);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		AA a = new AA();
		a.init();
	}
}

//JLabel
//JTextField
//JButton
//JTextArea
//JScrollPane