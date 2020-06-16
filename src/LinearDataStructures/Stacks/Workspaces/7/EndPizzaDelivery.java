public class PizzaDelivery {

    public Stack deliveryGal;
    public Stack pizzaHouse;

    public PizzaDelivery() {
        // Instantiate deliveryGal and pizzaHouse stacks below
        this.deliveryGal = new Stack(4);
        this.pizzaHouse = new Stack();

    }

    public void assign(String [] pizzas) {
        for (String pizza : pizzas) {
            try {
                // Push pizzas onto deliveryGal and print the update
                deliveryGal.push(pizza);
                System.out.println(pizza + " pizza was added to the deliveryGal stack.");
                
            } catch (Error e) {
                // Push pizzas onto pizzaHouse and print the update
                pizzaHouse.push(pizza);
                System.out.println("deliveryGal left to make deliveries! " + pizza + " pizza was added to the pizzaHouse stack.");
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
            String pizzaType = deliveryGal.pop();
            System.out.println(pizzaType + " pizza was delivered!");
        }
    }
    public static void main(String[]args) {
        String [] pizzas = {"pepperoni","cheese","veggie","meat","hawaiian", "margherita"};
        PizzaDelivery pizzaDelivery = new PizzaDelivery();
        pizzaDelivery.assign(pizzas);
        pizzaDelivery.deliver();
    }
}
