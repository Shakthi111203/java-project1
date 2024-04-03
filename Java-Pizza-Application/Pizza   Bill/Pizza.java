public class Pizza {
    private int totalPrice;

    private int pizza;
    private int isExtraToppingsAdded;
    private int isExtraCheeseAdded;
    private int takeAway;

    Pizza(Boolean veg)
    {
        if(veg)
        {
            this.pizza=300;
        }
        else
        {
            this.pizza=400;
        }

        totalPrice=pizza;

    }
   public void addExtraCheese(boolean needChesse)
   {
       if(needChesse)
       {
           isExtraCheeseAdded=100;
           totalPrice+=isExtraCheeseAdded;
           
       }
       else
       {
           isExtraCheeseAdded=0;
           totalPrice+=isExtraCheeseAdded;
       }
   }
    public void addExtraTopping(boolean needTopping)
    {
        if(needTopping)
        {
            isExtraToppingsAdded=100;
            totalPrice+=isExtraToppingsAdded;
        }
        else
        {
            isExtraToppingsAdded=0;
            totalPrice+=isExtraToppingsAdded;
        }
    }
    public void addTakeAway(boolean takeaway)
    {
        if(takeaway)
        {
            takeAway=20;
            totalPrice+=takeAway;
        }
        else
        {
            takeAway=0;
            totalPrice+=takeAway;
        }
    }
    public void getPizzaBill()
    {
        System.out.println("The pizza price is "+pizza);
        System.out.println("Cheese "+isExtraCheeseAdded);
        System.out.println("Toppings "+isExtraToppingsAdded);
        System.out.println("Your total bill is "+totalPrice);

    }

















}
