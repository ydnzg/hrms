package kodlamaio.hrms.core.utlities.results;

public class SuccessResult  extends Result{

	
	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String message) {
		super(true, message);
	}
	
}
