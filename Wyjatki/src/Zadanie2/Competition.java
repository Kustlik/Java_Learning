package Zadanie2;

class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) throws AgeViolationException, MaxCompetitorsException, DuplicateException {
        if (participant.getAge() < ageLimit)
            throw new AgeViolationException("Zawodnik nie spełnia minimalnego wymaganego wieku");
        if (!hasFreeSpots())
            throw new MaxCompetitorsException("Nie ma wolnego miejsca");
        if (!checkIfUniqueId(participant))
            throw new DuplicateException("Osoba istnieje juz w bazie danych");
        participants[size] = participant;
        size++;
    }

    boolean checkIfUniqueId(Participant participant){
        for (Participant signedParticipant : participants) {
            if (signedParticipant != null) {
                if(signedParticipant.getDocumentId() == participant.getDocumentId())
                    return false;
            }
        }
        return true;
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}