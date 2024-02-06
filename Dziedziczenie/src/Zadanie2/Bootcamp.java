package Zadanie2;

public class Bootcamp extends OnlineCourse
{
    private String coachFirstName;
    private String coachLastName;
    private int consultationHoursLeft;

    public String getCoachFirstName() {
        return coachFirstName;
    }

    public void setCoachFirstName(String coachFirstName) {
        this.coachFirstName = coachFirstName;
    }

    public String getCoachLastName() {
        return coachLastName;
    }

    public void setCoachLastName(String coachLastName) {
        this.coachLastName = coachLastName;
    }

    public int getConsultationHoursLeft() {
        return consultationHoursLeft;
    }

    public void setConsultationHoursLeft(int consultationHoursLeft) {
        this.consultationHoursLeft = consultationHoursLeft;
    }
}
