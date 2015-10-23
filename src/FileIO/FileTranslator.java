package FileIO;
import java.util.ArrayList;

import Animals.Chick;
import Animals.Cow;
import Animals.Pig;
import People.*;

public class FileTranslator 
{
	private ArrayList<Person> people = new ArrayList<Person>();
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<CollegeStudent> collegeStudents = new ArrayList<CollegeStudent>();
	private ArrayList<Cow> cows = new ArrayList<Cow>();
	private ArrayList<Pig> pigs = new ArrayList<Pig>();
	private ArrayList<Chick> chicks = new ArrayList<Chick>();

	public ArrayList<Person> lineToPeople (String line)
	{
		int personIndex = line.indexOf("<Person>");

		if (personIndex != -1)
		{
			for (int i = personIndex; i <= line.lastIndexOf("<Person>"); i++)
			{
				if (i == line.indexOf("<Person>", personIndex))
				{
					people.add(lineToPerson(line, i));
					personIndex = i+1;
				}
			}
		}

		System.out.println(people);
		return people;
	}

	public ArrayList<Teacher> lineToTeachers (String line)
	{
		int teacherIndex = line.indexOf("<Teacher>");

		if (teacherIndex != -1)
		{
			for (int i = teacherIndex; i <= line.lastIndexOf("<Teacher>"); i++)
			{
				if (i == line.indexOf("<Teacher>", teacherIndex))
				{
					teachers.add(lineToTeacher(line, i));
					teacherIndex = i+1;
				}
			}
		}

		return teachers;
	}

	public ArrayList<Student> lineToStudents (String line)
	{
		int studentIndex = line.indexOf("<Student>");

		if (studentIndex != -1)
		{
			for (int i = studentIndex; i <= line.lastIndexOf("<Student>"); i++)
			{
				if (i == line.indexOf("<Student>", studentIndex))
				{
					students.add(lineToStudent(line, i));
					studentIndex = i+1;
				}
			}
		}

		return students;
	}

	public ArrayList<CollegeStudent> lineToCollegeStudents (String line)
	{
		int collegeStudentIndex = line.indexOf("<CollegeStudent>");

		if (collegeStudentIndex != -1)
		{
			for (int i = collegeStudentIndex; i <= line.lastIndexOf("<CollegeStudent>"); i++)
			{
				if (i == line.indexOf("<CollegeStudent>", collegeStudentIndex))
				{
					collegeStudents.add(lineToCollegeStudent(line, i));
					collegeStudentIndex = i+1;
				}
			}
		}

		return collegeStudents;
	}

	public ArrayList<Cow> lineToCows (String line)
	{
		int cowIndex = line.indexOf("Cow");

		if (cowIndex != -1)
		{
			for (int i = cowIndex; i <= line.lastIndexOf("Cow"); i++)
			{
				if (i == line.indexOf("Cow", cowIndex))
				{
					cows.add(lineToCow(line, i));
					cowIndex = i+1;
				}
			}
		}

		System.out.println(cows);
		return cows;
	}

	public ArrayList<Pig> lineToPigs (String line)
	{
		int pigIndex = line.indexOf("Pig");

		if (pigIndex != -1)
		{
			for (int i = pigIndex; i <= line.lastIndexOf("Pig"); i++)
			{
				if (i == line.indexOf("Pig", pigIndex))
				{
					pigs.add(lineToPig(line, i));
					pigIndex = i+1;
				}
			}
		}

		System.out.println(pigs);
		return pigs;
	}

	public ArrayList<Chick> lineToChicks (String line)
	{
		int chickIndex = line.indexOf("Chick");

		if (chickIndex != -1)
		{
			for (int i = chickIndex; i <= line.lastIndexOf("Chick"); i++)
			{
				if (i == line.indexOf("Chick", chickIndex))
				{
					chicks.add(lineToChick(line, i));
					chickIndex = i+1;
				}
			}
		}

		System.out.println(chicks);
		return chicks;
	}

	private Person lineToPerson (String line, int index)
	{	
		String block = line.substring(index, line.indexOf("</Person>", index));

		System.out.println(block);

		String name = block.substring(block.indexOf("<name>") + 6, block.indexOf("</name>"));
		int age = Integer.parseInt(block.substring(block.indexOf("<age>") + 5, block.indexOf("</age>")));
		String gender = block.substring(block.indexOf("<gender>") + 8, block.indexOf("</gender>"));

		return new Person (name, age, gender);
	}

	private Teacher lineToTeacher (String line, int index)
	{
		String block = line.substring(index, line.indexOf("</Teacher>", index));

		System.out.println(block);

		String name = block.substring(block.indexOf("<name>") + 6, block.indexOf("</name>"));
		int age = Integer.parseInt(block.substring(block.indexOf("<age>") + 5, block.indexOf("</age>")));
		String gender = block.substring(block.indexOf("<gender>") + 8, block.indexOf("</gender>"));

		String subject = block.substring(block.indexOf("<subject>") + 9, block.indexOf("</subject>"));
		double salary = Double.parseDouble(block.substring(block.indexOf("<salary>") + 8, block.indexOf("</salary>")));

		return new Teacher (name, age, gender, subject, salary);
	}

	private Student lineToStudent (String line, int index)
	{
		String block = line.substring(index, line.indexOf("</Student>", index));

		System.out.println(block);

		String name = block.substring(block.indexOf("<name>") + 6, block.indexOf("</name>"));
		int age = Integer.parseInt(block.substring(block.indexOf("<age>") + 5, block.indexOf("</age>")));
		String gender = block.substring(block.indexOf("<gender>") + 8, block.indexOf("</gender>"));

		String idNum = block.substring(block.indexOf("<ID>") + 4, block.indexOf("</ID>"));
		double GPA = Double.parseDouble(block.substring(block.indexOf("<GPA>") + 5, block.indexOf("</GPA>")));

		return new Student (name, age, gender, idNum, GPA);
	}

	private CollegeStudent lineToCollegeStudent (String line, int index)
	{
		String block = line.substring(index, line.indexOf("</CollegeStudent>", index));

		System.out.println(block);

		String name = block.substring(block.indexOf("<name>") + 6, block.indexOf("</name>"));
		int age = Integer.parseInt(block.substring(block.indexOf("<age>") + 5, block.indexOf("</age>")));
		String gender = block.substring(block.indexOf("<gender>") + 8, block.indexOf("</gender>"));

		String idNum = block.substring(block.indexOf("<ID>") + 4, block.indexOf("</ID>"));
		double GPA = Double.parseDouble(block.substring(block.indexOf("<GPA>") + 5, block.indexOf("</GPA>")));

		int year = Integer.parseInt(block.substring(block.indexOf("<year>") + 6, block.indexOf("</year>")));
		String major = block.substring(block.indexOf("<major>") + 7, block.indexOf("</major>"));

		return new CollegeStudent (name, age, gender, idNum, GPA, year, major);
	}

	private Cow lineToCow (String line, int index)
	{	
		return new Cow();
	}

	private Pig lineToPig (String line, int index)
	{
		return new Pig();
	}

	private Chick lineToChick (String line, int index)
	{
		return new Chick();
	}
}
