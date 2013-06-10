package studentsurvey

class Answer {

	String answerText;
	int questionId;
	Date dateAnswered;
	int groupId;
	
     static belongsTo = [student: Student]
	
    static constraints = {
	answerText (blank:false)
	dateAnswered (blank:false)
    }
	
}
