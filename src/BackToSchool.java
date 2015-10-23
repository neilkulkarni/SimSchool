import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import Animals.Chick;
import Animals.Cow;
import Animals.Pig;
import FileIO.FileIO;
import FileIO.FileTranslator;
import People.*;
import gpdraw.DrawingTool;
import gpdraw.SketchPad;


public class BackToSchool 
{
	public static void main(String[] args) 
	{		
		SimSchoolDrawing panel = new SimSchoolDrawing();
		panel.setDelay(0);
		SketchPad pad = new SketchPad(1200, 600, panel);
		
		
		/*
		FileIO reader = new FileIO();
		String fileData = reader.readFile("data/simSchoolXML.xml");
		
		FileTranslator translator = new FileTranslator();
		ArrayList<Person> people = translator.lineToPeople(fileData);
		ArrayList<Teacher> teachers = translator.lineToTeachers(fileData);
		ArrayList<Student> students = translator.lineToStudents(fileData);
		ArrayList<CollegeStudent> collegeStudents = translator.lineToCollegeStudents(fileData);
		ArrayList<Cow> cows = translator.lineToCows(fileData);
		ArrayList<Pig> pigs = translator.lineToPigs(fileData);
		ArrayList<Chick> chicks = translator.lineToChicks(fileData);
		
		int peopleSize = people.size();
		int teachersSize = teachers.size();
		int studentsSize = students.size();
		int collegeStudentsSize = collegeStudents.size();
		int cowsSize = cows.size();
		int pigsSize = pigs.size();
		int chicksSize = chicks.size();
		
		int numOfOrganisms = peopleSize + teachersSize + studentsSize + collegeStudentsSize + cowsSize + pigsSize + chicksSize;
		
		int organismWidth = 125;
		int windowWidth = organismWidth * numOfOrganisms + organismWidth/2;
		int windowHeight = 600;
		
		SketchPad pad = new SketchPad(windowWidth, windowHeight);
		DrawingTool marker = new DrawingTool(pad);
		
		
		int shift = (-windowWidth + organismWidth)/2;
		
		for (int i = 0; i < peopleSize; i++)
		{
			people.get(i).draw(marker, shift, 20);
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < teachersSize; i++)
		{
			teachers.get(i).draw(marker, shift, 20);
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < studentsSize; i++)
		{
			students.get(i).draw(marker, shift, 20);
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < collegeStudentsSize; i++)
		{
			collegeStudents.get(i).draw(marker, shift, 20);
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < cowsSize; i++)
		{
			cows.get(i).draw(marker, shift, 20);
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < pigsSize; i++)
		{
			pigs.get(i).draw(marker, shift, 20);
			
			shift += organismWidth;
		}
		
		if (chicks.size() > 0)
		{
			for (int i = 0; i < chicksSize; i++)
			{
				chicks.get(i).draw(marker, shift, 20);
				
				shift += organismWidth;
			}
		}
		*/
	}
}
