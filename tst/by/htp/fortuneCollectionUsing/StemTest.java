package by.htp.fortuneCollectionUsing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import by.htp.fortuneCollectionUsing.bean.Stem;
import junit.framework.Assert;

public class StemTest {
	
	private Stem stem;
	
	@Before
	public void initTestData() {
	
	stem = new Stem();
	stem.setHeight(9);

}
	
	@Test
	public void initStemObject() {
		int height = stem.getHeight();
		assertEquals("Stem Object was not created", 9, height);
	}
	
}
	
	

