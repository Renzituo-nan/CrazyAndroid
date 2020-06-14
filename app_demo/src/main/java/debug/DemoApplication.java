package debug;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Debug;

import com.plkj.common.base.BaseApplication;
import com.plkj.common.utils.ToastUtils;
import com.plkj.crazydemo.Person;
import com.plkj.crazydemo.performanceOptimization.LaunchTimer;
import com.plkj.crazydemo.performanceOptimization.launchstarter.TaskDispatcher;
import com.plkj.crazydemo.performanceOptimization.launchstarter.task.InitBugly;
import com.plkj.crazydemo.performanceOptimization.launchstarter.task.InitThirdPartTask;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import androidx.core.os.TraceCompat;
import androidx.multidex.MultiDex;

public class DemoApplication extends BaseApplication {

    private DemoApplication mDemoApplication;

    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int CORE_POOL_SIZE = Math.max(2, Math.min(CPU_COUNT - 1, 4));
    private static final int MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;

    private CountDownLatch mCountDownLatch = new CountDownLatch(1);

    public static Context getApplication() {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mDemoApplication = this;
//        Debug.startMethodTracing("App_traceView");//开启traceView功能
//        TraceCompat.beginSection("AppOnCreate");//systrace开始点
        initThirdPart();
        initBugly();
//        Debug.stopMethodTracing();//traceView结束点
//        TraceCompat.endSection();//systrace结束点


//        这种常规获取方法耗时的方式就很不合理
/*        long time = System.currentTimeMillis();
        initThirdPart();
        long cost = System.currentTimeMillis() - time;

        time = System.currentTimeMillis();
        initBugly();
        cost = System.currentTimeMillis() - time;

        time = System.currentTimeMillis();
        initAMap();
        cost = System.currentTimeMillis() - time;

          time = System.currentTimeMillis();
        initFresco();
        cost = System.currentTimeMillis() - time;

        time = System.currentTimeMillis();
        initUmeng();
        cost = System.currentTimeMillis() - time;*/


//      关于异步优化，一个初始化对应一条线程效果更好，而有的初始化并不适合在子线程中进行，
//      比如Handler，当然也可以改造成可以在子线程进行初始化，但是有的只能在主线程中初始化
//      异步优化无法保证初始化的完成时机,若依然还是需要在子线程进行初始化，可以借助CountDownLatch完成
/*        ExecutorService executorService = Executors.newFixedThreadPool(CORE_POOL_SIZE);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                initThirdPart();
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                initBugly();
                mCountDownLatch.countDown();
            }
        });
        try {
            mCountDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

//      使用启动器的方式进行初始化优化
/*        TaskDispatcher.init(this);
        TaskDispatcher taskDispatcher = TaskDispatcher.createInstance();
        taskDispatcher.addTask(new InitBugly()).addTask(new InitThirdPartTask()).start();
        taskDispatcher.await();//有的task需要等待完成*/

        initThirdPart();
        initBugly();
    }

    private void initBugly() {

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        //该回调是应用程序收到的最早回调时间 所以选择在此埋点
        LaunchTimer.startRecord();
    }

    /**
     * 模拟为在Application中的初始化操作的耗时行为
     */
    private void initThirdPart() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            ToastUtils.showShortToast("第三方框架初始化耗时异常");
        }
    }
}
