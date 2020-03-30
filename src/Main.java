import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String albumName = "ARMS";
// D:\OneDrive - The University of Nottingham\Music Backup
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/ben/Music/" + albumName));
        System.out.println(br.toString());
        br.close();
    }
}
