package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand>musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("Radiohead",1985));
        musicBandList.add(new MusicBand("Nirvana",1987));
        musicBandList.add(new MusicBand("Megadeth",1983));
        musicBandList.add(new MusicBand("Slipknot", 1995));
        musicBandList.add(new MusicBand("Led Zeppelin", 1968));
        musicBandList.add(new MusicBand("Queen", 1970));
        musicBandList.add(new MusicBand("Arctic monkeys",2002));
        musicBandList.add(new MusicBand("Daughtry",2006));
        musicBandList.add(new MusicBand("ABBA", 1972));
        musicBandList.add(new MusicBand("Skillet", 1996));

        Collections.shuffle(musicBandList);

        System.out.println(musicBandList);
        System.out.println(groupsAfter2000(musicBandList));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBandList) {
       List<MusicBand>musicBandListNew = new ArrayList<>();
       for (int i = 0; i < musicBandList.size(); i++) {
           if (musicBandList.get(i).getYear() > 2000) {
               musicBandListNew.add(musicBandList.get(i));
           }
       }
       return musicBandListNew;
    }
}