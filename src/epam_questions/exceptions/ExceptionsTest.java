package epam_questions.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class ExceptionsTest {

  public static void main(String[] args) {

    try{
      new ExceptionsTest().foo();
    }catch(MyException e){
      System.out.println("Method foo has thrown exception" + e);
    }catch(FileNotFoundException e){
      System.out.println("Method foo has thrown exception" + e);
    }finally{

    }

    try{
      new ExceptionsTest().foo();
    }catch(MyException | FileNotFoundException e){
      System.out.println("Method foo has thrown exception" + e);
    }

    try(FileOutputStream fos = new FileOutputStream("src//resources//text.txt", true)){
      byte[] buffer = "Java is the best!".getBytes();
      fos.write(buffer, 0, buffer.length);
      fos.flush();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void foo() throws MyException, FileNotFoundException{
    if(new Random().nextBoolean()){
      throw new MyException("Something went wrong");
    }else{
      throw new FileNotFoundException();
    }
  }

}

class MyException extends Exception{

  public MyException(String message) {
    super(message);
  }

  public MyException(Throwable cause) {
    super(cause);
  }


}