package studentsurvey

class Student {

	String name;
	String gender;
	String grade;
	String age;
	
	static hasMany = [answers:Answer];
    static constraints = {
	 name(blank: false)
    }

 
}
