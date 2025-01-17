package model;

public class DichVu {
	private int id;
	private String tenDichVu;
	private String moTa;
	private double gia;
	public DichVu(int id, String tenDichVu, String moTa, double gia) {
		this.id = id;
		this.tenDichVu = tenDichVu;
		this.moTa = moTa;
		this.gia = gia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenDichVu() {
		return tenDichVu;
	}
	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	
	
}
