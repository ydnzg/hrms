package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activation_codes")
public class ActivationCode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "activation_code")
	private String activationCode;
	
	@Column(name = "is_confirmed")
	private boolean isCpnfirmed;
	
	@Column(name = "confirmed_date", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate confirmedDate = LocalDate.now();
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getActivationCode() {
		return activationCode;
	}


	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}


	public boolean isCpnfirmed() {
		return isCpnfirmed;
	}


	public void setCpnfirmed(boolean isCpnfirmed) {
		this.isCpnfirmed = isCpnfirmed;
	}


	public LocalDate getConfirmedDate() {
		return confirmedDate;
	}


	public void setConfirmedDate(LocalDate confirmedDate) {
		this.confirmedDate = confirmedDate;
	}


	public ActivationCode() {
		super();
	}

	
	public ActivationCode(int id, String activationCode, boolean isCpnfirmed, LocalDate confirmedDate) {
		super();
		this.id = id;
		this.activationCode = activationCode;
		this.isCpnfirmed = isCpnfirmed;
		this.confirmedDate = confirmedDate;
	}

}
