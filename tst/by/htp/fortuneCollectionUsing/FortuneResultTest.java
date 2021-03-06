/**
 * 
 */
package by.htp.fortuneCollectionUsing;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import by.htp.fortuneCollectionUsing.bean.Flower;
import by.htp.fortuneCollectionUsing.logic.Fortune;

/**
 * @author dbarkova
 *
 */
public class FortuneResultTest {

	private Flower flower;
	private Map<String, String[]> fortuneIvents;
	private Fortune fortune;
	
	@Before
	public void initTestData() {
		
		flower = new Flower("Camomile", 8, 4);
		flower.getBud().addFreshLeaves(5, "white", "ellipse");
		
		fortuneIvents = new HashMap<String, String[]>();
		Fortune.setFortuneTypes(fortuneIvents);
		fortune = new Fortune(flower, fortuneIvents);
		fortune.readChoiceToFortune();
	}
	
	@Test
	public void fortunePredictionTest() {
		String result = fortune.printResultOfFortune();
		assertEquals("Fortune prediction is wrong!!!", "loves", result);
	}
	
}
