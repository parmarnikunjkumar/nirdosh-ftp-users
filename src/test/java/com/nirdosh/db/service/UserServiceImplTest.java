package com.nirdosh.db.service;

import javax.inject.Inject;

import junit.framework.TestCase;

import org.bson.types.Code;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nirdosh.config.test.TestConfig;
import com.nirdosh.domain.Address;
import com.nirdosh.domain.Country;
import com.nirdosh.domain.EmailAddress;
import com.nirdosh.domain.EmailAddressType;
import com.nirdosh.domain.State;
import com.nirdosh.domain.User;
import com.nirdosh.ftp.FTPAccount;
import com.nirdosh.ftp.FTPAccountType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
public class UserServiceImplTest extends TestCase {
	
	@Inject
	private UserService userService;
	
	@Before
	public void init(){
//		this.userService = new UserServiceImpl();
	}
	
	
	@Test
	public void testUserService(){
		
		User user = createUser();
//		userService = new UserServiceImpl();
		userService.add(user);
		assertNotNull(userService.getByName("nirdosh"));
		for(User userFound : userService.getByName("nirdosh")){
			assertEquals("nirdosh", userFound.getName());
			assertEquals(2, userFound.getEmails().size());
			assertEquals(1, userFound.getAddresses().size());
			assertEquals(2, userFound.getFtpAccounts().size());
		}
		
//		userService.deleteAll();
		
	}

	private User createUser() {
		
		User user = new User();
		user.setName("nikunj");
		user.setSpiritualName("nirdosh");
		user.setName("Parmar");
		
		EmailAddress email1 = new EmailAddress("nirdoshbhulku@gmail.com",EmailAddressType.PRIVATE);
		
		EmailAddress email2 = new EmailAddress("parmar.nikunjkumar@gmail.com",EmailAddressType.BUSINESS);
		
		user.getEmails().add(email1);
		user.getEmails().add(email2);
	
		
		State state = new State("Berlin", new Country("germany"));
		
		Address address = new Address();
		address.setHouseNumber("10");
		address.setStreetName("Im Tal");
		address.setState(state);
		
		user.getAddresses().add(address);
		
		FTPAccount account1 = new FTPAccount("web586f123",FTPAccountType.BHAIO_SABHA);
		FTPAccount account2 = new FTPAccount("web586f1234",FTPAccountType.SUNDAY_SABHA);
		
		user.getFtpAccounts().add(account1);
		user.getFtpAccounts().add(account2);
		
		user.setCommingToAYM(true);
		
		
		
		// TODO Auto-generated method stub
		return user;
	}

}
