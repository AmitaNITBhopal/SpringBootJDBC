package com.example.SpringBootJDBC.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.SpringBootJDBC.model.BookDtls;

public class BookDtlsMapper implements RowMapper<BookDtls> {

	@Override
	public BookDtls mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookDtls bookDtls = new BookDtls();
		bookDtls.setId(rs.getInt("id"));
		bookDtls.setPublishDate(rs.getDate("publishdate"));
		bookDtls.setStatus(rs.getBoolean("status"));
		bookDtls.setTitle(rs.getNString("title"));
		
		return bookDtls;
	}

}
