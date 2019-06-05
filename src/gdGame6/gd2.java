package gdGame6;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class gd2 extends JFrame implements ActionListener {
	List<Integer> a = new ArrayList<Integer>();
	private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
			+ "databaseName=learningsql;"
			+ "integratedSecurity=true";
	private static String USER_NAME = "sa";
	private static String PASSWORD = "123";
	
	
	JTextField t1 = new JTextField("     0");
	JTextField t2 = new JTextField("     0");
	JTextField t3 = new JTextField("");
	JTextField t4 = new JTextField("      Lượt đầu tiên của người 1!");

	nguoiChoi n1 = new nguoiChoi(0);
	nguoiChoi n2 = new nguoiChoi(0);
	int i = 1;

	JLabel lblXutPht = new JLabel("Xuất Phát:");
	JLabel label_53 = new JLabel("");
	JLabel label_52 = new JLabel("");

	public static int getRandomIntInBetween(int min, int max) {
		Random r = new Random();
		return min + r.nextInt(max - min);
	}
	public static Connection getConnection(String dbURL, String userName, String password) {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(dbURL, userName, password);
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}
	
	public int lacXX() {
		return getRandomIntInBetween(1, 6);
	}

	public void hien1(int vitri) {
		switch (vitri) {
		case 0:
			label_53.setBounds(121, 83, 21, 20);
			break;
		case 1:
			label_53.setBounds(33, 110, 11, 15);
			break;
		case 2:
			label_53.setBounds(58, 110, 16, 15);
			break;
		case 3:
			label_53.setBounds(79, 110, 11, 15);
			break;
		case 4:
			label_53.setBounds(105, 110, 16, 15);
			break;
		case 5:
			label_53.setBounds(131, 110, 16, 15);
			break;
		case 6:
			label_53.setBounds(153, 110, 16, 15);
			break;
		case 7:
			label_53.setBounds(179, 110, 16, 15);
			break;
		case 8:
			label_53.setBounds(203, 110, 16, 15);
			break;
		case 9:
			label_53.setBounds(227, 110, 16, 15);
			break;
		case 10:
			label_53.setBounds(253, 110, 16, 15);
			break;
		case 11:
			label_53.setBounds(277, 110, 16, 15);
			break;
		case 12:
			label_53.setBounds(302, 110, 16, 15);
			break;
		case 13:
			label_53.setBounds(327, 110, 16, 15);
			break;
		case 14:
			label_53.setBounds(353, 110, 16, 15);
			break;
		case 15:
			label_53.setBounds(379, 110, 16, 15);
			break;
		case 16:
			label_53.setBounds(405, 110, 16, 15);
			break;
		case 17:
			label_53.setBounds(405, 135, 16, 15);
			break;
		case 18:
			label_53.setBounds(405, 158, 16, 15);
			break;
		case 19:
			label_53.setBounds(379, 158, 16, 15);
			break;
		case 20:
			label_53.setBounds(353, 158, 16, 15);
			break;
		case 21:
			label_53.setBounds(327, 158, 16, 15);
			break;
		case 22:
			label_53.setBounds(302, 158, 16, 15);
			break;
		case 23:
			label_53.setBounds(277, 158, 16, 15);
			break;
		case 24:
			label_53.setBounds(253, 158, 16, 15);
			break;
		case 25:
			label_53.setBounds(227, 158, 16, 15);
			break;
		case 26:
			label_53.setBounds(203, 158, 16, 15);
			break;
		case 27:
			label_53.setBounds(179, 158, 16, 15);
			break;
		case 28:
			label_53.setBounds(153, 158, 16, 15);
			break;
		case 29:
			label_53.setBounds(131, 158, 16, 15);
			break;
		case 30:
			label_53.setBounds(105, 158, 16, 15);
			break;
		case 31:
			label_53.setBounds(79, 158, 16, 15);
			break;
		case 32:
			label_53.setBounds(79, 183, 16, 15);
			break;
		case 33:
			label_53.setBounds(79, 210, 16, 15);
			break;
		case 34:
			label_53.setBounds(105, 210, 16, 15);
			break;
		case 35:
			label_53.setBounds(131, 210, 16, 15);
			break;
		case 36:
			label_53.setBounds(153, 210, 16, 15);
			break;
		case 37:
			label_53.setBounds(179, 210, 16, 15);
			break;
		case 38:
			label_53.setBounds(203, 210, 16, 15);
			break;
		case 39:
			label_53.setBounds(227, 210, 16, 15);
			break;
		case 40:
			label_53.setBounds(253, 210, 16, 15);
			break;
		case 41:
			label_53.setBounds(277, 210, 16, 15);
			break;
		case 42:
			label_53.setBounds(302, 210, 16, 15);
			break;
		case 43:
			label_53.setBounds(327, 210, 16, 15);
			break;
		case 44:
			label_53.setBounds(353, 210, 16, 15);
			break;
		case 45:
			label_53.setBounds(379, 210, 16, 15);
			break;
		case 46:
			label_53.setBounds(405, 210, 16, 15);
			break;
		case 47:
			label_53.setBounds(426, 210, 16, 15);
			break;
		case 48:
			label_53.setBounds(452, 210, 16, 15);
			break;
		case 49:
			label_53.setBounds(452, 183, 16, 15);
			break;
		case 50:
			label_53.setBounds(452, 160, 16, 15);
			break;
		}
	}

	public void hien2(int vitri) {
		switch (vitri) {
		case 0:
			label_52.setBounds(143, 83, 21, 20);
			break;
		case 1:
			label_52.setBounds(39, 114, 11, 15);
			break;
		case 2:
			label_52.setBounds(64, 114, 16, 15);
			break;
		case 3:
			label_52.setBounds(86, 114, 11, 15);
			break;
		case 4:
			label_52.setBounds(114, 114, 16, 15);
			break;
		case 5:
			label_52.setBounds(138, 114, 16, 15);
			break;
		case 6:
			label_52.setBounds(162, 114, 16, 15);
			break;
		case 7:
			label_52.setBounds(188, 114, 16, 15);
			break;
		case 8:
			label_52.setBounds(212, 114, 16, 15);
			break;
		case 9:
			label_52.setBounds(236, 114, 16, 15);
			break;
		case 10:
			label_52.setBounds(261, 114, 16, 15);
			break;
		case 11:
			label_52.setBounds(286, 114, 16, 15);
			break;
		case 12:
			label_52.setBounds(310, 114, 16, 15);
			break;
		case 13:
			label_52.setBounds(335, 114, 16, 15);
			break;
		case 14:
			label_52.setBounds(362, 114, 16, 15);
			break;
		case 15:
			label_52.setBounds(388, 114, 16, 15);
			break;
		case 16:
			label_52.setBounds(413, 112, 16, 15);
			break;
		case 17:
			label_52.setBounds(413, 138, 16, 15);
			break;
		case 18:
			label_52.setBounds(413, 162, 16, 15);
			break;
		case 19:
			label_52.setBounds(388, 162, 16, 15);
			break;
		case 20:
			label_52.setBounds(362, 162, 16, 15);
			break;
		case 21:
			label_52.setBounds(336, 162, 16, 15);
			break;
		case 22:
			label_52.setBounds(310, 162, 16, 15);
			break;
		case 23:
			label_52.setBounds(286, 162, 16, 15);
			break;
		case 24:
			label_52.setBounds(262, 162, 16, 15);
			break;
		case 25:
			label_52.setBounds(235, 162, 16, 15);
			break;
		case 26:
			label_52.setBounds(212, 162, 16, 15);
			break;
		case 27:
			label_52.setBounds(188, 162, 16, 15);
			break;
		case 28:
			label_52.setBounds(162, 162, 16, 15);
			break;
		case 29:
			label_52.setBounds(139, 162, 16, 15);
			break;
		case 30:
			label_52.setBounds(114, 162, 16, 15);
			break;
		case 31:
			label_52.setBounds(88, 162, 16, 15);
			break;
		case 32:
			label_52.setBounds(88, 186, 16, 15);
			break;
		case 33:
			label_52.setBounds(88, 212, 16, 15);
			break;
		case 34:
			label_52.setBounds(114, 212, 16, 15);
			break;
		case 35:
			label_52.setBounds(140, 212, 16, 15);
			break;
		case 36:
			label_52.setBounds(162, 212, 16, 15);
			break;
		case 37:
			label_52.setBounds(188, 212, 16, 15);
			break;
		case 38:
			label_52.setBounds(212, 212, 16, 15);
			break;
		case 39:
			label_52.setBounds(236, 212, 16, 15);
			break;
		case 40:
			label_52.setBounds(262, 212, 16, 15);
			break;
		case 41:
			label_52.setBounds(285, 212, 16, 15);
			break;
		case 42:
			label_52.setBounds(311, 212, 16, 15);
			break;
		case 43:
			label_52.setBounds(335, 212, 16, 15);
			break;
		case 44:
			label_52.setBounds(362, 212, 16, 15);
			break;
		case 45:
			label_52.setBounds(388, 212, 16, 15);
			break;
		case 46:
			label_52.setBounds(414, 212, 16, 15);
			break;
		case 47:
			label_52.setBounds(435, 212, 16, 15);
			break;
		case 48:
			label_52.setBounds(461, 212, 16, 15);
			break;
		case 49:
			label_52.setBounds(461, 186, 16, 15);
			break;
		case 50:
			label_52.setBounds(461, 162, 16, 15);
			break;
		}
	}

	public gd2() {
		super();
		this.setTitle("Xúc Xắc Vui Vẻ");
		this.setLocation(400, 100);
		this.setSize(510, 510);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.init();
	}

	private void init() {
		i = 1;
		JPanel pane1 = new JPanel();
		pane1.setLayout(null);
		a.add(3);
		a.add(6);
		a.add(10);
		a.add(14);
		a.add(18);
		a.add(22);
		a.add(28);
		a.add(30);
		a.add(36);
		a.add(40);
		a.add(44);

		JButton j1 = new JButton("Lắc xúc xắc");
		j1.setBackground(new Color(127, 255, 0));
		j1.setForeground(new Color(0, 100, 0));
		j1.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		JButton j2 = new JButton("New game");
		j2.setFont(new Font("Trajan Pro 3", Font.BOLD, 12));
		j2.setForeground(Color.BLUE);
		JButton j3 = new JButton("Thoát game");
		j3.setFont(new Font("Trajan Pro 3", Font.BOLD, 10));
		j3.setForeground(Color.RED);

		JLabel l1 = new JLabel("Người thứ 1");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		JLabel l2 = new JLabel("Người thứ 2");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));

		t1.setEditable(false);
		t1.setBackground(Color.LIGHT_GRAY);
		t1.setFont(new Font("Tahoma", Font.BOLD, 30));
		t1.setForeground(Color.WHITE);
		t2.setEditable(false);
		t2.setBackground(Color.LIGHT_GRAY);
		t1.setBackground(Color.LIGHT_GRAY);
		t2.setFont(new Font("Tahoma", Font.BOLD, 30));
		t2.setForeground(Color.BLACK);
		t3.setEditable(false);
		t3.setBackground(Color.WHITE);
		t3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		t4.setForeground(new Color(0, 128, 0));
		t4.setEditable(false);
		t4.setBackground(Color.CYAN);
		t4.setFont(new Font("Tahoma", Font.BOLD, 15));

		j1.setLocation(165, 317);
		j1.setSize(172, 154);
		j2.setLocation(20, 430);
		j2.setSize(120, 40);
		j3.setLocation(360, 430);
		j3.setSize(120, 40);

		l1.setLocation(20, 314);
		l1.setSize(120, 20);
		t1.setLocation(20, 345);
		t1.setSize(120, 74);

		l2.setLocation(360, 314);
		l2.setSize(103, 20);
		t2.setLocation(360, 345);
		t2.setSize(120, 74);
		t3.setLocation(20, 285);
		t3.setSize(460, 20);

		t4.setLocation(121, 33);
		t4.setSize(265, 30);

		pane1.add(j1);
		pane1.add(j2);
		pane1.add(j3);
		pane1.add(l1);
		pane1.add(l2);
		pane1.add(t1);
		pane1.add(t2);
		pane1.add(t3);
		pane1.add(t4);
		this.getContentPane().add(pane1);

		lblXutPht.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblXutPht.setBackground(Color.ORANGE);
		lblXutPht.setBounds(25, 83, 84, 20);
		pane1.add(lblXutPht);
		label_52.setIcon(new ImageIcon("E:\\Downloads\\pic\\hoccovua49.jpg"));

		label_52.setForeground(Color.RED);
		label_52.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_52.setBackground(Color.LIGHT_GRAY);
		label_52.setBounds(143, 83, 21, 20);
		pane1.add(label_52);
		label_53.setIcon(new ImageIcon("E:\\Downloads\\pic\\q1.jpg"));

		label_53.setForeground(Color.BLUE);
		label_53.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_53.setBackground(Color.LIGHT_GRAY);
		label_53.setBounds(121, 83, 21, 20);
		pane1.add(label_53);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Documents\\btl1.jpg"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBackground(Color.DARK_GRAY);
		label_1.setBounds(10, 61, 484, 217);
		pane1.add(label_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\Downloads\\pic\\mew3.jpg"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.DARK_GRAY);
		label.setBounds(0, 0, 504, 488);
		pane1.add(label);

		j3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
					Statement stmt = conn.createStatement();

					int r = gd2.getRandomIntInBetween(1, 6);
					switch (r) {
					case 1: {
						ResultSet rs = stmt.executeQuery("select * from login");
						while (rs.next()) {
							a.set(0, rs.getInt(2));
							a.set(1, rs.getInt(3));
							a.set(2, rs.getInt(4));
							a.set(3, rs.getInt(5));
							a.set(4, rs.getInt(6));
							a.set(5, rs.getInt(7));
							a.set(6, rs.getInt(8));
							a.set(7, rs.getInt(9));
							a.set(8, rs.getInt(10));
							a.set(9, rs.getInt(11));
							a.set(10, rs.getInt(12));
							label_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Documents\\btlf1.jpg"));
						}
						break;
					}
					case 2: {
						ResultSet rs1 = stmt.executeQuery("select * from login1");
						while (rs1.next()) {
							a.set(0, rs1.getInt(2));
							a.set(1, rs1.getInt(3));
							a.set(2, rs1.getInt(4));
							a.set(3, rs1.getInt(5));
							a.set(4, rs1.getInt(6));
							a.set(5, rs1.getInt(7));
							a.set(6, rs1.getInt(8));
							a.set(7, rs1.getInt(9));
							a.set(8, rs1.getInt(10));
							a.set(9, rs1.getInt(11));
							a.set(10, rs1.getInt(12));
							label_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Documents\\btlf2.jpg"));
						}
						break;

					}
					case 3: {
						ResultSet rs2 = stmt.executeQuery("select * from login2");
						while (rs2.next()) {
							a.set(0, rs2.getInt(2));
							a.set(1, rs2.getInt(3));
							a.set(2, rs2.getInt(4));
							a.set(3, rs2.getInt(5));
							a.set(4, rs2.getInt(6));
							a.set(5, rs2.getInt(7));
							a.set(6, rs2.getInt(8));
							a.set(7, rs2.getInt(9));
							a.set(8, rs2.getInt(10));
							a.set(9, rs2.getInt(11));
							a.set(10, rs2.getInt(12));
							label_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Documents\\btlf3.jpg"));
						}
						break;
					}
					case 4: {
						ResultSet rs3 = stmt.executeQuery("select * from login3");
						while (rs3.next()) {
							a.set(0, rs3.getInt(2));
							a.set(1, rs3.getInt(3));
							a.set(2, rs3.getInt(4));
							a.set(3, rs3.getInt(5));
							a.set(4, rs3.getInt(6));
							a.set(5, rs3.getInt(7));
							a.set(6, rs3.getInt(8));
							a.set(7, rs3.getInt(9));
							a.set(8, rs3.getInt(10));
							a.set(9, rs3.getInt(11));
							a.set(10, rs3.getInt(12));
							label_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Documents\\btlf4.jpg"));
						}
						break;
					}
					case 5: {
						ResultSet rs4 = stmt.executeQuery("select * from login4");
						while (rs4.next()) {
							a.set(0, rs4.getInt(2));
							a.set(1, rs4.getInt(3));
							a.set(2, rs4.getInt(4));
							a.set(3, rs4.getInt(5));
							a.set(4, rs4.getInt(6));
							a.set(5, rs4.getInt(7));
							a.set(6, rs4.getInt(8));
							a.set(7, rs4.getInt(9));
							a.set(8, rs4.getInt(10));
							a.set(9, rs4.getInt(11));
							a.set(10, rs4.getInt(12));
							label_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Documents\\btlf5.jpg"));
						}
						conn.close();
					}
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
//				System.out.println("////////");
				i = 1;
				t4.setText("    Lượt của người đầu tiên 1!");
				n1.setViTri(0);
				n2.setViTri(0);
				t1.setText("     0");
				t2.setText("     0");
				t3.setText("");
				hien1(0);
				hien2(0);
			}
		});
		j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int o = a.size();

				if (i % 2 == 1) {
					int n = lacXX();
					t3.setText("     Người 1 được cộng thêm " + n + " điểm!");
					t4.setText("     Lượt tiếp theo đến người thứ 2!");
					n1.setViTri(n1.getViTri() + n);
					if (n1.getViTri() >= 50) {
						hien1(50);
						t1.setText("    50");
						JOptionPane.showMessageDialog(null, "Người 1 chiến thắng! Bắt đầu game mới",
				                  "Title", JOptionPane.WARNING_MESSAGE);
						t3.setText("     Người thứ 1 thắng!");
						t4.setText("***Bắt đầu game mới!***");
					} else {
						if (n1.getViTri() == a.get(o - 11)) {
							n1.setViTri(n1.getViTri() + 2);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và được tặng thêm 2 điểm!");
						}
						if (n1.getViTri() == a.get(o - 10)) {
							n1.setViTri(n1.getViTri() - 4);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và bị trừ 4 điểm!");
						}
						if (n1.getViTri() == a.get(o - 9)) {
							n1.setViTri(0);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và bị về với 0!");
						}
						if (n1.getViTri() == a.get(o - 8)) {
							n1.setViTri(n1.getViTri() + 1);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và được tặng thêm 1 điểm!");
						}
						if (n1.getViTri() == a.get(o - 7)) {
							n1.setViTri(n1.getViTri() + 2);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và được tặng thêm 2 điểm!");
						}
						if (n1.getViTri() == a.get(o - 6)) {
							n1.setViTri(n1.getViTri() + 10);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và được tặng thêm 10 điểm!");
						}
						if (n1.getViTri() == a.get(o - 5)) {
							n1.setViTri(49);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và được nhảy tăng điểm thành 49");
						}
						if (n1.getViTri() == a.get(o - 4)) {
							n1.setViTri(n1.getViTri() + 2);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và được tặng thêm 2 điểm!");
						}
						if (n1.getViTri() == a.get(o - 3)) {
							n1.setViTri(n1.getViTri() - 2);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và bị trừ 2 điểm!");
						}
						if (n1.getViTri() == a.get(o - 2)) {
							n1.setViTri(n1.getViTri() - 12);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và bị trừ 12 điểm!");
						}
						if (n1.getViTri() == a.get(o - 1)) {
							n1.setViTri(n1.getViTri() - 2);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và bị trừ 6 điểm!");
						}
						t1.setText("     " + n1.getViTri());
						i++;
						hien1(n1.getViTri());
					}
				} else {
					int n = lacXX();
					t3.setText("     Người 2 được cộng thêm " + n + " điểm!");
					t4.setText("     Lượt tiếp theo đến người thứ 1!");
					n2.setViTri(n2.getViTri() + n);
					if (n2.getViTri() >= 50) {
						hien2(50);
						JOptionPane.showMessageDialog(null, "Người 2 chiến thắng! Bắt đầu game mới",
				                  "Title", JOptionPane.WARNING_MESSAGE);
						t2.setText("    50");
						t3.setText("     Người thứ 2 thắng!");
						t4.setText("***Bắt đầu game mới!***");
					} else {
						if (n2.getViTri() == a.get(o - 11)) {
							n1.setViTri(n1.getViTri() + 2);
							t3.setText("     Người 1 được cộng thêm " + n + " điểm và được tặng thêm 2 điểm!");
						}
						if (n2.getViTri() == a.get(o - 10)) {
							n2.setViTri(n2.getViTri() - 4);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và bị trừ 4 điểm!");
						}
						if (n2.getViTri() == a.get(o - 9)) {
							n2.setViTri(0);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và bị về với 0!");
						}
						if (n2.getViTri() == a.get(o - 8)) {
							n2.setViTri(n2.getViTri() + 1);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và được tặng thêm 1 điểm!");
						}
						if (n2.getViTri() == a.get(o - 7)) {
							n2.setViTri(n2.getViTri() + 2);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và được tặng thêm 2 điểm!");
						}
						if (n2.getViTri() == a.get(o - 6)) {
							n2.setViTri(n2.getViTri() + 10);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và được tặng thêm 10 điểm!");
						}
						if (n2.getViTri() == a.get(o - 5)) {
							n2.setViTri(49);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và được nhảy tăng điểm thành 49");
						}
						if (n2.getViTri() == a.get(o - 4)) {
							n2.setViTri(n2.getViTri() + 2);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và được tặng thêm 2 điểm!");
						}
						if (n2.getViTri() == a.get(o - 3)) {
							n2.setViTri(n2.getViTri() - 2);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và bị trừ 2 điểm!");
						}
						if (n2.getViTri() == a.get(o - 2)) {
							n2.setViTri(n2.getViTri() - 12);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và bị trừ 12 điểm!");
						}
						if (n2.getViTri() == a.get(o - 1)) {
							n2.setViTri(n2.getViTri() - 2);
							t3.setText("     Người 2 được cộng thêm " + n + " điểm và bị trừ 6 điểm!");
						}
						t2.setText("     " + n2.getViTri());
						i++;
						hien2(n2.getViTri());
					}
				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
