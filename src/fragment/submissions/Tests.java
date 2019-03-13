package fragment.submissions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Tests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		String input = "m quaerat voluptatem.;pora incidunt ut labore et d;, consectetur, adipisci velit;olore magnam"+
		"aliqua;idunt ut labore et dolore magn;uptatem.;i dolorem ipsum qu;iquam quaerat vol;psum quia"+
		"dolor sit amet, consectetur, a;ia dolor sit amet, conse;squam est, qui do;Neque porro quisquam est,"+
		"qu;aerat voluptatem.;m eius modi tem;Neque porro qui;, sed quia non numquam ei;lorem ipsum"+
		"quia dolor sit amet;ctetur, adipisci velit, sed quia non numq;unt ut labore et dolore magnam aliquam"+
		"qu;dipisci velit, sed quia non numqua;us modi tempora incid;Neque porro quisquam est, qui"+
		"dolorem i;uam eius modi tem;pora inc;am al";
		String output="Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed" + 
				"quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat" + 
				"voluptatem.";
		List<String> inputList = GillianBray.copyStringToListOfWords(input);
		Assert.assertTrue("Big", output.equals(GillianBray.reduce((ArrayList<String>) inputList)));
	}
	@Test
	void test2() {
		String input = "O draconia;conian devil! Oh la;h lame sa;saint!";
		String output="O draconian devil! Oh lame saint!";
		List<String> inputList = GillianBray.copyStringToListOfWords(input);
		Assert.assertTrue("Small", output.equals(GillianBray.reduce((ArrayList<String>) inputList)));
	}
	@Test
	void test3() {
		String input = "m quaerat voluptatem.;pora incidunt ut labore et d;, consectetur, adipisci velit;olore magnam "+
		"aliqua;idunt ut labore et dolore magn;uptatem.;i dolorem ipsum qu;iquam quaerat vol;psum quia "+
		"dolor sit amet, consectetur, a;ia dolor sit amet, conse;squam est, qui do;Neque porro quisquam est, "+
		"qu;aerat voluptatem.;m eius modi tem;Neque porro qui;, sed quia non numquam ei;lorem ipsum "+
		"quia dolor sit amet;ctetur, adipisci velit, sed quia non numq;unt ut labore et dolore magnam aliquam "+
		"qu;dipisci velit, sed quia non numqua;us modi tempora incid;Neque porro quisquam est, qui "+
		"dolorem i;uam eius modi tem;pora inc;am al";
		String output="Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed " + 
				"quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat " + 
				"voluptatem.";
		List<String> inputList = GillianBray.copyStringToListOfWords(input);
		Assert.assertTrue("Big2", output.equals(GillianBray.reduce((ArrayList<String>) inputList)));
	}
	@Test
	void test4() {
		String input = "m quaerat voluptatem.;pora incidunt ut labore et d;, consectetur, adipisci velit;olore magnam;"+
		"aliqua;idunt ut labore et dolore magn;uptatem.;i dolorem ipsum qu;iquam quaerat vol;psum quia;"+
		"dolor sit amet, consectetur, a;ia dolor sit amet, conse;squam est, qui do;Neque porro quisquam est,;"+
		"qu;aerat voluptatem.;m eius modi tem;Neque porro qui;, sed quia non numquam ei;lorem ipsum;"+
		"quia dolor sit amet;ctetur, adipisci velit, sed quia non numq;unt ut labore et dolore magnam aliquam;"+
		"qu;dipisci velit, sed quia non numqua;us modi tempora incid;Neque porro quisquam est, qui;"+
		"dolorem i;uam eius modi tem;pora inc;am al";
		String output="Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed " + 
				"quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat " + 
				"voluptatem.";
		List<String> inputList = GillianBray.copyStringToListOfWords(input);
		Assert.assertTrue("Big3", output.equals(GillianBray.reduce((ArrayList<String>) inputList)));
	}
	
	@Test
	void test5() {
		Assert.assertTrue("overlap 3", GillianBray.overlap("ABCDEF","DEFG")[1]==3);
	}
	@Test
	void test6() {
		Assert.assertTrue("overlap 3", GillianBray.overlap("XYZABC","ABCDEF")[1]==3);
	}
	@Test
	void test7() {
		Assert.assertTrue("overlap 4", GillianBray.overlap("ABCDEF","BCDE")[1]==4);
	}
	@Test
	void test8() {
		Assert.assertTrue("overlap 0", GillianBray.overlap("ABCDEF","XCDEZ")[1]==0);
	}

	
}
