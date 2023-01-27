package Behavior.Mediator._e2_;

public class Main {
    public static void main(String[] args) {
        // Mediator mediator = new FrontDesk();
        Mediator pseudoMediator = new PseudoMediator();
        Guest guest1 = new Guest(pseudoMediator, "gtw");
        Guest guest2 = new Guest(pseudoMediator, "mj");
        Gym gym = new Gym(pseudoMediator);
        CleaningService cleaningService = new CleaningService(pseudoMediator);
        Restaurant restaurant = new Restaurant(pseudoMediator);

        pseudoMediator.addUser(guest1);
        pseudoMediator.addUser(guest2);
        pseudoMediator.addUser(gym);
        pseudoMediator.addUser(restaurant);
        pseudoMediator.addUser(cleaningService);

        guest1.getTower(3);
        guest2.eatDinner();
        restaurant.clean();
        gym.clean();
    }
}
