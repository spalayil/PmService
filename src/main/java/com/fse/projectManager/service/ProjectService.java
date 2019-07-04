package com.fse.projectManager.service;

import java.util.List;

import com.fse.projectManager.entity.Project;

public interface ProjectService {
	
	public boolean addProject(Project project);
	public List<Project> GetProjectList();
	public boolean editProject(Project project);
	public boolean deleteProject(int projectId);
	

}
