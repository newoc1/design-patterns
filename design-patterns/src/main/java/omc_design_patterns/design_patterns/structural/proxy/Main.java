package omc_design_patterns.design_patterns.structural.proxy;

import java.util.Random;

public class Main {

	public static void main(String[] args){
		Client actualClient = new Client();
		Random random = new Random();
		String clientId = String.valueOf(random.nextLong());
		actualClient.setId(clientId);
		String creditCardNumber ="1234134"; 
		ProtectionProxy proxy = new ProtectionProxy(creditCardNumber, clientId);
		Client maliciousClient = new Client();
		String malId = String.valueOf(random.nextLong());
		maliciousClient.setId(malId);
		SensitiveData malSensitiveData = proxy.getSensitiveData(maliciousClient);
		assert(malSensitiveData==null);
		System.out.println("Malicious client tried to retrieve sensitive data by proxy and got: "+malSensitiveData);
		SensitiveData actualSensitiveData = proxy.getSensitiveData(actualClient);
		assert(actualSensitiveData.getCreditCardNumber().equals(creditCardNumber));
		System.out.println("Actual client tried to retrieve sensitive data by proxy and got: "+actualSensitiveData+" with creditCardNumber: "+actualSensitiveData.getCreditCardNumber());
	}
}
