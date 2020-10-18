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
import java.util.List;

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
	private JLabel lblDía;	
	private JLabel lblNombreCiudad; 
	
	public JLabel lblinfoNombreciudad;
//	public JLabel lblinfoDia_0;
	public JLabel lblinfoTempMax;
	public JLabel lblinfoTempMin;
	public JLabel lblinfoTiempo;
	public JLabel lbIconoTiempo;
	
	public List<JLabel> listaLblDias = ;
	
	public JLabel lblinfoDia_0;
public JLabel lblinfoDia_1; 
public JLabel lblinfoDia_2; 
public JLabel lblinfoDia_3; 
	
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
		setBounds(300, 30, 600, 625);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	

		btBerlin = new JButton("Berlin");
		btBerlin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btBerlin.setBounds(380, 212, 67, 23);
		btBerlin.setBorder(null);
		btBerlin.setContentAreaFilled(false);
		
		
		btBremen = new JButton("Bremen");
		btBremen.setFont(new Font("Tahoma", Font.BOLD, 11));
		btBremen.setBounds(211, 195, 67, 23);
		btBremen.setBorder(null);
		btBremen.setContentAreaFilled(false);
		
		btEssen = new JButton("Essen");
		btEssen.setFont(new Font("Tahoma", Font.BOLD, 11));
		btEssen.setBounds(149, 272, 50, 23);
		btEssen.setBorder(null);
		btEssen.setContentAreaFilled(false);
		
		btFrank = new JButton("Frankfurt");
		btFrank.setFont(new Font("Tahoma", Font.BOLD, 11));
		btFrank.setBounds(182, 362, 67, 23);
		btFrank.setBorder(null);
		btFrank.setContentAreaFilled(false);
		
		btFriburg = new JButton("Friburgo");
		btFriburg.setFont(new Font("Tahoma", Font.BOLD, 11));
		btFriburg.setBounds(182, 460, 67, 23);
		btFriburg.setBorder(null);
		btFriburg.setContentAreaFilled(false);
		
		btMunich = new JButton("Munich");
		btMunich.setFont(new Font("Tahoma", Font.BOLD, 11));
		btMunich.setBounds(293, 474, 67, 23);
		btMunich.setBorder(null);
		btMunich.setContentAreaFilled(false);
		
		btNuren = new JButton("Nuremberg");
		btNuren.setFont(new Font("Tahoma", Font.BOLD, 11));
		btNuren.setBounds(280, 395, 67, 23);
		btNuren.setBorder(null);
		btNuren.setContentAreaFilled(false);
		
		btDres = new JButton("Dresde");
		btDres.setFont(new Font("Tahoma", Font.BOLD, 11));
		btDres.setBounds(380, 295, 67, 23);
		btDres.setBorder(null);
		btDres.setContentAreaFilled(false);
		
		btKass = new JButton("Kassel");
		btKass.setFont(new Font("Tahoma", Font.BOLD, 11));
		btKass.setBounds(251, 283, 67, 23);
		btKass.setBorder(null);
		btKass.setContentAreaFilled(false);
		
		btHamb = new JButton("Hamburgo");
		btHamb.setFont(new Font("Tahoma", Font.BOLD, 11));
		btHamb.setBounds(268, 165, 67, 23);
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
		lbFondo.setBounds(0, 106, 594, 490);
	
		ImageIcon map = new ImageIcon(sMapa);
		this.repaint();
		Icon iconFondo = new ImageIcon(map.getImage().getScaledInstance(lbFondo.getWidth(), lbFondo.getHeight(), Image.SCALE_DEFAULT));
		lbFondo.setIcon(iconFondo);
		
				contentPane.add(lbFondo);	
				
				panelResultados = new JPanel();
				panelResultados.setBackground(Color.WHITE);
				panelResultados.setBounds(0, 0, 594, 134);
				contentPane.add(panelResultados);
				panelResultados.setLayout(null);
				
				lblNombreCiudad = new JLabel("Ciudad");
				lblNombreCiudad.setBounds(0, 0, 99, 24);
				panelResultados.add(lblNombreCiudad);
				
				lblDía = new JLabel("D\u00EDa");
				lblDía.setBounds(99, 0, 99, 24);
				panelResultados.add(lblDía);
				
				lblTempMax = new JLabel("Temp. m\u00E1xima");
				lblTempMax.setBounds(198, 0, 99, 24);
				panelResultados.add(lblTempMax);
				
				lblTempMin = new JLabel("Temp. M\u00EDnima");
				lblTempMin.setBounds(297, 0, 99, 24);
				panelResultados.add(lblTempMin);
				
				lblTiempo = new JLabel("Tiempo");
				lblTiempo.setBounds(396, 0, 99, 24);
				panelResultados.add(lblTiempo);
				
				lblIcono = new JLabel("     ");
				lblIcono.setBounds(495, 0, 99, 24);
				panelResultados.add(lblIcono);
				
				lblinfoNombreciudad = new JLabel("");
				lblinfoNombreciudad.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblinfoNombreciudad.setBounds(0, 24, 99, 82);
				panelResultados.add(lblinfoNombreciudad);
				
				lblinfoDia_0 = new JLabel("");
				lblinfoDia_0.setBounds(99, 24, 99, 24);
				panelResultados.add(lblinfoDia_0);
				listaLblDias.add(lblinfoDia_0);
				
				lblinfoTempMax = new JLabel("");
				lblinfoTempMax.setBounds(198, 24, 99, 24);
				panelResultados.add(lblinfoTempMax);
				
				lblinfoTempMin = new JLabel("");
				lblinfoTempMin.setBounds(297, 24, 99, 24);
				panelResultados.add(lblinfoTempMin);
				
				lblinfoTiempo = new JLabel("");
				lblinfoTiempo.setBounds(396, 24, 99, 24);
				panelResultados.add(lblinfoTiempo);
				
				lblinfoDia_1 = new JLabel("");
				lblinfoDia_1.setBounds(99, 47, 99, 24);
				panelResultados.add(lblinfoDia_1);
				listaLblDias.add(lblinfoDia_1);
				
				lblinfoDia_2 = new JLabel("");
				lblinfoDia_2.setBounds(99, 82, 99, 24);
				panelResultados.add(lblinfoDia_2);
				listaLblDias.add(lblinfoDia_2);
				
				lblinfoDia_3 = new JLabel("");
				lblinfoDia_3.setBounds(99, 110, 99, 24);
				panelResultados.add(lblinfoDia_3);
				listaLblDias.add(lblinfoDia_3);
		
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