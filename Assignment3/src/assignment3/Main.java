package assignment3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.Icon;

public class Main {

	private JFrame frame;
	
	private BufferedImage battery;
	private BufferedImage bmi;
	private BufferedImage calc;
	private BufferedImage temp;
	private BufferedImage contacts;
	
	private Bmi bmiPanel = new Bmi();
	private Calculator calculatorPanel = new Calculator();
	private Temp tempPanel = new Temp();
	private Contacts contactsPanel = new Contacts();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_203895899322750");
		panel.setLayout(null);
		
		
		try {                
	          battery = ImageIO.read(new File("battery.png"));
	          bmi = ImageIO.read(new File("bmi.png"));
	          calc = ImageIO.read(new File("calc.png"));
	          temp = ImageIO.read(new File("temp.png"));
	          contacts = ImageIO.read(new File("contacts.png"));
	       } catch (IOException ex) {
	            // handle exception...
	       }
		
		JPanel upperTab = new JPanel();
		upperTab.setBackground(Color.DARK_GRAY);
		upperTab.setForeground(Color.WHITE);
		upperTab.setBounds(0, 0, 234, 18);
		panel.add(upperTab);
		upperTab.setLayout(new GridLayout(1, 7, 0, 0));
		
		JLabel label = new JLabel("");
		upperTab.add(label);
		
		JLabel label_1 = new JLabel("");
		upperTab.add(label_1);
		
		JLabel label_2 = new JLabel("");
		upperTab.add(label_2);
		
		JLabel label_3 = new JLabel("");
		upperTab.add(label_3);
		
		JLabel batteryPercentage = new JLabel("70%");
		batteryPercentage.setForeground(Color.WHITE);
		upperTab.add(batteryPercentage);
		
		JLabel batteryIcon = new JLabel(new ImageIcon(battery.getScaledInstance(16, 16, Image.SCALE_FAST)));
		upperTab.add(batteryIcon);
		
		JLabel time = new JLabel("20:00");
		time.setForeground(Color.WHITE);
		upperTab.add(time);
		
		JPanel menu = new JPanel();
		menu.setBounds(0, 18, 234, 344);
		panel.add(menu);
		menu.setLayout(null);
		
		JButton bmiButton = new JButton(new ImageIcon(bmi.getScaledInstance(50, 50, Image.SCALE_FAST)));
		bmiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().add(bmiPanel);
				panel.setVisible(false);
				bmiPanel.setVisible(true);
			}
		});
		bmiButton.setBounds(10, 10, 50, 50);
		menu.add(bmiButton);
		
		JButton calculator = new JButton(new ImageIcon(calc.getScaledInstance(50, 50, Image.SCALE_FAST)));
		calculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().add(calculatorPanel);
				calculatorPanel.setVisible(true);
				panel.setVisible(false);
				System.out.println("Calc");
			}
		});
		calculator.setBounds(82, 10, 50, 50);
		menu.add(calculator);
		
		JButton button_1 = new JButton(new ImageIcon(temp.getScaledInstance(50, 50, Image.SCALE_FAST)));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().add(tempPanel);
				tempPanel.setVisible(true);
				panel.setVisible(false);
				
			}
		});
		button_1.setBounds(82, 132, 50, 50);
		menu.add(button_1);
		
		JButton button_3 = new JButton(new ImageIcon(contacts.getScaledInstance(50, 50, Image.SCALE_FAST)));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().add(contactsPanel);
				contactsPanel.setVisible(true);
				panel.setVisible(false);
			}
		});
		button_3.setBounds(10, 254, 50, 50);
		menu.add(button_3);
	
	}

}
