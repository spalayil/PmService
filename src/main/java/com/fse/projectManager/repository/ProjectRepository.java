package com.fse.projectManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fse.projectManager.entity.Project;




public interface ProjectRepository extends JpaRepository<Project, Integer>{
	

}
