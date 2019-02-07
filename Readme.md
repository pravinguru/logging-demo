<pattern>
        %d{dd-MM-yyyy HH:mm:ss.SSS} %magenta([%thread]) %highlight(%-5level) %logger{36}.%M - %msg%n
      </pattern>

d – outputs the time which the log message occurred in formats that SimpleDateFormat allows.


%thread – outputs the name of the thread that the log message occurred in.


$-5level – outputs the logging level of the log message.


%logger{36} – outputs the package + class name the log message occurred in. The number inside the brackets represents the maximum length of the package + class name. If the output is longer than the specified length it will take a substring of the first character of each individual package starting from the root package until the output is below the maximum length. The class name will never be reduced. A nice diagram of this can be found in the Conversion word docs.


%M – outputs the name of the method that the log message occurred in (apparently this is quite slow to use and not recommended unless your not worried about performance or the method name is particularly important to you).


%msg – outputs the actual log message.


%n – line break.


%magenta() – sets the colour of the output contained in the brackets to magenta (other colours are available).


highlight() – sets the colour of the output contained in the brackets to the depending on the logging level (for example ERROR = red).

-->When using Spring Boot, a default configuration for Logback is provided which is overridden when you add your own logback.xml. If you wish to include Spring Boot’s configuration you can add the below inside the tags.
<include resource="org/springframework/boot/logging/logback/base.xml"/>





