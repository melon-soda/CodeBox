package com.codebox.project.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codebox.project.dto.MemberVO;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	public MemberVO getMember(String id) {
		return mybatis.selectOne("MemberDAO.getMember", id);
	}
	
	public int attemptLogin(MemberVO vo) {
		int result = -1;
		String pwd = null;
		
		pwd = (String)mybatis.selectOne("MemberDAO.getPassById", vo.getId());
		
		if(pwd == null)
			result = -1; //ID 없음
		else if(pwd.equals(vo.getPwd()))
			result = 1; //ID PW 일치
		else
			result = 0; //ID PW 불일치
		
		return result;
	}
	
	public void insertMember(MemberVO vo) {
		mybatis.insert("MemberDAO.insertMember", vo);
	}
	
	public void updateMember(MemberVO vo) {
		mybatis.update("MemberDAO.updateMember", vo);
	}
	
	public void deleteMember(MemberVO vo) {
		mybatis.delete("MemberDAO.deleteMember", vo);
	}
}
