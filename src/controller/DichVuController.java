package controller;

import model.DichVu;
import model.DichVuDAO;
import view.DichVuView;

import javax.swing.*;
import java.util.List;

public class DichVuController {
    private DichVuView view;
    private DichVuDAO dao;

    public DichVuController(DichVuView view) {
        this.view = view;
        this.dao = new DichVuDAO();

        // Thêm sự kiện cho các nút
        view.addAddButtonListener(e -> addDichVu());
        view.addUpdateButtonListener(e -> updateDichVu());
        view.addDeleteButtonListener(e -> deleteDichVu());
        view.addShowAllButtonListener(e -> loadDichVuData());

        // Tải dữ liệu ban đầu vào bảng
        loadDichVuData();
    }

    private void loadDichVuData() {
        List<DichVu> data = dao.getAllDichVu();
        view.setTableData(data);
    }

    private void addDichVu() {
        String ten = view.getTenDichVu();
        String moTa = view.getMoTa();
        String giaStr = view.getGia();

        if (ten.isEmpty() || moTa.isEmpty() || giaStr.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        try {
            double gia = Double.parseDouble(giaStr);
            if (dao.addDichVu(new DichVu(0, ten, moTa, gia))) {
                JOptionPane.showMessageDialog(view, "Thêm dịch vụ thành công!");
                loadDichVuData();
                view.clearInputFields();
            } else {
                JOptionPane.showMessageDialog(view, "Thêm dịch vụ thất bại!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Giá phải là số hợp lệ!");
        }
    }

    private void updateDichVu() {
        int id = view.getSelectedRowId();
        if (id == -1) {
            JOptionPane.showMessageDialog(view, "Vui lòng chọn dịch vụ để cập nhật!");
            return;
        }

        String ten = view.getTenDichVu();
        String moTa = view.getMoTa();
        String giaStr = view.getGia();

        if (ten.isEmpty() || moTa.isEmpty() || giaStr.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        try {
            double gia = Double.parseDouble(giaStr);
            if (dao.updateDichVu(new DichVu(id, ten, moTa, gia))) {
                JOptionPane.showMessageDialog(view, "Cập nhật dịch vụ thành công!");
                loadDichVuData();
                view.clearInputFields();
            } else {
                JOptionPane.showMessageDialog(view, "Cập nhật dịch vụ thất bại!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Giá phải là số hợp lệ!");
        }
    }

    private void deleteDichVu() {
        int id = view.getSelectedRowId();
        if (id == -1) {
            JOptionPane.showMessageDialog(view, "Vui lòng chọn dịch vụ để xóa!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(view, "Bạn có chắc chắn muốn xóa dịch vụ này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (dao.deleteDichVu(id)) {
                JOptionPane.showMessageDialog(view, "Xóa dịch vụ thành công!");
                loadDichVuData();
                view.clearInputFields();
            } else {
                JOptionPane.showMessageDialog(view, "Xóa dịch vụ thất bại!");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DichVuView view = new DichVuView();
            new DichVuController(view);
            view.setVisible(true);
        });
    }
}
