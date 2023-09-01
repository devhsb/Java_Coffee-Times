import java.util.LinkedList;

class main {
    public static void main(String[] args) {
        Album album = new Album("Fav Songs", "None");
        album.addSong("Songs1", 60);
        album.addSong("Songs2", 120);

        LinkedList<Song> playlist1 = album.getSongs();

        album.addToPlayList("MyPlaylist", playlist1);

        for(Song song: playlist1) {
            System.out.println(song.getTitle());
        }

        
    }
}