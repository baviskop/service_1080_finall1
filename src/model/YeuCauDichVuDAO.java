package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class YeuCauDichVuDAO {
	private Connection connection;
	
	public YeuCauDichVuDAO() {
		try {
			connection = DatabaseConnection.getConnection();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	// them ycdv
	public boolean addYeuCauDichVu(YeuCauDichVu yeuCau) {
		String sql = "INSERT INTO YeuCauDichVu (KhachHangID, DichVuID, NhanVienID, NgayYeuCau, TrangThai) VALUES (?, ?, ?, ?, ?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setInt(1,  yeuCau.getKhachHangId());
			stmt.setInt(2,  yeuCau.getDichVuId());
			stmt.setInt(3,  yeuCau.getNhanVienId());
			stmt.setDate(4, new java.sql.Date(yeuCau.getNgayYeuCau().getTime()));
			stmt.setString(5,  yeuCau.getTrangThai());
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	// lay 
	public List<YeuCauDichVu> getAllYeuCauDichVu() {
		List<YeuCauDichVu> list = new ArrayList<>();
		String sql = "SELECT * FROM YeuCauDichVu";
		try (Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			while (rs.next()) {
				YeuCauDichVu yc = new YeuCauDichVu(
						rs.getInt("ID"),
						rs.getInt("KhachHangID"),
						rs.getInt("DichVuID"),
						rs.getInt("NhanVienID"),
						rs.getDate("NgayYeuCau"),
						rs.getString("TrangThai")
				);
				list.add(yc);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	// cap nhat
	public boolean updateYeuCauDichVu(YeuCauDichVu yeuCau) {
		String sql = "UPDATE YeuCauDichVu SET KhachHangID = ?, DichVuID = ?, NhanVienID = ?, NgayYeuCau = ?, TrangThai = ?, WHERE ID = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setInt(1,  yeuCau.getKhachHangId());
			stmt.setInt(2,  yeuCau.getDichVuId());
			stmt.setInt(3, yeuCau.getNhanVienId());
			stmt.setDate(4,  new java.sql.Date(yeuCau.getNgayYeuCau().getTime()));
			stmt.setString(5, yeuCau.getTrangThai());
			stmt.setInt(6,  yeuCau.getId());
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	// xoa
	public boolean deleteYeuCauDichVu(int id) {
		String sql = "DELETE FROM YeuCauDichVu WHERE ID = ?";
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
