package Creation.Builder.after;

import java.time.LocalDate;

public interface TourPlanBuilder {

    public TourPlanBuilder setTitle(String title);

    public TourPlanBuilder setNights(int nights);

    public TourPlanBuilder setDays(int days);

    public TourPlanBuilder setStartDate(LocalDate startDate);

    public TourPlanBuilder setWhereToStay(String whereToStay);

    public TourPlanBuilder addPlan(int day, String plan);

    public TourPlan getTourPlan();
}
