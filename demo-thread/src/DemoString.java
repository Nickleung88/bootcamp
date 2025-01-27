
import java.security.spec.DSAGenParameterSpec;
import javax.swing.event.SwingPropertyChangeSupport;

public class DemoString {
  private String str;

  public void addChar(char c) {
    this.str += c;
  }

  public static void main(String[] args) {
    DemoString ds = new Demostring();
    Runnable task = () -> {
      for (int i = 0; i < 100000; i++) {
        ds.addChar('a');
      }
    };
    Thread thread1 = new Thread(task);
    thread1.start();
    Thread thread2 = new Thread(task);
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
    }
  }System.out.println(ds.getStr().length());

}
