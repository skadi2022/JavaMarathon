package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Freddie Mercury", 44));
        members1.add(new MusicArtist("Brain May", 43));
        members1.add(new MusicArtist("Roger Taylor", 41));
        members1.add(new MusicArtist("John Deacon", 39));

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Kurt Cobain", 23));
        members2.add(new MusicArtist("Krist Novoselic", 25));
        members2.add(new MusicArtist("Dave Grohl", 21));

        MusicBand groupA = new MusicBand("Queen", 1970, members1);
        MusicBand groupB = new MusicBand("Nirvana", 1987, members2);

        groupA.printMembers();
        groupB.printMembers();

        MusicBand.transferMembers(groupA, groupB);
        groupA.printMembers();
        groupB.printMembers();
    }
}
