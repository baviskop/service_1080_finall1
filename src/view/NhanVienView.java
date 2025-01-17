package view;

import model.NhanVien;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class NhanVienView extends JFrame {
    private JTextField txtTen, txtSoDienThoai, txtViTri;
    private JButton btnAdd, btnUpdate, btnDelete, btnShowAll, btnAssignTask;
    private JTable table;
    private DefaultTableModel tableModel;

    public NhanVienView() {
        setTitle("Quản Lý Nhân Viên");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel nhập thông tin nhân viên
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Thông Tin Nhân Viên"));

        inputPanel.add(new JLabel("Tên Nhân Viên:"));
        txtTen = new JTextField();
        inputPanel.add(txtTen);

        inputPanel.add(new JLabel("Số Điện Thoại:"));
        txtSoDienThoai = new JTextField();
        inputPanel.add(txtSoDienThoai);

        inputPanel.add(new JLabel("Vị Trí:"));
        txtViTri = new JTextField();
        inputPanel.add(txtViTri);

        // Các nút chức năng
        JPanel buttonPanel = new JPanel(new GridLayout(1, 5, 10, 10));
        btnAdd = new JButton("Thêm");
        btnUpdate = new JButton("Cập Nhật");
        btnDelete = new JButton("Xóa");
        btnShowAll = new JButton("Hiển Thị DS");
        btnAssignTask = new JButton("Phân Công");
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnShowAll);
        buttonPanel.add(btnAssignTask);

        // Bảng hiển thị thông tin nhân viên
        tableModel = new DefaultTableModel(new String[]{"ID", "Tên", "Số Điện Thoại", "Vị Trí"}, 0);
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Layout chính
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(tableScrollPane, BorderLayout.SOUTH);
    }

    // Các getter để lấy thông tin từ giao diện
    public String getTenNhanVien() {
        return txtTen.getText();
    }

    public String getSoDienThoai() {
        return txtSoDienThoai.getText();
    }

    public String getViTri() {
        return txtViTri.getText();
    }

    public int getSelectedRowId() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) return -1;
        return (int) tableModel.getValueAt(selectedRow, 0);
    }

    public void setTableData(List<NhanVien> data) {
        tableModel.setRowCount(0); // Xóa dữ liệu cũ
        for (NhanVien nv : data) {
            tableModel.addRow(new Object[]{nv.getId(), nv.getTen(), nv.getSoDienThoai(), nv.getViTri()});
        }
    }

    public void clearInputFields() {
        txtTen.setText("");
        txtSoDienThoai.setText("");
        txtViTri.setText("");
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

    public void addAssignTaskButtonListener(java.awt.event.ActionListener listener) {
        btnAssignTask.addActionListener(listener);
    }
}
