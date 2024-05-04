package org.example.modelo.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InputRegisterNameItem{
	private String portugese;
	private String german;
	private String french;
	private String spanish;
	private String english;

}
