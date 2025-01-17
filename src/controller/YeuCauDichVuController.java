/*package controller;

import model.YeuCauDichVu;
import model.YeuCauDichVuDAO;
import view.YeuCauDichVuView;

import javax.swing.*;
import java.util.List;

public class YeuCauDichVuController {
    private YeuCauDichVuView view;
    private YeuCauDichVuDAO dao;

    public YeuCauDichVuController(YeuCauDichVuView view) {
        this.view = view;
        this.dao = new YeuCauDichVuDAO();

        // Thêm sự kiện cho các nút
        view.addAddButtonListener(e -> addYeuCau());
        view.addUpdateStatusButtonListener(e -> updateTrangThai());
        view.addSearchButtonListener(e -> searchYeuCau());

        // Tải dữ liệu ban đầu vào bảng
        loadYeuCauData();
        loadComboBoxData();
    }

    private void loadComboBoxData() {
        view.setKhachHangOptions(dao.getKhachHangList());
        view.setDichVuOptions(dao.getDichVuList());
        view.setNhanVienOptions(dao.getNhanVienList());
    }

    private void loadYeuCauData() {
        List<YeuCauDichVu> data = dao.getAllYeuCau();
        view.setTableData(data);
    }

    private void addYeuCau() {
        String khachHang = view.getSelectedKhachHang();
        String dichVu = view.getSelectedDichVu();
        String nhanVien = view.getSelectedNhanVien();
        String trangThai = view.getSelectedTrangThai();

        if (khachHang == null || dichVu == null || nhanVien == null) {
            JOptionPane.showMessageDialog(view, "Vui lòng chọn đầy đủ thông tin!");
            return;
        }

        if (dao.addYeuCau(new YeuCauDichVu(0, khachHang, dichVu, nhanVien, trangThai))) {
            JOptionPane.showMessageDialog(view, "Thêm yêu cầu thành công!");
            loadYeuCauData();
        } else {
            JOptionPane.showMessageDialog(view, "Thêm yêu cầu thất bại!");
        }
    }

    private void updateTrangThai() {
        int id = view.getSelectedRowId();
        if (id == -1) {
            JOptionPane.showMessageDialog(view, "Vui lòng chọn yêu cầu để cập nhật!");
            return;
        }

        String trangThai = view.getSelectedTrangThai();
        if (dao.updateTrangThai(id, trangThai)) {
            JOptionPane.showMessageDialog(view, "Cập nhật trạng thái thành công!");
            loadYeuCauData();
        } else {
            JOptionPane.showMessageDialog(view, "Cập nhật trạng thái thất bại!");
        }
    }

    private void searchYeuCau() {
        String keyword = view.getTimKiemText();
        List<YeuCauDichVu> data = dao.searchYeuCau(keyword);
        view.setTableData(data);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            YeuCauDichVuView view = new YeuCauDichVuView();
            new YeuCauDichVuController(view);
            view.setVisible(true);
        });
    }
}
*/