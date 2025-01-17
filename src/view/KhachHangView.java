package view;

import model.KhachHang; 

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class KhachHangView extends JFrame {
	private JTextField txtTen, txtSoDienThoai, txtDiaChi, txtEmail;
	private JButton btnAdd, btnUpdate, btnDelete;
	private JTable table;
	private DefaultTableModel tableModel;
	
	public KhachHangView() {
		setTitle("Quản lý Khách Hàng");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// panel nhap tt kh
		JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));
		inputPanel.setBorder(BorderFactory.createTitledBorder("Thông Tin Khách Hàng"));
		
		
		inputPanel.add(new JLabel("Tên Khách Hàng:"));
		txtTen = new JTextField();
		inputPanel.add(txtTen);
		
		inputPanel.add(new JLabel("Số Điện Thoại:"));
		txtSoDienThoai = new JTextField();
		inputPanel.add(txtSoDienThoai);
		
		
		inputPanel.add(new JLabel("Địa Chỉ:"));
		txtDiaChi = new JTextField();
		inputPanel.add(txtDiaChi);
		
		inputPanel.add(new JLabel("Email:"));
		txtEmail = new JTextField();
		inputPanel.add(txtEmail);
		
		JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10));
		btnAdd = new JButton("Thêm");
		btnUpdate = new JButton("Cập Nhật");
		btnDelete = new JButton("Xóa");
		
		buttonPanel.add(btnAdd);
		buttonPanel.add(btnUpdate);
		buttonPanel.add(btnDelete);
		
		// bảng hiển thị thông tin khách hàng
		tableModel = new DefaultTableModel(new String[] {"ID", "Tên", "Số Điện Thoại", "Địa Chỉ", "Email"}, 0);
		table = new JTable(tableModel);
		JScrollPane tableScrollPane = new JScrollPane(table);
		
		// Layout chính
		setLayout(new BorderLayout());
		add(inputPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);
		add(tableScrollPane, BorderLayout.SOUTH);
	}
	
	// cac getter de lay thong tin tu giao dien
	public String getTenKhachHang() {
		return txtTen.getText();
	}
	public String getSoDienThoai() {
		return txtSoDienThoai.getText();
	}
	public String getDiaChi() {
		return txtDiaChi.getText();
	}
	public String getEmail() {
		return txtEmail.getText();
	}
	
	public int getSelectedRowId() {
		int selectedRow = table.getSelectedRow();
		if(selectedRow == -1) return -1;
		return (int) tableModel.getValueAt(selectedRow, 0);
	}
	
	public void setTableData(List<KhachHang> data) {
		tableModel.setRowCount(0);
		for (KhachHang kh : data) {
			tableModel.addRow(new Object[] {kh.getId(), kh.getTen(), kh.getSoDienThoai(), kh.getDiaChi(), kh.getEmail()});
		}
	}
	public void clearInputFields() {
		txtTen.setText("");
		txtSoDienThoai.setText("");
		txtDiaChi.setText("");
		txtEmail.setText("");
	}
	
	// phthuc them su kien
	public void addAddButtonListener(java.awt.event.ActionListener lis) {
		btnAdd.addActionListener(lis);
	}
	public void addUpdateButtonListener(java.awt.event.ActionListener lis) {
		btnAdd.addActionListener(lis);
	}
	public void addDeleteButtonListener(java.awt.event.ActionListener lis) {
		btnAdd.addActionListener(lis);
	}
	
}