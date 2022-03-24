package pp;

import java.util.List;

public class Trainer {
private int tid;
private String name;
private List<String> students;
public void setTid(int tid) {
	this.tid = tid;
}
public void setName(String name) {
	this.name = name;
}
public void setStudents(List<String> students) {
	this.students = students;
}
public void show()
{
	System.out.println(tid+" "+name);
	for(String s:students)
	{
		System.out.println(s);
	}
}
}
