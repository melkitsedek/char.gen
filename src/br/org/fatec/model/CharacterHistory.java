package br.org.fatec.model;

import java.util.Date;
import java.util.List;

public class CharacterHistory {
	private Date birthday;
	private MaritalStatus maritalStatus;
	private List<AcademicFormation> academicHistory;
	private List<Profession> professionalHistory;
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public List<AcademicFormation> getAcademicHistory() {
		return academicHistory;
	}
	public void setAcademicHistory(List<AcademicFormation> academicHistory) {
		this.academicHistory = academicHistory;
	}
	public List<Profession> getProfessionalHistory() {
		return professionalHistory;
	}
	public void setProfessionalHistory(List<Profession> professionalHistory) {
		this.professionalHistory = professionalHistory;
	}
	
	
}
