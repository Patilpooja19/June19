package com.xworkz.Abstract.boot;

import com.xworkz.Abstract.app.Project;
import com.xworkz.Abstract.app.AcademicsProject;

public class ProjectRunner {

	public static void main(String[] args) {
		
Project project=new AcademicsProject();
		
		project.start();
		project.pause();
		project.resume();
		project.complete();
		project.reportStatus();

       
        System.out.println(project.getProjectType());
        project.assignTeam();
        project.implement();
        project.review();
        project.deliver();
		

	}

}
