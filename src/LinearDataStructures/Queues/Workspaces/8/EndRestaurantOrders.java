public class RestaurantOrders {

    public Queue headChef = new Queue(3);
    public Queue sousChef = new Queue(3);
    public Queue waitingList = new Queue();

    public void assign(String[] orders) {
        for (String order : orders) {
            try {
                headChef.enqueue(order);
                System.out.println("Order for " + order + " taken by Head Chef.");
            } catch (Error e) {
                if (sousChef.hasSpace()) {
                    sousChef.enqueue(order);
                    System.out.println("Head Chef is busy! Assign " + order + " order to Sous Chef.");

                } else {
                    System.out.println("Both chefs are busy! Add " + order + " order to the waiting list.");
                    waitingList.enqueue(order);
                }

            }
        }
        System.out.println("--------------------");
        System.out.println("You've got just " + waitingList.size + " orders on the waiting list. Keep up the hard work chefs!");
    }
}
