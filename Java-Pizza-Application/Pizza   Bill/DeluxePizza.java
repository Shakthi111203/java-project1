//public class DeluxePizza extends Pizza {
//    public DeluxePizza(Boolean veg) {
//        super(veg);
////        super.addExtraCheese(true);
////        super.addExtraTopping(true);
//
//    }
//}

public class DeluxePizza
{
    Pizza p = null;
    
    public DeluxePizza(Boolean veg)
    {
      if (veg)
      {
          p = new Pizza(true);
          p.addExtraCheese(true);
          p.addExtraTopping(true);
      }
      else
      {
          p = new Pizza(false);
          p.addExtraCheese(true);
          p.addExtraTopping(true);
      }

    }

    public void deluxeTakeaway (boolean takeaway)
    {
        p.addTakeAway(takeaway);
    }

    public void deluxBill ()
    {
        p.getPizzaBill();
    }
}