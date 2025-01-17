package model;

import java.util.Date;

public class YeuCauDichVu {
	private int id;
	private int khachHangId;
	private int dichVuId;
	private int nhanVienId;
	private Date ngayYeuCau;
	private String trangThai;
	
	public YeuCauDichVu(int id, int khachHangId, int dichVuId, int nhanVienId, Date ngayYeuCau,
			String trangThai) {
		this.id = id;
		this.khachHangId = khachHangId;
		this.dichVuId = dichVuId;
		this.nhanVienId = nhanVienId;
		this.ngayYeuCau = ngayYeuCau;
		this.trangThai = trangThai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKhachHangId() {
		return khachHangId;
	}
	public void setKhachHangId(int khachHangId) {
		this.khachHangId = khachHangId;
	}
	public int getDichVuId() {
		return dichVuId;
	}
	public void setDichVuId(int dichVuId) {
		this.dichVuId = dichVuId;
	}
	public int getNhanVienId() {
		return nhanVienId;
	}
	public void setNhanVienId(int nhanVienId) {
		this.nhanVienId = nhanVienId;
	}
	public Date getNgayYeuCau() {
		return ngayYeuCau;
	}
	public void setNgayYeuCau(Date ngayYeuCau) {
		this.ngayYeuCau = ngayYeuCau;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
}
