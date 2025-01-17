package view;

import model.DichVu;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class DichVuView extends JFrame {
    private JTextField txtTenDichVu, txtMoTa, txtGia;
    private JButton btnAdd, btnUpdate, btnDelete, btnShowAll;
    private JTable table;
    private DefaultTableModel tableModel;

    public DichVuView() {
        setTitle("Quản Lý Dịch Vụ");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel nhập thông tin dịch vụ
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Thông Tin Dịch Vụ"));

        inputPanel.add(new JLabel("Tên Dịch Vụ:"));
        txtTenDichVu = new JTextField();
        inputPanel.add(txtTenDichVu);

        inputPanel.add(new JLabel("Mô Tả:"));
        txtMoTa = new JTextField();
        inputPanel.add(txtMoTa);

        inputPanel.add(new JLabel("Giá:"));
        txtGia = new JTextField();
        inputPanel.add(txtGia);

        // Các nút chức năng
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        btnAdd = new JButton("Thêm");
        btnUpdate = new JButton("Cập Nhật");
        btnDelete = new JButton("Xóa");
        btnShowAll = new JButton("Hiển Thị DS");
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnShowAll);

        // Bảng hiển thị thông tin dịch vụ
        tableModel = new DefaultTableModel(new String[]{"ID", "Tên Dịch Vụ", "Mô Tả", "Giá"}, 0);
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Layout chính
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(tableScrollPane, BorderLayout.SOUTH);
    }

    // Các getter để lấy thông tin từ giao diện
    public String getTenDichVu() {
        return txtTenDichVu.getText();
    }

    public String getMoTa() {
        return txtMoTa.getText();
    }

    public String getGia() {
        return txtGia.getText();
    }

    public int getSelectedRowId() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) return -1;
        return (int) tableModel.getValueAt(selectedRow, 0);
    }

    public void setTableData(List<DichVu> data) {
        tableModel.setRowCount(0); // Xóa dữ liệu cũ
        for (DichVu dv : data) {
            tableModel.addRow(new Object[]{dv.getId(), dv.getTenDichVu(), dv.getMoTa(), dv.getGia()});
        }
    }

    public void clearInputFields() {
        txtTenDichVu.setText("");
        txtMoTa.setText("");
        txtGia.setText("");
    }

    // Các phương thức để thêm sự kiện cho nút
    public void addAddButtonListener(java.awt.event.ActionListener listener) {
        btnAdd.addActionListener(listener);
    }

    public void addUpdateButtonListener(java.awt.event.ActionListener listener) {
        btnUpdate.addActionListener(listener);
    }

    public void addDeleteButtonListener(java.awt.event.ActionListener listener) {
        btnDelete.addActionListener(listener);
    }

    public void addShowAllButtonListener(java.awt.event.ActionListener listener) {
        btnShowAll.addActionListener(listener);
    }
}
