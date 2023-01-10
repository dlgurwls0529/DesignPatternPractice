package Creation.Builder.after;

import java.time.LocalDate;
import java.util.List;

public class ShortTourPlanBuilder implements TourPlanBuilder{

    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> plans;

    @Override
    public TourPlanBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder setNights(int nights) {
        return null;
    }

    @Override
    public TourPlanBuilder setDays(int days) {
        return null;
    }

    @Override
    public TourPlanBuilder setStartDate(LocalDate startDate) {
        return null;
    }

    @Override
    public TourPlanBuilder setWhereToStay(String whereToStay) {
        return null;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getTourPlan() {
        return new TourPlan(
            title,
            nights,
            days,
            startDate,
            whereToStay,
            plans
        );
    }
}
