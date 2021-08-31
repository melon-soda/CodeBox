package com.codebox.project.member;

import com.codebox.project.dto.MemberVO;

public interface MemberService {
	MemberVO getMember(String id);
	
	int attemptLogin(MemberVO vo);
	
	void insertMember(MemberVO vo);
}
