public class PizzaDelivery {

    public Stack deliveryGal;
    public Stack pizzaHouse;

    public PizzaDelivery() {
        // Instantiate deliveryGal and pizzaHouse stacks below

    }

    public void assign(String [] pizzas) {
        for (String pizza : pizzas) {
            try {
                // Push pizzas onto deliveryGal and print the update


            } catch (Error e) {
                // Push pizzas onto pizzaHouse and print the update

            }
        }
        System.out.println("---------------------------");
        System.out.println("Deliveries are underway...");
        System.out.println("---------------------------");
    }
    public void deliver() {
        int numPizzas = deliveryGal.size;
        for (int i = 0; i < numPizzas; i++) {
            // Pop off each pizza from deliveryGal and print the update
            
        }
    }
    public static void main(String[]args) {
        String [] pizzas = {"pepperoni","cheese","veggie","meat","hawaiian", "margherita"};
        PizzaDelivery pizzaDelivery = new PizzaDelivery();
        pizzaDelivery.assign(pizzas);
        pizzaDelivery.deliver();
    }
}
