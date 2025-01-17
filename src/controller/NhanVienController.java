package controller;

import model.NhanVien;
import model.NhanVienDAO;
import view.NhanVienView;

import javax.swing.*;
import java.util.List;

public class NhanVienController {
    private NhanVienView view;
    private NhanVienDAO dao;

    public NhanVienController(NhanVienView view) {
        this.view = view;
        this.dao = new NhanVienDAO();

        // Thêm sự kiện cho các nút
        view.addAddButtonListener(e -> addNhanVien());
        view.addUpdateButtonListener(e -> updateNhanVien());
        view.addDeleteButtonListener(e -> deleteNhanVien());
        view.addShowAllButtonListener(e -> loadNhanVienData());
        view.addAssignTaskButtonListener(e -> assignTask());

        // Tải dữ liệu ban đầu vào bảng
        loadNhanVienData();
    }

    private void loadNhanVienData() {
        List<NhanVien> data = dao.getAllNhanVien();
        view.setTableData(data);
    }

    private void addNhanVien() {
        String ten = view.getTenNhanVien();
        String soDienThoai = view.getSoDienThoai();
        String viTri = view.getViTri();

        if (ten.isEmpty() || soDienThoai.isEmpty() || viTri.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        if (dao.addNhanVien(new NhanVien(0, ten, soDienThoai, viTri))) {
            JOptionPane.showMessageDialog(view, "Thêm nhân viên thành công!");
            loadNhanVienData(); // Làm mới bảng
            view.clearInputFields();
        } else {
            JOptionPane.showMessageDialog(view, "Thêm nhân viên thất bại!");
        }
    }

    private void updateNhanVien() {
        int id = view.getSelectedRowId();
        if (id == -1) {
            JOptionPane.showMessageDialog(view, "Vui lòng chọn nhân viên để cập nhật!");
            return;
        }

        String ten = view.getTenNhanVien();
        String soDienThoai = view.getSoDienThoai();
        String viTri = view.getViTri();

        if (ten.isEmpty() || soDienThoai.isEmpty() || viTri.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        if (dao.updateNhanVien(new NhanVien(id, ten, soDienThoai, viTri))) {
            JOptionPane.showMessageDialog(view, "Cập nhật nhân viên thành công!");
            loadNhanVienData(); // Làm mới bảng
            view.clearInputFields();
        } else {
            JOptionPane.showMessageDialog(view, "Cập nhật nhân viên thất bại!");
        }
    }

    private void deleteNhanVien() {
        int id = view.getSelectedRowId();
        if (id == -1) {
            JOptionPane.showMessageDialog(view, "Vui lòng chọn nhân viên để xóa!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(view, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (dao.deleteNhanVien(id)) {
                JOptionPane.showMessageDialog(view, "Xóa nhân viên thành công!");
                loadNhanVienData(); // Làm mới bảng
                view.clearInputFields();
            } else {
                JOptionPane.showMessageDialog(view, "Xóa nhân viên thất bại!");
            }
        }
    }

    private void assignTask() {
        int id = view.getSelectedRowId();
        if (id == -1) {
            JOptionPane.showMessageDialog(view, "Vui lòng chọn nhân viên để phân công công việc!");
            return;
        }

        String task = JOptionPane.showInputDialog(view, "Nhập công việc cần phân công:");
        if (task != null && !task.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Đã phân công công việc: " + task + " cho nhân viên ID " + id);
        } else {
            JOptionPane.showMessageDialog(view, "Phân công công việc thất bại!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NhanVienView view = new NhanVienView();
            new NhanVienController(view);
            view.setVisible(true);
        });
    }
}
