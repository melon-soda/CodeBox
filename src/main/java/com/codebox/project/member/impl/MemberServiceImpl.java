package com.codebox.project.member.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebox.project.dao.MemberDAO;
import com.codebox.project.dto.MemberVO;
import com.codebox.project.member.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDao;
	
	@Override
	public MemberVO getMember(String id) {
		return memberDao.getMember(id);
	}

	@Override
	public int attemptLogin(MemberVO vo) {
		return memberDao.attemptLogin(vo);
	}

	@Override
	public void insertMember(MemberVO vo) {
		memberDao.insertMember(vo);
	}

	@Override
	public void updateMember(MemberVO vo) {
		memberDao.updateMember(vo);
	}

	@Override
	public void deleteMember(MemberVO vo) {
		memberDao.deleteMember(vo);
	}
}
