package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand groupA, MusicBand groupB) {
        for (String member : groupA.members)
            groupB.getMembers().add(member);
            groupA.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(members);
    }
}
