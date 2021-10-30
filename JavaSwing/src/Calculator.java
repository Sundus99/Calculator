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
import java.awt.Toolkit;

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
	private JButton x;
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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/resources/freepik_calculator.png")));
		//frame.setForeground(Color.BLACK);
		//frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 273, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);

		dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		dot.setBounds(130, 242, 44, 41);
		frame.getContentPane().add(dot);

		zero = new JButton("0");
		//zero.setForeground(Color.BLACK);
		//zero.setBorderPainted(false);
		//zero.setBackground(Color.YELLOW);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				m.actionPerformed(e,display);
			}
		});
		zero.setBounds(15, 242, 103, 41);
		frame.getContentPane().add(zero);

		one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		one.setBounds(15, 185, 44, 41);
		frame.getContentPane().add(one);

		two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		two.setBounds(74, 185, 44, 41);
		frame.getContentPane().add(two);

		three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		three.setBounds(130, 185, 44, 41);
		frame.getContentPane().add(three);

		four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		four.setBounds(15, 128, 44, 41);
		frame.getContentPane().add(four);

		five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		five.setBounds(74, 128, 44, 41);
		frame.getContentPane().add(five);

		six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		six.setBounds(130, 128, 44, 41);
		frame.getContentPane().add(six);

		seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		seven.setBounds(15, 71, 44, 41);
		frame.getContentPane().add(seven);

		eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		eight.setBounds(74, 71, 44, 41);
		frame.getContentPane().add(eight);

		nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		nine.setBounds(130, 71, 44, 41);
		frame.getContentPane().add(nine);

		plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		plus.setBounds(189, 71, 44, 41);
		frame.getContentPane().add(plus);

		minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		minus.setBounds(189, 128, 44, 41);
		frame.getContentPane().add(minus);

		equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		equal.setBounds(189, 299, 44, 41);
		frame.getContentPane().add(equal);

		display = new JTextField();
		display.setBounds(15, 14, 218, 41);
		frame.getContentPane().add(display);
		display.setColumns(10);

		C = new JButton("Clear");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		C.setBounds(15, 299, 159, 41);
		frame.getContentPane().add(C);

		x = new JButton("x");
		x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		x.setBounds(189, 185, 44, 41);
		frame.getContentPane().add(x);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.actionPerformed(e,display);
			}
		});
		div.setBounds(189, 242, 44, 41);
		frame.getContentPane().add(div);

	}
}

