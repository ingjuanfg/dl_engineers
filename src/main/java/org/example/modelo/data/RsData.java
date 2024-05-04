package org.example.modelo.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RsData {
	private List<InputLoginPasswordItem> inputLoginPassword;
	private List<LabelTitlePageItem> labelTitlePage;
	private List<InputSearchLocationItem> inputSearchLocation;
	private List<InputSearchCheckoutDateItem> inputSearchCheckoutDate;
	private List<InputRegisterPasswordItem> inputRegisterPassword;
	private List<ButtonRegisterItem> buttonRegister;
	private List<InputRegisterNameItem> inputRegisterName;
	private List<InputRegisterEmailItem> inputRegisterEmail;
	private List<InputSearchCheckinDateItem> inputSearchCheckinDate;
	private List<ButtonSearchItem> buttonSearch;
	private List<ButtonLoginItem> buttonLogin;
	private List<InputLoginUserItem> inputLoginUser;
}