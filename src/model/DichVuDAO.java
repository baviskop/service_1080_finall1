package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class DichVuDAO {
	private Connection connection;
	
	public DichVuDAO() {
		try {
			connection = DatabaseConnection.getConnection();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	// them dv
	public boolean addDichVu(DichVu dichVu) {
		String sql = "INSERT INTO DichVu (TenDichVu, MoTa, Gia) VALUES (?, ?, ?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1,  dichVu.getTenDichVu());
			stmt.setString(2,  dichVu.getMoTa());
			stmt.setDouble(3, dichVu.getGia());
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	// lay danh sach
	public List<DichVu> getAllDichVu() {
		List<DichVu> list = new ArrayList<>();
		String sql = "SELECT * FROM DichVu";
		try (Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			while (rs.next()) {
				DichVu dv = new DichVu(
						rs.getInt("ID"),
						rs.getString("TenDichVu"),
						rs.getString("MoTa"),
						rs.getDouble("Gia")
				);
				list.add(dv);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	// cap nhat
	public boolean updateDichVu(DichVu dichVu) {
		String sql = "UPDATE DichVu SET TenDichVu = ?, MoTa = ?, Gia = ? WHERE ID = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1,  dichVu.getTenDichVu());
			stmt.setString(2,  dichVu.getMoTa());
			stmt.setDouble(3,  dichVu.getGia());
			stmt.setInt(4,  dichVu.getId());
			return stmt.executeUpdate() > 0;
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	// xoa
	public boolean deleteDichVu(int id) {
		String sql = "DELETE FROM DichVu WHERE ID = ?";
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
