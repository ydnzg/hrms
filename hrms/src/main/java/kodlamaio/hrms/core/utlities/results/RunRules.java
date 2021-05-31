package kodlamaio.hrms.core.utlities.results;

public class RunRules {

	  public static Result  run(Result... things) {
	        for(Result thing : things) {
	            if(!thing.isSuccess()) {
	                return thing;
	            }
	        }
	        return new SuccessResult();
	    }
}
