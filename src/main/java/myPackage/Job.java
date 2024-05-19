package myPackage;

import jakarta.servlet.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class Job{
	
	private int id;
	private String typeOfJob, title, company, location, description;
	private List<String> requirements;
	public Job(int id, String typeOfJob, String title, String company, String location, String description, List<String> requirements) {
		this.id = id;
		this.typeOfJob = typeOfJob;
		this.title = title;
		this.company = company;
		this.location = location;
		this.description = description;
		this.requirements = requirements;
	}
	
	public String getTypeOfJob() {
		return typeOfJob;
	}
	public String getTitle() {
		return title;
	}
	public String getCompany() {
		return company;
	}
	public String getLocation() {
		return location;
	}
	public String getDescription() {
		return description;
	}
	public int getId() {
		return id;
	}
	public List<String> getRequirements(){
		return requirements;
	}
}