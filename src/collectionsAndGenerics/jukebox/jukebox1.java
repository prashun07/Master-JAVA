package collectionsAndGenerics.jukebox;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class jukebox1{
    ArrayList<Song>songList=new ArrayList<Song>();
    public static void main(String args[]) {
        new jukebox1().go(); //go will call other functions without making main and other function static
    }
    private void go() {
        getSongs();
        System.out.println(songList);
        System.out.println("After sorting the playlist!!");
        Collections.sort(songList);
        System.out.println(songList);
    }

    private void getSongs() {
        try {
            File file = new File("src/collectionsAndGenerics/jukebox/songListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void addSong(String LineToParse) {
        String[] tokens = LineToParse.split("/");
//        songList.add(tokens[0]);
     Song song=new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
     songList.add(song);
    }
}
