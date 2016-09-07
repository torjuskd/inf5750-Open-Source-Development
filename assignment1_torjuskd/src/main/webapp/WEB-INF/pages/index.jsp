<html>
<body>

<div>
	<h2>Hello World!</h2>
	
	<h4>Message : ${message}</h4>
	<a href="http://localhost:8080/assignment1_torjuskd/hello/gruppelærer :)">If you are a puny mortal being, click here.</a>
	<br/>
	<a href="http://localhost:8080/assignment1_torjuskd/hello/The Real Slim Shady">Popstars, click here.</a>

</div>

<br />

<div>

	<h2>Leave a message</h2>
	
	 
	
	<h1>${message}</h1>
	
	<form name="input" action="/assignment1_torjuskd/send" method="get">
	
	Message content: <input type="text" name="content">
	
	<input type="submit" value="Submit">
	
	</form>
	
	<p><a href="/assignment1_torjuskd/read">Get last message</a></p>

</div>

</body>
</html>