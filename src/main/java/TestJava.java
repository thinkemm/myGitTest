import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class TestJava {
    public static void main(String[] args) {
        System.out.println("123");

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,4,1000L, TimeUnit.SECONDS,new LinkedBlockingDeque<>());

        ReentrantLock r = new ReentrantLock();
        r.lock();


    }
}

