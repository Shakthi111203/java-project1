import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean selecPizzaLoop = true;

        while(selecPizzaLoop)
    {
        System.out.println("Select pizza");
        System.out.println("a -> Regular Pizza");
        System.out.println("b -> Deluxe Pizza");

        String pizzaType = scanner.nextLine();
        String veg;
        boolean takeawayLoop = true;

        switch (pizzaType)
        {
            case "a":
                  selecPizzaLoop=false;
                  System.out.println("Select type");
                  System.out.println("a -> veg Pizza");
                  System.out.println("b -> non-veg Pizza");

                   veg = scanner.nextLine();

                  Pizza p=null;
                  switch (veg)
                  {
                    case "a":
                        p = new Pizza(true);
                        break;
                    case "b":
                        p = new Pizza(false);
                        break;
                    default:
                        System.out.println("Choose a appropriate option");
                  }

                  boolean cheeseLoop = true;

                  while(cheeseLoop)
                  {
                      System.out.println("a -> need extra cheese ? ( yes / no )");
                      String extraCheesee = scanner.nextLine();

                      if (extraCheesee.equals("yes")||extraCheesee.equals("Yes"))
                      {
                          p.addExtraCheese(true);
                          cheeseLoop = false;
                      }
                      else if (extraCheesee.equals("No")||extraCheesee.equals("no"))
                      {
                          p.addExtraCheese(false);
                          cheeseLoop = false;
                      }
                      else
                      {
                          System.out.println("Choose a correct option");
                        
                      }
                  }

                  boolean ToppingLoop = true;

                  while(ToppingLoop)
                  {
                      System.out.println("a -> need extra topping ? ( yes / no )");
                      String extraTopping = scanner.nextLine();

                      if (extraTopping.equals("yes") || extraTopping.equals("Yes"))
                      {
                          p.addExtraTopping(true);
                          ToppingLoop = false;
                      }
                      else if (extraTopping.equals("No") || extraTopping.equals("no"))
                      {
                          p.addExtraTopping(false);
                          ToppingLoop = false;
                      }
                      else
                      {
                          System.out.println("Choose a correct option");
                      }
                  }

                  

                  while (true)
                  {
                      System.out.println("a -> Dining");
                      System.out.println("b -> Takeaway");

                      String takeaway = scanner.nextLine();

                      switch (takeaway)
                      {
                          case "a":
                              p.addTakeAway(false);
                              takeawayLoop=false;
                              break;
                          case "b":
                              p.addTakeAway(true);
                              takeawayLoop=false;
                              break;
                          default:
                              System.out.println("Choose a appropriate option");
                              break;
                       }

                      p.getPizzaBill();
                  break;
                  }
            case "b":
            selecPizzaLoop=false;
            System.out.println("Select type");
            System.out.println("a -> veg Pizza");
            System.out.println("b -> non-veg Pizza");

             veg = scanner.nextLine();
        
            DeluxePizza dp=new DeluxePizza(true);
                        
            while(takeawayLoop)
            {
            System.out.println("a--> Dining");
            System.out.println("b--> takeaway");
            String takeAway=scanner.nextLine();

            if(takeAway.equals("a"))
            {
                dp.deluxeTakeaway(false);
                takeawayLoop=false;
            }
            else if(takeAway.equals("b"))
            {

                dp.deluxeTakeaway(true);
                takeawayLoop=false;    
            }
            else
            {
                 System.out.println("choosen an appropiate option");
            }
            }
              dp.deluxBill();
            
            break;


         default:
        System.out.println("Choose an appropriate option");
    }
}
}
}



