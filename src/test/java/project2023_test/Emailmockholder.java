package project2023_test;

import mycleann.Company;
import mycleann.EmailServer;
import static org.mockito.Mockito.mock;

public class Emailmockholder
{

	private EmailServer emai= mock(EmailServer.class);

	public Emailmockholder(Company l){
		l.EmailServer(emai);
		
	}

	public EmailServer getMockEmailHolder() {
		return emai;
	}

	
	
}
