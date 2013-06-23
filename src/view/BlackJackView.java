package view;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.BlackJackController;
import enums.Acao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BlackJackView extends JFrame {
	
	Object semaphore = new Object();
	private Semaphore semaphoreComandos;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArrayList<Acao> listaDeComandos = new ArrayList<Acao>();

	private BlackJackController owner;
	
	HashMap<String, Acao> mapaAcoes = new HashMap<String, Acao>();
	
	private JPanel contentPane;
	private JPanel panelGameView = new JPanel();

	private JLabel buttonSurrender = new JLabel();
	private JLabel buttonDoubleDown = new JLabel();
	private JLabel buttonStand = new JLabel();
	private JLabel buttonHit = new JLabel();

	/**
	 * Launch the application.
	 * Use only for debugging, BlackJackView must be created inside BlackJackController.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BlackJackView frame = new BlackJackView(null);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public BlackJackView(BlackJackController owner) {
		this.owner = owner;
		
		setTitle("BlackJack - [Augusto, Gabriel, Gabriel, Lucian]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		buttonSurrender.setName("Surrender");
		buttonDoubleDown.setName("DoubleDown");
		buttonStand.setName("Stand");
		buttonHit.setName("Hit");
		
		
		buttonSurrender.addMouseListener(buttonMouseListener());
		buttonDoubleDown.addMouseListener(buttonMouseListener());
		buttonStand.addMouseListener(buttonMouseListener());
		buttonHit.addMouseListener(buttonMouseListener());		
		
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		panelGameView.setLayout(null);
		
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
		
		panelGameView.setBounds(0, 0, 1200, 750);
		picLabel.setBounds(0, 0, 1200, 750);

		panelGameView.add(buttonSurrender);
		panelGameView.add(buttonDoubleDown);
		panelGameView.add(buttonStand);
		panelGameView.add(buttonHit);
		panelGameView.add(picLabel);
		contentPane.add(panelGameView);

		picLabel.setLocation(0, 0);
		panelGameView.setLocation(0, 0);
		buttonSurrender.setLocation(1025, 130);
		buttonDoubleDown.setLocation(1025, 195);
		buttonStand.setLocation(1025, 260);
		buttonHit.setLocation(1025, 325);
		
		
		//configurando mapa de acoes
		mapaAcoes.put("Surrender", Acao.SURRENDER);
		mapaAcoes.put("DoubleDown", Acao.DOUBLEDOWN);
		mapaAcoes.put("Stand", Acao.STAND);
		mapaAcoes.put("Hit", Acao.HIT);

	}
	
	private MouseAdapter buttonMouseListener() {
		return new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String nomeBotao = ((JLabel)  e.getSource()).getName();
				// TODO Auto-generated method stub
				System.out.println(nomeBotao);

				//System.out.println("teste");

				super.mouseClicked(e);
			}
		};
	}
	

}
