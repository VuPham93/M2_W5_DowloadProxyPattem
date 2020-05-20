import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloader implements Downloader{
    @Override
    public void download(String userAgent, String downloadLink, String destination) {
        try{
            URLConnection urlConnection = new URL(downloadLink).openConnection();
            urlConnection.setRequestProperty("User Agent",userAgent);
            urlConnection.setUseCaches(false);
            Files.copy(urlConnection.getInputStream(), Paths.get(destination));
        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
