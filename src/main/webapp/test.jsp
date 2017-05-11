
<%@include file="/jsp/taglib.jsp"%>
<c:set var="title" value="Recipe" />
<%@include file="/jsp/head.jsp"%>

<script>
    $("#menu-collapse").accordion({
        header: "h3"
    });
</script>

<html>
<body>
<%@include file="/jsp/fixedNavbar.jsp"%>


<!-- Accordion -->
<section id="accordion">
    <div class="page-header">
        <h1>Accordion</h1>
    </div>
    <div id="menu-collapse">
        <div>
            <h3>First</h3>
            <div>Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet.</div>
        </div>
        <div>
            <h3>Second</h3>
            <div>Phasellus mattis tincidunt nibh.</div>
        </div>
        <div>
            <h3>Third</h3>
            <div>Nam dui erat, auctor a, dignissim quis.</div>
        </div>
    </div>
    <pre class="prettyprint linenums">
</pre>
</section>