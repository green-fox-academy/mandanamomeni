//Fleet of Things
//    You have the Thing class
//You have the Fleet class
//You have the FleetOfThings class with a main method
//    Download those, use those
//    In the main method create a fleet
//    Achieve this output:
//    1. [ ] Get milk
//    2. [ ] Remove the obstacles
//    3. [x] Stand up
//    4. [x] Eat lunch
public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing thing0 = new Thing("Get milk");
    Thing thing1 = new Thing("Remove obstacles");
    Thing thing2 = new Thing("Stand up");
    Thing thing3 = new Thing("Eat lunch");

    fleet.add(thing0);
    fleet.add(thing1);
    fleet.add(thing2);
    fleet.add(thing3);

    thing2.complete();
    thing3.complete();

    System.out.println(fleet);

  }
}









