package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ResumeImageService;
import kodlamaio.hrms.core.utlities.results.DataResult;
import kodlamaio.hrms.core.utlities.results.Result;
import kodlamaio.hrms.core.utlities.results.SuccessDataResult;
import kodlamaio.hrms.core.utlities.results.SuccessResult;
import kodlamaio.hrms.core.utlities.results.cloudOperations.CloudService;
import kodlamaio.hrms.dataAccess.abstracts.ResumeImageDao;
import kodlamaio.hrms.entities.concretes.ResumeImage;

@Service
public class ResumeImageManager implements ResumeImageService{

	private ResumeImageDao resumeImageDao;
	private CloudService cloudService;
	
	@Autowired
	public ResumeImageManager(ResumeImageDao resumeImageDao,CloudService cloudService) {
		super();
		this.resumeImageDao = resumeImageDao;
		this.cloudService = cloudService;
	}	
	
	@Override
	public Result add(ResumeImage resumeImage, MultipartFile imageFile) {
		@SuppressWarnings("unchecked")
		Map<String,String> uploadImage = (Map<String, String>) this.cloudService.save(imageFile).getData();
		resumeImage.setUrlAddress(uploadImage.get("url"));
		this.resumeImageDao.save(resumeImage);
		return new SuccessResult("Photo is added");
	}

	@Override
	public Result update(ResumeImage resumeImage) {
		this.resumeImageDao.save(resumeImage);
		return new SuccessResult("Photo is updated");
	}

	@Override
	public Result delete(int id) {
		this.resumeImageDao.deleteById(id);
		return new SuccessResult("Photo is deleted");
	}

	@Override
	public DataResult<ResumeImage> getById(int id) {
		return new SuccessDataResult<ResumeImage>
		(this.resumeImageDao.getById(id),"Photos are listed by id");
	}

	@Override
	public DataResult<List<ResumeImage>> getAll() {
		return new SuccessDataResult<List<ResumeImage>>
		(this.resumeImageDao.findAll(),"Photos are listed");	
	}

	@Override
	public DataResult<ResumeImage> getByJobseeker_UserId(int id) {
		return new SuccessDataResult<ResumeImage>
		(this.resumeImageDao.getByJobseeker_UserId(id),"Photos are listed by user id");
	}

}
