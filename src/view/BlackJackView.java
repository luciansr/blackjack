package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Button;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BlackJackView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJackView frame = new BlackJackView();
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
	public BlackJackView() {
		setTitle("BlackJack - [Augusto, Gabriel, Gabriel, Lucian]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		@SuppressWarnings("serial")
		JLabel buttonSurrender = new JLabel();
		
		buttonSurrender.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("teste");
			}
		});
		
		Button buttonDoubleDown = new Button("DoubleDown");
		Button buttonStand = new Button("Stand");
		Button buttonHit = new Button("Hit");
		
		
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		panel.setLayout(null);
		
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("src/images/layV2wbutton.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));	
		
		setResizable(false);
		setContentPane(contentPane);
		setBounds(0, 0, 1200, 750);

		buttonSurrender.setBounds(0, 0, 120, 50);
		buttonDoubleDown.setBounds(0, 0, 120, 50);		
		buttonStand.setBounds(0, 0, 120, 50);
		buttonHit.setBounds(0, 0, 120, 50);
		
		panel.setBounds(0, 0, 1200, 750);
		picLabel.setBounds(0, 0, 1200, 750);

		panel.add(buttonSurrender);
		panel.add(buttonDoubleDown);
		panel.add(buttonStand);
		panel.add(buttonHit);
		panel.add(picLabel);
		contentPane.add(panel);

		picLabel.setLocation(0, 0);
		panel.setLocation(0, 0);
		buttonSurrender.setLocation(1025, 130);
		buttonDoubleDown.setLocation(1025, 195);
		buttonStand.setLocation(1025, 260);
		buttonHit.setLocation(1025, 325);

	}

}
