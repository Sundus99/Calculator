/**@author Sundus Yawar*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JButton dot;
	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton plus;
	private JButton minus;
	private JButton equal;
	private JTextField display;
	private ArrayList<String> valList = new ArrayList<String>();
	private int sum = 0;
	private String str = "";
	private JButton C;
	private JButton button_1;
	ListenToAction m = new ListenToAction();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		dot.setBounds(130, 187, 44, 41);
		frame.getContentPane().add(dot);

		zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				m.actionPerformed(e,display);
//				str = str + zero.getText() + " ";
//				display.setText(str);
//				valList.add(zero.getText());
			}
		});
		zero.setBounds(15, 187, 103, 41);
		frame.getContentPane().add(zero);

		one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + one.getText() + " ";
//				display.setText(str);
//				valList.add(one.getText());
			}
		});
		one.setBounds(15, 130, 44, 41);
		frame.getContentPane().add(one);

		two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + two.getText() + " ";
//				display.setText(str);
//				valList.add(two.getText());
			}
		});
		two.setBounds(74, 130, 44, 41);
		frame.getContentPane().add(two);

		three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + three.getText() + " ";
//				display.setText(str);
//				valList.add(three.getText());
			}
		});
		three.setBounds(130, 130, 44, 41);
		frame.getContentPane().add(three);

		four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + four.getText() + " ";
//				display.setText(str);
//				valList.add(four.getText());
			}
		});
		four.setBounds(15, 73, 44, 41);
		frame.getContentPane().add(four);

		five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + five.getText() + " ";
//				display.setText(str);
//				valList.add(five.getText());
			}
		});
		five.setBounds(74, 73, 44, 41);
		frame.getContentPane().add(five);

		six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + six.getText() + " ";
//				display.setText(str);
//				valList.add(six.getText());
			}
		});
		six.setBounds(130, 73, 44, 41);
		frame.getContentPane().add(six);

		seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + seven.getText() + " ";
//				display.setText(str);
//				valList.add(seven.getText());
			}
		});
		seven.setBounds(15, 16, 44, 41);
		frame.getContentPane().add(seven);

		eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + eight.getText() + " ";
//				display.setText(str);
//				valList.add(eight.getText());
			}
		});
		eight.setBounds(74, 16, 44, 41);
		frame.getContentPane().add(eight);

		nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + nine.getText() + " ";
//				display.setText(str);
//				valList.add(nine.getText());
			}
		});
		nine.setBounds(130, 16, 44, 41);
		frame.getContentPane().add(nine);

		plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + plus.getText() + " ";
//				display.setText(str);
//				// sum =0;
//				for (String num : valList) {
//					sum = Integer.parseInt(num) + sum;
//				}
			}
		});
		plus.setBounds(239, 73, 44, 41);
		frame.getContentPane().add(plus);

		minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = str + minus.getText() + " ";
//				display.setText(str);
//				//sum = 0;
//				for (String num : valList) {
//					sum = Integer.parseInt(num) - sum;
//				}
			}
		});
		minus.setBounds(298, 73, 44, 41);
		frame.getContentPane().add(minus);

		equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				display.setText(Integer.toString(sum));
//				str = "";
//				valList.clear();
//				sum = 0;
			}
		});
		equal.setBounds(357, 73, 44, 41);
		frame.getContentPane().add(equal);

		display = new JTextField();
		display.setBounds(239, 16, 162, 41);
		frame.getContentPane().add(display);
		display.setColumns(10);

		C = new JButton("C");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
//				str = "";
//				valList.clear();
//				sum = 0;
//				display.setText("");
			}
		});
		C.setBounds(268, 136, 44, 41);
		frame.getContentPane().add(C);

		button_1 = new JButton("+");
		button_1.setBounds(327, 136, 44, 41);
		frame.getContentPane().add(button_1);

	}
}

