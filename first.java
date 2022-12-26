package my;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class first extends JFrame {

	private JPanel textareaA;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first frame = new first();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public first() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		textareaA = new JPanel();
		textareaA.setBackground(new Color(128, 128, 255));
		textareaA.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(textareaA);
		textareaA.setLayout(null);
		
		JLabel heading = new JLabel("Calculator");
		heading.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 20));
		heading.setBounds(168, 11, 118, 18);
		textareaA.add(heading);
		
		JLabel labelA = new JLabel("A");
		labelA.setFont(new Font("Snap ITC", Font.ITALIC, 17));
		labelA.setBounds(123, 68, 24, 14);
		textareaA.add(labelA);
		
		tfa = new JTextField();
		tfa.setBounds(170, 62, 173, 32);
		textareaA.add(tfa);
		tfa.setColumns(10);
		
		JLabel labelB = new JLabel("B");
		labelB.setFont(new Font("Snap ITC", Font.ITALIC, 17));
		labelB.setBounds(123, 111, 45, 14);
		textareaA.add(labelB);
		
		tfb = new JTextField();
		tfb.setBounds(168, 105, 175, 32);
		textareaA.add(tfb);
		tfb.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Result");
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 17));
		lblNewLabel.setBounds(81, 159, 92, 14);
		textareaA.add(lblNewLabel);
		
		tfr = new JTextField();
		tfr.setBounds(170, 148, 173, 31);
		textareaA.add(tfr);
		tfr.setColumns(10);
		
		JButton add = new JButton("add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1= Integer.valueOf(data1);
				int var2= Integer.valueOf(data2);
				int res=var1+var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		add.setBounds(10, 209, 64, 32);
		textareaA.add(add);
		
		JButton sub = new JButton("sub");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1= Integer.valueOf(data1);
				int var2= Integer.valueOf(data2);
				int res=var1-var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		sub.setBounds(101, 209, 64, 32);
		textareaA.add(sub);
		
		JButton Div = new JButton("div");
		Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				 float var1= Float.valueOf(data1);
				float var2= Float.valueOf(data2);
				float res=var1/var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		Div.setBounds(279, 209, 64, 32);
		textareaA.add(Div);
		
		JButton mul = new JButton("Mul");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1= Integer.valueOf(data1);
				int var2= Integer.valueOf(data2);
				int res=var1*var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		mul.setBounds(186, 209, 64, 32);
		textareaA.add(mul);
		
		JButton rem = new JButton("rem");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=tfa.getText();
				String data2=tfb.getText();
				 float var1= Float.valueOf(data1);
				float var2= Float.valueOf(data2);
				float res=var1%var2;
				String result = String.valueOf(res);
				tfr.setText(result);
				
			}
		});
		rem.setBounds(365, 209, 64, 32);
		textareaA.add(rem);
	}
}
