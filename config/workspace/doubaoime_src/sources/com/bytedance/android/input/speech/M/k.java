package com.bytedance.android.input.speech.M;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.bytedance.common.utility.NetworkUtils;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.o;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {
    public static final k a = new k();
    private static AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static String f3099c;

    /* renamed from: d, reason: collision with root package name */
    private static long f3100d;

    /* renamed from: e, reason: collision with root package name */
    private static final HandlerThread f3101e;

    /* renamed from: f, reason: collision with root package name */
    private static final Handler f3102f;

    /* renamed from: g, reason: collision with root package name */
    private static final h f3103g;
    private static ConnectivityManager.NetworkCallback h;
    private static AtomicBoolean i;
    private static long j;
    private static int k;
    private static long l;
    private static AtomicBoolean m;

    public static final class a implements com.ss.ugc.effectplatform.h.b<String[]> {
        a() {
        }

        @Override // com.ss.ugc.effectplatform.h.b
        public void b(String[] strArr, com.ss.ugc.effectplatform.model.b bVar) {
            l.f(bVar, "exception");
            com.bytedance.android.input.r.j.j("Effect-OfflineModelManager", "downloadModel onFail, " + bVar);
            k.b.set(false);
            k.i(k.a);
            k.j = System.currentTimeMillis();
        }

        @Override // com.ss.ugc.effectplatform.h.b
        public void onSuccess(String[] strArr) {
            String[] strArr2 = strArr;
            l.f(strArr2, "response");
            Object e2 = SettingsConfigNext.e(C0838R.string.asr_offline_download_way);
            k.a.A();
            com.ss.ugc.effectplatform.algorithm.d dVar = com.ss.ugc.effectplatform.algorithm.d.f8434f;
            if (dVar == null) {
                throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
            }
            String findResourceUri = dVar.d().findResourceUri("acllmtest");
            String E = findResourceUri != null ? kotlin.text.a.E(findResourceUri, "file://", "", false, 4, null) : null;
            StringBuilder M = e.a.a.a.a.M("downloadModel onSuccess, [");
            l.f(strArr2, "<this>");
            l.f(Constants.ACCEPT_TIME_SEPARATOR_SP, "separator");
            l.f("", "prefix");
            l.f("", "postfix");
            l.f("...", "truncated");
            StringBuilder sb = new StringBuilder();
            l.f(strArr2, "<this>");
            l.f(sb, "buffer");
            l.f(Constants.ACCEPT_TIME_SEPARATOR_SP, "separator");
            l.f("", "prefix");
            l.f("", "postfix");
            l.f("...", "truncated");
            sb.append((CharSequence) "");
            int i = 0;
            for (String str : strArr2) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                kotlin.text.a.a(sb, str, null);
            }
            sb.append((CharSequence) "");
            String sb2 = sb.toString();
            l.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
            M.append(sb2);
            M.append("], downloadWay = ");
            M.append(e2);
            com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", M.toString());
            com.bytedance.android.input.r.j.i("Effect-OfflineModelManager", "downloadModel onSuccess resource path = " + E);
            k.b.set(false);
            k kVar = k.a;
            k.j = System.currentTimeMillis();
            if (l.a(e2, 0)) {
                File file = E != null ? new File(E) : null;
                if (file != null) {
                    file.delete();
                    return;
                }
                return;
            }
            kVar.E();
            if (!kVar.x()) {
                k.i(kVar);
            } else {
                kVar.z(true, SystemClock.elapsedRealtime() - k.f3100d);
                kVar.D(3);
            }
        }
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ ConnectivityManager a;

        b(ConnectivityManager connectivityManager) {
            this.a = connectivityManager;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            l.f(network, "network");
            super.onAvailable(network);
            ConnectivityManager connectivityManager = this.a;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            boolean hasTransport = networkCapabilities != null ? networkCapabilities.hasTransport(1) : false;
            if (hasTransport) {
                if (k.i.get()) {
                    com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "start is connected isWifi");
                    k.a.n();
                    k.i.set(false);
                } else {
                    k.a.m();
                }
            }
            e.a.a.a.a.y0("NetworkCallback - Network is connected isWifi = ", hasTransport, "Effect-OfflineModelManager");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            l.f(network, "network");
            super.onLost(network);
            ConnectivityManager connectivityManager = this.a;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            e.a.a.a.a.y0("NetworkCallback - Network is disconnected isWifi = ", networkCapabilities != null ? networkCapabilities.hasTransport(1) : false, "Effect-OfflineModelManager");
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("OfflineModelManager");
        handlerThread.start();
        f3101e = handlerThread;
        f3102f = new Handler(handlerThread.getLooper());
        f3103g = new h();
        i = new AtomicBoolean(false);
        k = 4;
        m = new AtomicBoolean(false);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        if (com.ss.ugc.effectplatform.algorithm.d.f8434f != null) {
            return;
        }
        f3103g.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i2) {
        e.a.a.a.a.j0("updateSettingsDownloadStatus, downloadStatus: ", i2, "Effect-OfflineModelManager");
        IAppGlobals.a aVar = IAppGlobals.a;
        SettingsConfigNext.l(e.a.a.a.a.e(aVar, C0838R.string.asr_offline_model_download_status, "IAppGlobals.context.getS…ne_model_download_status)"), Integer.valueOf(i2));
        Intent intent = new Intent();
        intent.setAction(SettingsActivityNext.MAIN_PROCESS_UPDATE_PREFERENCE);
        intent.putExtra(MonitorConstants.EXTRA_DOWNLOAD_STATUS, i2);
        aVar.getContext().sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        String str;
        A();
        com.ss.ugc.effectplatform.algorithm.d dVar = com.ss.ugc.effectplatform.algorithm.d.f8434f;
        if (dVar == null) {
            throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
        }
        String findResourceUri = dVar.d().findResourceUri("acllmtest");
        f3099c = findResourceUri != null ? kotlin.text.a.E(findResourceUri, "file://", "", false, 4, null) : null;
        boolean x = x();
        if (!x) {
            String str2 = IEnvironment.a.a() + "asr/acllm_model_0729_punc_vad_stream_b1_v2.0.model";
            if (e.a.a.a.a.R0(str2)) {
                f3099c = str2;
                x = true;
                IAppGlobals.a aVar = IAppGlobals.a;
                SettingsConfigNext.l(e.a.a.a.a.e(aVar, C0838R.string.asr_offline_download_way, "IAppGlobals.context.getS…asr_offline_download_way)"), 2);
                Intent intent = new Intent();
                intent.setAction(SettingsActivityNext.MAIN_PROCESS_UPDATE_PREFERENCE);
                intent.putExtra("download_way", 2);
                aVar.getContext().sendBroadcast(intent);
                String string = aVar.getContext().getString(C0838R.string.asr_offline_model_download_tip_show);
                l.e(string, "IAppGlobals.context.getS…_model_download_tip_show)");
                SettingsConfigNext.l(string, Boolean.FALSE);
            }
        }
        StringBuilder M = e.a.a.a.a.M("model [");
        M.append(f3099c);
        M.append("] exist: ");
        M.append(x);
        com.bytedance.android.input.r.j.i("Effect-OfflineModelManager", M.toString());
        if (!x || (str = f3099c) == null) {
            return;
        }
        l.c(str);
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        IAppGlobals.a aVar2 = IAppGlobals.a;
        String string2 = aVar2.getContext().getString(C0838R.string.asr_offline_model_path);
        l.e(string2, "IAppGlobals.context.getS…g.asr_offline_model_path)");
        settingsConfigNext.m(string2, str);
        Intent intent2 = new Intent();
        intent2.setAction(SettingsActivityNext.MAIN_PROCESS_UPDATE_PREFERENCE);
        intent2.putExtra(DownloadConstants.PATH_KEY, str);
        aVar2.getContext().sendBroadcast(intent2);
    }

    public static final void i(k kVar) {
        kVar.z(false, SystemClock.elapsedRealtime() - f3100d);
        kVar.D(2);
        kVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        StringBuilder M = e.a.a.a.a.M("downloadAutoRetry check stopAutoRetry = ");
        M.append(m);
        M.append(", downLoadRetryCount = ");
        e.a.a.a.a.B0(M, k, "Effect-OfflineModelManager");
        if (m.get() || k >= 3) {
            return false;
        }
        if (!s()) {
            k = 4;
        } else if (NetworkUtils.j(IAppGlobals.a.getContext()) && !b.get()) {
            k++;
            e.a.a.a.a.C0(e.a.a.a.a.M("start downloadAutoRetry downLoadRetryCount = "), k, "Effect-OfflineModelManager");
            n();
            l = System.currentTimeMillis();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        com.bytedance.android.input.r.j.i("Effect-OfflineModelManager", "start downloadModel");
        IAppGlobals.a aVar = IAppGlobals.a;
        if (!(((Integer) e.a.a.a.a.L0(aVar, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 0)) {
            com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "initEpAndDownloadModel not full input mode");
            return;
        }
        if (b.get()) {
            com.bytedance.android.input.r.j.i("Effect-OfflineModelManager", "downloadModel, isDownloading");
            D(1);
            return;
        }
        boolean h2 = NetworkUtils.h(aVar.getApplication());
        e.a.a.a.a.y0("downloadModel, isNetworkAvailable: ", h2, "Effect-OfflineModelManager");
        if (!h2) {
            D(2);
            return;
        }
        b.set(true);
        D(1);
        f3100d = SystemClock.elapsedRealtime();
        A();
        com.ss.ugc.effectplatform.algorithm.d dVar = com.ss.ugc.effectplatform.algorithm.d.f8434f;
        if (dVar == null) {
            throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
        }
        dVar.c(0, new String[]{"acllmtest"}, new com.ss.ugc.effectplatform.a(true), new a());
    }

    private final boolean s() {
        Object e2 = SettingsConfigNext.e(C0838R.string.asr_offline_download_way);
        IAppGlobals.a aVar = IAppGlobals.a;
        int i2 = aVar.o().getInt(aVar.getContext().getString(C0838R.string.asr_offline_model_download_error_time), 0);
        if (x() || l.a(e2, 0)) {
            return false;
        }
        return !l.a(e2, 3) || i2 >= 3;
    }

    public static void t() {
        a.n();
    }

    public static void u() {
        Object J2;
        k kVar = a;
        try {
            f3103g.b();
            kVar.E();
            kVar.y();
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "initEpAndDownloadModel error = " + b2);
        }
    }

    public static void v() {
        k kVar = a;
        if (kVar.x() && NetworkUtils.j(IAppGlobals.a.getContext())) {
            if (System.currentTimeMillis() - j > com.heytap.mcssdk.constant.a.f6888f) {
                j = System.currentTimeMillis();
                com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "start updateModelVersion");
                kVar.n();
                return;
            }
            return;
        }
        if (kVar.s()) {
            long currentTimeMillis = System.currentTimeMillis() - l;
            if (kVar.m() || currentTimeMillis <= 3600000 || !NetworkUtils.j(IAppGlobals.a.getContext())) {
                return;
            }
            l = System.currentTimeMillis();
            com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "start downloadRetryOneHour");
            kVar.n();
        }
    }

    public static void w() {
        com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "start downloadModelNow");
        a.n();
    }

    private final void y() {
        Object J2;
        if (h != null) {
            com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "registerNetworkCallback: networkCallback already registered");
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(IAppGlobals.a.getApplication(), ConnectivityManager.class);
        b bVar = new b(connectivityManager);
        com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "registerNetworkCallback");
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(bVar);
                J2 = o.a;
            } catch (Throwable th) {
                J2 = r.J(th);
            }
        } else {
            J2 = null;
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "onFailure e = " + b2);
        }
        h = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean z, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", z ? 1 : 0);
            jSONObject.put("duration", j2);
            jSONObject.put("type", 1);
            jSONObject.put("retry", 3);
            IAppLog.a.t("wakeup_download_algorithm_time", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void B(int i2, boolean z) {
        SettingsActivityNext.FragmentType fragmentType = SettingsActivityNext.FragmentType.OFFLINE_DOWNLOAD;
        if (i2 == 14) {
            m.set(z);
            Object e2 = SettingsConfigNext.e(C0838R.string.asr_offline_download_way);
            Object e3 = SettingsConfigNext.e(C0838R.string.asr_offline_model_download_status);
            if (z && l.a(e2, 2) && l.a(e3, 0)) {
                o();
            }
        }
    }

    public final void C() {
        f3102f.post(new Runnable() { // from class: com.bytedance.android.input.speech.M.c
            @Override // java.lang.Runnable
            public final void run() {
                k.v();
            }
        });
    }

    public final void l() {
        k = 4;
    }

    public final void o() {
        StringBuilder M = e.a.a.a.a.M("start downloadModelInWifi ");
        IAppGlobals.a aVar = IAppGlobals.a;
        M.append(NetworkUtils.j(aVar.getApplication()));
        com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", M.toString());
        k = 0;
        if (NetworkUtils.j(aVar.getApplication())) {
            n();
        } else {
            i.set(true);
            D(0);
        }
    }

    public final void p() {
        k = 0;
        f3102f.post(new Runnable() { // from class: com.bytedance.android.input.speech.M.d
            @Override // java.lang.Runnable
            public final void run() {
                k.w();
            }
        });
    }

    public final void q() {
        f3102f.post(new Runnable() { // from class: com.bytedance.android.input.speech.M.a
            @Override // java.lang.Runnable
            public final void run() {
                k.t();
            }
        });
    }

    public final void r() {
        if (((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 0) {
            f3102f.post(new Runnable() { // from class: com.bytedance.android.input.speech.M.b
                @Override // java.lang.Runnable
                public final void run() {
                    k.u();
                }
            });
        } else {
            com.bytedance.android.input.r.j.m("Effect-OfflineModelManager", "initEpAndDownloadModel not full input mode");
        }
    }

    public final boolean x() {
        if (f3099c == null) {
            return false;
        }
        return new File(f3099c).exists();
    }
}
