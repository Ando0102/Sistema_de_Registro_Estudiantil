package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Dimension tamaño;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {

		setResizable(false);
		
	
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//Permite poner a tomano de la pantalla
		
		tamaño = super.getToolkit().getScreenSize();
		super.setSize(tamaño.width, tamaño.height);
		//----------------
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPepe = new JMenu("Administrador");
		menuBar.add(mnPepe);
		
		JMenu mnCrear_1 = new JMenu("Crear");
		mnPepe.add(mnCrear_1);
		
		JMenuItem mntmEstudiante_1 = new JMenuItem("Estudiante");
		mntmEstudiante_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CrearEstudiante nuevoEstudiante = new CrearEstudiante();
				nuevoEstudiante.setLocationRelativeTo(null);//centra la venta. 
				nuevoEstudiante.setVisible(true);	
			
				
				
			}
		});
		mnCrear_1.add(mntmEstudiante_1);
		
		JMenuItem menuItem = new JMenuItem("Asignatura");
		mnCrear_1.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Grupo");
		mnCrear_1.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("GrupoHorario");
		mnCrear_1.add(menuItem_2);
		
		JMenu mnCrear = new JMenu("Modificar");
		mnPepe.add(mnCrear);
		
		JMenuItem mntmAsignatura = new JMenuItem("Asignatura");
		mnCrear.add(mntmAsignatura);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Grupo");
		mnCrear.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("GrupoHorario");
		mnCrear.add(mntmNewMenuItem_1);
		
		JMenuItem mntmEstudiante = new JMenuItem("Estudiante");
		mnPepe.add(mntmEstudiante);
		
		JMenu mnEstudiante = new JMenu("Estudiante");
		menuBar.add(mnEstudiante);
		
		JMenuItem mntmRealizarinscri = new JMenuItem("Realizar Inscripcion");
		mnEstudiante.add(mntmRealizarinscri);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Modificar Inscricipcion");
		mnEstudiante.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
