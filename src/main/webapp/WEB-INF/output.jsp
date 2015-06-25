<%--
  Created by IntelliJ IDEA.
  User: mikhail.peredirey
  Date: 24.06.2015
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="i18n.messages">
  <html>
  <head lang="en">
    <title><fmt:message key="title"/></title>
    <link rel="stylesheet" href="style/style.css" type="text/css">
      <%--<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">--%>
  </head>
  <body>
    <%--<script src="http://code.jquery.com/jquery-latest.js"></script>--%>
    <%--<script src="js/bootstrap.min.js"></script>--%>
  <h1><fmt:message key="head"/></h1>

  <h2><fmt:message key="output.text.submitted"/></h2>
    ${text}
  <h2><fmt:message key="output.text.source"/></h2>
    ${text.toSourceString()}

    <%--<h2><fmt:message key="output.text.sentence"/></h2>--%>
  <c:forEach var="sent" items="${result}" varStatus="loop">
    <br>${loop.index+1}. ${sent}<br>
  </c:forEach>
    <%--<h2><fmt:message key="output.text.word"/></h2>--%>
    <%--<c:forEach var="sent" items="${word}" varStatus="loop">--%>
    <%--<br> <a>${loop.index}. ${sent}</a><br>--%>
    <%--</c:forEach>--%>
    <%--<h2><fmt:message key="output.text.letter"/></h2>--%>
    <%--<c:forEach var="sent" items="${letter}" varStatus="loop">--%>
    <%--<br> <a>${loop.index}. ${sent}</a><br>--%>
    <%--</c:forEach>--%>

  </body>
  </html>
</fmt:bundle>

