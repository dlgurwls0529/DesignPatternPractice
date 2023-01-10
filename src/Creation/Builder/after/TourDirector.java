package Creation.Builder.after;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan getCancunTourPlan() {
        return this.tourPlanBuilder
                .setTitle("칸쿤 여행")
                .setDays(3)
                .setStartDate(LocalDate.of(2020, 12, 9))
                .setWhereToStay("리조트")
                .addPlan(0, "체크인 이후 잠들기")
                .setNights(2)
                .getTourPlan();
    }

    public TourPlan getOregonTourPlan() {
        return this.tourPlanBuilder
                .setTitle("오레곤 롱비치 여행")
                .setStartDate(LocalDate.of(2021, 7, 15))
                .getTourPlan();
    }
}
