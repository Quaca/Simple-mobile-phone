package assignment3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temp extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JPanel bottom;
	private BufferedImage back;

	/**
	 * Create the panel.
	 */
	public Temp() {
		setLayout(null);
		setSize(244,372);
		
		try {                
	          back = ImageIO.read(new File("back.png"));
	       } catch (IOException ex) {
	            // handle exception...
	       }
		
		JLabel lblNewLabel = new JLabel("Temperature converter");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 22, 224, 30);
		add(lblNewLabel);
		
		JLabel lblEnterTemperaturIn = new JLabel("Enter temperature in \u00B0F: ");
		lblEnterTemperaturIn.setBounds(10, 90, 224, 14);
		add(lblEnterTemperaturIn);
		
		textField = new JTextField();
		textField.setBounds(10, 115, 96, 37);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblTemperatureInc = new JLabel("Temperature in \u00B0C:");
		lblTemperatureInc.setBounds(10, 246, 224, 14);
		add(lblTemperatureInc);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 271, 96, 37);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tempF = Double.parseDouble(textField.getText());
				double celsius = (tempF - 32)*(0.5555);
				textField_1.setText(Double.toString(celsius));
			}
		});
		btnConvert.setBounds(65, 190, 89, 23);
		add(btnConvert);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 347, 244, 25);
		add(panel);
		
		JLabel label = new JLabel(new ImageIcon(back.getScaledInstance(18, 18, Image.SCALE_FAST)));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		panel.add(label);
		
		

	}

}
