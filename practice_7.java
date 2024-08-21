//The Do/While Loop exapmle
public class Main {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i <= 20);  
  }
}

//the while loop, we have created a simple "countdown" program
public class Main{
  public static void main(String[] args)
  {
    int countdown = 10;
    while (countdown>0){
      System.out.println(countdown);
      countdown--;
    }
    System.out.println(" happy new year");
  }
}
//while loop combined with an if else statement, let's say we play a game of Yatzy
//Print "Yatzy!" If the dice number is 6:
public class Main{
  public static void main(String[] args)
  {
    int dice = 1;

while (dice <= 6) {
  if (dice < 6) {
    System.out.println("No Yatzy.");
  } else {
    System.out.println("Yatzy!");
  }
  dice = dice + 1;
}
  }
}

  
