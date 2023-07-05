package aisw.web.biz.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import aisw.web.util.ConnectionFactory;

public class BoardDAO {
	
	public List<BoardVO> getBoardList(){
		StringBuilder sql = new StringBuilder();
		List<BoardVO> boardList = new ArrayList<>();
		BoardVO board = null;
		sql.append("select * from b_posts order by post_no");
		try(Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				board = new BoardVO();
				board.setPostNo(rs.getInt("post_no"));
				board.setWriter(rs.getString("user_id"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getString("post_reg_date"));
				board.setTitle(rs.getString("post_title"));
				board.setPostPermission(rs.getInt("post_permission"));
				board.setHit(rs.getInt("post_hit"));
				
				boardList.add(board);
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return boardList;
	}

}
