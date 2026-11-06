package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Keralabaseclass;

public class Keralatestclass extends Keralabaseclass {
	@Test
	public void titlemthd()
	{
		String actualtitle=keralaobj.titleverificationmthd();
		Assert.assertEquals(actualtitle, "Post your Property");
	}
	@Test
	public void loginvalidationmthd()
	{
		keralaobj.loginmthd("ebin.luminar@gmail.com", "123456");
	}
	

}
