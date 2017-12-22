package Model;

import java.util.Date;

/**
 *
 * @author Ahmad S.Abu Selmya
 */
public class Disease {
        
	private Integer diseaseId;
	private String disease;
	private String note;
	private Patient patient;
	
	public Disease() {
	}

	public Integer getDiseaseId() {
		return this.diseaseId;
	}

	public void setDiseaseId(Integer diseaseId) {
		this.diseaseId = diseaseId;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDisease() {
		return this.disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
