package gdGame6;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class gd1 extends JFrame implements ActionListener {
	public gd1() {
		this.setLocation(400, 100);
		this.setSize(490, 490);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.init();
	}
	private void init() {
		getContentPane().setLayout(null);

		JLabel l1 = new JLabel();
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setForeground(Color.WHITE);
		l1.setBounds(20, 351, 440, 20);
		getContentPane().add(l1);
		JLabel l2 = new JLabel();
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		l2.setForeground(Color.WHITE);
		l2.setBounds(20, 372, 440, 20);
		getContentPane().add(l2);
		JLabel l3 = new JLabel();
		l3.setFont(new Font("Tahoma", Font.BOLD, 15));
		l3.setForeground(Color.WHITE);
		l3.setBounds(20, 391, 440, 20);
		getContentPane().add(l3);
		JLabel l4 = new JLabel();
		l4.setFont(new Font("Tahoma", Font.BOLD, 15));
		l4.setForeground(Color.WHITE);
		l4.setBounds(20, 412, 440, 20);
		getContentPane().add(l4);
		JLabel l5 = new JLabel();
		l5.setFont(new Font("Tahoma", Font.BOLD, 15));
		l5.setForeground(Color.WHITE);
		l5.setBounds(20, 430, 440, 20);
		getContentPane().add(l5);
		
		JButton b2 = new JButton("Help");
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("Tahoma" , Font.BOLD | Font.ITALIC, 15));
		b2.setForeground(Color.MAGENTA);
		b2.setBounds(174, 278, 120, 40);
		getContentPane().add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				l1.setText("- Game dành cho 2 người chơi ");
				l2.setText("- 2 người có lượt chơi xen kẽ nhau, bắt đầu từ người 1 ");
				l3.setText("- Mỗi lượt chơi là một lần xúc xắc");
				l4.setText("- Mỗi lần xúc xắc người chơi sẽ được cộng điểm tương ứng");
				l5.setText("- Ai đặt 50 điểm trước sẽ thắng!");
			}
		});

		JButton b1 = new JButton("New Game");
		b1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.MAGENTA);
		b1.setBounds(174, 227, 120, 40);
		getContentPane().add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gd2 a = new gd2();
				a.setVisible(true);
				
			}
		});
		JLabel lBackground = new JLabel("");
		lBackground.setBackground(Color.DARK_GRAY);
		lBackground.setBounds(0, 0, 484, 488);
		getContentPane().add(lBackground);
		lBackground.setIcon(new ImageIcon("E:\\Downloads\\pic\\xuc-xac-vui-nhon-hd2.jpg"));
		lBackground.setHorizontalAlignment(SwingConstants.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	
}
