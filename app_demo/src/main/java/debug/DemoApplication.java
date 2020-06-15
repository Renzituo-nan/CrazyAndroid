package debug;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StrictMode;
import android.util.Log;
import android.widget.ImageView;

import com.plkj.common.base.BaseApplication;
import com.plkj.common.utils.ToastUtils;
import com.plkj.common.utils.Utils;
import com.plkj.crazydemo.performanceOptimization.bean.NewsItem;
import com.plkj.crazydemo.performanceOptimization.launchstarter.TaskDispatcher;
import com.plkj.crazydemo.performanceOptimization.memory.ImageHook;
import com.plkj.crazydemo.performanceOptimization.tasks.InitBugly;
import com.plkj.crazydemo.performanceOptimization.tasks.InitThirdPartTask;
import com.plkj.crazydemo.performanceOptimization.utils.LaunchTimer;
import com.plkj.crazydemo.performanceOptimization.utils.LogUtils;
import com.taobao.android.dexposed.DexposedBridge;
import com.taobao.android.dexposed.XC_MethodHook;
import com.tencent.mmkv.MMKV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.CountDownLatch;

import androidx.multidex.MultiDex;

public class DemoApplication extends BaseApplication {


    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int CORE_POOL_SIZE = Math.max(2, Math.min(CPU_COUNT - 1, 4));
    private static final int MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
    private CountDownLatch mCountDownLatch = new CountDownLatch(1);
    private int mCrashTimes;
    private boolean DEV_MODE = true;

    private static Application mDemoApplication;
    public static Application getApplication() {
        return mDemoApplication;
    }
    @Override
    public void onCreate() {
        super.onCreate();

        mDemoApplication = this;

//        Top性能优化演示============================================================================

//        Debug.startMethodTracing("App_traceView");//开启traceView功能
//        TraceCompat.beginSection("AppOnCreate");//systrace开始点
//        initThirdPart();
//        initBugly();
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

        MMKV.initialize(DemoApplication.this);
        MMKV.defaultMMKV().encode("times",100);
        int times = MMKV.defaultMMKV().decodeInt("times");

        LaunchTimer.startRecord();

        TaskDispatcher.init(DemoApplication.this);

        TaskDispatcher dispatcher = TaskDispatcher.createInstance();

        dispatcher.addTask(new InitBugly())
                .addTask(new InitThirdPartTask())
                .start();
        dispatcher.await();

        LaunchTimer.endRecord();

        DexposedBridge.hookAllConstructors(ImageView.class, new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                super.afterHookedMethod(param);
                DexposedBridge.findAndHookMethod(ImageView.class, "setImageBitmap",
                        Bitmap.class, new ImageHook());
            }
        });


//        try {
//            DexposedBridge.findAndHookMethod(Class.forName("android.os.BinderProxy"), "transact",
//                    int.class, Parcel.class, Parcel.class, int.class, new XC_MethodHook() {
//                        @Override
//                        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                            LogUtils.i( "BinderProxy beforeHookedMethod " + param.thisObject.getClass().getSimpleName()
//                                    + "\n" + Log.getStackTraceString(new Throwable()));
//                            super.beforeHookedMethod(param);
//                        }
//                    });
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        BlockCanary.install(this, new AppBlockCanaryContext()).start();

        initStrictMode();

//        new ANRWatchDog().start();

//        ==========================================================================================








        initThirdPart();
        initBugly();
    }

    private void initBugly() {

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

//        Top性能优化演示============================================================================
        if(mCrashTimes > 3){
            // 删除文件，恢复到重新安装的状态
        }

        if(mCrashTimes > 5){
            // 清除热修信息
        }

        MultiDex.install(this);
        //该回调是应用程序收到的最早回调时间 所以选择在此埋点
        LaunchTimer.startRecord();

        DexposedBridge.hookAllConstructors(Thread.class, new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                super.afterHookedMethod(param);
                Thread thread = (Thread) param.thisObject;
                LogUtils.i(thread.getName()+" stack "+ Log.getStackTraceString(new Throwable()));
            }
        });


//        ==========================================================================================











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

    public String getStringFromAssets(String fileName) {
        String Result = "";
        InputStreamReader inputReader = null;
        BufferedReader bufReader = null;
        try {
            inputReader = new InputStreamReader(getResources().getAssets().open(fileName));
            bufReader = new BufferedReader(inputReader);
            String line = "";
            while ((line = bufReader.readLine()) != null) {
                Result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputReader != null) {
                try {
                    inputReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufReader != null) {
                try {
                    bufReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return Result;
    }


    private void initStrictMode() {
        if (DEV_MODE) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectCustomSlowCalls() //API等级11，使用StrictMode.noteSlowCode
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()// or .detectAll() for all detectable problems
                    .penaltyLog() //在Logcat 中打印违规异常信息
                    .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectLeakedSqlLiteObjects()
                    .setClassInstanceLimit(NewsItem.class, 1)
                    .detectLeakedClosableObjects() //API等级11
                    .penaltyLog()
                    .build());
        }
    }
}
