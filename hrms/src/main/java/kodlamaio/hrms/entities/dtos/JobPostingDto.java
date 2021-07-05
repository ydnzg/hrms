package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class JobPostingDto {

	private String city;
	private String CompanyName;
	private String positionName;
	private String definition;
	private boolean activityStatus;
	private int openPositionNumber;
	private LocalDateTime postingDate;
	private LocalDate applicationDeadline;

	public JobPostingDto() {
		super();
	}


	public JobPostingDto(String city, String companyName, String positionName, String definition,
			boolean activityStatus, int openPositionNumber, LocalDateTime postingDate, LocalDate applicationDeadline) {
		super();
		this.city = city;
		CompanyName = companyName;
		this.positionName = positionName;
		this.definition = definition;
		this.activityStatus = activityStatus;
		this.openPositionNumber = openPositionNumber;
		this.postingDate = postingDate;
		this.applicationDeadline = applicationDeadline;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCompanyName() {
		return CompanyName;
	}


	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	public String getPositionName() {
		return positionName;
	}


	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}


	public String getDefinition() {
		return definition;
	}


	public void setDefinition(String definition) {
		this.definition = definition;
	}


	public boolean isActivityStatus() {
		return activityStatus;
	}


	public void setActivityStatus(boolean activityStatus) {
		this.activityStatus = activityStatus;
	}


	public int getOpenPositionNumber() {
		return openPositionNumber;
	}


	public void setOpenPositionNumber(int openPositionNumber) {
		this.openPositionNumber = openPositionNumber;
	}


	public LocalDateTime getPostingDate() {
		return postingDate;
	}


	public void setPostingDate(LocalDateTime postingDate) {
		this.postingDate = postingDate;
	}


	public LocalDate getApplicationDeadline() {
		return applicationDeadline;
	}


	public void setApplicationDeadline(LocalDate applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	
}
