package vista;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public final class Boton {
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source text sMapa
	 * @wbp.factory.parameter.source icon iconFondo
	 */
	public static JLabel createJLabel(String text, Icon icon) {
		JLabel label = new JLabel(text);
		label.setIcon(new ImageIcon());
		label.setIcon(icon);
		return label;
	}
}