package Creation.Builder.after;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");
        */

        TourPlanBuilder cancunTourPlanBuilder = new DefaultTourPlanBuilder();
        TourPlan cancunTourPlan = cancunTourPlanBuilder
                .setTitle("칸쿤 여행")
                .setDays(3)
                .setStartDate(LocalDate.of(2020, 12, 9))
                .setWhereToStay("리조트")
                .addPlan(0, "체크인 이후 잠들기")
                .setNights(2)
                .getTourPlan();


        TourPlanBuilder oregonTourBuilder = new ShortTourPlanBuilder();
        TourPlan oregonTourPlan = oregonTourBuilder
                .setTitle("오레곤 롱비치 여행")
                .setStartDate(LocalDate.of(2021, 7, 15))
                .getTourPlan();

        cancunTourPlan = new TourDirector(new DefaultTourPlanBuilder()).getCancunTourPlan();
        oregonTourPlan = new TourDirector(new ShortTourPlanBuilder()).getCancunTourPlan();
    }
}
