import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() 
{
for(int i=0;i<Student.length;i++)
{
return students[i];
}

		return null;
	}

	@Override
public void setStudents(Student[] students)throws IllegalArgumentException{
		
try
{
               if(students==null)
{
throw new IllegalArgumentException; 
}
	}

	@Override
	public Student getStudent(int index) throws  IllegalArgumentException{
try
{
		if(index<=0 ||index>=students.length)
{
throw new IllegalArgumentException;
}
}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
for(int i=0;i<=index;i++)
{
if(i==index)
{
Student.replace("student.charAt(i)","Student.student");
}
else 
{
continue;
}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
for(i=0;i<=student.length;i++)
{
int ages;
ages=s[i].age;
if(ages==age)
{
return s[i].ages;
}
}
return null;
}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
for(i=0;i<=student.length;i++)
{
int mark;
mark=s[i].avgMark;
if(s.avgMark==mark)
{
return s[i].mark;
}
}

		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) throws IllegalArgumentException {
		try
{
if(student==null)
{
throw new IllegalArgumentException;
}
student++; 
		return null;
	}
}
