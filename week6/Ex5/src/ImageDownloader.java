import java.io.*;
import java.net.*;

public class ImageDownloader {

    public static void saveImage(String imageUrl) {
        InputStream is = null;
        OutputStream os = null;

        try {
            // Create a URL object from the given image URL
            URL url = new URL(imageUrl);
            String fileName = url.getFile();
            String destName = "./figures" + fileName.substring(fileName.lastIndexOf("/"));

            System.out.println("Saving image to: " + destName);

            // Open the input stream from the URL
            is = url.openStream();

            // Create output stream for saving the file locally
            os = new FileOutputStream(destName);

            byte[] b = new byte[2048];
            int length;

            // Read and write the data in chunks
            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }

        } catch (MalformedURLException e) {
            // Handles invalid URL format
            System.out.println("Error: The URL is malformed.");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // Handles file-related errors (e.g., destination directory not found)
            System.out.println("Error: The destination directory does not exist or file cannot be written.");
            e.printStackTrace();
        } catch (IOException e) {
            // Handles IO errors during file reading/writing
            System.out.println("Error: An I/O error occurred.");
            e.printStackTrace();
        } finally {
            // Ensure streams are closed properly
            try {
                if (is != null) {
                    is.close();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Failed to close streams.");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String imageUrl = "https://example.com/path/to/image.jpg";
        saveImage(imageUrl);
    }
}
