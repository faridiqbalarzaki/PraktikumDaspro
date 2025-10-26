package Jobsheet05;

import java.util.Scanner;

public class pemilihanHari_09 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String dayName, dayType;

    System.out.print("Input day name: ");
    dayName = sc.nextLine();

    switch (dayName.toLowerCase()) {
      case "monday":
      case "tuesday":
      case "wednesday":
      case "thusday":
      case "friday":
        dayType = "weekday";

        break;
      case "saturday":
      case "sunday":
        dayType = "weekend";
        break;
      default:
        dayType = "invalid day name";
    }
    System.out.println(dayName + " is a " + dayType);
  }
}
