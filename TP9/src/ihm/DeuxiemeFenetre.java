package ihm;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;

public class DeuxiemeFenetre extends JFrame
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
					DeuxiemeFenetre frame = new DeuxiemeFenetre();
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
	public DeuxiemeFenetre()
	{
		setTitle("Deuxi\u00E8me Fen\u00EAtre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 192);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblMessage = new JLabel("");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBackground(Color.LIGHT_GRAY);
		lblMessage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMessage.setBounds(90, 96, 213, 41);
		lblMessage.setOpaque(true);
		contentPane.add(lblMessage);
		
		final JCheckBox chkThe = new JCheckBox("Th\u00E9");
		chkThe.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				if(e.getStateChange() == ItemEvent.SELECTED) 
				   lblMessage.setText("Vous avez choisi un thé."); 
			              
			    if(e.getStateChange() == ItemEvent.DESELECTED) 
			       if(chkThe.isSelected() == false) 
			            lblMessage.setText(""); 
			       
			      

			}
		});
		chkThe.setBounds(111, 55, 97, 23);
		contentPane.add(chkThe);
		
		final JCheckBox chkCafe = new JCheckBox("Caf\u00E9");
		chkCafe.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				if(e.getStateChange() == ItemEvent.SELECTED) 
		            lblMessage.setText("Vous avez choisi un café."); 
		        else 
		        	lblMessage.setText(""); 
		         
			}
		});
		chkCafe.setBounds(231, 55, 97, 23);
		contentPane.add(chkCafe);
		
		final JLabel lblTitre = new JLabel("Th\u00E9 ou Caf\u00E9 ?");
		lblTitre.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblTitre.setBounds(143, 11, 97, 23);
		contentPane.add(lblTitre);
	}
}
