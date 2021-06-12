package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeSkillService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeSkillDao;
import kodlamaio.hrms.entities.concretes.ResumeSkill;

@Service
public class ResumeSkillManager implements ResumeSkillService{

private ResumeSkillDao resumeSkillDao;
	
	@Autowired
	public ResumeSkillManager(ResumeSkillDao resumeSkillDao) {
		super();
		this.resumeSkillDao = resumeSkillDao;
	}
	
	
	@Override
	public Result add(ResumeSkill resumeSkill) {
		this.resumeSkillDao.save(resumeSkill);
		return new SuccessResult("Skill is added");
	}

	@Override
	public Result update(ResumeSkill resumeSkill) {
		this.resumeSkillDao.save(resumeSkill);
		return new SuccessResult("Skill is updated");
	}

	@Override
	public Result delete(int id) {
		this.resumeSkillDao.deleteById(id);
		return new SuccessResult("Skill is deleted");
	}

	@Override
	public DataResult<ResumeSkill> getById(int id) {
		return new SuccessDataResult<ResumeSkill>
		(this.resumeSkillDao.getById(id));
	}

	@Override
	public DataResult<List<ResumeSkill>> getAll() {
		return new SuccessDataResult<List<ResumeSkill>>
		(this.resumeSkillDao.findAll());
	}

	@Override
	public DataResult<List<ResumeSkill>> getAllByJobseeker_UserId(int id) {
		return new SuccessDataResult<List<ResumeSkill>>
		(this.resumeSkillDao.getAllByJobseeker_UserId(id));
	}

}
