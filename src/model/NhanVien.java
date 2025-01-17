package model;

public class NhanVien {
	private int id;
	private String ten;
	private String soDienThoai;
	private String viTri;
	public NhanVien(int id, String ten, String soDienThoai, String viTri) {
		this.id = id;
		this.ten = ten;
		this.soDienThoai = soDienThoai;
		this.viTri = viTri;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	
	
}
