package omc_design_patterns.design_patterns.structural.proxy.sensitive_data;

import omc_design_patterns.design_patterns.structural.proxy.Client;

public class ProtectionProxy {
	private SensitiveData sensitiveData;

	public ProtectionProxy(String creditCardNumber, String clientId){
		sensitiveData = new SensitiveData();
		sensitiveData.setClientId(clientId);
		sensitiveData.setCreditCardNumber(creditCardNumber);
	}
	public SensitiveData getSensitiveData(Client client) {
		SensitiveData sensitiveData = null;
		if(client.getId().equals(this.sensitiveData.getClientId())){
			sensitiveData = this.sensitiveData;
		}
		return sensitiveData;
	}	
}
