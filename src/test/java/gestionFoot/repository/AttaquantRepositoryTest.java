package gestionFoot.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gestionFoot.config.AppConfig;
import gestionFoot.model.Attaquant;
import gestionFoot.repository.AttaquantRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@Transactional
public class AttaquantRepositoryTest {
	
	@Autowired
	private AttaquantRepository daoAttaquant;
	
	
	@Test
	public void init() {
	
			assertNotNull(daoAttaquant);
	}
	
	@Test 
//	@Commit
//	@Rollback(false)
	public void findTest() {
		
		Attaquant a ;
		Attaquant neymar = new Attaquant ("neymar","da Silva Santos Júnior",LocalDate.parse("1992-02-05"),0.7,0.94,0.65,0.45,15,25);
		a = daoAttaquant.save(neymar);
		
		if(a==null) {
			fail();
		}
		
		
		
	}
	
	

}
