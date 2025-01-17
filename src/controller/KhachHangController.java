package controller;

import model.KhachHang; 
import model.KhachHangDAO;
import view.KhachHangView;

import javax.swing.*;
import java.util.List;



public class KhachHangController {
	private KhachHangView view;
	private KhachHangDAO dao;
	
	public KhachHangController(KhachHangView view) {
		this.view = view;
		this.dao = new KhachHangDAO();
		
		// them su kien cho nut
		view.addAddButtonListener(e -> addKhachHang());
		view.addUpdateButtonListener(e -> updateKhachHang());
		view.addDeleteButtonListener(e -> deleteKhachHang());
		
		// tai du lieu ban dau vao bang
		loadKhachHangData();
	}
	private void loadKhachHangData() {
		List<KhachHang> data = dao.getAllKhachHang();
		view.setTableData(data);
	}
	
	private void addKhachHang() {
		String ten = view.getTenKhachHang();
		String soDienThoai = view.getSoDienThoai();
		String diaChi = view.getDiaChi();
		String email = view.getEmail();
		
		if(ten.isEmpty() || soDienThoai.isEmpty() || diaChi.isEmpty() || email.isEmpty()) {
			JOptionPane.showMessageDialog(view, "Vui lòng nhập đầy đủ thông tin!");
			return;
		}
		
		if (dao.addKhachHang(new KhachHang(0, ten, soDienThoai, diaChi, email))) {
			JOptionPane.showMessageDialog(view, "Thêm khách hàng thành công!");
			loadKhachHangData();
			view.clearInputFields();
		} else {
			JOptionPane.showMessageDialog(view, "Thêm khách hàng thất bại!");
		}
	}
	
	private void updateKhachHang() {
		int id = view.getSelectedRowId();
		if (id == -1) {
			JOptionPane.showMessageDialog(view, "Vui lòng chọn khách hàng để cập nhật!");
			return;
		}
		
		String ten = view.getTenKhachHang();
		String soDienThoai = view.getSoDienThoai();
		String diaChi = view.getDiaChi();
		String email = view.getEmail();
		
		if (ten.isEmpty() || soDienThoai.isEmpty() || diaChi.isEmpty() || email.isEmpty()) {
			JOptionPane.showMessageDialog(view, "Vui lòng nhập đầy đủ thông tin!");
			return;
		}
		
		if (dao.updateKhachHang(new KhachHang(id, ten, soDienThoai, diaChi, email))) {
			JOptionPane.showMessageDialog(view, "Cập nhật khách hàng thành công!");
			loadKhachHangData();
			view.clearInputFields();
			
		} else {
			JOptionPane.showMessageDialog(view, "Cập nhật khách hàng thất bại!");
		}
	}
	private void deleteKhachHang() {
		int id = view.getSelectedRowId();
		if (id == -1) {
			JOptionPane.showMessageDialog(view, "Vui lòng chọn khách hàng để xóa!");
			return;
		}
		
		int confirm = JOptionPane.showConfirmDialog(view, "Bạn có chắc muốn xóa khách hàng này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			if(dao.deleteKhachHang(id)) {
				JOptionPane.showMessageDialog(view, "Xóa khách hàng thành công!");
				loadKhachHangData();
				view.clearInputFields();
			} else {
				JOptionPane.showMessageDialog(view, "Xóa khách hàng thất bại!");
			}
		}
	}
	
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			KhachHangView view = new KhachHangView();
			new KhachHangController(view);
			view.setVisible(true);
		});
	}
	*/
	
}