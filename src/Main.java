import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        String userWrong = "Mozilla/5.0 Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11";
        String user = "Mozilla/5.0";
        String downloadLink = "https://f9-stream.nixcdn.com/NhacCuaTui999/EmBoHutThuocChua-BichPhuongtraitimtrongvang-6281294.mp3?st=JocA_JjgSF8i-K-xaSzfjQ&e=1590046650&download=true";
        String destination = "save.mp3";

        System.out.println("Download with wrong user agent");
        fileDownloaderProxy.download(userWrong, downloadLink, destination);


        System.out.println("Download with right user agent");
        fileDownloaderProxy.download(user, downloadLink, destination);
    }
}
