package OmokUI;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OmokUI extends JFrame {
	
	
	private final int col = 20;
	private final int row = 20;
	ImageIcon black = new ImageIcon("images/black.png");
	ImageIcon white = new ImageIcon("images/white.png");
	ImageIcon background = new ImageIcon("images/Badokpan.png");
	private JButton[][] button = new JButton[col][row];
	
	public int col_index = 0;
	public int row_index = 0;
	public OmokUI() {

		setSize(620, 650);
		
		JLabel panImage = new JLabel();
		panImage.setBounds(0, 0, 600, 600);
		panImage.setIcon(background);
		getContentPane().add(panImage);
		
		for (col_index=0; col_index<col;col_index++) {
			for (row_index=0; row_index<row; row_index++) {
				button[col_index][row_index] = new JButton();
				button[col_index][row_index].setBounds(2+30*col_index, 2+30*row_index, 30, 30);
				button[col_index][row_index].setOpaque(false);
				getContentPane().add(button[col_index][row_index]);
				button[col_index][row_index].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						button[col_index][row_index].setIcon(black);
					}
				});
			}
		}
	}

	public static void main(String[] args) {
		OmokUI omok = new OmokUI();
		omok.setVisible(true);
	}
}
