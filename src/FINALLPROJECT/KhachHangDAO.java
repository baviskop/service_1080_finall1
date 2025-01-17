package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO {
	private Connection connection;
	
	public KhachHangDAO() {
		try {
			connection = DatabaseConnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean addKhachHang(KhachHang khachHang) {
		String sql = "INSERT INTO KhachHang (Ten, SoDienThoai, DiaChi, Email) VALUES (?, ?, ?, ?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1, khachHang.getTen());
			stmt.setString(2,  khachHang.getSoDienThoai());
			stmt.setString(3,  khachHang.getDiaChi());
			stmt.setString(4, khachHang.getEmail());
			return stmt.executeUpdate() > 0;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	// laay danh sach
	public List<KhachHang> getAllKhachHang() {
		List<KhachHang> list = new ArrayList<>();
		String sql = "SELECT * FROM KhachHang";
		try (Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				KhachHang kh = new KhachHang(
						rs.getInt("ID"),
						rs.getString("Ten"),
						rs.getString("SoDienThoai"),
						rs.getString("DiaChi"),
						rs.getString("Email")
				);
				list.add(kh);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// cap nhat
	public boolean updateKhachHang(KhachHang khachHang) {
		String sql = "UPDATE KhachHang SET Ten = ?, SoDienThoai = ?, DiaChi = ?, Email = ?, WHERE ID = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1,  khachHang.getTen());
			stmt.setString(2,  khachHang.getSoDienThoai());
			stmt.setString(3,  khachHang.getDiaChi());
			stmt.setString(4,  khachHang.getEmail());
			stmt.setInt(5,  khachHang.getId());
			return stmt.executeUpdate() > 0;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	//xoa
	public boolean deleteKhachHang(int id) {
		String sql = "DELETE FROM KhachHang WHERE ID = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setInt(1, id);
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
