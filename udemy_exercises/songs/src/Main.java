package src;

import java.util.*;

public class Main {

  private static ArrayList<Album> albums = new ArrayList<Album>();

  public static void main(String[] args) {

    Album album = new Album("Metropolis pt.2: Scenes from a Memory", "Dream Theater");
    album.addSong("Scene One: Regression", 2.06);
    album.addSong("Scene Two: I. Overture 1928", 3.37);
    album.addSong("Scene Two: II. Strange Deja Vu", 5.12);
    album.addSong("Scene Three: I. Through My Words", 1.02);
    album.addSong("Scene Three: II. Fatal Tragedy", 6.49);
    album.addSong("Scene Four: Beyond This Life", 11.22);
    album.addSong("Scene Five: Through Her Eyes", 5.29);
    album.addSong("Scene Six: Home", 12.53);
    album.addSong("Scene Seven: I. The Dance of Eternity", 6.13);
    album.addSong("Scene Seven: II. One Last Time", 3.46);
    album.addSong("Scene Eight: The Spirit Carries On", 6.38);
    album.addSong("Scene Nine: Finally Free", 11.59);
    albums.add(album);

    album = new Album("Ghost Reveries", "Opeth");
    album.addSong("Ghost of Perdition", 10.29);
    album.addSong("The Baying of the Hounds", 10.41);
    album.addSong( "Beneath the Mire", 7.57);
    album.addSong("Atonement", 5.23);
    album.addSong( "Reverie/Harlequin Forest", 11.39);
    album.addSong( "Hours of Wealth", 5.20);
    album.addSong("The Grand Conjuration", 10.21);
    album.addSong( "Isolation Years", 3.51);
        albums.add(album);

    LinkedList<Song> playList = new LinkedList<Song>();
    albums.get(0).addToPlayList("Scene One: Regression", playList);
    albums.get(0).addToPlayList("Scene Three: I. Through My Words", playList);
    albums.get(0).addToPlayList("Scene Four: Beyond This Life", playList);
    albums.get(0).addToPlayList(11, playList);
    albums.get(0).addToPlayList("Isolation Years", playList);  //Song not on current album
    albums.get(1).addToPlayList(1, playList);
    albums.get(1).addToPlayList(5, playList);
    albums.get(1).addToPlayList(7, playList);
    albums.get(1).addToPlayList(18, playList); //No track 18

    play(playList);

  }

  private static void play(LinkedList<Song> playList) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean forward = true;
    ListIterator<Song> listIterator = playList.listIterator();
    if(playList.size() == 0) {
      System.out.println("No songs in playlist");
      return;
    } else {
      System.out.println("Now playing " + listIterator.next().toString());
      printMenu();
    }

    while(!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();

      switch(action) {
        case 0:
          System.out.println("Playlist complete.");
          quit = true;
          break;
        case 1:
          if(!forward) {
            if(listIterator.hasNext()) {
              listIterator.next();
            }
            forward = true;
          }
          if(listIterator.hasNext()) {
            System.out.println("Now playing " + listIterator.next().toString());
          } else {
            System.out.println("We have reached the end of the playlist");
            forward = false;
          }
          break;

        case 2:
          if(forward) {
            if(listIterator.hasPrevious()) {
              listIterator.previous();
            }
            forward = false;
          }
          if(listIterator.hasPrevious()) {
            System.out.println("Now playing " + listIterator.previous().toString());
          } else {
            System.out.println("We are at the start of the playlist");
            forward = true;
          }
          break;
        case 3:
          if(forward) {
            if(listIterator.hasPrevious()) {
              System.out.println("Now replaying " + listIterator.previous().toString());
              forward = false;
            } else {
              System.out.println("We are at the start of the list");
            }
          } else {
            if(listIterator.hasNext()) {
              System.out.println("Now replaying " + listIterator.next().toString());
              forward = true;
            } else {
              System.out.println("We have reached the end of the list");
            }
          }
          break;
        case 4:
          printList(playList);
          break;
        case 5:
          printMenu();
          break;

        case 6:
          if(playList.size() >0) {
            listIterator.remove();
            if(listIterator.hasNext()) {
              System.out.println("Now playing " + listIterator.next());
            } else if(listIterator.hasPrevious()) {
              System.out.println("Now playing " + listIterator.previous());
            }
          }
          break;

      }
    }
  }

  private static void printMenu() {
    System.out.println("Available actions:\npress");
    System.out.println("0 - to quit\n" +
        "1 - to play next song\n" +
        "2 - to play previous song\n" +
        "3 - to replay the current song\n" +
        "4 - list songs in the playlist\n" +
        "5 - print available actions.\n" +
        "6 - delete current song from playlist");

  }


  private static void printList(LinkedList<Song> playList) {
    Iterator<Song> iterator = playList.iterator();
    System.out.println("================================");
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("================================");
  }

}
