package ihm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;

public class TroisiemeFenetre extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					TroisiemeFenetre frame = new TroisiemeFenetre();
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
	public TroisiemeFenetre()
	{
		setTitle("Troisi\u00E8me Fen\u00EAtre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rbBleu = new JRadioButton("Bleu");
		rbBleu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setBackground(Color.blue);  
			}
		});
		rbBleu.setBounds(32, 59, 109, 23);
		contentPane.add(rbBleu);
		
		JRadioButton rbBlanc = new JRadioButton("Blanc");
		rbBlanc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.white); 
			}
		});
		rbBlanc.setBounds(32, 101, 109, 23);
		contentPane.add(rbBlanc);
		
		JRadioButton rbRouge = new JRadioButton("Rouge");
		rbRouge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.red); 
			}
		});
		rbRouge.setBounds(32, 141, 109, 23);
		contentPane.add(rbRouge);
		
		ButtonGroup groupeRadioBtn = new ButtonGroup(); 
	    groupeRadioBtn.add(rbBleu); 
	    groupeRadioBtn.add(rbBlanc); 
	    groupeRadioBtn.add(rbRouge); 
	    
	    final JLabel lblImage = new JLabel("");
	    lblImage.setIcon(new ImageIcon(TroisiemeFenetre.class.getResource("/images/pomme.gif")));
	    lblImage.setBounds(253, 143, 21, 35);
	    contentPane.add(lblImage);
	    
	    final JComboBox cbFruit = new JComboBox();
	    cbFruit.addItemListener(new ItemListener() {
	    	public void itemStateChanged(ItemEvent e) {
	    		String fruit = (String)cbFruit.getSelectedItem();     
	    		if (fruit.equals("Pomme"))
	    		   lblImage.setIcon(new ImageIcon(TroisiemeFenetre.class.getResource("/images/pomme.gif"))); 
	    		else 
	    		   if(fruit.equals("Banane")) 
	    		      lblImage.setIcon(new ImageIcon(TroisiemeFenetre.class.getResource("/images/banane.gif"))); 
	    		   else
	    		      lblImage.setIcon(new ImageIcon(TroisiemeFenetre.class.getResource("/images/poire.gif"))); 

	    	}
	    });
	    cbFruit.setModel(new DefaultComboBoxModel(new String[] {"Pomme", "Banane", "Poire"}));
	    cbFruit.setBounds(223, 60, 83, 20);
	    contentPane.add(cbFruit);
	    

		
	}
}
