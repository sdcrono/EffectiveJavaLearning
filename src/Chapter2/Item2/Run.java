package Chapter2.Item2;

import static Chapter2.Item2.NyPizza.Size.SMALL;
import static Chapter2.Item2.Pizza.Topping.HAM;
import static Chapter2.Item2.Pizza.Topping.ONION;
import static Chapter2.Item2.Pizza.Topping.SAUSAGE;

public class Run {
    public static void main(String arg[]) {
       Duke duke = new Duke.Builder(1, "Sword").height(160).build();
       System.out.print(duke.getForm() + duke.getHeight() + duke.getWeapon() + duke.getWeight());

       NyPizza pizza = new NyPizza.Builder(SMALL)
               .addTopping(SAUSAGE).addTopping(ONION).build();
       Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
    }
}
