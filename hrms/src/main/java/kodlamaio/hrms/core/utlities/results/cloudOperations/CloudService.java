package kodlamaio.hrms.core.utlities.results.cloudOperations;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utlities.results.DataResult;

public interface CloudService {

	DataResult<?> save(MultipartFile file);
}
