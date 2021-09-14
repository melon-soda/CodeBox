package com.codebox.project.contribution;

import java.util.List;

import com.codebox.project.dto.ContributionVO;

public interface ContributionService {
	List<ContributionVO> getContributors(ContributionVO vo);
	
	void setContribution(ContributionVO vo);
}
