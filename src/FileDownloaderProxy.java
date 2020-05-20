public class FileDownloaderProxy implements Downloader{
    @Override
    public void download(String userAgent, String downloadLink, String destination) {
        FileDownloader fileDownloader = new FileDownloader();
        String user = "Mozilla/5.0";
        if (userAgent.equals(user)) {
            fileDownloader.download(userAgent, downloadLink, destination);
            System.out.println("Download complete!");
        }
        else
            System.out.println("Wrong user agent!");
    }
}
