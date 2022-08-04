// Employee

package employee;

import static java.lang.System.*;

public class Employee {
	protected String course;

	protected void setCourse(String course) {
		this.course = course;
	}

	protected void printCourse() {
		out.println("Your current course is " + this.course);
	}
}
