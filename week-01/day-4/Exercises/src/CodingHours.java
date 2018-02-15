public class CodingHours {
    public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
        int weeks = 17;
        int workdays =5;
        int average_hours = 6;
        float hours = weeks*workdays*average_hours;
        System.out.println("Coding Hours[h]= " + hours);
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
        int average_working_hours = 52;
        float average_sum = average_working_hours*weeks;
        float percentage = (hours/average_sum)*100;
        System.out.println("Compared to a full time: " + percentage + '%');

}
}
