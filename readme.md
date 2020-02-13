## A simple application that demonstrate Accessing MySQL database from Android through RESTful Web Service
#### The overall architecture is as follows 

![](https://miro.medium.com/max/1042/1*e0kwuCoRjPqP_DkcZwGTtQ.png)

#### Test the application
(Note that the application expects that you have a database scheme already created, with at least one table, named ```test```, and having a column ```name``` that is of type VARCHAR(10))
1. Run the Web server 
    1. Open the FoodServer in eclipse
    2. Renam the db.properties.template to db.properties
    3. Fill the db.properties file with the specific database connection information 
    4. Modify the jetty server (file JettyStart.java)) by filling the ip filed to be your local machine
    ```server.addListener("localhost:8080");``` // replace localhost with the IP of your machine
    5. Run the Jetty Server (file JettyStart.java), you can run it as a simple Java application 
2. Test the Android App (open the app folder in Android studio): 
    1. Assume your IP address is: 123.123.123.123, go to the url: 
        1. 123.123.123.123:8080/JDBC
        2. 123.123.123.123:8080/Hello (note that this GET command executed the doGet90 method in the class Hello) 
        3. 123.123.123.123:8080/JDBC (note that this GET command executed the doGet90 method in the class HelloJDBC) 
    2. Hint: you can check the ip of your machine using the ifconfig command
    3. Important: For the 123.123.123.123:8080/JDBC to work, you need to create a database with a table food, and one column name.
3. Call the Restful web service from the Android application  
    1. In the ServletFoodManager application change the IP to your IP address (the one described in 6.1)
    2. Open the AndroidManifest file, there are few important changes here: 
```<uses-permission android:name="android.permission.INTERNET" />```
```<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />```

```android:usesCleartextTraffic="true"```
 
:exclamation: Remember: We practiced Restful WebServices in CS2002, we looked at the RestEasy Framework. 
Have a look at the CS2002 lab sheet on Restful services and see how you can combine it with Jetty.  
