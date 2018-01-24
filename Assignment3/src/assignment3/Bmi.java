package assignment3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Image;

public class Bmi extends JPanel{
	private JTextField heightArea;
	private JTextField weightArea;
	private BufferedImage back;

	/**
	 * Create the panel.
	 */
	public Bmi() {
		setLayout(null);
		setSize(244,372);
		try {                
	          back = ImageIO.read(new File("back.png"));
	       } catch (IOException ex) {
	            // handle exception...
	       }
		
		JLabel bmiLabel = new JLabel("BMI Calculator");
		bmiLabel.setBackground(Color.CYAN);
		bmiLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bmiLabel.setBounds(10, 24, 214, 14);
		add(bmiLabel);
		
		JLabel heightLabel = new JLabel("Your height(cm):");
		heightLabel.setBounds(10, 158, 118, 29);
		add(heightLabel);
		
		heightArea = new JTextField();
		heightArea.setBounds(138, 162, 86, 20);
		add(heightArea);
		heightArea.setColumns(10);
		
		JLabel weightLabel = new JLabel("Your weight(kg):");
		weightLabel.setBounds(10, 198, 100, 29);
		add(weightLabel);
		
		weightArea = new JTextField();
		weightArea.setBounds(138, 202, 86, 20);
		add(weightArea);
		weightArea.setColumns(10);
		
		
		
		JLabel result = new JLabel("");
		result.setBounds(82, 293, 46, 14);
		add(result);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 49, 214, 87);
		add(panel);
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel underweight = new JLabel("Underweight = <18.5");
		panel.add(underweight);
		
		JLabel normal = new JLabel("Normal weight = 18.5 - 24.9");
		panel.add(normal);
		
		JLabel lblOverweight = new JLabel("Overweight = 25 - 29.9");
		panel.add(lblOverweight);
		
		JLabel lblObesity = new JLabel("Obesity = BMI of 30 or greather");
		panel.add(lblObesity);

		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double kg = Double.parseDouble(weightArea.getText());
				double m = Double.parseDouble(heightArea.getText()) / 100; 
				
				double bmiIndex = kg / (Math.pow(m, 2));
				
				result.setText(String.valueOf(bmiIndex));
				
				
			}
		});
		calculate.setBounds(73, 254, 89, 23);
		add(calculate);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.DARK_GRAY);
		bottom.setBounds(0, 348, 244, 24);
		add(bottom);
		
		JLabel label = new JLabel(new ImageIcon(back.getScaledInstance(18, 18, Image.SCALE_FAST)));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		bottom.add(label);
		
	}

}
