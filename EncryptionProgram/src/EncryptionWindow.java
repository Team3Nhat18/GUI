import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class EncryptionWindow {

	public static void main(String[] args) {
		showwindow();

	}
	public static void showwindow()
	{
		JFrame window = new JFrame ("Decryption Box");
		window.getContentPane().setBackground(new Color(240, 248, 255));
		window.setBackground(new Color(240, 248, 255));
				
				window.setBounds(100, 100, 718, 324);
				window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				window.getContentPane().setLayout(null);
				
				JLabel TextLabel = new JLabel("Nh\u00E2\u0323p Text");
				TextLabel.setForeground(new Color(255, 0, 255));
				TextLabel.setFont(new Font("Cambria", Font.BOLD, 18));
				TextLabel.setBounds(12, 53, 96, 27);
				window.getContentPane().add(TextLabel);
				
				JTextArea Text1 = new JTextArea();
				Text1.setBackground(new Color(255, 235, 205));
				Text1.setForeground(new Color(184, 134, 11));
				Text1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				Text1.setLineWrap(true);
				Text1.setBounds(12, 80, 286, 170);
				window.getContentPane().add(Text1);
				
				JLabel lblMaHoa = new JLabel("MA\u0303 HO\u0301A");
				lblMaHoa.setForeground(new Color(255, 0, 0));
				lblMaHoa.setFont(new Font("Cambria", Font.BOLD, 20));
				lblMaHoa.setBounds(310, 13, 77, 27);
				window.getContentPane().add(lblMaHoa);
				
				JTextArea Text2 = new JTextArea();
				Text2.setEditable(false);
				Text2.setLineWrap(true);
				Text2.setForeground(new Color(184, 134, 11));
				Text2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				Text2.setBackground(new Color(255, 235, 205));
				Text2.setBounds(399, 80, 286, 170);
				window.getContentPane().add(Text2);
				
				JLabel EncryptedText = new JLabel("Text \u0111a\u0303 ma\u0303 ho\u0301a");
				EncryptedText.setForeground(Color.MAGENTA);
				EncryptedText.setFont(new Font("Cambria", Font.BOLD, 18));
				EncryptedText.setBounds(399, 53, 136, 27);
				window.getContentPane().add(EncryptedText);
				
				JButton EnBtn = new JButton("");
				EnBtn.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\Change3.png"));
				EnBtn.setForeground(new Color(255, 0, 0));
				EnBtn.setFont(new Font("Cambria", Font.PLAIN, 14));
				EnBtn.setBounds(310, 125, 77, 44);
				window.getContentPane().add(EnBtn);
				window.setLocationRelativeTo(null);
				
				window.setVisible(true);
	}

}
