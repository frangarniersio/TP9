package ihm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class PremiereFenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PremiereFenetre frame = new PremiereFenetre();
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
	public PremiereFenetre() {
		setTitle("Premi\u00E8re fen\u00EAtre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 216);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Bienvenue " + txtNom.getText());
			}
		});
		btnOk.setBounds(145, 120, 91, 23);
		contentPane.add(btnOk);
		
		txtNom = new JTextField();
		txtNom.setBounds(123, 70, 134, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblNom = new JLabel("Saisir votre nom");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNom.setBounds(123, 45, 134, 14);
		contentPane.add(lblNom);
		
		JLabel lblFond = new JLabel("");
		lblFond.setIcon(new ImageIcon(PremiereFenetre.class.getResource("/images/fond2.png")));
		lblFond.setBounds(0, 0, 387, 178);
		contentPane.add(lblFond);
	}
}
