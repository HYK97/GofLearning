package builder.after;

import builder.before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector TourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = TourDirector.seoulTrip();
        System.out.println("tourPlan = " + tourPlan);
    }
}
