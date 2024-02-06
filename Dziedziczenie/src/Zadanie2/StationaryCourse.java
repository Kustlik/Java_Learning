package Zadanie2;

public class StationaryCourse extends Course
{
    private String City;
    private int lectureAmount;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getLectureAmount() {
        return lectureAmount;
    }

    public void setLectureAmount(int lectureAmount) {
        this.lectureAmount = lectureAmount;
    }
}
