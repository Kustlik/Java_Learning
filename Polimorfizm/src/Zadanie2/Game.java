package Zadanie2;

public class Game
{
    public static void main(String[] args)
    {
        final int TEAM_CAPACITY = 3;

        Attacker atk1 = new Attacker("sdfdsfds", 100, 100, 200, 3.2);
        Attacker atk2 = new Attacker("sddsfewfdsfds", 100, 100, 200, 1.5);
        Attacker atk3 = new Attacker("sdfdsdsfgdfds", 100, 100, 200, 5.8);

        Defender def1 = new Defender("dssdvsvds", 100, 100, 200, 1.2);
        Defender def2 = new Defender("dssdvsvds", 100, 100, 200, 8.3);
        Defender def3 = new Defender("dssdvsvdhjmhjhs", 100, 100, 200, 1.9);

        Character[] team1 = {atk1, def2, atk3};
        Character[] team2 = {def1, atk2, def3};

        double healthTeam1 = countTeamHealth(team1);
        double healthTeam2 = countTeamHealth(team2);

        if (countTeamAttack(team1) > countTeamDefense(team2))
            healthTeam2 -= (countTeamAttack(team1) - countTeamDefense(team2));
        if (countTeamAttack(team2) > countTeamDefense(team1))
            healthTeam1 -= (countTeamAttack(team2) - countTeamDefense(team1));

        if (healthTeam1 > healthTeam2)
            System.out.println("Drużyna 1 wygrała mając: " + healthTeam1 + " życia, a przeciwnik " + healthTeam2);
        else if (healthTeam2 > healthTeam1)
            System.out.println("Drużyna 2 wygrała mając: " + healthTeam2 + " życia, a przeciwnik " + healthTeam1);
        else
            System.out.println("Remis");
    }

    public static double countTeamAttack(Character[] team)
    {
        double sum = 0;
        for(Character character: team)
            sum += character.getPower();
        return sum;
    }

    public static double countTeamDefense(Character[] team)
    {
        double sum = 0;
        for(Character character: team)
            sum += character.getDefense();
        return sum;
    }

    public static double countTeamHealth(Character[] team)
    {
        double sum = 0;
        for(Character character: team)
            sum += character.getHealth();
        return sum;
    }
}
