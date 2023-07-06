package aisw.web.biz.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

@Service
public class BoardDAO {
	
	@Autowired
	private DataSource datasource;
	

	
	public List<BoardVO> getBoardList(){
		StringBuilder sql = new StringBuilder();
		sql.append("select * from posts order by post_no");
		
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(datasource);
		List<BoardVO> boardList = template.query(sql.toString(), new BeanPropertyRowMapper(BoardVO.class));
		
//		try(Connection conn = datasource.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				board = new BoardVO();
//				board.setPostNo(rs.getInt("post_no"));
//				board.setWriter(rs.getString("user_id"));
//				board.setContent(rs.getString("content"));
//				board.setRegDate(rs.getString("post_reg_date"));
//				board.setTitle(rs.getString("post_title"));
//				board.setPostPermission(rs.getInt("post_permission"));
//				board.setHit(rs.getInt("post_hit"));
//				
//				boardList.add(board);
//				
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		return boardList;
	}
	
	public BoardVO getPost(Integer postNo) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from posts where post_no = ?");
		
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(datasource);
		BoardVO board = template.queryForObject(sql.toString(), new BeanPropertyRowMapper<>(BoardVO.class), postNo);
		
		return board;
	}
	
	public BoardVO posting(BoardVO board) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into posts(post_no, user_id, content, post_title, post_permission, post_hit) ");
		sql.append(" values(postNo.nextval, ?, ?, ?, ?, 0)");
		
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(datasource);
		template.update(sql.toString(), board.getUserId(), board.getContent(), board.getPostTitle(), board.getPostPermission());
		
		
		
		return board;
	}
	
	

}
