package com.nitaraweb.AccountManagement;

import java.time.Clock;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nitaraweb.API.ViewFarmAnalysis;
import com.nitaraweb.base.GenericBase;

import groovy.time.Duration;

public class Testcase1 extends GenericBase{
	  

	//	public static WebDriver driver = null;

//	@Test
//	public void validateCattleCount() throws Exception {
//
//		basePage.launchURL(properties.getProperty("url"));
//
//		nitaraLoginPage.click_SignIn();
//		Thread.sleep(5000);
//		nitaraHomePage.click_all();
//
//		nitaraHomePage.getCattleCount();
//		//		nitaraHomePage.getCount("total");
//(
//		ViewFarmAnalysis farmAnalysis = new ViewFarmAnalysis();
//		JSONObject response = farmAnalysis.viewFarmAnalysis();
//		JSONObject allDetails = ((JSONObject) ((JSONObject) response.get("farmAnalysis")).get("allDetails"));
//		JSONObject farmStatus = (JSONObject) ((JSONObject) allDetails.get("farmStatus"));
		//Getting values
//		int calfCount = (Integer) farmStatus.get("calfCount");
//		int heiferCount = (Integer) farmStatus.get("heiferCount");
//		int bullCount = (Integer) farmStatus.get("bullCount");
//		int milchCount = (Integer) farmStatus.get("milchCount");
//		int cattleCount = (Integer) farmStatus.get("cattleCount");
//		
//
//		String calf_string = nitaraHomePage.getCount("calf");
//		String heifer_string = nitaraHomePage.getCount("heifer");
//		String milch_string = nitaraHomePage.getCount("milch");
//		String bull_string = nitaraHomePage.getCount("bull");
//		String total_string = nitaraHomePage.getCount("total").substring(0, 2);
//	
//		
//		int heifer = Integer.parseInt(heifer_string);
//		int milch= Integer.parseInt(milch_string);
//		int bull = Integer.parseInt(bull_string);
//		int total = Integer.parseInt(total_string);
//		int calf = Integer.parseInt(calf_string);
//
//
//		//Asserting values
//		Assert.assertEquals(heiferCount, heifer, "The heifer count does not match.");
//		Assert.assertEquals(bullCount, bull, "The bull count does not match.");
//		Assert.assertEquals(milchCount, milch, "The milch count does not match.");
//		Assert.assertEquals(cattleCount, total, "The total count does not match.");
//		Assert.assertEquals(calfCount, calf, "The calf count does not match.");
//
//	}

//	@Test
//	public void validateCowCount() throws Exception {
//
//		
//		nitaraHomePage.click_cow();
//		
//		nitaraHomePage.getCattleCount();
//		
//
//		ViewFarmAnalysis farmAnalysis = new ViewFarmAnalysis();
//		JSONObject response = farmAnalysis.viewFarmAnalysis();
//		JSONObject cowDetails = ((JSONObject) ((JSONObject) response.get("farmAnalysis")).get("cowDetails"));
//		JSONObject farmStatus = (JSONObject) ((JSONObject) cowDetails.get("farmStatus"));
//		//Getting values
//		int calfCount = (Integer) farmStatus.get("calfCount");
//		int heiferCount = (Integer) farmStatus.get("heiferCount");
//		int bullCount = (Integer) farmStatus.get("bullCount");
//		int milchCount = (Integer) farmStatus.get("milchCount");
//		int cattleCount = (Integer) farmStatus.get("cattleCount");
//
//		String calf_string = nitaraHomePage.getCount("calf");
//		String heifer_string = nitaraHomePage.getCount("heifer");
//		String milch_string = nitaraHomePage.getCount("milch");
//		String bull_string = nitaraHomePage.getCount("bull");
//		String total_string = nitaraHomePage.getCount("total").substring(0, 2);
//		//		
//		int calf = Integer.parseInt(calf_string);
//		int heifer = Integer.parseInt(heifer_string);
//		int milch= Integer.parseInt(milch_string);
//		int bull = Integer.parseInt(bull_string);
//		int total = Integer.parseInt(total_string);
//
//
//		//Asserting values
//		Assert.assertEquals(calfCount, calf, "The calf count does not match.");
//		Assert.assertEquals(heiferCount, heifer, "The heifer count does not match.");
//		Assert.assertEquals(bullCount, bull, "The bull count does not match.");
//		Assert.assertEquals(milchCount, milch, "The milch count does not match.");
//		Assert.assertEquals(cattleCount, total, "The total count does not match.");
//		
//		
//
//	}
//	
//
//
//	@Test
//	public void validateBullCount() throws Exception {
//		
////		basePage.launchURL(properties.getProperty("url"));
////
////		nitaraLoginPage.click_SignIn();
//		
//		Thread.sleep(5000);
//		nitaraHomePage.click_bull();
//		
//		nitaraHomePage.getCattleCount();
//		
//
//		ViewFarmAnalysis farmAnalysis = new ViewFarmAnalysis();
//		JSONObject response = farmAnalysis.viewFarmAnalysis();
//		JSONObject cowDetails = ((JSONObject) ((JSONObject) response.get("farmAnalysis")).get("buffaloDetails"));
//		JSONObject farmStatus = (JSONObject) ((JSONObject) cowDetails.get("farmStatus"));
//		//Getting values
//		int calfCount = (Integer) farmStatus.get("calfCount");
//		int heiferCount = (Integer) farmStatus.get("heiferCount");
//		int bullCount = (Integer) farmStatus.get("bullCount");
//		int milchCount = (Integer) farmStatus.get("milchCount");
//		int cattleCount = (Integer) farmStatus.get("cattleCount");
//
//		String calf_string = nitaraHomePage.getCount("calf");
//		String heifer_string = nitaraHomePage.getCount("heifer");
//		String milch_string = nitaraHomePage.getCount("milch");
//		String bull_string = nitaraHomePage.getCount("bull");
//		String total_string = nitaraHomePage.getCount("total").substring(0, 1);
//		//		
//		int calf = Integer.parseInt(calf_string);
//		int heifer = Integer.parseInt(heifer_string);
//		int milch= Integer.parseInt(milch_string);
//		int bull = Integer.parseInt(bull_string);
//		int total = Integer.parseInt(total_string);
//
//
//		//Asserting values
//		Assert.assertEquals(calfCount, calf, "The calf count does not match.");
//		Assert.assertEquals(heiferCount, heifer, "The heifer count does not match.");
//		Assert.assertEquals(bullCount, bull, "The bull count does not match.");
//		Assert.assertEquals(milchCount, milch, "The milch count does not match.");
//		Assert.assertEquals(cattleCount, total, "The total count does not match.");
//
//	}
	
	@Test
	public void validateFarmBreedingStatus() throws Exception {

		basePage.launchURL(properties.getProperty("url"));

		nitaraLoginPage.click_SignIn();
		
//		nitaraHomePage.click_all();
		Thread.sleep(5000);
		nitaraHomePage.getBreedingData();
		

		ViewFarmAnalysis farmAnalysis = new ViewFarmAnalysis();
		JSONObject response = farmAnalysis.viewFarmAnalysis();
		JSONObject cowDetails = ((JSONObject) ((JSONObject) response.get("farmAnalysis")).get("allDetails"));
		JSONObject farmStatus = (JSONObject) ((JSONObject) cowDetails.get("farmBreedingStatus"));
		//Getting values
		int openCount = (Integer) farmStatus.get("openCount");
		int inseminatedCount = (Integer) farmStatus.get("inseminatedCount");
		int pregnantCount = (Integer) farmStatus.get("pregnantCount");
		int dryCount = (Integer) farmStatus.get("dryCount");

		System.out.println(nitaraHomePage.getBreedCount("open"));
		System.out.println(nitaraHomePage.getBreedCount("insemenated"));
		System.out.println(nitaraHomePage.getBreedCount("pregnent"));
		System.out.println(nitaraHomePage.getBreedCount("dry"));
		
		int open = Integer.parseInt(nitaraHomePage.getBreedCount("open"));
		int insemenated = Integer.parseInt(nitaraHomePage.getBreedCount("insemenated"));
		int pregnent= Integer.parseInt(nitaraHomePage.getBreedCount("pregnent"));
		int dry = Integer.parseInt(nitaraHomePage.getBreedCount("dry"));
		


		//Asserting values
		Assert.assertEquals(openCount, open, "The calf count does not match.");
		Assert.assertEquals(inseminatedCount, insemenated, "The heifer count does not match.");
		Assert.assertEquals(pregnantCount, pregnent, "The bull count does not match.");
		Assert.assertEquals(dryCount, dry, "The milch count does not match.");
		

	}
}
