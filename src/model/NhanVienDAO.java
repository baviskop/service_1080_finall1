package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class NhanVienDAO {
	private Connection connection;
	
	public NhanVienDAO() {
		try {
			connection = DatabaseConnection.getConnection();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	// them nv
	public boolean addNhanVien(NhanVien nhanVien) {
		String sql = "INSERT INTO NhanVien (Ten, SoDienThoai, ViTri) VALUES (?, ?, ?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1,  nhanVien.getTen());
			stmt.setString(2, nhanVien.getSoDienThoai());
			stmt.setString(3,  nhanVien.getViTri());
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	// lay danh sach nv
	public List<NhanVien> getAllNhanVien() {
		List<NhanVien> list = new ArrayList<>();
		String sql = "SELECT * FROM NhanVien";
		try (Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			while (rs.next()) {
				NhanVien nv = new NhanVien(
						rs.getInt("ID"),
						rs.getString("Ten"),
						rs.getString("SoDienThoai"),
						rs.getString("ViTri")
				);
				list.add(nv);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	//capnhat
	public boolean updateNhanVien(NhanVien nhanVien) {
		String sql = "UPDATE NhanVien SET Ten = ?, SoDienThoai = ?, ViTri = ? WHERE ID = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1, nhanVien.getTen());
			stmt.setString(2,  nhanVien.getSoDienThoai());
			stmt.setString(3,  nhanVien.getViTri());
			stmt.setInt(4,  nhanVien.getId());
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	// xoa
	public boolean deleteNhanVien(int id) {
		String sql = "DELETE FROM NhanVien WHERE ID = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setInt(1,  id);
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
