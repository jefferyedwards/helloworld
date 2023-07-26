package net.edwardsonthe;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

  public void sayHello() {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy");
    final LocalDateTime now = LocalDateTime.now();
    System.out.println("\n>>>>> Hello, World! The current time is " + dtf.format(now) + "!\n");    
  }

  public static void main(final String[] args) {
    new HelloWorld().sayHello();
  }

}
