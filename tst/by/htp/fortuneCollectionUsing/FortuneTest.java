package by.htp.fortuneCollectionUsing;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import by.htp.fortuneCollectionUsing.bean.Flower;
import by.htp.fortuneCollectionUsing.logic.Fortune;

public class FortuneTest {
	
	private Fortune fortune;
	private Fortune fort;
	private Flower flower;
	private HashMap<String, String[]> fortuneIvents;
	
	@Before
	
	public void initTestData() {
		fortune = new Fortune();
		
		fortuneIvents = new HashMap<String, String[]>();
		fortuneIvents.put(new String("love"), new String[] { "loves", "almost loves", "does not love", "neutral" });
		
		fortune.setFortuneIvents(fortuneIvents);
		
		flower = new Flower();
		
		fort = new Fortune(flower, fortuneIvents);
		 
	}
	
	@Test
	public void fortuneConstructorTest() {
		assertEquals("Fortunes are different!", fortune.toString(), fort.toString());
	}

}
