<%@ page import="studentsurvey.Answer" %>



<div class="fieldcontain ${hasErrors(bean: answerInstance, field: 'answerText', 'error')} required">
	<label for="answerText">
		<g:message code="answer.answerText.label" default="Answer Text" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="answerText" required="" value="${answerInstance?.answerText}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: answerInstance, field: 'dateAnswered', 'error')} required">
	<label for="dateAnswered">
		<g:message code="answer.dateAnswered.label" default="Date Answered" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateAnswered" precision="day"  value="${answerInstance?.dateAnswered}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: answerInstance, field: 'groupId', 'error')} required">
	<label for="groupId">
		<g:message code="answer.groupId.label" default="Group Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="groupId" type="number" value="${answerInstance.groupId}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: answerInstance, field: 'questionId', 'error')} required">
	<label for="questionId">
		<g:message code="answer.questionId.label" default="Question Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="questionId" type="number" value="${answerInstance.questionId}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: answerInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="answer.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${studentsurvey.Student.list()}" optionKey="id" required="" value="${answerInstance?.student?.id}" class="many-to-one"/>
</div>

