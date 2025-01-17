package view;

import model.YeuCauDichVu;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class YeuCauDichVuView extends JFrame {
    private JComboBox<String> cbKhachHang, cbDichVu, cbNhanVien, cbTrangThai;
    private JTextField txtTimKiem;
    private JButton btnAdd, btnUpdateStatus, btnSearch;
    private JTable table;
    private DefaultTableModel tableModel;

    public YeuCauDichVuView() {
        setTitle("Quản Lý Yêu Cầu Dịch Vụ");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel nhập thông tin yêu cầu
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Thông Tin Yêu Cầu"));

        inputPanel.add(new JLabel("Khách Hàng:"));
        cbKhachHang = new JComboBox<>();
        inputPanel.add(cbKhachHang);

        inputPanel.add(new JLabel("Dịch Vụ:"));
        cbDichVu = new JComboBox<>();
        inputPanel.add(cbDichVu);

        inputPanel.add(new JLabel("Nhân Viên:"));
        cbNhanVien = new JComboBox<>();
        inputPanel.add(cbNhanVien);

        inputPanel.add(new JLabel("Trạng Thái:"));
        cbTrangThai = new JComboBox<>(new String[]{"Đang xử lý", "Hoàn thành", "Bị hủy"});
        inputPanel.add(cbTrangThai);

        // Các nút chức năng
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        btnAdd = new JButton("Thêm Yêu Cầu");
        btnUpdateStatus = new JButton("Cập Nhật Trạng Thái");
        btnSearch = new JButton("Tìm Kiếm");
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnUpdateStatus);
        buttonPanel.add(btnSearch);

        // Bảng hiển thị danh sách yêu cầu dịch vụ
        tableModel = new DefaultTableModel(new String[]{"ID", "Khách Hàng", "Dịch Vụ", "Nhân Viên", "Ngày Yêu Cầu", "Trạng Thái"}, 0);
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Tìm kiếm
        JPanel searchPanel = new JPanel(new BorderLayout());
        txtTimKiem = new JTextField();
        searchPanel.add(new JLabel("Tìm Kiếm: "), BorderLayout.WEST);
        searchPanel.add(txtTimKiem, BorderLayout.CENTER);

        // Layout chính
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(tableScrollPane, BorderLayout.SOUTH);
        add(searchPanel, BorderLayout.PAGE_END);
    }

    // Phương thức để thêm dữ liệu vào combo box
    public void setKhachHangOptions(List<String> khachHang) {
        cbKhachHang.removeAllItems();
        for (String kh : khachHang) {
            cbKhachHang.addItem(kh);
        }
    }

    public void setDichVuOptions(List<String> dichVu) {
        cbDichVu.removeAllItems();
        for (String dv : dichVu) {
            cbDichVu.addItem(dv);
        }
    }

    public void setNhanVienOptions(List<String> nhanVien) {
        cbNhanVien.removeAllItems();
        for (String nv : nhanVien) {
            cbNhanVien.addItem(nv);
        }
    }

    // Getter các thông tin từ giao diện
    public String getSelectedKhachHang() {
        return (String) cbKhachHang.getSelectedItem();
    }

    public String getSelectedDichVu() {
        return (String) cbDichVu.getSelectedItem();
    }

    public String getSelectedNhanVien() {
        return (String) cbNhanVien.getSelectedItem();
    }

    public String getSelectedTrangThai() {
        return (String) cbTrangThai.getSelectedItem();
    }

    public String getTimKiemText() {
        return txtTimKiem.getText();
    }

    public int getSelectedRowId() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) return -1;
        return (int) tableModel.getValueAt(selectedRow, 0);
    }

    public void setTableData(List<YeuCauDichVu> data) {
        tableModel.setRowCount(0); // Xóa dữ liệu cũ
        for (YeuCauDichVu yc : data) {
            tableModel.addRow(new Object[]{yc.getId(), yc.getKhachHangId(), yc.getDichVuId(), yc.getNhanVienId(), yc.getNgayYeuCau(), yc.getTrangThai()});
        }
    }

    public void addAddButtonListener(java.awt.event.ActionListener listener) {
        btnAdd.addActionListener(listener);
    }

    public void addUpdateStatusButtonListener(java.awt.event.ActionListener listener) {
        btnUpdateStatus.addActionListener(listener);
    }

    public void addSearchButtonListener(java.awt.event.ActionListener listener) {
        btnSearch.addActionListener(listener);
    }
}
