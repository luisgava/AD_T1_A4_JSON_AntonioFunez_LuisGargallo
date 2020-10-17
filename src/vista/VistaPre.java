package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

public class VistaPre extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	
	String weather = null;
	String minTemp = null;
	String maxTemp = null;
	String weatherIcon;
	
	String CELDAS="src/resources/CELDAS.png";
	
	public VistaPre() {
		
		String sIcon="src/resources/iconoBandera.png";
		setIconImage(Toolkit.getDefaultToolkit().getImage(sIcon));
		setTitle("Deutschland Weather --> " + " NOMBRE_DE_LA_CIUDAD");
		
		setBounds(100, 100, 543, 111);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
			JLabel lbIconoTiempo = new JLabel("New label");
			lbIconoTiempo.setBounds(411, 42, 46, 25);
			contentPane.add(lbIconoTiempo);
		
			// JUSTO AQUI ES DONDE LE METO EL ICONO DEL TIEMPO DENTRO DE LA CELDA
			ImageIcon map = new ImageIcon(sIcon);
			this.repaint();
			Icon iconTiempo = new ImageIcon(map.getImage().getScaledInstance(lbIconoTiempo.getWidth(), lbIconoTiempo.getHeight(), Image.SCALE_DEFAULT));
			lbIconoTiempo.setIcon(iconTiempo); 
		
		
		JLabel lbTMin_Escritura = new JLabel("T MIN");
		lbTMin_Escritura.setBounds(287, 47, 46, 14);
		contentPane.add(lbTMin_Escritura);
		
		JLabel lbTMax_Escritura = new JLabel("T MAX");
		lbTMax_Escritura.setBounds(199, 47, 46, 14);
		contentPane.add(lbTMax_Escritura);
		
		JLabel lbFecha_Escritura = new JLabel("10/10/2020");
		lbFecha_Escritura.setBounds(34, 47, 99, 14);
		contentPane.add(lbFecha_Escritura);
		
		JLabel lblEstadoDelCielo = new JLabel("ESTADO DEL CIELO");
		lblEstadoDelCielo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEstadoDelCielo.setBounds(371, 11, 156, 14);
		contentPane.add(lblEstadoDelCielo);
		
		JLabel lblCMin = new JLabel("C\u00BA MIN");
		lblCMin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCMin.setBounds(281, 11, 70, 14);
		contentPane.add(lblCMin);
		
		JLabel lblCMax = new JLabel("C\u00BA MAX");
		lblCMax.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCMax.setBounds(193, 11, 70, 14);
		contentPane.add(lblCMax);
		
		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha.setBounds(63, 11, 70, 14);
		contentPane.add(lblFecha);
		
		JLabel lbFondo = new JLabel("");
		lbFondo.setIcon(new ImageIcon(CELDAS));
		lbFondo.setBounds(-16, -39, 558, 120);
		contentPane.add(lbFondo);
	}
	
	// CONSTRUCTOR CON LOS DATOS QUE NOS HACEN FALTA PARA RELLENAR LA TABLA
	// HAY SOBRECARGA DE CONSTRUCTORES PARA PODER TRABAJAR YO EN PRINCIPIO VIENDO COMO SE EJECUTABA SIN DATOS
	public VistaPre(String weather, String minTemp, String maxTemp, String weatherIcon) {
		
		this.weather=weather;
		this.minTemp=minTemp;
		this.maxTemp=maxTemp;
		this.weatherIcon=estadoDelTiempo(weatherIcon); 	// EL CONSTRUCTOR NOS PIDE UN STRING QUE NOS DA LA PREVISION
														// CON ESTE METODO ESE STRING LO CONVERTIMOS EN UNA RUTA QUE LA UTILIZAREMOS
														// PARA PONER LA RUTA CORRESPONDIENTE
		
		setResizable(false);
		setBounds(100, 100, 601, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbFondo = new JLabel("");
		lbFondo.setBounds(10, 67, 565, 120);
		contentPane.add(lbFondo);
	}
	
	
	// METEMOS EN EL STRING ESTADO EL ESTADO DEL CIELO QUE NOS DEVULVE EL CONTROLADOR
	// EN FUNCION DEL ESTADO DEL CIELO, NOS DEVULVE UNA RUTA U OTRA QUE SERÁ LA QUE LE DAREMOS AL CONSTRUCTOR PARA QUE NOS PINTE LA INTERFAZ
	public String estadoDelTiempo(String estado) {
		
		String prevision = null;
		
		if(estado == "nublado") {
			prevision = "src/nublado.png";
		}
		
		return prevision;
	}
}
