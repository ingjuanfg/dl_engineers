package org.example.modelo.data;

import lombok.Data;

@Data
public class RsData {
	private Languages languages;

	public Languages getLanguages(){
		return languages;
	}
}
