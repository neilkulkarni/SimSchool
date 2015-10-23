import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Animals.Chick;
import Animals.Cow;
import Animals.Pig;
import FileIO.FileIO;
import FileIO.FileTranslator;
import LivingBeings.Organism;
import People.CollegeStudent;
import People.Person;
import People.Student;
import People.Teacher;
import gpdraw.DrawingTool;
import gpdraw.SketchPad;
import gpdraw.SketchPadPanel;


public class SimSchoolDrawing extends SketchPadPanel
{
	private int organismWidth;
	private int numOfOrganisms;
	
	private int windowWidth;
	private int windowHeight;
	
	private int startingPoint;
	
	private ArrayList<Person> people;
	private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;
	private ArrayList<CollegeStudent> collegeStudents;
	private ArrayList<Cow> cows;
	private ArrayList<Pig> pigs;
	private ArrayList<Chick> chicks;
	private ArrayList<Organism> organisms = new ArrayList<Organism>();
	
	private int peopleSize;
	private int teachersSize;
	private int studentsSize;
	private int collegeStudentsSize;
	private int cowsSize;
	private int pigsSize;
	private int chicksSize;

	private Point position = new Point();
	private boolean hitEnter;
	
	public SimSchoolDrawing()
	{	
		addMouseListener(new MouseHandler());
		addKeyListener(new KeyHandler());
		
		readFile();
		organismWidth = 125;
		windowWidth = organismWidth * numOfOrganisms + organismWidth/2;
		
		DrawingTool marker = new DrawingTool(this);
		
		int shift = (-windowWidth + organismWidth*3/2)/2;
		
		startingPoint = shift;
		
		for (int i = 0; i < peopleSize; i++)
		{
			people.get(i).draw(marker, shift, 20);
			organisms.add(people.get(i));
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < teachersSize; i++)
		{
			teachers.get(i).draw(marker, shift, 20);
			organisms.add(teachers.get(i));
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < studentsSize; i++)
		{
			students.get(i).draw(marker, shift, 20);
			organisms.add(students.get(i));
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < collegeStudentsSize; i++)
		{
			collegeStudents.get(i).draw(marker, shift, 20);
			organisms.add(collegeStudents.get(i));
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < cowsSize; i++)
		{
			cows.get(i).draw(marker, shift, 20);
			organisms.add(cows.get(i));
			
			shift += organismWidth;
		}
		
		for (int i = 0; i < pigsSize; i++)
		{
			pigs.get(i).draw(marker, shift, 20);
			organisms.add(pigs.get(i));
			
			shift += organismWidth;
		}
		
		if (chicks.size() > 0)
		{
			for (int i = 0; i < chicksSize; i++)
			{
				chicks.get(i).draw(marker, shift, 20);
				organisms.add(chicks.get(i));
				
				shift += organismWidth;
			}
		}

		System.out.println(""+ organisms.size());
	}
	
	public void paintComponent(Graphics g) 
	{	
		super.paintComponent(g);
		
		int x = (int)position.getX();
		
		g.setColor(Color.CYAN);
		
		if (position.getX() > 0 && position.getY() > 0)
		{	
			for (int i = 0; i < numOfOrganisms; i++)
			{
				if (x > startingPoint + i*125 + getWidth()/2 - 125/2 && x < i*125 + 125/2)
				{					
					g.fillRect(startingPoint + i*125 + getWidth()/2 - 125/2, getHeight()/2 + 50, 125, 10);
										
					if (hitEnter)
					{
						JOptionPane.showMessageDialog(null, organisms.get(i).toString());
					}
				}
			}
		}
	}
	
	
	private void readFile()
	{
		FileIO reader = new FileIO();
		String fileData = reader.readFile("data/simSchoolXML.xml");
		FileTranslator translator = new FileTranslator();
		
		people = translator.lineToPeople(fileData);
		teachers = translator.lineToTeachers(fileData);
		students = translator.lineToStudents(fileData);
		collegeStudents = translator.lineToCollegeStudents(fileData);
		cows = translator.lineToCows(fileData);
		pigs = translator.lineToPigs(fileData);
		chicks = translator.lineToChicks(fileData);
		
		peopleSize = people.size();
		teachersSize = teachers.size();
		studentsSize = students.size();
		collegeStudentsSize = collegeStudents.size();
		cowsSize = cows.size();
		pigsSize = pigs.size();
		chicksSize = chicks.size();
		
		numOfOrganisms = peopleSize + teachersSize + studentsSize + collegeStudentsSize + cowsSize + pigsSize + chicksSize;
		
		System.out.println(""+ organisms.size());
	}
	
	class MouseHandler implements MouseListener 
	{
		public void mouseClicked(MouseEvent e) 
		{
			 position = e.getPoint();
			 
			 repaint();
		}
		

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) 
		{
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class KeyHandler implements KeyListener
	{
		@Override
		public void keyTyped(KeyEvent e) 
		{	
			System.out.println("hello");
			
			hitEnter = true;
		}
	
		@Override
		public void keyPressed(KeyEvent e) 
		{
			
		}
	
		@Override
		public void keyReleased(KeyEvent e) {
	
			
		}
	}
}
