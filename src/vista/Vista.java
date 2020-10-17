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
import java.awt.GridLayout;

public class Vista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	String nombreCiudad;
	public JButton btBerlin, btFrank, btBremen, btEssen, btFriburg, btMunich, btNuren, btDres, btKass, btHamb;
	
	private JPanel panelResultados;
	public JLabel lblIcono;
	private JLabel lblTiempo;
	private JLabel lblTempMin;
	private JLabel lblTempMax;
	private JLabel lblD�a;	
	private JLabel lblNombreCiudad; 
	
	public JLabel lblinfoNombreciudad;
	public JLabel lblinfoDia;
	public JLabel lblinfoTempMax;
	public JLabel lblinfoTempMin;
	public JLabel lblinfoTiempo;
	public JLabel lbIconoTiempo;

	
		public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
		/**
	 * Create the frame.
	 */
	public Vista() {
		
		this.nombreCiudad = nombreCiudad;
		String sIcon="src/resources/iconoBandera.png";
		String sMapa="src/resources/alemania 1280x1280.jpg";
		int ancho = 600;
		int alto = 600; 
		
		setTitle("Deutschland Weather");
		setIconImage(Toolkit.getDefaultToolkit().getImage(sIcon));
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 30, ancho, alto);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	

		btBerlin = new JButton("Berlin");
		btBerlin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btBerlin.setBounds(379, 183, 67, 23);
		btBerlin.setBorder(null);
		btBerlin.setContentAreaFilled(false);
		
		
		btBremen = new JButton("Bremen");
		btBremen.setFont(new Font("Tahoma", Font.BOLD, 11));
		btBremen.setBounds(210, 166, 67, 23);
		btBremen.setBorder(null);
		btBremen.setContentAreaFilled(false);
		
		btEssen = new JButton("Essen");
		btEssen.setFont(new Font("Tahoma", Font.BOLD, 11));
		btEssen.setBounds(148, 243, 50, 23);
		btEssen.setBorder(null);
		btEssen.setContentAreaFilled(false);
		
		btFrank = new JButton("Frankfurt");
		btFrank.setFont(new Font("Tahoma", Font.BOLD, 11));
		btFrank.setBounds(181, 333, 67, 23);
		btFrank.setBorder(null);
		btFrank.setContentAreaFilled(false);
		
		btFriburg = new JButton("Friburgo");
		btFriburg.setFont(new Font("Tahoma", Font.BOLD, 11));
		btFriburg.setBounds(181, 431, 67, 23);
		btFriburg.setBorder(null);
		btFriburg.setContentAreaFilled(false);
		
		btMunich = new JButton("Munich");
		btMunich.setFont(new Font("Tahoma", Font.BOLD, 11));
		btMunich.setBounds(292, 445, 67, 23);
		btMunich.setBorder(null);
		btMunich.setContentAreaFilled(false);
		
		btNuren = new JButton("Nuremberg");
		btNuren.setFont(new Font("Tahoma", Font.BOLD, 11));
		btNuren.setBounds(279, 366, 67, 23);
		btNuren.setBorder(null);
		btNuren.setContentAreaFilled(false);
		
		btDres = new JButton("Dresde");
		btDres.setFont(new Font("Tahoma", Font.BOLD, 11));
		btDres.setBounds(379, 266, 67, 23);
		btDres.setBorder(null);
		btDres.setContentAreaFilled(false);
		
		btKass = new JButton("Kassel");
		btKass.setFont(new Font("Tahoma", Font.BOLD, 11));
		btKass.setBounds(250, 254, 67, 23);
		btKass.setBorder(null);
		btKass.setContentAreaFilled(false);
		
		btHamb = new JButton("Hamburgo");
		btHamb.setFont(new Font("Tahoma", Font.BOLD, 11));
		btHamb.setBounds(267, 136, 67, 23);
		btHamb.setBorder(null);
		btHamb.setContentAreaFilled(false);
		
		contentPane.add(btBerlin);
		contentPane.add(btFrank);
		contentPane.add(btEssen);
		contentPane.add(btBremen);
		contentPane.add(btFriburg);
		contentPane.add(btMunich);
		contentPane.add(btNuren);
		contentPane.add(btDres);
		contentPane.add(btKass);
		contentPane.add(btHamb);
			
		
		JLabel lbFondo = new JLabel("");
		lbFondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lbFondo.setBackground(Color.LIGHT_GRAY);
		lbFondo.setIcon(new ImageIcon(sMapa));
		lbFondo.setBounds(0, 71, 594, 490);
	
		ImageIcon map = new ImageIcon(sMapa);
		this.repaint();
		Icon iconFondo = new ImageIcon(map.getImage().getScaledInstance(lbFondo.getWidth(), lbFondo.getHeight(), Image.SCALE_DEFAULT));
		lbFondo.setIcon(iconFondo);
		
				contentPane.add(lbFondo);	
				
				panelResultados = new JPanel();
				panelResultados.setBackground(Color.WHITE);
				panelResultados.setBounds(0, 11, 594, 49);
				contentPane.add(panelResultados);
				panelResultados.setLayout(new GridLayout(2, 8, 0, 0));
				
				lblNombreCiudad = new JLabel("Ciudad");
				panelResultados.add(lblNombreCiudad);
				
				lblD�a = new JLabel("D\u00EDa");
				panelResultados.add(lblD�a);
				
				lblTempMax = new JLabel("Temp. m\u00E1xima");
				panelResultados.add(lblTempMax);
				
				lblTempMin = new JLabel("Temp. M\u00EDnima");
				panelResultados.add(lblTempMin);
				
				lblTiempo = new JLabel("Tiempo");
				panelResultados.add(lblTiempo);
				
				lblIcono = new JLabel("     ");
				panelResultados.add(lblIcono);
				
				lblinfoNombreciudad = new JLabel("");
				panelResultados.add(lblinfoNombreciudad);
				
				lblinfoDia = new JLabel("");
				panelResultados.add(lblinfoDia);
				
				lblinfoTempMax = new JLabel("");
				panelResultados.add(lblinfoTempMax);
				
				lblinfoTempMin = new JLabel("");
				panelResultados.add(lblinfoTempMin);
				
				lblinfoTiempo = new JLabel("");
				panelResultados.add(lblinfoTiempo);
		
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