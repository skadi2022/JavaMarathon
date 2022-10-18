package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand groupA, MusicBand groupB) {
        for (MusicArtist member : groupA.members)
            groupB.getMembers().add(member);
            groupA.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(members);
    }
}
