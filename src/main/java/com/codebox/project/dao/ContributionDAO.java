package com.codebox.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codebox.project.dto.ContributionVO;

@Repository
public class ContributionDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<ContributionVO> getContributors(ContributionVO vo) {
		return mybatis.selectList("ContributionDAO.getContributors", vo);
	}
	
	public void setContribution(ContributionVO vo) {
		mybatis.insert("ContributionDAO.setContribution", vo);
	}
}
