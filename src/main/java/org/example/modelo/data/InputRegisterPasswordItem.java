package org.example.modelo.data;

import lombok.Data;

@Data
public class InputRegisterPasswordItem{
	private String portugese;
	private String german;
	private String french;
	private String spanish;
	private String english;

	public String getPortugese(){
		return portugese;
	}

	public String getGerman(){
		return german;
	}

	public String getFrench(){
		return french;
	}

	public String getSpanish(){
		return spanish;
	}

	public String getEnglish(){
		return english;
	}
}
