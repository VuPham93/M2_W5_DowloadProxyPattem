import java.io.IOException;

public interface Downloader {
    void download(String userAgent, String downloadLink, String destination);
}
