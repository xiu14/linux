package com.bytedance.feedbackerlib.service;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.activity.FeedbackActivity;
import com.bytedance.feedbackerlib.activity.LarkSSOLaunchTransitionActivity;
import com.bytedance.feedbackerlib.manager.F;
import com.bytedance.feedbackerlib.manager.k;
import com.bytedance.feedbackerlib.manager.z;
import com.bytedance.feedbackerlib.model.FeedbackCommonInfo;
import com.bytedance.feedbackerlib.model.b;
import com.bytedance.feedbackerlib.receiver.DynamicReceiver;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;
import com.bytedance.feedbackerlib.util.d;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class FloatWindowService extends Service {

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicInteger f4963g = new AtomicInteger(0);
    private static final SparseArray<h> h = new SparseArray<>();
    private static volatile boolean i = false;
    private static volatile long j = 0;
    public static final /* synthetic */ int k = 0;
    private k a;
    private F b;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f4966e = new a(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f4964c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final g f4965d = new g(null);

    /* renamed from: f, reason: collision with root package name */
    private final Object f4967f = new b(this);

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        @RequiresApi(api = 21)
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                FloatWindowService.a(FloatWindowService.this);
            } else {
                if (i != 1) {
                    return;
                }
                FloatWindowService.b(FloatWindowService.this);
            }
        }
    }

    class b extends ConnectivityManager.NetworkCallback {
        b(FloatWindowService floatWindowService) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            super.onAvailable(network);
            if (!Feedbacker.isFeedbackCommonInfoSetted() || Feedbacker.getApplicationContext() == null) {
                return;
            }
            Context applicationContext = Feedbacker.getApplicationContext();
            StringBuilder M = e.a.a.a.a.M("on_network_available->");
            M.append(System.currentTimeMillis());
            FloatWindowService.h(applicationContext, false, false, M.toString());
        }
    }

    class c implements Feedbacker.m {
        c(FloatWindowService floatWindowService) {
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.m
        public void a() {
            FloatWindowService.t(false);
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.m
        public void b(@NonNull String str) {
            FloatWindowService.t(false);
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.m
        public void c() {
            FloatWindowService.t(false);
        }
    }

    class d implements b.r {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4968c;

        d(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.f4968c = z2;
        }

        @Override // com.bytedance.feedbackerlib.model.b.r
        public void a(int i, String str) {
            com.bytedance.feedbackerlib.a.j0(this.a, "onRequestFinished invoked", e.a.a.a.a.j("resultCode=", i), e.a.a.a.a.s("msg=", str));
            if (i == 0) {
                try {
                    if (Boolean.parseBoolean(str)) {
                        com.bytedance.feedbackerlib.model.j.e J2 = com.bytedance.feedbackerlib.model.b.F().J();
                        if (J2 == null) {
                            com.bytedance.feedbackerlib.a.j0(this.a, "userProfileInfo==null", new String[0]);
                            FloatWindowService.this.l(this.b, this.f4968c, this.a);
                            z.a();
                            return;
                        }
                        String str2 = J2.b;
                        if (TextUtils.isEmpty(str2)) {
                            com.bytedance.feedbackerlib.a.j0(this.a, "email is empty", new String[0]);
                            FloatWindowService.this.l(this.b, this.f4968c, this.a);
                            z.a();
                            return;
                        }
                        com.bytedance.feedbackerlib.a.j0(this.a, "callback lark sso success", "email=" + str2);
                        DynamicReceiver.b(FloatWindowService.this.getApplicationContext(), this.a);
                        FloatWindowService.r("ShowFloatWindowForWhiteList->" + System.currentTimeMillis(), FloatWindowService.this.getApplicationContext());
                        z.a();
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            FloatWindowService.this.l(this.b, this.f4968c, this.a);
        }
    }

    class e implements b.q {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4970c;

        class a implements b.r {
            a() {
            }

            @Override // com.bytedance.feedbackerlib.model.b.r
            public void a(int i, String str) {
                com.bytedance.feedbackerlib.a.j0(e.this.a, "onRequestFinished invoked", e.a.a.a.a.j("resultCode=", i), e.a.a.a.a.s("msg=", str));
                if (i == 1) {
                    e eVar = e.this;
                    if (FloatWindowService.this.m(eVar.a)) {
                        com.bytedance.feedbackerlib.a.j0(e.this.a, "callback larkssoBypassed", new String[0]);
                        DynamicReceiver.a(FloatWindowService.this.getApplicationContext(), e.this.a);
                        z.a();
                        return;
                    }
                    e eVar2 = e.this;
                    if (eVar2.b) {
                        String str2 = eVar2.a;
                        StringBuilder M = e.a.a.a.a.M("ssoIfNeed=");
                        M.append(e.this.b);
                        com.bytedance.feedbackerlib.a.j0(str2, "start LarkSSOLaunchTransitionActivity", M.toString());
                        Context applicationContext = FloatWindowService.this.getApplicationContext();
                        e eVar3 = e.this;
                        LarkSSOLaunchTransitionActivity.C(applicationContext, eVar3.f4970c, eVar3.a);
                    }
                    z.a();
                    return;
                }
                com.bytedance.feedbackerlib.model.j.e J2 = com.bytedance.feedbackerlib.model.b.F().J();
                if (J2 != null && !TextUtils.isEmpty(J2.b)) {
                    String str3 = e.this.a;
                    StringBuilder M2 = e.a.a.a.a.M("email=");
                    M2.append(Feedbacker.getLarkSSOEmail());
                    com.bytedance.feedbackerlib.a.j0(str3, "callback lark sso success", M2.toString());
                    DynamicReceiver.b(FloatWindowService.this.getApplicationContext(), e.this.a);
                    StringBuilder sb = new StringBuilder();
                    sb.append("ShowFloatWindowForNotIntWhiteList->");
                    FloatWindowService.r(e.a.a.a.a.B(sb), FloatWindowService.this.getApplicationContext());
                    z.a();
                    return;
                }
                e eVar4 = e.this;
                if (FloatWindowService.this.m(eVar4.a)) {
                    com.bytedance.feedbackerlib.a.j0(e.this.a, "weakNetwork bypass sso", new String[0]);
                    DynamicReceiver.a(FloatWindowService.this.getApplicationContext(), e.this.a);
                    z.a();
                    return;
                }
                e eVar5 = e.this;
                if (eVar5.b) {
                    String str4 = eVar5.a;
                    StringBuilder M3 = e.a.a.a.a.M("ssoIfNeed=");
                    M3.append(e.this.b);
                    com.bytedance.feedbackerlib.a.j0(str4, "startLarkSSOLaunchTransitionActivity", M3.toString());
                    Context applicationContext2 = FloatWindowService.this.getApplicationContext();
                    e eVar6 = e.this;
                    LarkSSOLaunchTransitionActivity.C(applicationContext2, eVar6.f4970c, eVar6.a);
                }
                z.a();
            }
        }

        e(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.f4970c = z2;
        }

        @Override // com.bytedance.feedbackerlib.model.b.q
        public void a(@NonNull Boolean bool) {
            com.bytedance.feedbackerlib.a.j0(this.a, "onNetworkStateRequestFinish invoked start request user profile from server", new String[0]);
            com.bytedance.feedbackerlib.model.b.F().U(bool.booleanValue(), new a());
        }
    }

    class f implements b.p {
        final /* synthetic */ String a;

        f(String str) {
            this.a = str;
        }

        @Override // com.bytedance.feedbackerlib.model.b.p
        public void a(String str) {
            if ("success".equals(str)) {
                FloatWindowService floatWindowService = FloatWindowService.this;
                String str2 = this.a;
                int i = FloatWindowService.k;
                Objects.requireNonNull(floatWindowService);
                com.bytedance.feedbackerlib.model.b.F().P(new com.bytedance.feedbackerlib.service.c(floatWindowService, str2), com.bytedance.feedbackerlib.model.b.F().C(), str2);
                return;
            }
            Toast.makeText(FloatWindowService.this, "base apk md5 计算失败：" + str, 0).show();
        }
    }

    private class g implements ComponentCallbacks {
        g(a aVar) {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NonNull Configuration configuration) {
            FloatWindowService.this.q();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public interface h {
        void a();
    }

    static void a(FloatWindowService floatWindowService) {
        Objects.requireNonNull(floatWindowService);
        StringBuilder sb = new StringBuilder();
        sb.append("handlePollingCheck->");
        floatWindowService.i(e.a.a.a.a.B(sb));
        floatWindowService.f4966e.sendEmptyMessageDelayed(0, 500L);
    }

    static void b(FloatWindowService floatWindowService) {
        Objects.requireNonNull(floatWindowService);
        SharedPreferencesUtils.LONG_CACHE long_cache = SharedPreferencesUtils.LONG_CACHE.DURATION_PROCESS_ALIVE;
        long j2 = long_cache.get(-1L);
        if (j2 < 0) {
            long_cache.put(0L);
        } else {
            long_cache.put(j2 + com.heytap.mcssdk.constant.a.q);
        }
        floatWindowService.f4966e.sendEmptyMessageDelayed(1, com.heytap.mcssdk.constant.a.q);
    }

    public static void g(@Nullable Context context, String str) {
        h(context, false, true, str);
    }

    public static void h(@Nullable Context context, boolean z, boolean z2, String str) {
        if (TextUtils.isEmpty(str)) {
            str = System.currentTimeMillis() + "->" + f4963g.getAndIncrement();
        }
        com.bytedance.feedbackerlib.a.j0(str, "checkLarkSSOWhiteList invoked", "context=" + context, e.a.a.a.a.A("forceH5=", z), e.a.a.a.a.A("ssoIfNeed=", z2));
        if (context == null || context.getApplicationContext() == null || Feedbacker.isBypassDebug()) {
            com.bytedance.feedbackerlib.a.j0(str, "args illegal", "context=" + context, e.a.a.a.a.A("forceH5=", z), e.a.a.a.a.A("ssoIfNeed=", z2));
            return;
        }
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) FloatWindowService.class);
        intent.setAction("action_check_sso_white_list");
        intent.putExtra("extra_force_h5", z);
        intent.putExtra("extra_sso_if_need", z2);
        intent.putExtra("extra_log_id", str);
        try {
            context.getApplicationContext().startService(intent);
        } catch (Throwable unused) {
        }
    }

    @RequiresApi(api = 21)
    private void i(String str) {
        String str2;
        boolean z;
        String str3;
        boolean z2;
        String[] strArr;
        boolean z3;
        String str4 = ", mFloatWindowManager.isInitialOrFloatPicVideoOrRecordVideoState() is ";
        if (this.a == null) {
            com.bytedance.feedbackerlib.a.R("FloatWindowService show", "mFloatWindowManager is null");
            com.bytedance.feedbackerlib.a.g0(str, "ensureFloatWindowStateCorrect is invoked", "mFloatWindowManager is null");
            return;
        }
        try {
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            if (activityManager != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                HashSet hashSet = new HashSet();
                if (runningAppProcesses != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
                    z = false;
                    while (it2.hasNext()) {
                        ActivityManager.RunningAppProcessInfo next = it2.next();
                        hashSet.add(next.processName);
                        Iterator<ActivityManager.RunningAppProcessInfo> it3 = it2;
                        if (next.processName.endsWith(":feedbacker") || (strArr = next.pkgList) == null) {
                            str3 = str4;
                            z2 = z;
                        } else {
                            String packageName = getPackageName();
                            if (strArr != null) {
                                z2 = z;
                                int length = strArr.length;
                                str3 = str4;
                                int i2 = 0;
                                while (i2 < length) {
                                    int i3 = length;
                                    String str5 = strArr[i2];
                                    if (str5 != packageName) {
                                        if (str5 != null && str5.equals(packageName)) {
                                        }
                                        i2++;
                                        length = i3;
                                    }
                                    z3 = true;
                                    break;
                                }
                            } else {
                                str3 = str4;
                                z2 = z;
                            }
                            z3 = false;
                            if (z3 && next.importance == 100) {
                                z = true;
                                it2 = it3;
                                str4 = str3;
                            }
                        }
                        z = z2;
                        it2 = it3;
                        str4 = str3;
                    }
                    str2 = str4;
                } else {
                    str2 = ", mFloatWindowManager.isInitialOrFloatPicVideoOrRecordVideoState() is ";
                    z = false;
                }
                Iterator<String> it4 = this.f4964c.iterator();
                while (it4.hasNext()) {
                    if (!hashSet.contains(it4.next())) {
                        it4.remove();
                    }
                }
            } else {
                str2 = ", mFloatWindowManager.isInitialOrFloatPicVideoOrRecordVideoState() is ";
                z = false;
            }
            if ((this.f4964c.size() <= 0 && !z) || (Feedbacker.isApplicationForegroundLogic() && (!d.f.a() || this.a.x0() || !this.a.u0()))) {
                if (this.f4964c.size() <= 0 && !z && (Feedbacker.isApplicationForegroundLogic() || this.a.x0())) {
                    com.bytedance.feedbackerlib.a.R("FloatWindowService show", "mProcessesInForeground.size() is " + this.f4964c.size() + ", isApplicationForegroundImportance is " + z + ", isApplicationForegroundLogic() is " + Feedbacker.isApplicationForegroundLogic() + ", mFloatWindowManager.isShown() is " + this.a.x0());
                    com.bytedance.feedbackerlib.a.g0(str, "ensureFloatWindowStateCorrect is invoked", "mProcessesInForeground.size() is " + this.f4964c.size() + ", isApplicationForegroundImportance is " + z + ", isApplicationForegroundLogic() is " + Feedbacker.isApplicationForegroundLogic() + ", mFloatWindowManager.isShown() is " + this.a.x0());
                    Feedbacker.setApplicationForegroundLogic(false);
                    n(str);
                }
                p();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("mProcessesInForeground.size() = ");
            sb.append(this.f4964c.size());
            sb.append(",  isApplicationForegroundImportance is ");
            sb.append(z);
            sb.append(", isBoeDomain() is ");
            sb.append(d.f.a());
            sb.append(", mFloatWindowManager.isShown() is ");
            sb.append(this.a.x0());
            String str6 = str2;
            sb.append(str6);
            sb.append(this.a.u0());
            com.bytedance.feedbackerlib.a.R("FloatWindowService show", sb.toString());
            com.bytedance.feedbackerlib.a.g0(str, "ensureFloatWindowStateCorrect is invoked", "mProcessesInForeground.size() = " + this.f4964c.size() + ",  isApplicationForegroundImportance is " + z + ", isBoeDomain() is " + d.f.a() + ", mFloatWindowManager.isShown() is " + this.a.x0() + str6 + this.a.u0());
            Feedbacker.setApplicationForegroundLogic(true);
            s(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static long j() {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z, boolean z2, String str) {
        com.bytedance.feedbackerlib.a.j0(str, "handleNoSSObypassToken inovked", e.a.a.a.a.A("forceH5=", z), e.a.a.a.a.A("ssoIfNeed=", z2), e.a.a.a.a.s("logId=", str));
        if (com.bytedance.feedbackerlib.a.c0(getApplicationContext())) {
            com.bytedance.feedbackerlib.a.j0(str, "none network", new String[0]);
            Toast.makeText(this, this.b.f("network_unavailable"), 0).show();
            if (m(str)) {
                com.bytedance.feedbackerlib.a.j0(str, "callback ssoBypassed", new String[0]);
                DynamicReceiver.a(getApplicationContext(), str);
                z.a();
                return;
            }
        }
        com.bytedance.feedbackerlib.a.j0(str, "start request white list info from server", new String[0]);
        com.bytedance.feedbackerlib.model.b.F().V(new d(str, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean z, boolean z2, String str) {
        com.bytedance.feedbackerlib.a.j0(str, "handleNotInfWhiteList invoked", e.a.a.a.a.A("forceH5=", z), e.a.a.a.a.A("ssoIfNeed=", z2));
        String I = com.bytedance.feedbackerlib.model.b.F().I();
        if (!TextUtils.isEmpty(I)) {
            com.bytedance.feedbackerlib.a.j0(str, "start request network state from server", new String[0]);
            com.bytedance.feedbackerlib.model.b.F().Q(new e(str, z2, z));
            return;
        }
        com.bytedance.feedbackerlib.a.j0(str, e.a.a.a.a.s("userAccessToken=", I), new String[0]);
        if (z2) {
            com.bytedance.feedbackerlib.a.j0(str, "start LarkSSOLaunchTransitionActivity", e.a.a.a.a.A("ssoIfNeed=", z2));
            LarkSSOLaunchTransitionActivity.C(getApplicationContext(), z, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(String str) {
        com.bytedance.feedbackerlib.a.j0(str, "handleWeakNetworkState invoked", new String[0]);
        if (TextUtils.isEmpty(com.bytedance.feedbackerlib.model.b.F().I())) {
            com.bytedance.feedbackerlib.a.j0(str, "userAccessToken is empty return false", new String[0]);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = SharedPreferencesUtils.LONG_CACHE.LAST_SSO_TIMESTAMP.get(-1L);
        boolean z = currentTimeMillis - j2 < 2592000000L;
        com.bytedance.feedbackerlib.a.j0(str, "check time is valid: ", e.a.a.a.a.n("currentTimeMillis=", currentTimeMillis), e.a.a.a.a.n("lastssotimestamp=", j2), e.a.a.a.a.A("tokenValid=", z));
        return z;
    }

    private void n(String str) {
        com.bytedance.feedbackerlib.a.f0(str, "hideFeedbackFloatWindow() is invoked", new String[0]);
        if (this.a != null) {
            com.bytedance.feedbackerlib.a.f0(str, "hideFeedbackFloatWindow(): mFloatWindowManager != null", new String[0]);
            this.a.p0();
        }
    }

    public static void o(@Nullable Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) FloatWindowService.class);
        intent.setAction("action_hide_float_window");
        try {
            context.getApplicationContext().startService(intent);
        } catch (Throwable unused) {
        }
    }

    private void p() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        boolean z = false;
        Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str = it2.next().processName;
            if (str != null && !str.endsWith(":feedbacker")) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        stopForeground(true);
        stopSelf();
        Process.killProcess(Process.myPid());
    }

    public static void r(String str, @Nullable Context context) {
        com.bytedance.feedbackerlib.a.R("FloatWindowService show", "requestActivateInfoAndShowFloatWindowIfNecessary(Context context) is invoked");
        com.bytedance.feedbackerlib.a.g0(str, "requestActivateInfoAndShowFloatWindowIfNecessary(Context context) is invoked", new String[0]);
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) FloatWindowService.class);
        intent.setAction("action_request_activate_info_and_show_float_window");
        intent.putExtra("extra_log_id", str);
        try {
            context.getApplicationContext().startService(intent);
        } catch (Throwable unused) {
            com.bytedance.feedbackerlib.a.R("FloatWindowService show", "requestActivateInfoAndShowFloatWindowIfNecessary(Context context) has exception");
            com.bytedance.feedbackerlib.a.g0(str, "requestActivateInfoAndShowFloatWindowIfNecessary(Context context) has exception", new String[0]);
        }
    }

    private void s(String str) {
        com.bytedance.feedbackerlib.a.R("FloatWindowService show", "requestFeedbackerActivateInfoAndShowFloatWindowIfNecessary is invoked");
        com.bytedance.feedbackerlib.a.g0(str, "requestFeedbackerActivateInfoAndShowFloatWindowIfNecessary is invoked", new String[0]);
        if (TextUtils.isEmpty(com.bytedance.feedbackerlib.model.b.F().C())) {
            com.bytedance.feedbackerlib.model.b.F().w(this, new f(str));
        } else {
            com.bytedance.feedbackerlib.model.b.F().P(new com.bytedance.feedbackerlib.service.c(this, str), com.bytedance.feedbackerlib.model.b.F().C(), str);
        }
    }

    public static void t(boolean z) {
        i = z;
    }

    public static void u(@Nullable Context context, @Nullable FeedbackCommonInfo feedbackCommonInfo) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) FloatWindowService.class);
        intent.setAction("action_set_feedback_common_info");
        intent.putExtra("extra_feedback_common_info", feedbackCommonInfo);
        try {
            context.getApplicationContext().startService(intent);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        com.bytedance.feedbackerlib.a.R("FloatWindowService show", "showFeedbackFloatWindow() is invoked");
        com.bytedance.feedbackerlib.a.g0(str, "showFeedbackFloatWindow() is invoked", new String[0]);
        if (this.a != null) {
            com.bytedance.feedbackerlib.a.R("FloatWindowService show", "mFloatWindowManager != null");
            com.bytedance.feedbackerlib.a.g0(str, "mFloatWindowManager != null", new String[0]);
            this.a.I0(str);
        }
    }

    public static void w(@Nullable Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) FloatWindowService.class);
        intent.setAction("action_show_float_window");
        try {
            context.getApplicationContext().startService(intent);
        } catch (Throwable unused) {
        }
    }

    public static void x(@Nullable Context context, h hVar) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) FloatWindowService.class);
        intent.setAction("action_start_service_foreground");
        int andIncrement = f4963g.getAndIncrement();
        intent.putExtra("extra_invoke_id", andIncrement);
        SparseArray<h> sparseArray = h;
        synchronized (sparseArray) {
            sparseArray.put(andIncrement, hVar);
        }
        try {
            context.getApplicationContext().startService(intent);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new RuntimeException("cannot bind FloatWindowService");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Feedbacker.init(getApplication(), false);
        Feedbacker.registerLarkSSOCallback(new c(this));
        SharedPreferencesUtils.LONG_CACHE long_cache = SharedPreferencesUtils.LONG_CACHE.DURATION_PROCESS_ALIVE;
        if (long_cache.get(-1L) >= 0) {
            long_cache.put(-1L);
        }
        this.a = k.n0(getApplication());
        this.b = F.d();
        getApplication().registerComponentCallbacks(this.f4965d);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) this.f4967f);
            } catch (Throwable unused) {
            }
        }
        this.f4966e.sendEmptyMessage(0);
        this.f4966e.sendEmptyMessage(1);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f4967f);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    @RequiresApi(api = 21)
    public int onStartCommand(Intent intent, int i2, int i3) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return 1;
        }
        action.hashCode();
        switch (action) {
            case "action_process_came_to_foreground":
                String stringExtra = intent.getStringExtra("extra_process_name");
                String B = e.a.a.a.a.B(e.a.a.a.a.M("handleProcessCameToForeground->"));
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.f4964c.add(stringExtra);
                    i(B);
                }
                return 1;
            case "action_hide_float_window":
                n(e.a.a.a.a.B(e.a.a.a.a.M("handleHideFloatWindow->")));
                return 1;
            case "action_start_service_foreground":
                int intExtra = intent.getIntExtra("extra_invoke_id", -1);
                NotificationManager notificationManager = (NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION);
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("feedbackerlib.FloatWindowService", "FloatWindowService", 1));
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "feedbackerlib.FloatWindowService");
                    builder.setContentTitle(this.b.f("feedbacker_running"));
                    builder.setContentText(this.b.f("enter_feedbacker"));
                    builder.setSmallIcon(C0838R.drawable.feedbacker_inner_test);
                    builder.setContentIntent(PendingIntent.getActivity(getApplicationContext(), 0, FeedbackActivity.k0(getApplicationContext(), null), 67108864));
                    startForeground(16384, builder.build());
                }
                SparseArray<h> sparseArray = h;
                synchronized (sparseArray) {
                    h hVar = sparseArray.get(intExtra);
                    if (hVar != null) {
                        sparseArray.delete(intExtra);
                        hVar.a();
                    }
                }
                return 1;
            case "action_process_came_to_background":
                String stringExtra2 = intent.getStringExtra("extra_process_name");
                if (!TextUtils.isEmpty(stringExtra2)) {
                    String B2 = e.a.a.a.a.B(e.a.a.a.a.M("handleProcessCameToBackground->"));
                    this.f4964c.remove(stringExtra2);
                    i(B2);
                }
                return 1;
            case "action_request_activate_info_and_show_float_window":
                s(intent.getStringExtra("extra_log_id"));
                return 1;
            case "action_set_feedback_common_info":
                Feedbacker.setFeedbackCommonInfo((FeedbackCommonInfo) intent.getParcelableExtra("extra_feedback_common_info"));
                return 1;
            case "action_show_float_window":
                v(e.a.a.a.a.B(e.a.a.a.a.M("handleShowFloatWindow->")));
                return 1;
            case "action_stop_service_foreground":
                stopForeground(true);
                return 1;
            case "action_switch_to_online_domain":
                d.f.b = "https://app-alpha.bytedance.com/";
                d.f.a = "https://starling.snssdk.com/text/";
                F.d().i();
                return 1;
            case "action_check_sso_white_list":
                boolean booleanExtra = intent.getBooleanExtra("extra_force_h5", false);
                boolean booleanExtra2 = intent.getBooleanExtra("extra_sso_if_need", true);
                String stringExtra3 = intent.getStringExtra("extra_log_id");
                com.bytedance.feedbackerlib.a.j0(stringExtra3, "handleRequestLarkSSOWhiteListInfo invoked", e.a.a.a.a.A("forceH5=", booleanExtra), e.a.a.a.a.A("ssoIfNeed=", booleanExtra2), e.a.a.a.a.s("logId=", stringExtra3));
                if (Feedbacker.isFeedbackCommonInfoSetted()) {
                    j = System.currentTimeMillis();
                    if (i && booleanExtra2) {
                        com.bytedance.feedbackerlib.a.j0(stringExtra3, "already started sso return", new String[0]);
                        z.a();
                    } else {
                        if (booleanExtra2) {
                            com.bytedance.feedbackerlib.a.j0(stringExtra3, "setAlreadyStartedSSO(true)", new String[0]);
                            i = true;
                        }
                        String forceSSOToken = Feedbacker.getForceSSOToken();
                        com.bytedance.feedbackerlib.a.R("FloatWindowService", "forceSSOToken = " + forceSSOToken);
                        com.bytedance.feedbackerlib.a.j0(stringExtra3, "isForceSSO is invoked", e.a.a.a.a.s("forceSSOToken = ", forceSSOToken));
                        if (!TextUtils.isEmpty(forceSSOToken) && com.bytedance.android.input.k.b.a.G(forceSSOToken, "default_force_sso_token")) {
                            l(booleanExtra, booleanExtra2, stringExtra3);
                        } else {
                            ContentResolver contentResolver = getContentResolver();
                            String string = contentResolver != null ? Settings.Global.getString(contentResolver, "feedbacker_sso_bypass_token") : null;
                            com.bytedance.feedbackerlib.a.j0(stringExtra3, e.a.a.a.a.s("ssoBypassToken=", string), new String[0]);
                            if (TextUtils.isEmpty(string)) {
                                k(booleanExtra, booleanExtra2, stringExtra3);
                            } else {
                                com.bytedance.feedbackerlib.a.j0(stringExtra3, "handleSSOBypassToken invoked", e.a.a.a.a.s("ssoBypassToken=", string), e.a.a.a.a.A("forceH5=", booleanExtra), e.a.a.a.a.A("ssoIfNeed=", booleanExtra2), e.a.a.a.a.s("logId=", stringExtra3));
                                if ("default_sso_bypass_token".equals(string)) {
                                    com.bytedance.feedbackerlib.a.j0(stringExtra3, "start request network state from server", new String[0]);
                                    com.bytedance.feedbackerlib.model.b.F().Q(new com.bytedance.feedbackerlib.service.a(this, stringExtra3, booleanExtra, booleanExtra2));
                                } else {
                                    com.bytedance.feedbackerlib.a.j0(stringExtra3, "start check sso bypass token", new String[0]);
                                    com.bytedance.feedbackerlib.model.b.F().x(string, new com.bytedance.feedbackerlib.service.b(this, stringExtra3, booleanExtra, booleanExtra2));
                                }
                            }
                        }
                    }
                } else {
                    com.bytedance.feedbackerlib.a.j0(stringExtra3, "!Feedbacker.isFeedbackCommonInfoSetted()", new String[0]);
                    z.a();
                }
                return 1;
            case "action_switch_to_boe_domain":
                d.f.b = "https://app-alpha-boe.bytedance.net/";
                d.f.a = "https://starling.snssdk.com/text_test/";
                F.d().i();
                return 1;
            default:
                return 1;
        }
    }

    public void q() {
        StringBuilder M = e.a.a.a.a.M("ScreenOrientationChanged->");
        M.append(System.currentTimeMillis());
        String sb = M.toString();
        com.bytedance.feedbackerlib.a.R("FloatWindowService", "onScreenOrientationChanged executed!");
        k kVar = this.a;
        if (kVar != null) {
            kVar.B0(sb);
        }
    }
}
