package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.HiAnalyticsOfCpUtils;
import com.huawei.hms.stats.HianalyticsExist;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AnalyticsSwitchHolder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class HiAnalyticsUtils {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7453c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f7454d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static HiAnalyticsUtils f7455e;
    private int a = 0;
    private final boolean b = HianalyticsExist.isHianalyticsExist();

    class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f7456c;

        a(Context context, String str, Map map) {
            this.a = context;
            this.b = str;
            this.f7456c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent(this.a, this.b, this.f7456c);
        }
    }

    class b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7458c;

        b(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.f7458c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent2(this.a, this.b, this.f7458c);
        }
    }

    class c implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f7460c;

        c(Context context, String str, Map map) {
            this.a = context;
            this.b = str;
            this.f7460c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.a, this.b, this.f7460c);
        }
    }

    class d implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f7462c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7463d;

        d(Context context, String str, Map map, int i) {
            this.a = context;
            this.b = str;
            this.f7462c = map;
            this.f7463d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.a, this.b, this.f7462c, this.f7463d);
        }
    }

    class e implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f7465c;

        e(Context context, String str, Map map) {
            this.a = context;
            this.b = str;
            this.f7465c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.a, this.b, this.f7465c);
        }
    }

    class f implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f7467c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7468d;

        f(Context context, String str, Map map, int i) {
            this.a = context;
            this.b = str;
            this.f7467c = map;
            this.f7468d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.a, this.b, this.f7467c, this.f7468d);
        }
    }

    private HiAnalyticsUtils() {
    }

    private static LinkedHashMap<String, String> a(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private void b(Context context) {
        synchronized (f7454d) {
            int i = this.a;
            if (i < 60) {
                this.a = i + 1;
            } else {
                this.a = 0;
                if (this.b) {
                    HiAnalyticsOfCpUtils.onReport(context, 0);
                    HiAnalyticsOfCpUtils.onReport(context, 1);
                } else {
                    HmsHiAnalyticsUtils.onReport();
                }
            }
        }
    }

    private void c(Context context, String str, Map map) {
        try {
            com.huawei.hms.stats.a.c().a(new e(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("<addOnReportToCache> failed. ");
            M.append(th.getMessage());
            HMSLog.e("HiAnalyticsUtils", M.toString());
        }
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (f7453c) {
            if (f7455e == null) {
                f7455e = new HiAnalyticsUtils();
            }
            hiAnalyticsUtils = f7455e;
        }
        return hiAnalyticsUtils;
    }

    public static String versionCodeToName(String str) {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + "." + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + "." + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + "." + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public void enableLog(Context context) {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (this.b) {
            HiAnalyticTools.enableLog(context);
        } else {
            HmsHiAnalyticsUtils.enableLog();
        }
    }

    public boolean getInitFlag() {
        return !this.b ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public int getOobeAnalyticsState(Context context) {
        if (context == null) {
            return 0;
        }
        int a2 = a(context);
        if (a2 == 1) {
            return a2;
        }
        Bundle bundle = new Bundle();
        bundle.putString("hms_cp_bundle_key", "content://com.huawei.hms.contentprovider/com.huawei.hms.privacy.HmsAnalyticsStateProvider");
        try {
            Bundle call = context.getApplicationContext().getContentResolver().call(Uri.parse("content://com.huawei.hms.contentprovider"), "getAnalyticsState", (String) null, bundle);
            if (call == null) {
                return a2;
            }
            a2 = call.getInt("SWITCH_IS_CHECKED");
            HMSLog.i("HiAnalyticsUtils", "get hms analyticsOobe state " + a2);
            return a2;
        } catch (IllegalArgumentException unused) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState IllegalArgumentException ");
            return a2;
        } catch (SecurityException unused2) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState SecurityException ");
            return a2;
        } catch (Exception unused3) {
            HMSLog.i("HiAnalyticsUtils", "getOobeAnalyticsState Exception ");
            return a2;
        }
    }

    public boolean hasError(Context context) {
        return AnalyticsSwitchHolder.isAnalyticsDisabled(context);
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        onEvent2(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, map)) {
            a(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.b) {
                HiAnalyticsOfCpUtils.onEvent(context, 0, str, a(map));
                HiAnalyticsOfCpUtils.onEvent(context, 1, str, a(map));
            } else {
                HmsHiAnalyticsUtils.onEvent(0, str, a(map));
                HmsHiAnalyticsUtils.onEvent(1, str, a(map));
            }
            b(context);
        }
    }

    public void onEvent2(Context context, String str, String str2) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onEvent2> context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (!initFlag && andRefreshAnalyticsState != 2 && a(str2)) {
            a(context, str, str2);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.b) {
                HiAnalyticsOfCpUtils.onEvent(context, str, str2);
            } else {
                HmsHiAnalyticsUtils.onEvent(context, str, str2);
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onNewEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            b(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.b) {
                HiAnalyticsOfCpUtils.onEvent(context, 0, str, a((Map<String, String>) map));
                HiAnalyticsOfCpUtils.onEvent(context, 1, str, a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onEvent(0, str, a((Map<String, String>) map));
                HmsHiAnalyticsUtils.onEvent(1, str, a((Map<String, String>) map));
            }
            b(context);
        }
    }

    public void onReport(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.e("HiAnalyticsUtils", "<onReport> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            c(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.b) {
                HiAnalyticsOfCpUtils.onStreamEvent(context, 0, str, a((Map<String, String>) map));
                HiAnalyticsOfCpUtils.onStreamEvent(context, 1, str, a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onStreamEvent(0, str, a((Map<String, String>) map));
                HmsHiAnalyticsUtils.onStreamEvent(1, str, a((Map<String, String>) map));
            }
        }
    }

    public void enableLog() {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (!this.b) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HMSLog.i("HiAnalyticsUtils", "cp needs to pass in the context, this method is not supported");
        }
    }

    private int a(Context context) {
        int i = 0;
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state");
            HMSLog.i("HiAnalyticsUtils", "getOobeStateForSettings value is " + i);
            return i;
        } catch (Settings.SettingNotFoundException e2) {
            StringBuilder M = e.a.a.a.a.M("Settings.SettingNotFoundException ");
            M.append(e2.getMessage());
            HMSLog.i("HiAnalyticsUtils", M.toString());
            return i;
        }
    }

    private boolean a(boolean z, boolean z2, Map<?, ?> map) {
        return !z && z2 && b(map);
    }

    private boolean b(Map<?, ?> map) {
        try {
            Iterator<?> it2 = map.values().iterator();
            long j = 0;
            while (it2.hasNext()) {
                if (it2.next() instanceof String) {
                    j += ((String) r3).getBytes(Charset.forName("UTF-8")).length;
                }
            }
            return j <= 512;
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("<isValidSize map> Exception: ");
            M.append(th.getMessage());
            HMSLog.e("HiAnalyticsUtils", M.toString());
            return false;
        }
    }

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return str.getBytes(Charset.forName("UTF-8")).length <= 512;
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("<isValidSize String> Exception: ");
            M.append(th.getMessage());
            HMSLog.e("HiAnalyticsUtils", M.toString());
            return false;
        }
    }

    public void onReport(Context context, String str, Map map, int i) {
        if (i != 0 && i != 1) {
            HMSLog.e("HiAnalyticsUtils", "<onReport with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
                b(context, str, map, i);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.b) {
                    HmsHiAnalyticsUtils.onStreamEvent(i, str, a((Map<String, String>) map));
                    return;
                } else {
                    HiAnalyticsOfCpUtils.onStreamEvent(context, i, str, a((Map<String, String>) map));
                    return;
                }
            }
            return;
        }
        HMSLog.e("HiAnalyticsUtils", "<onReport with type> map or context is null, state: " + andRefreshAnalyticsState);
    }

    private void a(Context context, String str, Map<String, String> map) {
        try {
            com.huawei.hms.stats.a.c().a(new a(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("<addOnEventToCache> failed. ");
            M.append(th.getMessage());
            HMSLog.e("HiAnalyticsUtils", M.toString());
        }
    }

    public void onNewEvent(Context context, String str, Map map, int i) {
        if (i != 0 && i != 1) {
            HMSLog.e("HiAnalyticsUtils", "<onNewEvent with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
                a(context, str, map, i);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.b) {
                    HmsHiAnalyticsUtils.onEvent(i, str, a((Map<String, String>) map));
                } else {
                    HiAnalyticsOfCpUtils.onEvent(context, i, str, a((Map<String, String>) map));
                }
                b(context);
                return;
            }
            return;
        }
        HMSLog.e("HiAnalyticsUtils", "<onNewEvent with type> map or context is null, state: " + andRefreshAnalyticsState);
    }

    private void b(Context context, String str, Map map) {
        try {
            com.huawei.hms.stats.a.c().a(new c(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("<addOnNewEventToCache> failed. ");
            M.append(th.getMessage());
            HMSLog.e("HiAnalyticsUtils", M.toString());
        }
    }

    private void a(Context context, String str, String str2) {
        try {
            com.huawei.hms.stats.a.c().a(new b(context.getApplicationContext(), str, str2));
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("<addOnEvent2ToCache> Failed. ");
            M.append(th.getMessage());
            HMSLog.e("HiAnalyticsUtils", M.toString());
        }
    }

    private void b(Context context, String str, Map map, int i) {
        try {
            com.huawei.hms.stats.a.c().a(new f(context.getApplicationContext(), str, map, i));
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("<addOnReportToCache with type> failed. ");
            M.append(th.getMessage());
            HMSLog.e("HiAnalyticsUtils", M.toString());
        }
    }

    private void a(Context context, String str, Map map, int i) {
        try {
            com.huawei.hms.stats.a.c().a(new d(context.getApplicationContext(), str, map, i));
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("<addOnNewEventToCache with type> failed. ");
            M.append(th.getMessage());
            HMSLog.e("HiAnalyticsUtils", M.toString());
        }
    }
}
