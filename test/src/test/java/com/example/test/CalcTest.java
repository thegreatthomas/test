package com.example.test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
	
	@Test
	public void doAdd() throws Exception{
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet request = new HttpGet("http://192.168.119.151:8080/test/CalcServlet?a=1&b=2");
		CloseableHttpResponse response = client.execute(request);
		String actual = EntityUtils.toString(response.getEntity());
		System.out.println(actual);
		Assert.assertEquals(actual, "3");
	}

}
