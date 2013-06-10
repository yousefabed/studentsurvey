<%@ page import="studentsurvey.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="student.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${studentInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'age', 'error')} ">
	<label for="age">
		<g:message code="student.age.label" default="Age" />
		
	</label>
	<g:textField name="age" value="${studentInstance?.age}"/>
</div>

 

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'gender', 'error')} ">
	<label for="gender">
		<g:message code="student.gender.label" default="Gender" />
		
	</label>
	<g:textField name="gender" value="${studentInstance?.gender}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'grade', 'error')} ">
	<label for="grade">
		<g:message code="student.grade.label" default="Grade" />
		
	</label>
	<g:textField name="grade" value="${studentInstance?.grade}"/>
</div>

