package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

public class CrearEstudiante extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField primerNombre;
	private JTextField SegundoNombre;
	private JTextField Dirrecion;
	private JTextField segundoNombre;
	private JTextField PrimerApeliido;

	/**
	 * Launch the application.

	public static void main(String[] args) {
		try {
			CrearEstudiante dialog = new CrearEstudiante();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CrearEstudiante() {
		
		setResizable(false);
		setModal(true);//Permite bloquear la venta principal hasta que se cierre la actual.
		setBounds(100, 100, 440, 485);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "Informaci\u00F3n del Nuevo Estudiante:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBackground(new Color(230, 230, 250));
			panel.setBounds(0, 0, 424, 413);
			contentPanel.add(panel);
			{
				JLabel lblPrimerNombre = new JLabel("Primer Nombre:");
				lblPrimerNombre.setBounds(36, 36, 106, 22);
				panel.add(lblPrimerNombre);
			}
			{
				primerNombre = new JTextField();
				primerNombre.setColumns(10);
				primerNombre.setBorder(new LineBorder(new Color(192, 192, 192)));
				primerNombre.setBounds(36, 64, 158, 20);
				panel.add(primerNombre);
			}
			{
				JLabel lblPrimerApellido = new JLabel("Segundo Nombre:");
				lblPrimerApellido.setBounds(218, 40, 106, 18);
				panel.add(lblPrimerApellido);
			}
			{
				SegundoNombre = new JTextField();
				SegundoNombre.setColumns(10);
				SegundoNombre.setBorder(new LineBorder(new Color(192, 192, 192)));
				SegundoNombre.setBounds(218, 64, 158, 20);
				panel.add(SegundoNombre);
			}
			{
				JLabel lblPrimerApellido_1 = new JLabel("Primer Apellido:");
				lblPrimerApellido_1.setBounds(36, 106, 106, 18);
				panel.add(lblPrimerApellido_1);
			}
			{

				
			}
			{
				JLabel lblSegundoApellido = new JLabel("Segundo Apellido");
				lblSegundoApellido.setBounds(218, 101, 98, 18);
				panel.add(lblSegundoApellido);
			}
			{

			}
			{
				JLabel lblCarrera = new JLabel("Carrera:");
				lblCarrera.setBounds(36, 316, 72, 14);
				panel.add(lblCarrera);
			}
			{
				JComboBox comboBox = new JComboBox();
				//comboBox.setSelectedIndex(0);
				comboBox.setBorder(new LineBorder(new Color(192, 192, 192)));
				comboBox.setBackground(new Color(240, 248, 255));
				comboBox.setBounds(36, 341, 158, 20);
				panel.add(comboBox);
			}
			{
				JLabel label = new JLabel("Pa\u00EDs de Origen :");
				label.setBounds(224, 244, 98, 20);
				panel.add(label);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Pa\u00EDs>", "Alemania", "Argentina", "Australia", "Burgar\u00EDa", "Canad\u00E1", "Colombia", "Cuba", "Hait\u00ED", "Mexico", "Rep. Dominicana", "Rusia", "Rep. Checa", "Venezuela", "Jap\u00F3n"}));
				//comboBox.setSelectedIndex(0);
				comboBox.setMaximumRowCount(5);
				comboBox.setBorder(new LineBorder(new Color(192, 192, 192)));
				comboBox.setBackground(new Color(240, 248, 255));
				comboBox.setBounds(224, 272, 158, 20);
				panel.add(comboBox);
			}
			{
				JLabel lblDirreccion = new JLabel("Dirreccion:");
				lblDirreccion.setBounds(36, 170, 145, 20);
				panel.add(lblDirreccion);
			}
			{
				Dirrecion = new JTextField();
				Dirrecion.setColumns(10);
				Dirrecion.setBorder(new LineBorder(new Color(192, 192, 192)));
				Dirrecion.setBounds(36, 201, 340, 20);
				panel.add(Dirrecion);
			}
			{
				JLabel label = new JLabel("Fecha de Nacimiento :");
				label.setBounds(36, 247, 125, 14);
				panel.add(label);
			}
			
			JLabel lblCategoriaDePago = new JLabel("Categoria de Pago:");
			lblCategoriaDePago.setBounds(224, 316, 125, 14);
			panel.add(lblCategoriaDePago);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Categoria Pago>"}));
			comboBox.setToolTipText("");
		//	comboBox.setSelectedIndex(0);
			comboBox.setBorder(new LineBorder(new Color(192, 192, 192)));
			comboBox.setBackground(new Color(240, 248, 255));
			comboBox.setBounds(224, 341, 158, 20);
			panel.add(comboBox);
			
			segundoNombre = new JTextField();
			segundoNombre.setColumns(10);
			segundoNombre.setBorder(new LineBorder(new Color(192, 192, 192)));
			segundoNombre.setBounds(218, 139, 158, 20);
			panel.add(segundoNombre);
			
			PrimerApeliido = new JTextField();
			PrimerApeliido.setColumns(10);
			PrimerApeliido.setBorder(new LineBorder(new Color(192, 192, 192)));
			PrimerApeliido.setBounds(36, 139, 158, 20);
			panel.add(PrimerApeliido);
			
			JDateChooser dateChooser = new JDateChooser();
			dateChooser.setBounds(36, 272, 158, 20);
			panel.add(dateChooser);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
