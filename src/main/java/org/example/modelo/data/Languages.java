package org.example.modelo.data;

import lombok.Data;

import java.util.List;
@Data
public class Languages{
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

	public List<InputLoginPasswordItem> getInputLoginPassword(){
		return inputLoginPassword;
	}

	public List<LabelTitlePageItem> getLabelTitlePage(){
		return labelTitlePage;
	}

	public List<InputSearchLocationItem> getInputSearchLocation(){
		return inputSearchLocation;
	}

	public List<InputSearchCheckoutDateItem> getInputSearchCheckoutDate(){
		return inputSearchCheckoutDate;
	}

	public List<InputRegisterPasswordItem> getInputRegisterPassword(){
		return inputRegisterPassword;
	}

	public List<ButtonRegisterItem> getButtonRegister(){
		return buttonRegister;
	}

	public List<InputRegisterNameItem> getInputRegisterName(){
		return inputRegisterName;
	}

	public List<InputRegisterEmailItem> getInputRegisterEmail(){
		return inputRegisterEmail;
	}

	public List<InputSearchCheckinDateItem> getInputSearchCheckinDate(){
		return inputSearchCheckinDate;
	}

	public List<ButtonSearchItem> getButtonSearch(){
		return buttonSearch;
	}

	public List<ButtonLoginItem> getButtonLogin(){
		return buttonLogin;
	}

	public List<InputLoginUserItem> getInputLoginUser(){
		return inputLoginUser;
	}
}