package Zadanie2;

import java.util.Scanner;

class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.println("Podaj nazwę zawodów:");
        String competitionName = scanner.nextLine();
        System.out.println("Podaj maksymalną liczbę uczestników:");
        int maxParticipants = scanner.nextInt();
        System.out.println("Podaj ograniczenie wiekowe:");
        int ageLimit = scanner.nextInt();
        scanner.nextLine();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant participant = createParticipant();
            try{
                competition.addParticipant(participant);
            }
            catch (AgeViolationException e){

            }
            catch (DuplicateException e) {

            }
            catch (MaxCompetitorsException e){

            }
        }
    }

    private int readPositiveNumber()
    {
        try{
            int number = scanner.nextInt();
            if (number < 0)
                throw new IllegalArgumentException("Wprowadzono wartość mniejszą niż 0");
        }
        finally {
            scanner.nextLine();
        }
    }

    private Participant createParticipant() {
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj id (np. pesel):");
        String id = scanner.nextLine();
        System.out.println("Podaj wiek:");
        int age = scanner.nextInt();
        scanner.nextLine();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }
}