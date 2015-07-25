package omc_design_patterns.design_patterns.structural.proxy.sensitive_data;

public class SensitiveData {
	private String clientId;
	private String creditCardNumber;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
}