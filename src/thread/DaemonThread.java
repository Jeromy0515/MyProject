package thread;
import java.awt.Toolkit;

public class DaemonThread {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (;;) {
                    toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true); // 데몬 스레드로 설정
        thread.start();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("비프음!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}
