package com.human.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.human.controller.HumanController;
import com.human.model.Human;
import com.human.service.HumanService;

@RunWith(MockitoJUnitRunner.class)
public class AppControllerTest {
	
	@Mock
	HumanService humanService;
	
	@InjectMocks
	HumanController hummanController;
	
	@Spy
	List<Human> humans = new ArrayList<Human>();
	
	@Spy
	ModelMap model;
	
	@Spy
	BindingResult result;
	
	@BeforeClass
	public void setUp(){
		humans = getHumanslist();
	}

	@Test
	public void showHumans(){ 
		
		Mockito.when(humanService.findAllHumans()).thenReturn(humans);
		Assert.assertEquals(hummanController.showHumans(model), "list");
		Assert.assertEquals(model.get("humans"), humans);
		Mockito.verify(humanService , Mockito.atLeastOnce()).findAllHumans();
	}
	
	@Test
	public void newHuman(){ 
		
		Assert.assertEquals(hummanController.newHuman(model), "NewHuman");
		Assert.assertNotNull(model.get("human"));
        Assert.assertEquals(((Human)model.get("human")).getId(), 0);
	}
	
	@Test
	public void newHumanWithError(){
		
		Mockito.when(result.hasErrors()).thenReturn(true);
		Mockito.doNothing().when(humanService).addHuman(Mockito.any(Human.class));
		Assert.assertEquals(hummanController.newHuman(model), "NewHuman");
	}
	
	public List<Human> getHumanslist(){
		
		Human human = new Human();
		human.setId(1);
		human.setAge(23);
		human.setName("Patryk");
		human.setSurname("Szczur");
		
		Human otherHuman = new Human();
		otherHuman.setId(2);
		otherHuman.setAge(55);
		otherHuman.setName("Jan");
		otherHuman.setSurname("Nowak");
		
		humans.add(otherHuman);
		humans.add(human);
		return humans;
	}
}
