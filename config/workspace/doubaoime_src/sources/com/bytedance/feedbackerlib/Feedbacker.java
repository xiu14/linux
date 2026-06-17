package com.bytedance.feedbackerlib;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.model.FeedbackCommonInfo;
import com.bytedance.feedbackerlib.provider.FeedbackerContentProvider;
import com.bytedance.feedbackerlib.receiver.DynamicReceiver;
import com.bytedance.feedbackerlib.service.FloatWindowService;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;
import com.bytedance.lighten.core.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Feedbacker {
    private static final long DELAY_POLLING_CHECK = 300;
    private static final String KEY_FORCE_SSO = "com.bytedance.feedbackerlib.forceSSO";
    private static final String KEY_LARK_SCHEME = "com.bytedance.feedbackerlib.larkScheme";
    private static final String TAG = "Feedbacker";
    private static final int WHAT_POLLING_CHECK = 0;
    private static l sLifeCycleObserver;
    private static final Set<m> LARK_SSO_CALLBACK_SET = new HashSet();
    private static final Handler MAIN_HANDLER = new c(Looper.getMainLooper());
    private static volatile String sVersionName = null;
    private static volatile long sVersionCode = 0;
    private static volatile String sLarkScheme = null;
    private static volatile String sForceSSOToken = null;
    private static volatile Application sApplication = null;
    private static volatile FeedbackCommonInfo sFeedbackCommonInfo = null;
    private static boolean sIsProcessForeground = false;
    private static boolean sIsApplicationForeground = false;
    private static volatile boolean sIsToutiaoLoading = false;
    private static volatile boolean sIsXiguaLoading = false;
    private static volatile boolean sIsToutiaoLiteLoading = false;
    private static volatile boolean sIsBypassDebug = false;
    private static volatile boolean sIsFirstLaunchAfterUpgrade = false;
    private static volatile boolean sIsFloatWindowEnable = true;
    private static String default_wrong_did = "000000000";
    private static volatile boolean enableFeedbackFunction = true;

    public interface IFeedbackCommonInfo {
        @Nullable
        String getALogFilesDir();

        int getAid();

        @NonNull
        String getAppId();

        @NonNull
        String getChannel();

        @NonNull
        String getDid();

        @Nullable
        n getOnFeedbackClickListener();

        @Nullable
        o getOnMediasUploadFailedListener();

        @NonNull
        String getUpdateVersionCode();

        @Nullable
        String getUserId();
    }

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.feedbackerlib.a.R(Feedbacker.TAG, "onApplicationCameToForeground executed!");
            boolean unused = Feedbacker.sIsProcessForeground = true;
            String a = com.bytedance.feedbackerlib.util.h.a(Feedbacker.sApplication);
            if (a != null) {
                Application application = Feedbacker.sApplication;
                int i = FloatWindowService.k;
                if (application == null || application.getApplicationContext() == null) {
                    return;
                }
                Intent intent = new Intent(application.getApplicationContext(), (Class<?>) FloatWindowService.class);
                intent.setAction("action_process_came_to_foreground");
                intent.putExtra("extra_process_name", a);
                try {
                    application.getApplicationContext().startService(intent);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.feedbackerlib.a.R(Feedbacker.TAG, "onApplicationCameToBackground executed");
            boolean unused = Feedbacker.sIsProcessForeground = false;
            String a = com.bytedance.feedbackerlib.util.h.a(Feedbacker.sApplication);
            if (a != null) {
                Application application = Feedbacker.sApplication;
                int i = FloatWindowService.k;
                if (application == null || application.getApplicationContext() == null) {
                    return;
                }
                Intent intent = new Intent(application.getApplicationContext(), (Class<?>) FloatWindowService.class);
                intent.setAction("action_process_came_to_background");
                intent.putExtra("extra_process_name", a);
                try {
                    application.getApplicationContext().startService(intent);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    static class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        @RequiresApi(api = 17)
        public void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            Feedbacker.handlePollingCheck();
        }
    }

    static class d implements Runnable {
        final /* synthetic */ Application a;
        final /* synthetic */ boolean b;

        d(Application application, boolean z) {
            this.a = application;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Feedbacker.initInner(this.a, this.b);
        }
    }

    static class e implements Runnable {
        final /* synthetic */ IFeedbackCommonInfo a;

        e(IFeedbackCommonInfo iFeedbackCommonInfo) {
            this.a = iFeedbackCommonInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Feedbacker.isBypassDebug()) {
                return;
            }
            if (this.a == null) {
                FeedbackCommonInfo unused = Feedbacker.sFeedbackCommonInfo = null;
                FloatWindowService.u(Feedbacker.sApplication, null);
            } else {
                FeedbackCommonInfo unused2 = Feedbacker.sFeedbackCommonInfo = new FeedbackCommonInfo(this.a);
                FloatWindowService.u(Feedbacker.sApplication, Feedbacker.sFeedbackCommonInfo);
            }
        }
    }

    static class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FloatWindowService.w(Feedbacker.sApplication);
        }
    }

    static class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FloatWindowService.o(Feedbacker.sApplication);
        }
    }

    static class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Application application = Feedbacker.sApplication;
            int i = FloatWindowService.k;
            if (application == null || application.getApplicationContext() == null) {
                return;
            }
            Intent intent = new Intent(application.getApplicationContext(), (Class<?>) FloatWindowService.class);
            intent.setAction("action_switch_to_boe_domain");
            try {
                application.getApplicationContext().startService(intent);
            } catch (Throwable unused) {
            }
        }
    }

    static class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Application application = Feedbacker.sApplication;
            int i = FloatWindowService.k;
            if (application == null || application.getApplicationContext() == null) {
                return;
            }
            Intent intent = new Intent(application.getApplicationContext(), (Class<?>) FloatWindowService.class);
            intent.setAction("action_switch_to_online_domain");
            try {
                application.getApplicationContext().startService(intent);
            } catch (Throwable unused) {
            }
        }
    }

    static class j implements n {
        j() {
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.n
        public void f() {
            try {
                Feedbacker.sFeedbackCommonInfo.f();
            } catch (Throwable unused) {
            }
        }
    }

    static class k implements o {
        k() {
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.o
        public void g() {
            try {
                Feedbacker.tryInitUpload();
                Feedbacker.sFeedbackCommonInfo.g();
            } catch (Throwable unused) {
            }
        }
    }

    private static class l implements Application.ActivityLifecycleCallbacks {
        private List<Activity> a = new ArrayList();
        private List<Activity> b = new ArrayList();

        l(c cVar) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            this.b.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            this.b.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            this.a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            this.a.remove(activity);
        }
    }

    public interface m {
        void a();

        void b(@NonNull String str);

        void c();
    }

    public interface n {
        void f();
    }

    public interface o {
        void g();
    }

    private static void cancelPollingCheck() {
        MAIN_HANDLER.removeMessages(0);
    }

    private static boolean checkAndroidSystemVersion() {
        return true;
    }

    public static void clearSSOCache() {
        if (sApplication != null) {
            FeedbackerContentProvider.a(sApplication);
        }
    }

    public static void closeFeedbackFunction() {
        enableFeedbackFunction = false;
    }

    private static void commonInitOperation(@NonNull Application application) {
        sApplication = application;
        SharedPreferencesUtils.b(sApplication);
        DynamicReceiver.c(sApplication);
    }

    public static void forceInitFresco(@NonNull Context context) {
        h.b g2 = com.bytedance.lighten.core.h.g(context.getApplicationContext());
        g2.g(true);
        g2.e(Bitmap.Config.RGB_565);
        g2.h(1);
        com.bytedance.lighten.core.g.c(g2.f());
    }

    public static Integer getAid() {
        try {
            if (sFeedbackCommonInfo == null) {
                return null;
            }
            return Integer.valueOf(sFeedbackCommonInfo.getAid());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static String getAlogFilesDir() throws RemoteException {
        if (sFeedbackCommonInfo == null) {
            return null;
        }
        return sFeedbackCommonInfo.getALogFilesDir();
    }

    public static String getAppId() {
        String str = sLarkScheme;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (sFeedbackCommonInfo == null) {
                return null;
            }
            return sFeedbackCommonInfo.getAppId();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Context getApplicationContext() {
        if (sApplication == null) {
            return null;
        }
        return sApplication.getApplicationContext();
    }

    @Nullable
    public static String getChannel() {
        try {
            if (sFeedbackCommonInfo == null) {
                return null;
            }
            return sFeedbackCommonInfo.getChannel();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getDid() {
        try {
            if (sFeedbackCommonInfo != null && !TextUtils.isEmpty(sFeedbackCommonInfo.getDid())) {
                return sFeedbackCommonInfo.getDid();
            }
            return default_wrong_did;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static int getEmployeeId() {
        String c2 = FeedbackerContentProvider.c(sApplication);
        try {
            if (TextUtils.isEmpty(c2)) {
                return -1;
            }
            return Integer.valueOf(c2).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static n getFeedbackClickListener() {
        if (sFeedbackCommonInfo == null) {
            return null;
        }
        return new j();
    }

    public static String getForceSSOToken() {
        return sForceSSOToken;
    }

    @Nullable
    public static String getLarkSSOEmail() {
        return FeedbackerContentProvider.b(sApplication);
    }

    public static o getMediasUploadFailedListener() {
        if (sFeedbackCommonInfo == null) {
            return null;
        }
        return new k();
    }

    @Nullable
    public static String getUpdateVersionCode() {
        try {
            if (sFeedbackCommonInfo == null) {
                return null;
            }
            return sFeedbackCommonInfo.getUpdateVersionCode();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static String getUserAccessToken() {
        return FeedbackerContentProvider.d(sApplication);
    }

    public static String getUserId() throws RemoteException {
        if (sFeedbackCommonInfo == null) {
            return null;
        }
        return sFeedbackCommonInfo.getUserId();
    }

    public static long getVersionCode() {
        return sVersionCode;
    }

    @NonNull
    public static String getVersionName() {
        return sVersionName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:2|(1:68)(2:4|(2:6|7)(1:67)))|(11:63|64|10|11|12|13|(1:15)(3:29|(7:32|33|34|36|(1:58)(5:38|39|(2:55|(3:44|45|46)(1:48))|42|(0)(0))|47|30)|60)|(1:17)|(1:(1:28))(1:21)|22|23)|9|10|11|12|13|(0)(0)|(0)|(1:19)|(2:26|28)|22|23) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003b A[SYNTHETIC] */
    @androidx.annotation.RequiresApi(api = 17)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void handlePollingCheck() {
        /*
            android.app.Application r0 = com.bytedance.feedbackerlib.Feedbacker.sApplication
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = r0.getApplicationContext()
        La:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r2 = 0
            if (r1 == 0) goto L18
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            if (r0 != 0) goto La
            r0 = r2
        L18:
            if (r0 != 0) goto L1b
            goto L22
        L1b:
            java.lang.String r1 = "mMainThread"
            java.lang.Object r0 = com.bytedance.feedbackerlib.util.a.b(r0, r1)     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
            r0 = r2
        L23:
            java.lang.String r1 = "mActivities"
            java.lang.Object r0 = com.bytedance.feedbackerlib.util.a.b(r0, r1)     // Catch: java.lang.IllegalAccessException -> L2c
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.IllegalAccessException -> L2c
            r2 = r0
        L2c:
            r0 = 1
            r1 = 0
            if (r2 != 0) goto L32
            r3 = r1
            goto L7b
        L32:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        L3b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.String r5 = "activity"
            java.lang.Object r4 = com.bytedance.feedbackerlib.util.a.b(r4, r5)     // Catch: java.lang.Throwable -> L3b
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L56
            goto L3b
        L56:
            java.lang.String r5 = "mStopped"
            java.lang.Object r5 = com.bytedance.feedbackerlib.util.a.b(r4, r5)     // Catch: java.lang.Throwable -> L3b java.lang.IllegalAccessException -> L75
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L3b java.lang.IllegalAccessException -> L75
            if (r5 != 0) goto L61
            goto L75
        L61:
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L3b java.lang.IllegalAccessException -> L75
            if (r5 != 0) goto L75
            boolean r5 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L3b java.lang.IllegalAccessException -> L75
            if (r5 != 0) goto L75
            boolean r4 = r4.isFinishing()     // Catch: java.lang.Throwable -> L3b java.lang.IllegalAccessException -> L75
            if (r4 != 0) goto L75
            r4 = r0
            goto L76
        L75:
            r4 = r1
        L76:
            if (r4 == 0) goto L3b
            int r3 = r3 + 1
            goto L3b
        L7b:
            if (r3 <= 0) goto L7e
            goto L7f
        L7e:
            r0 = r1
        L7f:
            if (r0 == 0) goto L89
            boolean r2 = com.bytedance.feedbackerlib.Feedbacker.sIsProcessForeground
            if (r2 != 0) goto L89
            onProcessCameToForeground()
            goto L92
        L89:
            if (r0 != 0) goto L92
            boolean r0 = com.bytedance.feedbackerlib.Feedbacker.sIsProcessForeground
            if (r0 == 0) goto L92
            onProcessCameToBackground()
        L92:
            android.os.Handler r0 = com.bytedance.feedbackerlib.Feedbacker.MAIN_HANDLER
            r2 = 300(0x12c, double:1.48E-321)
            r0.sendEmptyMessageDelayed(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.Feedbacker.handlePollingCheck():void");
    }

    public static void hideFeedbackFloatWindow() {
        com.bytedance.feedbackerlib.util.k.b(new g(), sApplication);
    }

    public static void init(@NonNull Application application) {
        init(application, true);
    }

    private static void initApplicationVersionInfo() {
        try {
            PackageInfo packageInfo = sApplication.getPackageManager().getPackageInfo(sApplication.getPackageName(), 0);
            sVersionCode = packageInfo.versionCode;
            sVersionName = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            sVersionName = "0";
            sVersionCode = 0L;
        }
        SharedPreferencesUtils.LONG_CACHE long_cache = SharedPreferencesUtils.LONG_CACHE.APP_VERSION;
        long j2 = long_cache.get(-1L);
        if (j2 == -1) {
            long_cache.put(sVersionCode);
        } else if (sVersionCode > j2) {
            long_cache.put(sVersionCode);
            SharedPreferencesUtils.BOOLEAN_CACHE.HIDE_FLOAT_WINDOW.put(false);
            sIsFirstLaunchAfterUpgrade = true;
        }
    }

    private static void initIfInFeedbackerProcess() {
        initApplicationVersionInfo();
        forceInitFresco(sApplication);
        tryInitUpload();
        readMeteDataFromManifest();
        sLifeCycleObserver = new l(null);
        sApplication.registerActivityLifecycleCallbacks(sLifeCycleObserver);
    }

    private static void initIfNotInFeedbackerProcess() {
        startPollingCheck();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r3 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void initInner(@androidx.annotation.NonNull android.app.Application r2, boolean r3) {
        /*
            android.app.Application r0 = com.bytedance.feedbackerlib.Feedbacker.sApplication
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L22
            if (r2 == 0) goto L1e
            android.content.Context r3 = r2.getApplicationContext()
            if (r3 != 0) goto L12
            goto L1e
        L12:
            android.content.pm.ApplicationInfo r3 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L1e
            int r3 = r3.flags     // Catch: java.lang.Throwable -> L1e
            r3 = r3 & 2
            if (r3 == 0) goto L1e
            r3 = r0
            goto L1f
        L1e:
            r3 = r1
        L1f:
            if (r3 == 0) goto L22
            goto L23
        L22:
            r0 = r1
        L23:
            com.bytedance.feedbackerlib.Feedbacker.sIsBypassDebug = r0
            commonInitOperation(r2)
            boolean r3 = checkAndroidSystemVersion()
            if (r3 != 0) goto L37
            r2 = 0
            java.lang.String r3 = "Feedbacker"
            java.lang.String r0 = "feedbacker only supports Android 5.0 and above"
            com.bytedance.feedbackerlib.a.s(r3, r0, r2)
            return
        L37:
            java.lang.String r2 = com.bytedance.feedbackerlib.util.h.a(r2)
            if (r2 == 0) goto L49
            java.lang.String r3 = ":feedbacker"
            boolean r2 = r2.endsWith(r3)
            if (r2 == 0) goto L49
            initIfInFeedbackerProcess()
            goto L4c
        L49:
            initIfNotInFeedbackerProcess()
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.Feedbacker.initInner(android.app.Application, boolean):void");
    }

    public static boolean isApplicationForegroundLogic() {
        return sIsApplicationForeground;
    }

    public static boolean isBypassDebug() {
        return sIsBypassDebug;
    }

    public static boolean isFeedbackCommonInfoSetted() {
        return sFeedbackCommonInfo != null;
    }

    public static boolean isFeedbackFunctionEnabled() {
        return enableFeedbackFunction;
    }

    public static boolean isFirstLaunchAfterUpgrade() {
        return sIsFirstLaunchAfterUpgrade;
    }

    public static boolean isFloatWindowEnable() {
        return sIsFloatWindowEnable;
    }

    private static void larkSSO() {
        FloatWindowService.g(sApplication, e.a.a.a.a.B(e.a.a.a.a.M("init_lark_sso->")));
    }

    private static synchronized void notifyLarkSSOBypassed() {
        synchronized (Feedbacker.class) {
            for (m mVar : LARK_SSO_CALLBACK_SET) {
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    private static synchronized void notifyLarkSSOFailed() {
        synchronized (Feedbacker.class) {
            for (m mVar : LARK_SSO_CALLBACK_SET) {
                if (mVar != null) {
                    mVar.c();
                }
            }
        }
    }

    private static synchronized void notifyLarkSSOSuccess() {
        synchronized (Feedbacker.class) {
            String larkSSOEmail = getLarkSSOEmail();
            if (TextUtils.isEmpty(larkSSOEmail)) {
                return;
            }
            for (m mVar : LARK_SSO_CALLBACK_SET) {
                if (mVar != null) {
                    mVar.b(larkSSOEmail);
                }
            }
        }
    }

    private static void onProcessCameToBackground() {
        com.bytedance.feedbackerlib.util.k.b(new b(), sApplication);
    }

    private static void onProcessCameToForeground() {
        com.bytedance.feedbackerlib.util.k.b(new a(), sApplication);
    }

    private static void readMeteDataFromManifest() {
        PackageManager packageManager;
        Bundle bundle;
        Application application = sApplication;
        if (application == null || (packageManager = application.getPackageManager()) == null) {
            return;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = packageManager.getPackageInfo(application.getPackageName(), 128).applicationInfo;
        } catch (Throwable unused) {
        }
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return;
        }
        sLarkScheme = bundle.getString(KEY_LARK_SCHEME);
        sForceSSOToken = bundle.getString(KEY_FORCE_SSO);
    }

    public static synchronized void registerLarkSSOCallback(@NonNull m mVar) {
        synchronized (Feedbacker.class) {
            LARK_SSO_CALLBACK_SET.add(mVar);
        }
    }

    public static void setApplicationForegroundLogic(boolean z) {
        sIsApplicationForeground = z;
    }

    public static void setFeedbackCommonInfo(@Nullable FeedbackCommonInfo feedbackCommonInfo) {
        sFeedbackCommonInfo = feedbackCommonInfo;
        if (sFeedbackCommonInfo != null) {
            com.bytedance.feedbackerlib.util.h.b(getApplicationContext(), getAid() + "", getChannel(), getDid() + "");
            larkSSO();
        }
    }

    public static void setFloatWindowEnable(boolean z) {
        sIsFloatWindowEnable = z;
        if (z) {
            FloatWindowService.w(sApplication);
        } else {
            FloatWindowService.o(sApplication);
        }
    }

    public static void setIFeedbackCommonInfo(@Nullable IFeedbackCommonInfo iFeedbackCommonInfo) {
        com.bytedance.feedbackerlib.util.k.b(new e(iFeedbackCommonInfo), sApplication);
    }

    public static void showFeedbackFloatWindow() {
        com.bytedance.feedbackerlib.util.k.b(new f(), sApplication);
    }

    private static void startPollingCheck() {
        MAIN_HANDLER.sendEmptyMessage(0);
    }

    public static void startSSOIfNecessary() {
        if (sApplication == null) {
        }
    }

    public static void switchToBoeDomain() {
        com.bytedance.feedbackerlib.util.k.b(new h(), sApplication);
    }

    public static void switchToOnlineDomain() {
        com.bytedance.feedbackerlib.util.k.b(new i(), sApplication);
    }

    public static synchronized void tryInitUpload() {
        boolean z;
        synchronized (Feedbacker.class) {
            boolean z2 = true;
            try {
                if (!sIsToutiaoLoading) {
                    Class<?> cls = Class.forName("com.bytedance.mira.Mira");
                    com.bytedance.feedbackerlib.util.g.c(cls, "loadPlugin", "com.ss.ttm");
                    com.bytedance.feedbackerlib.util.g.c(cls, "loadPlugin", "com.ss.ttm.upload");
                    sIsToutiaoLoading = ((Boolean) com.bytedance.feedbackerlib.util.g.c(Class.forName("com.bytedance.mira.core.SafelyLibraryLoader"), "loadLibrary", "com.ss.ttm.upload", "ttvideouploader")).booleanValue();
                }
            } catch (Throwable th) {
                com.bytedance.feedbackerlib.a.s(TAG, "failed to load ttuploader plugin" + th.getMessage(), th);
            }
            try {
                if (!sIsToutiaoLiteLoading) {
                    Class<?> cls2 = Class.forName("com.bytedance.mira.Mira");
                    com.bytedance.feedbackerlib.util.g.c(cls2, "loadPlugin", "com.bytedance.article.lite.plugin.ttplayer");
                    com.bytedance.feedbackerlib.util.g.c(cls2, "loadPlugin", "com.bytedance.article.lite.plugin.necessarylib");
                    Class<?> cls3 = Class.forName("com.bytedance.mira.core.SafelyLibraryLoader");
                    sIsToutiaoLiteLoading = ((Boolean) com.bytedance.feedbackerlib.util.g.c(cls3, "loadLibrary", "com.bytedance.article.lite.plugin.necessarylib", "ttvideouploader")).booleanValue() && ((Boolean) com.bytedance.feedbackerlib.util.g.c(cls3, "loadLibrary", "com.bytedance.article.lite.plugin.necessarylib", "ttopenssl")).booleanValue();
                }
            } catch (Throwable th2) {
                com.bytedance.feedbackerlib.a.s(TAG, "failed to load ttuploader plugin" + th2.getMessage(), th2);
            }
            try {
                if (!sIsXiguaLoading) {
                    Class<?> cls4 = Class.forName("com.bytedance.mira.Mira");
                    com.bytedance.feedbackerlib.util.g.c(cls4, "loadPlugin", "com.ss.ttm");
                    com.bytedance.feedbackerlib.util.g.c(cls4, "loadPlugin", "com.ixgua.common.plugin.upload");
                    boolean booleanValue = ((Boolean) com.bytedance.feedbackerlib.util.g.c(Class.forName("e.b.c.a.a"), "loadBoringssl", new Object[0])).booleanValue();
                    Class<?> cls5 = Class.forName("com.bytedance.mira.core.SafelyLibraryLoader");
                    boolean booleanValue2 = ((Boolean) com.bytedance.feedbackerlib.util.g.c(cls5, "loadLibrary", "com.ixgua.common.plugin.upload", "ttopenssl")).booleanValue();
                    if (!booleanValue && !booleanValue2) {
                        z = false;
                        ((Boolean) com.bytedance.feedbackerlib.util.g.c(cls5, "loadLibrary", "com.ixgua.common.plugin.upload", "vcn")).booleanValue();
                        ((Boolean) com.bytedance.feedbackerlib.util.g.c(cls5, "loadLibrary", "com.ixgua.common.plugin.upload", "vcnverify")).booleanValue();
                        boolean booleanValue3 = ((Boolean) com.bytedance.feedbackerlib.util.g.c(cls5, "loadLibrary", "com.ixgua.common.plugin.upload", "ttvideouploader")).booleanValue();
                        if (z || !booleanValue3) {
                            z2 = false;
                        }
                        sIsXiguaLoading = z2;
                    }
                    z = true;
                    ((Boolean) com.bytedance.feedbackerlib.util.g.c(cls5, "loadLibrary", "com.ixgua.common.plugin.upload", "vcn")).booleanValue();
                    ((Boolean) com.bytedance.feedbackerlib.util.g.c(cls5, "loadLibrary", "com.ixgua.common.plugin.upload", "vcnverify")).booleanValue();
                    boolean booleanValue32 = ((Boolean) com.bytedance.feedbackerlib.util.g.c(cls5, "loadLibrary", "com.ixgua.common.plugin.upload", "ttvideouploader")).booleanValue();
                    if (z) {
                    }
                    z2 = false;
                    sIsXiguaLoading = z2;
                }
            } catch (Throwable th3) {
                com.bytedance.feedbackerlib.a.s(TAG, "failed to load ttuploader plugin" + th3.getMessage(), th3);
            }
        }
    }

    public static synchronized void unregisterLarkSSOCallback(@NonNull m mVar) {
        synchronized (Feedbacker.class) {
            LARK_SSO_CALLBACK_SET.remove(mVar);
        }
    }

    public static void init(@NonNull Application application, boolean z) {
        StringBuilder M = e.a.a.a.a.M("Feedbacker.init executed in thread: ");
        M.append(Thread.currentThread().getName());
        com.bytedance.feedbackerlib.a.R(TAG, M.toString());
        d dVar = new d(application, z);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            dVar.run();
        } else {
            MAIN_HANDLER.post(dVar);
        }
    }
}
