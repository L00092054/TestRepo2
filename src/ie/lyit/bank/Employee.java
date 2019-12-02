/**
 * Class: B.Sc. Cloud and Green IT in Computing
 * Instructor: Maria Boyle
 * Description: Employyee class
 * Date: 1/12/2019
 * @author Damien Duffy
 * @version 1.0
**/
// GitHUB URL: https://github.com/L00092054/Assignment-Solution.git

package ie.lyit.bank;

public class Employee extends Person {

	private Date startDate;
	private double salary = 0.0;
	int nextNumber;
	int number;

	/**
	 * 
	 */
	public Employee() {
		super();
		salary = 0.0;
		startDate = new Date();
		number = nextNumber;
		nextNumber++;

	}

	/**
	 * @param n
	 * @param dob
	 */
	public Employee(Name n, Date dob, Date startDate, double salary) {
		super(n, dob);
		this.startDate = startDate;
		this.salary = salary;
		number = nextNumber;
		nextNumber++;

	}

	public double calculateWage(double taxPercentage) {

		double wage = salary / 12;
		return wage -= (wage * (taxPercentage / 100));

	}

	public void incrementSalary(double incrementAmount) {
		final double MAXIMUMSALARY = 15000;
		if (salary + incrementAmount > MAXIMUMSALARY) {
			throw new IllegalArgumentException("Salary must be less than 15000" + MAXIMUMSALARY);
		} else {
			salary += incrementAmount;
		}
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNextNumber() {
		return nextNumber;
	}

	public void setNextNumber(int nextNumber) {
		this.nextNumber = nextNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [startDate=" + startDate + ", salary=" + salary + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + ", toString()=" + super.toString() + ", getDateOfBirth()=" + getDateOfBirth() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (nextNumber != other.nextNumber)
			return false;
		if (number != other.number)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

}
