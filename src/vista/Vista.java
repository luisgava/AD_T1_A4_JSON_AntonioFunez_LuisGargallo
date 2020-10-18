package vista;

import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;

public class Vista extends JFrame {
	// Panel principal.
	private JPanel contentPane;
	// String para el nombre de la ciudad seleccionada.
	private String nombreCiudad;
	// Bortones de las ciudades.
	private JButton btBerlin, btFrank, btBremen, btEssen, btFriburg, btMunich, btNuren, btDres, btKass, btHamb;
	// Lista para guardar los botones.
	private List<JButton> listaBotones = new ArrayList<JButton>();
	// Panel de resultados.
	private JPanel panelResultados;
	// TextArea para mostrar los resultados.
	private JTextArea textAreaResultados;
	// Label para el icono del tiempo
	private JLabel lblIcono;
	
	/**
	 * Método que devuelve el nombre de la ciudad seleccionada.
	 * 
	 * @return
	 */
	public String getNombreCiudad() {
		return nombreCiudad;
	}

	/**
	 * Método que guarda el nombre de la ciudad.
	 * 
	 * @param nombreCiudad
	 */
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	/**
	 * Método que devuelve la lista de botones.
	 * 
	 * @return
	 */
	public List<JButton> getListaBotones() {
		return listaBotones;
	}
	/**
	 * Método que devuelve el TextArea de resultados.
	 * 
	 * @return
	 */
	public JTextArea getTextAreaResultados() {
		return textAreaResultados;
	}

	/**
	 * Create the frame.
	 */
	public Vista() {

		String sIcon = "src/resources/iconoBandera.png";
		String sMapa = "src/resources/alemania 1280x1280.jpg";
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
		
		listaBotones.add(btBerlin);
		listaBotones.add(btBremen);
		listaBotones.add(btDres);
		listaBotones.add(btEssen);
		listaBotones.add(btNuren);
		listaBotones.add(btFrank);
		listaBotones.add(btFriburg);
		listaBotones.add(btHamb);
		listaBotones.add(btKass);
		listaBotones.add(btMunich);

		JLabel lbFondo = new JLabel("");
		lbFondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lbFondo.setBackground(Color.LIGHT_GRAY);
		lbFondo.setIcon(new ImageIcon(sMapa));
		lbFondo.setBounds(0, 106, 594, 490);

		ImageIcon map = new ImageIcon(sMapa);
		this.repaint();
		Icon iconFondo = new ImageIcon(
				map.getImage().getScaledInstance(lbFondo.getWidth(), lbFondo.getHeight(), Image.SCALE_DEFAULT));
		lbFondo.setIcon(iconFondo);
		contentPane.add(lbFondo);

		panelResultados = new JPanel();
		panelResultados.setBackground(Color.WHITE);
		panelResultados.setBounds(0, 0, 594, 95);
		contentPane.add(panelResultados);
		panelResultados.setLayout(null);

		lblIcono = new JLabel("     ");
		lblIcono.setBounds(495, 0, 99, 24);
		panelResultados.add(lblIcono);

		textAreaResultados = new JTextArea();
		textAreaResultados.append(
				"Ciudad" + "\t" + "Fecha" + "\t" + "Temp. Máx." + "\t" + "Temp. Min." + "\t" + "Tiempo" + "\r\n");
		textAreaResultados.setBounds(10, 0, 485, 77);
		panelResultados.add(textAreaResultados);

	}
}
