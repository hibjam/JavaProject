# Java SDET - week 2 
## Contents
<ol>
<li><p><a href="https://github.com/hibjam/JavaProject#first-java-project" 
title="First Java Project">First Java Project</a></p>
<li><p> Creating a BubbleSort</p>
<li><p> Longest Palindrome Checker</p>
</li>

## First Java Project
#### What time is it?
<hr />
<p>The aim of this Java project was to create a method that would take a 
number as a single parameter ranging from 0 to 24 and return a welcome
message String based on what number was inputted. The method assumes 
that the number inputted represents a time on a 24h hour clock i.e. 15 = 3pm therefore 
would return good afternoon.
</p>
<hr/>
<p>The project could return 5 different messages depending on the number entered:
</p>
<ul>
<li>0 to <5 would return: "Go to Bed!"</li>
<li>>=5 to <12 would return: "Good Morning!" </li>
<li>>=12 to <=18 would return: "Good Afternoon!" </li>
<li>>18 to <=24 would return: "Good Evening!" </li>
<li>Any number outside this range would return a message 
saying it was not a valid time! </li>
</ul>
<hr/>

<p>The second part of this project required us to build a simple testing 
framework in order to check that the method would return the expected message 
when the correct parameter was entered. </p>
<p>Using Junit annotations such as @Test to show it is a test method and
@DisplayName to give the test a name, we created separate methods for each
possible greeting and used an assertion (assertEquals) to ensure that the
output of our App method was the correct one. The following dependencies were required 
to be added to the pom.xml file in a maven project in order to conduct testing</p>