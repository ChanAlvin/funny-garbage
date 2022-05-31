import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Chess extends JFrame {

	private JPanel contentPane;
	
	JPanel panel = new JPanel();
	ImageIcon background = new ImageIcon("background.png");
	final int BOARD_SIZE = 8;
	JButton[][] board = new JButton[BOARD_SIZE][BOARD_SIZE];
	int name = 0;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chess frame = new Chess();
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
	public Chess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		GridLayout layout = new GridLayout();
		panel.setLayout(layout);
		
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int col = 0; col < BOARD_SIZE; col++) {
				name++;
				board[row][col] = new JButton(Integer.toString(name));
				board[row][col].setIcon(background);
				panel.add(board[row][col]);
			}
		}
		
		getContentPane().add(panel);
		setVisible(true);
	}

}
