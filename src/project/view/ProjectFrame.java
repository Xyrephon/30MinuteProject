package project.view;

import javax.swing.JFrame;
import project.controller.ProjectController;
import java.awt.Dimension;

public class ProjectFrame extends JFrame
{
	private ProjectController baseController;
	private ProjectPanel appPanel;
	
	public ProjectFrame(ProjectController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new ProjectPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("30MinuteProject");
		this.setSize(new Dimension(500, 500));
		this.setResizable(false);
		this.setVisible(true);
	}
}
