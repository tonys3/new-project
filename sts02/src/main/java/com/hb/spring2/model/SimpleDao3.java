package com.hb.spring2.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

public class SimpleDao3 implements daoImpl {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public SimpleDao3() {

	}

	@Override
 	public List<SimpleVo> selectAll() throws SQLException {
 		String sql="SELECT * FROM SIMPLE03 ORDER BY SABUN";
 		List<SimpleVo> list=null;
 		try{
 			conn=ds.getConnection();
 			pstmt=conn.prepareStatement(sql);
 			rs=pstmt.executeQuery();
 			list=new ArrayList<>();
 			while(rs.next()){
 				list.add(new SimpleVo(rs.getInt("sabun")
 						, rs.getString("name")
 						, rs.getDate("nalja")
 						, rs.getInt("pay")));
 			}
 		}finally {
 			closeAll();
 		}
 		return list;
 	}
 
 	@Override
 	public void insertOne(SimpleVo simpleVo) throws SQLException {
 		String sql="INSERT INTO SIMPLE03 VALUES (?,?,SYSDATE,?)";
 		try{
 			conn=ds.getConnection();
 			pstmt=conn.prepareStatement(sql);
 			pstmt.setInt(1, simpleVo.getSabun());
 			pstmt.setString(2, simpleVo.getName());
 			pstmt.setInt(3, simpleVo.getPay());
 			pstmt.executeUpdate();
 		}finally {
 			closeAll();
 		}
 	}
 
 	@Override
 	public SimpleVo selectOne(int sabun) throws SQLException {
 		String sql="SELECT * FROM SIMPLE03 WHERE SABUN=?";
 		try{
 			conn=ds.getConnection();
 			pstmt=conn.prepareStatement(sql);
 			pstmt.setInt(1, sabun);
 			rs=pstmt.executeQuery();
 			if(rs.next()){
 				return new SimpleVo(rs.getInt("sabun")
 						, rs.getString("name")
 						, rs.getDate("nalja")
 						, rs.getInt("pay")
 						);
 			}
 		}finally {
 			closeAll();
 		}
 		return null;
 	}
 
 	private void closeAll() throws SQLException {
 		if(rs!=null)rs.close();
 		if(pstmt!=null)pstmt.close();
 		if(conn!=null)conn.close();
 	}

	@Override
	public int updateOne(SimpleVo bean) throws SQLException {
		String sql="UPDATE SIMPLE03 SET NAME=? , PAY=? WHERE SABUN=?";
		try{
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getPay());
			pstmt.setInt(3, bean.getSabun());
			return pstmt.executeUpdate();
		}finally {
			closeAll();
		}
	}
 	
}
