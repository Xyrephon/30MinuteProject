package project.controller;

import project.model.Project;
import project.view.ProjectFrame;

public class ProjectController 
{
	private Project project;
	private ProjectFrame appFrame;
	
	public ProjectController()
	{
		project = new Project();
		appFrame = new ProjectFrame(this);
		
	}
	
	public void start()
	{
		
	}
}
