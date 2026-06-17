package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.framwork.core.sdklib.util.NetUtils;
import com.bytedance.services.apm.api.IHttpService;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.Constants;
import e.b.g.a.a.h.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f implements e.b.g.a.a.e.b, e.b.g.a.a.g.c, a.c {
    private volatile boolean C;
    private volatile boolean E;
    private String I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f5260J;
    private Context a;
    private JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    private e.b.g.a.a.d f5261c;

    /* renamed from: d, reason: collision with root package name */
    private e.b.g.a.a.b f5262d;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f5264f;

    /* renamed from: g, reason: collision with root package name */
    private volatile int f5265g;
    private volatile int h;
    private volatile int i;
    private volatile int j;
    private volatile JSONObject k;
    private volatile JSONObject l;
    private volatile IHttpService m;
    private volatile int n;
    private volatile int o;
    private volatile List<String> p;
    private volatile List<Pattern> q;
    private volatile List<String> r;
    private volatile List<Pattern> s;
    private volatile long u;
    private k v;
    private Map<String, String> w;
    private volatile boolean y;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f5263e = 0;
    private volatile int t = 1;
    private List<String> x = new LinkedList();
    private volatile long z = 0;
    private volatile long A = 0;
    private volatile int B = 0;
    private volatile boolean D = true;
    private List<String> G = new LinkedList();
    private volatile boolean F = false;
    private com.bytedance.framwork.core.sdkmonitor.b H = new com.bytedance.framwork.core.sdkmonitor.b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f5261c != null) {
                f.this.f5261c.b(0L, true);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ j a;

        b(j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean b = f.this.f5261c != null ? f.this.f5261c.b(0L, true) : false;
            } finally {
                this.a.callback(false);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f5261c == null || f.this.f5262d == null) {
                return;
            }
            f.this.f5262d.b(true);
        }
    }

    class d implements Runnable {
        final /* synthetic */ j a;

        d(j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                if (f.this.f5261c != null && f.this.f5262d != null) {
                    z = f.this.f5262d.b(true);
                }
            } finally {
                this.a.callback(false);
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f5266c;

        e(Context context, JSONObject jSONObject, k kVar) {
            this.a = context;
            this.b = jSONObject;
            this.f5266c = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.j(f.this, this.a, this.b, this.f5266c);
            if (f.this.F) {
                f.this.H.e(f.this);
            }
        }
    }

    /* renamed from: com.bytedance.framwork.core.sdkmonitor.f$f, reason: collision with other inner class name */
    class RunnableC0260f implements Runnable {
        RunnableC0260f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr;
            try {
                if (f.this.w != null) {
                    Iterator it2 = f.this.x.iterator();
                    while (it2.hasNext()) {
                        StringBuilder v = f.this.v((String) it2.next());
                        v.append("&encrypt=close");
                        String sb = v.toString();
                        try {
                            byte[] bArr2 = null;
                            if (f.this.C() != null) {
                                bArr = f.this.C().doGet(sb, null).b();
                            } else {
                                boolean z = f.this.D;
                                if (!TextUtils.isDigitsOnly(sb)) {
                                    bArr2 = com.bytedance.framwork.core.sdkmonitor.e.b(sb, null, null, null, "GET", false, z);
                                }
                                bArr = bArr2;
                            }
                            if (bArr != null) {
                                f.t(f.this, new JSONObject(new String(bArr)));
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th2) {
                if (!f.this.F) {
                    f.this.F = true;
                    f.this.H.e(f.this);
                }
                th2.printStackTrace();
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5268c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f5269d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f5270e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5271f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f5272g;

        g(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
            this.a = j;
            this.b = j2;
            this.f5268c = str;
            this.f5269d = str2;
            this.f5270e = str3;
            this.f5271f = i;
            this.f5272g = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.H(this.a, this.b, this.f5268c, this.f5269d, this.f5270e, this.f5271f, this.f5272g);
        }
    }

    class h implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5273c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f5274d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f5275e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5276f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f5277g;

        h(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
            this.a = j;
            this.b = j2;
            this.f5273c = str;
            this.f5274d = str2;
            this.f5275e = str3;
            this.f5276f = i;
            this.f5277g = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.G(this.a, this.b, this.f5273c, this.f5274d, this.f5275e, this.f5276f, this.f5277g);
        }
    }

    class i implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f5278c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f5279d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ JSONObject f5280e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONObject f5281f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f5282g;

        i(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
            this.a = str;
            this.b = i;
            this.f5278c = jSONObject;
            this.f5279d = jSONObject2;
            this.f5280e = jSONObject3;
            this.f5281f = jSONObject4;
            this.f5282g = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.Q(this.a, this.b, this.f5278c, this.f5279d, this.f5280e, this.f5281f, this.f5282g);
        }
    }

    public interface j {
        void callback(boolean z);
    }

    public interface k {
        Map<String, String> getCommonParams();

        String getSessionId();
    }

    protected f(String str) {
        this.I = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IHttpService C() {
        if (this.m == null) {
            this.m = (IHttpService) com.bytedance.news.common.service.manager.c.a(IHttpService.class);
        }
        return this.m;
    }

    private String E() {
        k kVar = this.v;
        if (kVar != null) {
            return kVar.getSessionId();
        }
        return null;
    }

    private SharedPreferences F() {
        String d2 = com.bytedance.framwork.core.sdkmonitor.e.d(this.a);
        Context context = this.a;
        StringBuilder M = e.a.a.a.a.M("monitor_config");
        M.append(this.I);
        M.append(d2);
        return context.getSharedPreferences(M.toString(), 0);
    }

    private void J() {
        SharedPreferences F = F();
        String string = F.getString("monitor_net_config", null);
        this.f5263e = F.getLong("monitor_configure_refresh_time", 0L);
        boolean z = F.getInt("monitor_config_update", 0) == 1;
        e.b.g.a.a.h.a.d().c(this);
        if (!TextUtils.isEmpty(string)) {
            try {
                this.F = true;
                JSONObject jSONObject = new JSONObject(string);
                if (!z) {
                    jSONObject.remove("report_host_new");
                }
                Y(jSONObject);
            } catch (Exception unused) {
                Log.e("monitor_config", "配置信息读取失败");
            }
        }
        Z(false);
    }

    private boolean L(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!com.bytedance.feedbackerlib.a.V(list)) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (str.contains(it2.next())) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!com.bytedance.feedbackerlib.a.V(list2)) {
                Iterator<Pattern> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (it3.next().matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean U() {
        return (System.currentTimeMillis() - this.f5263e) / 1000 > this.f5264f;
    }

    private JSONObject V(String str, long j2, long j3, String str2, String str3, String str4, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", str);
            jSONObject.put("duration", j2);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", Uri.parse(str2));
            }
            if (j3 > 0) {
                jSONObject.put("timestamp", j3);
            }
            jSONObject.put("status", i2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("ip", str3);
            }
            if (TextUtils.isEmpty(str4)) {
                jSONObject.put("trace_code", "");
            } else {
                jSONObject.put("trace_code", str4);
            }
            jSONObject.put("network_type", com.bytedance.framwork.core.sdkmonitor.e.c(this.a).getValue());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    static void j(f fVar, Context context, JSONObject jSONObject, k kVar) {
        Objects.requireNonNull(fVar);
        if (context == null || jSONObject == null) {
            return;
        }
        fVar.E = true;
        fVar.a = context.getApplicationContext();
        fVar.b = jSONObject;
        try {
            jSONObject.put(WsConstants.KEY_APP_ID, fVar.I);
            fVar.b.put(RomInfo.KEY_OS_TYPE, "Android");
            fVar.b.put("device_platform", "android");
            fVar.b.put(RomInfo.KEY_ROM_OS_VERSION, Build.VERSION.RELEASE);
            fVar.b.put(RomInfo.KEY_ROM_OS_API, Build.VERSION.SDK_INT);
            fVar.b.put(HardwareInfo.KEY_HW_VENDOR_MODEL, Build.MODEL);
            fVar.b.put(HardwareInfo.KEY_HW_VENDOR_BRAND, Build.BRAND);
            fVar.b.put(HardwareInfo.KEY_HW_VENDOR_MANUFACTURER, Build.MANUFACTURER);
            fVar.b.put("sdkmonitor_version", "2.0.28");
            fVar.b.put("monitor_from", "sdk");
            if (TextUtils.isEmpty(fVar.b.optString(Constants.PACKAGE_NAME))) {
                fVar.b.put(Constants.PACKAGE_NAME, context.getPackageName());
            }
            PackageInfo packageInfo = null;
            if (TextUtils.isEmpty(fVar.b.optString("version_name"))) {
                packageInfo = fVar.a.getPackageManager().getPackageInfo(fVar.a.getPackageName(), 0);
                fVar.b.put("version_name", packageInfo.versionName);
            }
            if (TextUtils.isEmpty(fVar.b.optString("version_code"))) {
                if (packageInfo == null) {
                    packageInfo = fVar.a.getPackageManager().getPackageInfo(fVar.a.getPackageName(), 0);
                }
                fVar.b.put("version_code", packageInfo.versionCode);
            }
            fVar.v = kVar;
            if (kVar == null) {
                fVar.v = new com.bytedance.framwork.core.sdkmonitor.g(fVar);
            }
            Map<String, String> commonParams = fVar.v.getCommonParams();
            fVar.w = commonParams;
            if (commonParams == null) {
                fVar.w = new HashMap();
            }
            fVar.f5260J = TextUtils.equals(fVar.w.get("oversea"), PushClient.DEFAULT_REQUEST_ID);
            fVar.w.put(WsConstants.KEY_APP_ID, fVar.I);
            fVar.w.put("device_id", fVar.b.optString("device_id"));
            fVar.w.put("device_platform", "android");
            fVar.w.put(Constants.PACKAGE_NAME, fVar.b.optString(Constants.PACKAGE_NAME));
            fVar.w.put("channel", fVar.b.optString("channel"));
            fVar.w.put("app_version", fVar.b.optString("app_version"));
            fVar.w.put("sdkmonitor_version", "2.0.28");
            fVar.w.put("minor_version", PushClient.DEFAULT_REQUEST_ID);
            e.b.g.a.a.e.c.i(fVar.I, fVar);
            e.b.g.a.a.g.d.d(fVar.I, fVar);
            e.b.g.a.b.c.a(new com.bytedance.framwork.core.sdkmonitor.h(fVar));
            e.b.g.a.a.d dVar = new e.b.g.a.a.d(fVar.a, fVar.I);
            fVar.f5261c = dVar;
            e.b.g.a.a.h.a.d().c(dVar);
            fVar.m = (IHttpService) com.bytedance.news.common.service.manager.c.a(IHttpService.class);
            fVar.J();
        } catch (Exception unused) {
        }
    }

    static void t(f fVar, JSONObject jSONObject) {
        Objects.requireNonNull(fVar);
        if (jSONObject.length() > 0) {
            try {
                fVar.Y(jSONObject.getJSONObject("ret"));
                SharedPreferences.Editor edit = fVar.F().edit();
                edit.putLong("monitor_configure_refresh_time", System.currentTimeMillis());
                edit.putInt("monitor_config_update", 1);
                edit.putString("monitor_net_config", jSONObject.getJSONObject("ret").toString());
                edit.apply();
                if (fVar.F) {
                    return;
                }
                fVar.F = true;
                fVar.H.e(fVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StringBuilder v(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isDigitsOnly(str) && this.w != null) {
            if (!str.contains("?")) {
                sb.append("?");
            }
            w(sb, "sdk_version", String.valueOf(400));
            Map<String, String> map = this.w;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        w(sb, String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                    }
                }
            }
        }
        return sb;
    }

    private StringBuilder w(@NonNull StringBuilder sb, String str, String str2) {
        if (sb.charAt(sb.length() - 1) != '?') {
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        try {
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append('=');
            try {
                sb.append(URLEncoder.encode(str2, "UTF-8"));
                return sb;
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (UnsupportedEncodingException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    private void x(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void A() {
        e.b.g.a.a.h.a.d().e(new c());
    }

    public void B(j jVar) {
        e.b.g.a.a.h.a.d().e(new d(jVar));
    }

    public int D() {
        NetUtils.NetworkType networkType;
        NetworkInfo activeNetworkInfo;
        Context context = this.a;
        int i2 = NetUtils.a;
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            networkType = NetUtils.NetworkType.MOBILE;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            int type = activeNetworkInfo.getType();
            if (1 == type) {
                networkType = NetUtils.NetworkType.WIFI;
            } else if (type == 0) {
                switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        networkType = NetUtils.NetworkType.MOBILE_3G;
                        break;
                    case 4:
                    case 7:
                    case 11:
                    default:
                        networkType = NetUtils.NetworkType.MOBILE;
                        break;
                    case 13:
                        networkType = NetUtils.NetworkType.MOBILE_4G;
                        break;
                }
            } else {
                networkType = NetUtils.NetworkType.MOBILE;
            }
            return networkType.getValue();
        }
        networkType = NetUtils.NetworkType.NONE;
        return networkType.getValue();
    }

    void G(long j2, long j3, String str, String str2, String str3, int i2, JSONObject jSONObject) {
        e.b.g.a.a.d dVar;
        if (this.n == 1 || L(str, this.p, this.q)) {
            return;
        }
        JSONObject V = V("api_error", j2, j3, str, str2, str3, i2);
        x(V, jSONObject);
        if (V == null || V.length() <= 0 || (dVar = this.f5261c) == null) {
            return;
        }
        dVar.a("api_error", "api_error", V);
    }

    void H(long j2, long j3, String str, String str2, String str3, int i2, JSONObject jSONObject) {
        if (L(str, this.p, this.q) || !com.bytedance.framwork.core.sdkmonitor.e.e(this.a)) {
            return;
        }
        JSONObject V = V("api_all", j2, j3, str, str2, str3, i2);
        x(V, jSONObject);
        if ((V == null || !L(str, this.r, this.s)) && this.o == 0) {
            return;
        }
        try {
            V.put("hit_rules", 1);
            this.f5261c.a("api_all", "api_all", V);
        } catch (JSONException unused) {
        }
    }

    public boolean I(@NonNull Context context, @NonNull JSONObject jSONObject, @NonNull k kVar) {
        this.E = true;
        e.b.g.a.a.h.a.d().f(new e(context, jSONObject, kVar), com.heytap.mcssdk.constant.a.r);
        return true;
    }

    protected boolean K() {
        return this.E;
    }

    public void M(long j2, long j3, String str, String str2, String str3, int i2, JSONObject jSONObject) {
        try {
            if (this.F) {
                e.b.g.a.a.h.a.d().e(new h(j2, j3, str, str2, str3, i2, jSONObject));
            } else {
                this.H.f(new com.bytedance.framwork.core.sdkmonitor.a("api_all", j2, j3, str, str2, str3, i2, jSONObject));
            }
        } catch (Throwable unused) {
        }
    }

    void N(String str, JSONObject jSONObject, long j2) {
        try {
            throw null;
        } catch (Throwable unused) {
        }
    }

    public void O(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (this.F) {
                R(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
            } else {
                this.H.g(new com.bytedance.framwork.core.sdkmonitor.i(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public void P(long j2, long j3, String str, String str2, String str3, int i2, JSONObject jSONObject) {
        try {
            if (this.F) {
                e.b.g.a.a.h.a.d().e(new g(j2, j3, str, str2, str3, i2, jSONObject));
            } else {
                this.H.f(new com.bytedance.framwork.core.sdkmonitor.a("api_all", j2, j3, str, str2, str3, i2, jSONObject));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r3.f5261c.a("service_monitor", "service_monitor", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void Q(java.lang.String r4, int r5, org.json.JSONObject r6, org.json.JSONObject r7, org.json.JSONObject r8, org.json.JSONObject r9, long r10) {
        /*
            r3 = this;
            java.lang.String r0 = "timestamp"
            java.lang.String r1 = "service_monitor"
            if (r9 != 0) goto Lb
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L72
            r9.<init>()     // Catch: java.lang.Throwable -> L72
        Lb:
            java.lang.String r2 = "log_type"
            r9.put(r2, r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "service"
            r9.put(r2, r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "status"
            r9.put(r2, r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "network_type"
            int r2 = r3.D()     // Catch: java.lang.Throwable -> L72
            r9.put(r5, r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "value"
            r9.put(r5, r6)     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L2f
            java.lang.String r5 = "category"
            r9.put(r5, r7)     // Catch: java.lang.Throwable -> L72
        L2f:
            if (r8 == 0) goto L36
            java.lang.String r5 = "metric"
            r9.put(r5, r8)     // Catch: java.lang.Throwable -> L72
        L36:
            boolean r5 = r9.isNull(r0)     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L3f
            r9.put(r0, r10)     // Catch: java.lang.Throwable -> L72
        L3f:
            java.lang.String r5 = r3.E()     // Catch: java.lang.Throwable -> L72
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L72
            if (r5 != 0) goto L52
            java.lang.String r5 = "session_id"
            java.lang.String r6 = r3.E()     // Catch: java.lang.Throwable -> L72
            r9.put(r5, r6)     // Catch: java.lang.Throwable -> L72
        L52:
            e.b.g.a.a.d r5 = r3.f5261c     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L72
            org.json.JSONObject r5 = r3.k     // Catch: java.lang.Throwable -> L72
            r6 = 0
            if (r5 == 0) goto L6b
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L62
            goto L6b
        L62:
            org.json.JSONObject r5 = r3.k     // Catch: java.lang.Throwable -> L72
            java.lang.Object r4 = r5.opt(r4)     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L6b
            r6 = 1
        L6b:
            if (r6 == 0) goto L72
            e.b.g.a.a.d r4 = r3.f5261c     // Catch: java.lang.Throwable -> L72
            r4.a(r1, r1, r9)     // Catch: java.lang.Throwable -> L72
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.f.Q(java.lang.String, int, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, long):void");
    }

    void R(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j2) {
        e.b.g.a.a.h.a.d().e(new i(str, i2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j2));
    }

    public void S(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (this.F) {
                R(str, i2, jSONObject, null, null, jSONObject2, System.currentTimeMillis());
            } else {
                this.H.g(new com.bytedance.framwork.core.sdkmonitor.i(str, i2, jSONObject, null, null, jSONObject2, System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public void T(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (this.F) {
                R(str, i2, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
            } else {
                this.H.g(new com.bytedance.framwork.core.sdkmonitor.i(str, i2, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    void W(List<String> list) {
        if (list == null || com.bytedance.feedbackerlib.a.V(list)) {
            return;
        }
        this.x.clear();
        this.x.addAll(list);
    }

    void X(List<String> list) {
        if (list == null || com.bytedance.feedbackerlib.a.V(list)) {
            return;
        }
        this.G.clear();
        this.G.addAll(list);
    }

    synchronized void Y(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        JSONObject jSONObject2 = null;
        JSONObject optJSONObject2 = optJSONObject == null ? null : optJSONObject.optJSONObject("slardar_api_settings");
        if (optJSONObject2 != null) {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("fetch_setting");
            if (optJSONObject3 != null) {
                this.f5264f = optJSONObject3.optLong("fetch_setting_interval", 1200L);
            }
            if (this.f5264f < 600) {
                this.f5264f = 600L;
            }
            if (U()) {
                return;
            }
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("report_setting");
            if (optJSONObject4 != null) {
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray optJSONArray = optJSONObject4.optJSONArray("hosts");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int length = optJSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            String string = optJSONArray.getString(i2);
                            if (this.f5260J && (string.contains(".snssdk.") || string.contains(".toutiao."))) {
                                arrayList.clear();
                                break;
                            }
                            if (!TextUtils.isEmpty(string) && string.indexOf(46) > 0) {
                                arrayList.add(string);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (!arrayList.isEmpty()) {
                    this.G = arrayList;
                }
                int i3 = 120;
                this.f5265g = optJSONObject4.optInt("uploading_interval", 120);
                if (this.f5265g >= 0) {
                    i3 = this.f5265g;
                }
                this.f5265g = i3;
                int i4 = 100;
                this.h = optJSONObject4.optInt("once_max_count", 100);
                if (this.h >= 0) {
                    i4 = this.h;
                }
                this.h = i4;
                this.i = optJSONObject4.optInt("max_retry_count", 4);
                this.j = optJSONObject4.optInt("report_fail_base_interval", 15);
                this.t = optJSONObject4.optInt("log_send_switch", 1);
                this.u = optJSONObject4.optLong("more_channel_stop_interval", 1800L);
                this.D = optJSONObject4.optBoolean("enable_encrypt", true);
                optJSONObject4.optLong("memory_store_cache_max_count", 2000L);
                this.y = optJSONObject4.optBoolean("log_remove_switch", false);
            }
        }
        if (jSONObject.length() <= 0) {
            this.G = null;
            return;
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("custom_event_settings");
        if (optJSONObject5 != null) {
            this.k = optJSONObject5.optJSONObject("allow_service_name");
            this.l = optJSONObject5.optJSONObject("allow_log_type");
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("network_image_modules");
        if (optJSONObject6 != null) {
            jSONObject2 = optJSONObject6.optJSONObject("network");
        }
        if (jSONObject2 != null) {
            this.n = jSONObject2.optInt("enable_api_error_upload", 0);
            this.o = jSONObject2.optInt("enable_api_all_upload", 0);
            this.p = com.bytedance.feedbackerlib.a.t0(jSONObject2, "api_block_list");
            this.q = com.bytedance.feedbackerlib.a.u0(jSONObject2, "api_block_list");
            this.r = com.bytedance.feedbackerlib.a.t0(jSONObject2, "api_allow_list");
            this.s = com.bytedance.feedbackerlib.a.u0(jSONObject2, "api_allow_list");
        }
        if (this.f5262d == null) {
            e.b.g.a.a.b bVar = new e.b.g.a.a.b(this.a, this.I);
            this.f5262d = bVar;
            bVar.a();
        }
        this.f5262d.d();
    }

    void Z(boolean z) {
        if (this.f5264f < 600) {
            this.f5264f = 600L;
        }
        if ((z || U()) && com.bytedance.framwork.core.sdkmonitor.e.e(this.a)) {
            synchronized (f.class) {
                this.f5263e = System.currentTimeMillis();
            }
            try {
                e.b.g.a.a.h.a.d().e(new RunnableC0260f());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // e.b.g.a.a.e.b
    public boolean a() {
        return this.C ? this.C : this.y;
    }

    @Override // e.b.g.a.a.e.b
    public int b() {
        if (this.f5265g <= 0) {
            return 120;
        }
        return this.f5265g;
    }

    @Override // e.b.g.a.a.e.b
    public long c() {
        if (this.u == 0) {
            return 1800000L;
        }
        return this.u * 1000;
    }

    @Override // e.b.g.a.a.g.c
    public e.b.g.a.a.g.e d(String str, byte[] bArr) {
        byte[] a2;
        e.b.g.a.a.g.e eVar = new e.b.g.a.a.g.e();
        try {
            String sb = v(str).toString();
            if (C() != null) {
                HashMap hashMap = new HashMap();
                if (bArr.length > 128) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        try {
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            bArr = byteArrayOutputStream.toByteArray();
                            hashMap.put(DownloadHelper.CONTENT_ENCODING, DownloadHelper.GZIP);
                        } catch (IOException e2) {
                            throw e2;
                        }
                    } catch (Throwable th) {
                        gZIPOutputStream.close();
                        throw th;
                    }
                }
                if (this.D) {
                    byte[] a3 = EncryptorUtil.a(bArr, bArr.length);
                    if (a3 != null) {
                        sb = sb + "&tt_data=a";
                        hashMap.put(DownloadHelper.CONTENT_TYPE, "application/octet-stream;tt-data=a");
                    }
                    a2 = C().doPost(sb, a3, hashMap).b();
                } else {
                    a2 = C().doPost(sb, bArr, hashMap).b();
                }
            } else {
                a2 = com.bytedance.framwork.core.sdkmonitor.e.a(sb, bArr, MonitorNetUtil$CompressType.GZIP, "application/json; charset=utf-8", this.D);
            }
            this.B = 0;
            this.A = 0L;
            eVar.a = 200;
            JSONObject jSONObject = new JSONObject(new String(a2));
            try {
                String optString = jSONObject.optString(RemoteMessageConst.DATA);
                if (!optString.isEmpty()) {
                    jSONObject = new JSONObject(com.bytedance.feedbackerlib.a.o(optString.getBytes()));
                }
                eVar.b = jSONObject;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            eVar.b = jSONObject;
            return eVar;
        } catch (Throwable th3) {
            if (th3 instanceof com.bytedance.framwork.core.sdkmonitor.d) {
                eVar.a = th3.a;
            } else {
                eVar.a = -1;
            }
            int i2 = eVar.a;
            if (i2 == 503 || i2 == 509) {
                this.C = true;
                this.z = System.currentTimeMillis();
                this.f5261c.c(false);
                e.b.g.a.a.b bVar = this.f5262d;
                if (bVar != null) {
                    bVar.c(false);
                }
                if (this.B == 0) {
                    this.A = 300000L;
                } else if (this.B == 1) {
                    this.A = com.heytap.mcssdk.constant.a.h;
                } else {
                    this.A = 1800000L;
                }
                this.B++;
            }
            return eVar;
        }
    }

    @Override // e.b.g.a.a.e.b
    public List<String> e(String str) {
        return this.G;
    }

    @Override // e.b.g.a.a.e.b
    public JSONObject f() {
        return this.b;
    }

    @Override // e.b.g.a.a.e.b
    public int g() {
        if (this.h <= 0) {
            return 100;
        }
        return this.h;
    }

    @Override // e.b.g.a.a.e.b
    public int h() {
        if (this.j <= 0) {
            return 15;
        }
        return this.j;
    }

    @Override // e.b.g.a.a.e.b
    public int i() {
        if (this.i <= 0) {
            return 4;
        }
        return this.i;
    }

    @Override // e.b.g.a.a.h.a.c
    public void onTimeEvent(long j2) {
        if (System.currentTimeMillis() - this.z > this.A) {
            this.C = false;
            e.b.g.a.a.d dVar = this.f5261c;
            if (dVar != null) {
                dVar.c(this.t == 1);
            }
        }
        if (this.f5264f <= 0) {
            return;
        }
        Z(false);
    }

    public void y() {
        e.b.g.a.a.h.a.d().e(new a());
    }

    public void z(j jVar) {
        e.b.g.a.a.h.a.d().e(new b(jVar));
    }
}
