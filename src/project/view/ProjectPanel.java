package project.view;

import javax.swing.*;
import project.controller.ProjectController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectPanel extends JPanel
{
	private ProjectController baseController;
	private SpringLayout baseLayout;
	private JLabel projectTitle;
	private JLabel projectLabel1;
	
	public ProjectPanel(ProjectController baseController)
	{
		super();
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		projectTitle = new JLabel("30 Minute Project!");	
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.MAGENTA);
		this.add(projectTitle);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
