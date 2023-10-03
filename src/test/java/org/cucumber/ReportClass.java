package org.cucumber;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {
public static void generateReport(String json) {
	File file=new File("C:\\Users\\admin\\eclipse-workspace\\CucumberProject1\\CucumberFrameworkPractice\\target");
	Configuration con = new Configuration(file,"Adactin Hotel Page Inspection");
	con.addClassifications("UserStory", "12345");
	con.addClassifications("Tools", "Cucumber");
	List<String> li = new LinkedList<String>();
	li.add(json);
	ReportBuilder report = new ReportBuilder(li, con);
	report.generateReports();
}
}
