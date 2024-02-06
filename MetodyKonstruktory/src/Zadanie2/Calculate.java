package Zadanie2;

public class Calculate
{
    public static void main(String[] args)
    {
        var time = new Time();

        System.out.println("14 godzin na milisekundy to " +
                time.SecondsToMilliseconds(
                time.MinutesToSeconds(
                time.HourToMinutes(14)
                )));
    }
}
