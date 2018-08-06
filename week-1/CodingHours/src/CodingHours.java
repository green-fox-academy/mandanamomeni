public class CodingHours {
    public static void main(String[] args) {
        int weekHours = 6*5;
        int totalHours = weekHours*17;
        System.out.println("Total coding hours are " + totalHours);
        int percentage = totalHours%52;
        System.out.println("The percentage is " + percentage);
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}
