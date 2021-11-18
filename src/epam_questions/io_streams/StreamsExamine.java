package epam_questions.io_streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class StreamsExamine {

  private static final String TEXT_PATH = "src//resources//text.txt";

  public static void main(String[] args) {
    String text = "\nI Love JAVA!";
    StreamsExamine se = new StreamsExamine();
    //se.examineFileOutputStream(text);
    //se.examineFileInputStream();
    se.examineFileReader();
  }

  public void examineFileOutputStream(String text) {
    try (FileOutputStream fos = new FileOutputStream(TEXT_PATH, true)) {
      byte[] buffer = text.getBytes();
      fos.write(buffer, 0, buffer.length);
      fos.flush();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void examineFileInputStream() {
    try (FileInputStream fis = new FileInputStream(TEXT_PATH)) {
      int i;

      StringBuilder sb = new StringBuilder();
      while ((i = fis.read()) != -1) {
        sb.append((char) i);
      }
      System.out.println(sb);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void examineFileReader() {
    try (FileReader fr = new FileReader(TEXT_PATH)) {
      int charCount;
      char[] buf = new char[3];
      StringBuilder sb = new StringBuilder();
      while ((charCount = fr.read(buf)) > 0) {
        if (charCount == 3) {
          sb.append(buf);
        }else{
          sb.append(Arrays.copyOf(buf, charCount));
        }
      }
      System.out.println(sb);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
