package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Font;

public class Vista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	



	Listen lis = new Listen();
	String nombreCiudad;
		/**
	 * Create the frame.
	 */
	public Vista() {
		this.nombreCiudad = nombreCiudad;
		String sIcon="src/resources/iconoBandera.png";
		String sMapa="src/resources/alemania 1280x1280.jpg";
		int ancho = 600;
		int alto = 600; 
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(sIcon));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 30, ancho, alto);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btBerlin = new JButton("Berlin");
		btBerlin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btBerlin.setBounds(375, 173, 67, 23);
		btBerlin.setBorder(null);
		btBerlin.setContentAreaFilled(false);
		btBerlin.addActionListener(lis);
		
		JButton btBremen = new JButton("Bremen");
		btBremen.setFont(new Font("Tahoma", Font.BOLD, 11));
		btBremen.setBounds(209, 162, 67, 23);
		btBremen.setBorder(null);
		btBremen.setContentAreaFilled(false);
		btBremen.addActionListener(lis);
		
		JButton btEssen = new JButton("Essen");
		btEssen.setFont(new Font("Tahoma", Font.BOLD, 11));
		btEssen.setBounds(167, 213, 50, 23);
		btEssen.setBorder(null);
		btEssen.setContentAreaFilled(false);
		btEssen.addActionListener(lis);
		
		
		contentPane.add(btEssen);
		contentPane.add(btBremen);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 584, 51);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lbFondo = new JLabel(sMapa);
		lbFondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lbFondo.setBackground(Color.LIGHT_GRAY);
		lbFondo.setIcon(new ImageIcon("C:\\Users\\alu01-dam2\\git\\AD_T1_A4_JSON_AntonioFunez_LuisGargallo\\icon\\iconoVentana.png"));
		lbFondo.setBounds(0, 0, ancho, 600);
		
		ImageIcon map = new ImageIcon(sMapa);
		Icon iconFondo = new ImageIcon(map.getImage().getScaledInstance(lbFondo.getWidth(), lbFondo.getHeight(), Image.SCALE_DEFAULT));
		lbFondo.setIcon(iconFondo);
		this.repaint();

	
		contentPane.add(btBerlin);
		contentPane.add(lbFondo);
		
	}
	
	public class Listen implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			
			nombreCiudad = ae.getActionCommand();
			
			System.out.println(nombreCiudad);
			
		}
	}
}

/*De la clase City (prediccion.getCity().getcityName()):
 * String cityName;
 * de la clase ForecastDay (prediccion.getCity().getForecastDate().getCadaUnaDeLasCosas()):
	String forecastDate; // fecha de la prediccion
	String weather;
	String minTemp;
	String maxTemp;
	String weatherIcon;
 * */
