package SampleGitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SampleGitTest {
	public static void main (String[] args) throws Exception {
		
	WebDriver wd = new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.com/");
	File f =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File("E:\\Vmetry\\SampleGit\\Snapshots\\snap.jpeg"));
	
	
	}
}
