package assignment3;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;

public class Contacts extends JPanel {
	private JTextField numberFirst;
	private JTextField numberSecond;
	private JTextField numberThird;
	private JTextField numberFourth;
	private JTextField textField;
	
	private BufferedImage back;
	private BufferedImage call;
	
	/**
	 * Create the panel.
	 */
	public Contacts() {
		setSize(244,372);
		setLayout(null);
		try {                
	          back = ImageIO.read(new File("back.png"));
	          call = ImageIO.read(new File("call.png"));
	       } catch (IOException ex) {
	            // handle exception...
	       }
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 244, 50);
		add(panel);
		panel.setLayout(null);
		
		JLabel nameFirst = new JLabel("Amar Kvakic");
		nameFirst.setBounds(10, 11, 77, 28);
		panel.add(nameFirst);
		
		numberFirst = new JTextField();
		numberFirst.setEditable(false);
		numberFirst.setHorizontalAlignment(SwingConstants.CENTER);
		numberFirst.setText("062-010-323");
		numberFirst.setBounds(97, 15, 86, 20);
		panel.add(numberFirst);
		numberFirst.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(call.getScaledInstance(40, 40, Image.SCALE_FAST)));
		lblNewLabel.setBounds(193, 5, 40, 40);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 50, 244, 50);
		add(panel_1);
		
		JLabel nameSecond = new JLabel("Example Example");
		nameSecond.setBounds(10, 11, 77, 28);
		panel_1.add(nameSecond);
		
		numberSecond = new JTextField();
		numberSecond.setEditable(false);
		numberSecond.setText("062-111-111");
		numberSecond.setHorizontalAlignment(SwingConstants.CENTER);
		numberSecond.setColumns(10);
		numberSecond.setBounds(97, 15, 86, 20);
		panel_1.add(numberSecond);
		
		JLabel label_1 = new JLabel(new ImageIcon(call.getScaledInstance(40, 40, Image.SCALE_FAST)));
		label_1.setBounds(193, 5, 40, 40);
		panel_1.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(0, 100, 244, 50);
		add(panel_2);
		
		JLabel nameThird = new JLabel("NN Person");
		nameThird.setBounds(10, 11, 77, 28);
		panel_2.add(nameThird);
		
		numberThird = new JTextField();
		numberThird.setEditable(false);
		numberThird.setText("062-222-222");
		numberThird.setHorizontalAlignment(SwingConstants.CENTER);
		numberThird.setColumns(10);
		numberThird.setBounds(97, 15, 86, 20);
		panel_2.add(numberThird);
		
		JLabel label_2 = new JLabel(new ImageIcon(call.getScaledInstance(40, 40, Image.SCALE_FAST)));
		label_2.setBounds(194, 5, 40, 40);
		panel_2.add(label_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(0, 150, 244, 50);
		add(panel_3);
		
		JLabel nameFourth = new JLabel("Example Person");
		nameFourth.setBounds(10, 11, 77, 28);
		panel_3.add(nameFourth);
		
		numberFourth = new JTextField();
		numberFourth.setEditable(false);
		numberFourth.setText("062-333-333");
		numberFourth.setHorizontalAlignment(SwingConstants.CENTER);
		numberFourth.setColumns(10);
		numberFourth.setBounds(97, 15, 86, 20);
		panel_3.add(numberFourth);
		
		JLabel label_3 = new JLabel(new ImageIcon(call.getScaledInstance(40, 40, Image.SCALE_FAST)));
		label_3.setBounds(194, 5, 40, 40);
		panel_3.add(label_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.MAGENTA);
		panel_4.setBounds(0, 200, 244, 50);
		add(panel_4);
		
		JLabel lblAdnanHodzic = new JLabel("Nobody");
		lblAdnanHodzic.setBounds(10, 11, 77, 28);
		panel_4.add(lblAdnanHodzic);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("062-444-444");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(97, 15, 86, 20);
		panel_4.add(textField);
		
		JLabel label_4 = new JLabel(new ImageIcon(call.getScaledInstance(40, 40, Image.SCALE_FAST)));
		label_4.setBounds(194, 5, 40, 40);
		panel_4.add(label_4);
		
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
