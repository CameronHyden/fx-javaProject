# Welcome to my fx-javaProject
<H2> Overview </h2>

 have created a Spring Boot application, that can read from a CSV file and sort into an array of objects, which have been stored in a database,
the Spring application has been set up with multiple, functioning endpoints. Ready to be implimented into a frontEnd code base.

<h3> Key features </h3>
- Functionality to apply a bid/ask commission to the prices. <br>
- Functionality to sort the FxPrices and deliver the latest prices first. <br>
- Functionality to sort the FxPrices to just deliver the lastest price.<br>
- Functionality to read a CSV file and instantiate/ store new objects from the data.<br>

<h3> Testing </h3>
- Test to check the commission method is return the correct result. <br>
- Test to ensure the prices are being processed correctly, so there is no missing data from the.CSV

<H3> End to End </h3>
- I began to implement some integrated testing, to try and create test methods to mimic a user triggering my get requests. With the help of SpringBoot Tests and Mockmvc, to essentially create a mock of my controller, this way the tests would be more isolated(less costly to run) and I would be able to test all my request methods.




