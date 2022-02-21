import java.awt.EventQueue;
//import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Travellig {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travellig window = new Travellig();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travellig() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 13));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setFont(new Font("Dialog", Font.PLAIN, 30));
		frame.setBounds(0, 0, 669, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(20, 11, 623, 39);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Travelling Ticketing Systems");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(72, 49, 87, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		final JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnStandard.setBounds(6, 90, 91, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		final JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnEconomy.setBounds(6, 116, 91, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		final JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnFirstClass.setBounds(10, 145, 87, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		final JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSingleTicket.setBounds(102, 90, 109, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		final JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnReturnTicket.setBounds(102, 117, 109, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		final JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnAdult.setBounds(213, 90, 80, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		final JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnChild.setBounds(213, 117, 80, 23);
		frame.getContentPane().add(rdbtnChild);
		
		final JComboBox cmbDestination = new JComboBox();
		cmbDestination.setFont(new Font("Tahoma", Font.BOLD, 11));
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Wardha", "Nagpur", "Pune", "Parbhani", "Banglore", ""}));
		cmbDestination.setBounds(102, 145, 159, 22);
		frame.getContentPane().add(cmbDestination);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(16, 175, 290, 9);
		frame.getContentPane().add(lblNewLabel_2);
		
//		final JLabel txtTax = new JLabel("Tax");
		JLabel txtTax_label = new JLabel("Tax");
		txtTax_label.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTax_label.setBounds(20, 218, 46, 14);
		frame.getContentPane().add(txtTax_label);
		
		JLabel txtSubtotal_label = new JLabel("SubTotal");
		txtSubtotal_label.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSubtotal_label.setBounds(20, 243, 57, 14);
		frame.getContentPane().add(txtSubtotal_label);
		
		JLabel txtTotal_label = new JLabel("Total");
		txtTotal_label.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtTotal_label.setBounds(20, 271, 46, 14);
		frame.getContentPane().add(txtTotal_label);
		
		txtTax = new JTextField();
		txtTax.setBounds(91, 215, 86, 20);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setBounds(91, 240, 86, 20);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(91, 268, 86, 20);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 195, 177, -7);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(158, 195, 1, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(20, 310, 273, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 191, 273, -7);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.LIGHT_GRAY);
		separator_4.setBounds(10, 195, 283, 2);
		frame.getContentPane().add(separator_4);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double tax = 19.50;
				double MilesK8 = 25.78;
				double MileK12 = 25.10;
				double MileK20 = 45.23;
				double MileK30 = 55.98;
				double totalCost,eco=3.85,fclass=5.60;
				
				if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
				&& cmbDestination.getSelectedItem().equals("Pune"))
				{
					totalCost = (tax * MilesK8)/100;
					String sTax = String.format("₹%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("₹%.2f",MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("₹%.2f",MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				
				}
				
				
					
						
			}});
		btnNewButton.setToolTipText("Total Cost of Ticket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				              
					//Time
				Calendar timer = Calendar.getInstance();
				timer.getTime();
//				SimpleDateFormat tTime = new SimpleDateFormat("hh:mm:ss");
//				txtTime.setText(tTime.format(timer.getTime()));
				
				Date date = new Date();
			    String strDateFormat = "HH:mm:ss a";
			    SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
//			    System.out.println(sdf.format(date));
			    txtTime.setText(sdf.format(date));
					//Date
//				SimpleDateFormat Tdate = new SimpleDateFormat("dd-mm-yy");
//				txtDate.setText(Tdate.format(timer.getTime()));
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				txtDate.setText(dateFormat.format(timer.getTime()));
				
				txtFrom.setText("Delhi *");
				txtTo.setText((String) cmbDestination.getSelectedItem()+ " *");
				
					//Random Number Generator
				int num1;
				String q1 ="";
				num1 = 1325 + (int)  Math.random()*4238;
				q1+= num1 + 1325;
				txtTicketNo.setText(q1);
				
				txtRoute.setText("ANY");
				
			
				
	                                                                                                                                                                                                             
				
			                           
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 13));
		btnNewButton.setBounds(20, 327, 80, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit System");
		btnExit.setVerticalAlignment(SwingConstants.TOP);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Ticketing System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
				
				
				  
			
			}
		});
		btnExit.setFont(new Font("Dialog", Font.BOLD, 13));
		btnExit.setBounds(218, 327, 75, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(355, 145, 1, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(316, 90, 7, 260);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(6, 81, 287, 2);
		frame.getContentPane().add(separator_7);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setAction(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				txtFrom.setText(null);
				txtTo.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
				txtClass.setText(null);
				txtTicket.setText(null);
				txtAdult.setText(null);
				txtChild.setText(null);
				txtTicketNo.setText(null);
				
				
				

				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(119, 327, 80, 23);
		frame.getContentPane().add(btnReset);
		
		JLabel txtSubtotal_label_1 = new JLabel("Class");
		txtSubtotal_label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSubtotal_label_1.setBounds(334, 61, 46, 14);
		frame.getContentPane().add(txtSubtotal_label_1);
		
		JLabel txtSubtotal_label_2 = new JLabel("Ticket");
		txtSubtotal_label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSubtotal_label_2.setBounds(412, 63, 57, 14);
		frame.getContentPane().add(txtSubtotal_label_2);
		
		JLabel txtSubtotal_label_3 = new JLabel("Adult");
		txtSubtotal_label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSubtotal_label_3.setBounds(491, 63, 57, 14);
		frame.getContentPane().add(txtSubtotal_label_3);
		
		JLabel txtSubtotal_label_4 = new JLabel("Child");
		txtSubtotal_label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSubtotal_label_4.setBounds(568, 63, 57, 14);
		frame.getContentPane().add(txtSubtotal_label_4);
		
		txtClass = new JTextField();
		txtClass.setColumns(10);
		txtClass.setBounds(333, 91, 68, 20);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setColumns(10);
		txtTicket.setBounds(401, 91, 68, 20);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setColumns(10);
		txtAdult.setBounds(479, 91, 68, 20);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setColumns(10);
		txtChild.setBounds(557, 91, 68, 20);
		frame.getContentPane().add(txtChild);
		
		JSeparator separator_7_1 = new JSeparator();
		separator_7_1.setBounds(327, 81, 298, 2);
		frame.getContentPane().add(separator_7_1);
		
		JSeparator separator_7_1_1 = new JSeparator();
		separator_7_1_1.setBounds(327, 116, 298, 8);
		frame.getContentPane().add(separator_7_1_1);
		
		JSeparator separator_6_1 = new JSeparator();
		separator_6_1.setOrientation(SwingConstants.VERTICAL);
		separator_6_1.setBounds(635, 81, 7, 260);
		frame.getContentPane().add(separator_6_1);
		
		JLabel txtTax_label_1 = new JLabel("From");
		txtTax_label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTax_label_1.setBounds(334, 148, 46, 14);
		frame.getContentPane().add(txtTax_label_1);
		
		JLabel txtTax_label_2 = new JLabel("To");
		txtTax_label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTax_label_2.setBounds(333, 204, 46, 14);
		frame.getContentPane().add(txtTax_label_2);
		
		JLabel txtTax_label_3 = new JLabel("Date");
		txtTax_label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTax_label_3.setBounds(334, 258, 46, 14);
		frame.getContentPane().add(txtTax_label_3);
		
		JLabel txtTax_label_4 = new JLabel("Time");
		txtTax_label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTax_label_4.setBounds(334, 310, 46, 14);
		frame.getContentPane().add(txtTax_label_4);
		
		txtFrom = new JTextField();
		txtFrom.setColumns(10);
		txtFrom.setBounds(401, 146, 68, 20);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setColumns(10);
		txtTo.setBounds(401, 202, 68, 20);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(401, 256, 68, 20);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setColumns(10);
		txtTime.setBounds(401, 308, 68, 20);
		frame.getContentPane().add(txtTime);
		
		JSeparator separator_6_2 = new JSeparator();
		separator_6_2.setOrientation(SwingConstants.VERTICAL);
		separator_6_2.setBounds(479, 125, 1, 225);
		frame.getContentPane().add(separator_6_2);
		
		JLabel txtTax_label_1_1 = new JLabel("Ticket No");
		txtTax_label_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTax_label_1_1.setBounds(520, 175, 68, 14);
		frame.getContentPane().add(txtTax_label_1_1);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(520, 195, 91, 20);
		frame.getContentPane().add(txtTicketNo);
		
		JLabel txtTax_label_1_1_1 = new JLabel("Price");
		txtTax_label_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTax_label_1_1_1.setBounds(520, 231, 68, 14);
		frame.getContentPane().add(txtTax_label_1_1_1);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(520, 256, 91, 20);
		frame.getContentPane().add(txtPrice);
		
		JLabel txtTax_label_1_1_1_1 = new JLabel("Route");
		txtTax_label_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTax_label_1_1_1_1.setBounds(520, 287, 68, 14);
		frame.getContentPane().add(txtTax_label_1_1_1_1);
		
		txtRoute = new JTextField();
		txtRoute.setColumns(10);
		txtRoute.setBounds(520, 310, 91, 20);
		frame.getContentPane().add(txtRoute);
	}
}
