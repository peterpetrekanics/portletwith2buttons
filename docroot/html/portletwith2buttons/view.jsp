<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Portletwith2buttons</b> portlet in View mode.

<portlet:actionURL var="buttonActionURL" windowState="normal"
name="javaActionMethod">
</portlet:actionURL>

 <form action="<%=buttonActionURL%>" name="buttonPressed"  method="POST">
	<input type="submit" name="button1" id="buttonID1" value="Button 1"/>
	<input type="submit" name="button1" id="buttonID2" value="Button 2"/>
</form>
