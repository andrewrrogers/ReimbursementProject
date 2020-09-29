package com.company.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.company.project.Reimbursement;
import com.example.config.ConnectionUtil;

public class ReimbursementDao implements DaoContract< Reimbursement, Integer> {

	@Override
	public List<Reimbursement> findall() {
		List<Reimbursement> list = new LinkedList<Reimbursement>();
		try {
			Connection conn = ConnectionUtil.getInstance().getConnection();
			String sql = "select * from reimbursement";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Reimbursement(rs.getInt("reimbid"),rs.getString("username"),rs.getString("reimtype")
						,rs.getString("submitted"),rs.getString("resolved"),rs.getString("description")
						,rs.getString("status"),rs.getDouble("amount")));
			}
			conn.close();
			rs.close();
			ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Reimbursement findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Reimbursement t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Reimbursement insert(Reimbursement t) {
		// TODO Auto-generated method stub
		return null;
	}

}
