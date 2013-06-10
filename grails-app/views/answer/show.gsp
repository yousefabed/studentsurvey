
<%@ page import="studentsurvey.Answer" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'answer.label', default: 'Answer')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-answer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-answer" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list answer">
			
				<g:if test="${answerInstance?.answerText}">
				<li class="fieldcontain">
					<span id="answerText-label" class="property-label"><g:message code="answer.answerText.label" default="Answer Text" /></span>
					
						<span class="property-value" aria-labelledby="answerText-label"><g:fieldValue bean="${answerInstance}" field="answerText"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${answerInstance?.dateAnswered}">
				<li class="fieldcontain">
					<span id="dateAnswered-label" class="property-label"><g:message code="answer.dateAnswered.label" default="Date Answered" /></span>
					
						<span class="property-value" aria-labelledby="dateAnswered-label"><g:formatDate date="${answerInstance?.dateAnswered}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${answerInstance?.groupId}">
				<li class="fieldcontain">
					<span id="groupId-label" class="property-label"><g:message code="answer.groupId.label" default="Group Id" /></span>
					
						<span class="property-value" aria-labelledby="groupId-label"><g:fieldValue bean="${answerInstance}" field="groupId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${answerInstance?.questionId}">
				<li class="fieldcontain">
					<span id="questionId-label" class="property-label"><g:message code="answer.questionId.label" default="Question Id" /></span>
					
						<span class="property-value" aria-labelledby="questionId-label"><g:fieldValue bean="${answerInstance}" field="questionId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${answerInstance?.student}">
				<li class="fieldcontain">
					<span id="student-label" class="property-label"><g:message code="answer.student.label" default="Student" /></span>
					
						<span class="property-value" aria-labelledby="student-label"><g:link controller="student" action="show" id="${answerInstance?.student?.id}">${answerInstance?.student?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${answerInstance?.id}" />
					<g:link class="edit" action="edit" id="${answerInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
