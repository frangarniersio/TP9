package ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuatriemeFenetre extends JFrame
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try {
					QuatriemeFenetre frame = new QuatriemeFenetre();
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
	public QuatriemeFenetre()
	{
		setTitle("Quatri\u00E8me Fen\u00EAtre ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem mniQuitter = new JMenuItem("Quitter");
		mniQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFichier.add(mniQuitter);
		
		JMenu mnEdition = new JMenu("Edition");
		menuBar.add(mnEdition);
		
		JMenu mnClient = new JMenu("Client");
		menuBar.add(mnClient);
		
		JMenu mnGestion = new JMenu("Gestion");
		mnClient.add(mnGestion);
		
		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mnGestion.add(mntmAjouter);
		
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mnGestion.add(mntmSupprimer);
		
		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnGestion.add(mntmModifier);
		
		JMenuItem mntmRechercher = new JMenuItem("Rechercher");
		mnGestion.add(mntmRechercher);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
