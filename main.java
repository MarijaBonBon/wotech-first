import java.awt.geom.Ellipse2D;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

 /*   var firstName = "Marija";
    var lastName = "Kotova";
    var gender = "female";
    var nationality = "Latvian";
    var age = "32";
    var heigh = "1.76";
    var weight = "fine :)";
    var eyeColor = "blue";
    
    System.out.println("This person's name is " + firstName + " " + lastName + "." + "This " + nationality + " " + gender + " is " + age + " years old." + " She is " + heigh + " meters high, and her weight is just " + weight + ". She has " + eyeColor + " eyes."); 

    
var eggPrice = 2.50;
var money = 3;
if (eggPrice <= money)
{
  System.out.println("You can buy eggs!");
}
else
{
  System.out.println("You can't buy eggs!");
}
String text = "The light is turned OFF";
    if (text == "The light is turned on")
    {
      System.out.println("The light is on");
    }
    else
    {
      System.out.println("The light is off");
    }
*/


    int temperature = 22;
    if (temperature <= 5)
    {
      System.out.println("Wear super warm clothes");
    }
    else if (temperature > 5 && temperature <= 15)
    {
      System.out.println("Wear warm clothes");
    }
    else if (temperature > 15 && temperature <= 30)
    {
      System.out.println("Wear normal clothes");
    }
    else if (temperature > 30)
    {
      System.out.println("You need cooling!");
    }
    else
    {
      System.out.println("Please enter correct temperature in Celsius!");
    }







  }
}
