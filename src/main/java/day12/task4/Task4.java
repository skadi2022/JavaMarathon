package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Freddie Mercury");
        members1.add("Brain May");
        members1.add("Roger Taylor");
        members1.add("John Deacon");

        List<String> members2 = new ArrayList<>();
        members2.add("Kurt Cobain");
        members2.add("Krist Novoselic");
        members2.add("Dave Grohl");

        MusicBand groupA = new MusicBand("Queen", 1970, members1);
        MusicBand groupB = new MusicBand("Nirvana", 1987, members2);

        groupA.printMembers();
        groupB.printMembers();

        MusicBand.transferMembers(groupA, groupB);
        groupA.printMembers();
        groupB.printMembers();
    }
}


