package com.codebox.project.contribution.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebox.project.contribution.ContributionService;
import com.codebox.project.dao.ContributionDAO;
import com.codebox.project.dto.ContributionVO;

@Service("contributionService")
public class ContributionServiceImpl implements ContributionService {
	@Autowired
	private ContributionDAO contributionDao;

	@Override
	public List<ContributionVO> getContributors(ContributionVO vo) {
		return contributionDao.getContributors(vo);
	}

	@Override
	public void setContribution(ContributionVO vo) {
		contributionDao.setContribution(vo);
	}
}
