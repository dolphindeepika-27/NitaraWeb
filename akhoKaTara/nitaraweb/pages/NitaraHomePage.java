package com.nitaraweb.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NitaraHomePage extends BasePage{
	@FindBy(css  = "#content > div > div > div.overflow-y-80vh > div:nth-child(1) > div:nth-child(1) > div > div > div > div.col-12.text-blue.h2.text-center.my-4.ng-binding")
	public WebElement cattle;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div/span[1]")
	public WebElement bull;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div/div[3]/div/span[1]")
	public WebElement calf;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[1]/div[2]/div/div/div[3]/div[1]/div/div/div/div[3]/div/span[1]")
	public WebElement milch;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[1]/div[2]/div/div/div[3]/div[2]/div/div/div/div[3]/div/span[1]")
	public WebElement heifer;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div[1]/div/div/div/div[2]")
	public WebElement cowBtn;
	
	@FindBy(xpath = "//*[@id=\"buffalo\"]")
	public WebElement bullBtn;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div[1]/div/div/div/div[1]")
	public WebElement allBtn;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div[1]/span[1]")
	public WebElement open;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/span[1]")
	public WebElement insemenated;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div[3]/span[1]")
	public WebElement pregnent;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div[4]/span[1]")
	public WebElement dry;
	
	
	public NitaraHomePage() {
		PageFactory.initElements(driver, this);	
	}
	
	public void click_all() {
		allBtn.click();
	}
	
	public void click_cow() {
		cowBtn.click();
	}
	
	public void click_bull() {
		bullBtn.click();
	}
	
	public static Map<String, String> breedData = new HashMap<String, String>();
	public Map<String, String> getBreedingData() throws InterruptedException{
		
		String openCnt = open.getText();
		String insemenatedCnt = insemenated.getText();
		String pregnentCnt = pregnent.getText();
		String dryCnt = dry.getText();
		
		
		breedData.put("open", openCnt);
		breedData.put("insemenated", insemenatedCnt);
		breedData.put("pregnent", pregnentCnt);
		breedData.put("dry", dryCnt);
		

		return breedData;
		
	}
	public String getBreedCount(String breed) {
		if(breed.equals("open")) {
			return breedData.get("open");
		}else if(breed.equals("insemenated")) {
			return breedData.get("insemenated");
		}else if(breed.equals("pregnent")) {
			return breedData.get("pregnent");
		}else return breedData.get("dry");
	}
	
	public static Map<String, String> data = new HashMap<String, String>();
	public Map<String, String> getCattleCount() throws InterruptedException{
		
		String heifer_count = heifer.getText();
		String milch_count = milch.getText();
		String calf_count = calf.getText();
		String bull_count = bull.getText();
		String total = cattle.getText();
		
		data.put("total", total);
		data.put("bull", bull_count);
		data.put("milch", milch_count);
		data.put("heifer", heifer_count);
		data.put("calf", calf_count);

		return data;
		
	}
	public String getCount(String CattleType) {
		if(CattleType.equals("calf")) {
			return data.get("calf");
		}else if(CattleType.equals("heifer")) {
			return data.get("heifer");
		}else if(CattleType.equals("milch")) {
			return data.get("milch");
		}else if(CattleType.equals("bull")) {
			return data.get("bull");
		}else return data.get("total");
	}
	
}
