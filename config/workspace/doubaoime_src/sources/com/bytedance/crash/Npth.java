package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.D;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.crash.upload.CrashUploader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Npth {
    private static final J sCachedDataCenter = com.bytedance.crash.monitor.l.g();

    static class a implements Runnable {
        final /* synthetic */ com.bytedance.crash.monitor.a a;

        a(com.bytedance.crash.monitor.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.bytedance.crash.N.d(this.a).c();
        }
    }

    static class b extends x {
        b() {
        }
    }

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        sCachedDataCenter.e(attachUserData, crashType);
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        sCachedDataCenter.e(attachUserData, crashType);
    }

    public static void addCustomCrashReasonArray(@NonNull String str, String str2) {
        sCachedDataCenter.h(str, str2);
    }

    public static void addImportTag(String str, String str2) {
        I.e(str, str2);
    }

    public static void addImportTags(Map<? extends String, ? extends String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        I.f(map);
    }

    public static void addTag(String str, String str2) {
        I.g(str, str2, sCachedDataCenter);
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        I.h(map, sCachedDataCenter);
    }

    public static void addUserCrashInfoCallback(v vVar, CrashType crashType) {
        if (vVar != null) {
            sCachedDataCenter.o(vVar, crashType);
        }
    }

    public static void addWhiteLogType(String str) {
        com.bytedance.crash.R.d.c(str);
    }

    public static void clean() {
        com.bytedance.crash.R.d.e();
    }

    @Keep
    public static void customActivityName(com.bytedance.crash.V.a aVar) {
        com.bytedance.crash.a0.a.F(aVar);
    }

    public static void dumpHprof(String str) {
        NativeBridge.k(str);
    }

    public static void enableALogCollector(String str, com.bytedance.crash.K.c cVar, com.bytedance.crash.K.d dVar) {
        if (TextUtils.isEmpty(str) || !e.a.a.a.a.R0(str)) {
            return;
        }
        com.bytedance.crash.K.a.e(str, cVar, dVar);
    }

    public static void enableGwpAsan(boolean z) {
        if (z) {
            com.bytedance.crash.resource.e.a.e();
        }
    }

    public static int fixScudoVmaLeak() {
        return com.bytedance.crash.X.a.h();
    }

    public static ConfigManager getConfigManager() {
        return A.a();
    }

    @Deprecated
    public static long getFileSize(String str) {
        return 0L;
    }

    @Deprecated
    public static long getFolderSize(String str) {
        return 0L;
    }

    public static boolean hasCrash() {
        return false;
    }

    @Deprecated
    public static boolean hasCrashWhenNativeCrash() {
        return false;
    }

    public static void ignoreExceptionTag(boolean z) {
        J.V(z);
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            if (isInit()) {
                return;
            }
            com.bytedance.crash.Q.a.b();
            com.bytedance.crash.monitor.a c2 = com.bytedance.crash.monitor.l.c(context, iCommonParams);
            c2.o(new com.bytedance.crash.dumper.e(iCommonParams));
            new b();
            com.bytedance.crash.runtime.b.d(new a(c2));
            com.bytedance.crash.Q.a.a();
        }
    }

    public static synchronized void initMiniApp(@NonNull Context context, @NonNull ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            D.h(true);
            init(context, iCommonParams, true, false, true, true);
        }
    }

    public static synchronized com.bytedance.crash.monitor.h initSDK(@NonNull Context context, String str, int i, long j, String str2) {
        com.bytedance.crash.monitor.h b2;
        synchronized (Npth.class) {
            b2 = com.bytedance.crash.monitor.l.b(context, str, i, j, str2);
        }
        return b2;
    }

    public static boolean isANREnable() {
        return D.a.b();
    }

    public static boolean isInit() {
        return com.bytedance.crash.monitor.l.e() != null;
    }

    public static boolean isJavaCrashEnable() {
        return D.a.b();
    }

    public static boolean isNativeCrashEnable() {
        return D.a.b();
    }

    public static boolean isRunning() {
        if (D.a.b()) {
            return com.bytedance.crash.L.j.h();
        }
        return false;
    }

    @Deprecated
    public static boolean isStopUpload() {
        return false;
    }

    @Deprecated
    public static void openANRMonitor() {
    }

    @Deprecated
    public static void openJavaCrashMonitor() {
    }

    @Deprecated
    public static boolean openNativeCrashMonitor() {
        return false;
    }

    public static int optMtkBuffer(int i) {
        return com.bytedance.crash.X.a.k(i);
    }

    public static void optProcessTrackDisk() {
    }

    public static void pause() {
        com.bytedance.crash.R.c.e(true);
        com.bytedance.crash.R.f.b(true);
    }

    public static void registerANRCallback(InterfaceC0654i interfaceC0654i) {
        sCachedDataCenter.c(interfaceC0654i);
    }

    public static void registerAnrUploadCallback(InterfaceC0655j interfaceC0655j) {
        sCachedDataCenter.d(interfaceC0655j);
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        sCachedDataCenter.f(iCrashCallback, crashType);
    }

    @Deprecated
    public static void registerCrashCallbackOnDrop(AbstractC0647b abstractC0647b, CrashType crashType) {
    }

    public static void registerCrashInfoCallback(C0648c c0648c, CrashType crashType) {
        sCachedDataCenter.g(c0648c, crashType);
    }

    public static void registerHprofCallback(IOOMCallback iOOMCallback) {
        sCachedDataCenter.k(iOOMCallback);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        sCachedDataCenter.l(iOOMCallback);
    }

    public static void registerPreANRCallback(q qVar) {
        sCachedDataCenter.m(qVar);
    }

    @Deprecated
    public static void registerPreCrashCallback(r rVar, CrashType crashType) {
        sCachedDataCenter.n(rVar, crashType);
    }

    public static void registerSdk(int i, String str) {
        sCachedDataCenter.J(i, str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        sCachedDataCenter.K(crashType, attachUserData);
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        sCachedDataCenter.K(crashType, attachUserData);
    }

    public static void removeCrashInfoCallback(v vVar, CrashType crashType) {
        if (vVar != null) {
            sCachedDataCenter.S(vVar, crashType);
        }
    }

    public static void removeCustomCrashReasonArray(String str) {
        sCachedDataCenter.M(str);
    }

    public static void removeImportTag(String str) {
        I.p(str);
    }

    public static void removeTag(String str) {
        I.o(str, sCachedDataCenter);
    }

    public static void reportBizException(String str, Throwable th, String str2, Map<String, String> map) {
        if (str == null || th == null) {
            return;
        }
        reportBizException(str, th, str2, map, false);
    }

    public static void reportDartError(String str) {
        if (D.a.b() && !TextUtils.isEmpty(str)) {
            com.bytedance.crash.P.a.b(str, null, null, null);
        }
    }

    @Deprecated
    public static void reportError(String str) {
    }

    @Deprecated
    public static void reportError(@NonNull Throwable th) {
        A.a().isReportErrorEnable();
    }

    public static void reportGameException(String str, String str2, String str3) {
        if (D.a.b()) {
            com.bytedance.crash.S.a.c(str, str2, str3);
        }
    }

    public static void resume() {
        com.bytedance.crash.R.c.e(false);
        com.bytedance.crash.R.f.b(false);
    }

    @Deprecated
    public static void scanNativeCrash(Context context, AbstractC0647b abstractC0647b, String[] strArr) {
    }

    @Deprecated
    public static void setANRCheckEnable(boolean z) {
    }

    public static void setANRImprovementOpt(boolean z) {
        C0653h.d(z);
    }

    @Deprecated
    public static void setAlogFlushAddr(long j) {
    }

    public static void setAlogFlushV2Addr(long j) {
        int i = com.bytedance.crash.K.a.f4392c;
        NativeBridge.P(j);
    }

    @Deprecated
    public static void setAlogLogDirAddr(long j) {
    }

    @Deprecated
    public static void setAlogWriteAddr(long j) {
    }

    public static void setAnrDisableDumpData(boolean z) {
        com.bytedance.crash.L.j.n(z);
    }

    @Deprecated
    public static void setAnrInfoFileObserver(String str, p pVar) {
        com.bytedance.crash.L.j.l(str, pVar);
    }

    public static void setAnrMonitorOpt(boolean z) {
        C0653h.e(z);
    }

    public static void setAnrResendSigquit(boolean z) {
        NativeBridge.R(z);
    }

    public static void setApplication(Application application) {
        if (application != null) {
            C0652g.p(application);
        }
    }

    @Deprecated
    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        addAttachUserData(attachUserData, crashType);
    }

    @Deprecated
    public static void setBusiness(String str) {
        C0652g.q(str);
    }

    public static void setCloseBgAnr(boolean z) {
    }

    public static void setCrashAccessibilityEnable(boolean z) {
        com.bytedance.crash.Z.d.f(z);
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        sCachedDataCenter.T(iCrashFilter);
    }

    public static void setCrashMonitorService(l lVar) {
        C0652g.s(lVar);
    }

    public static void setCrashUploadCallback(InterfaceC0649d interfaceC0649d) {
        sCachedDataCenter.Y(interfaceC0649d);
    }

    public static void setCurProcessName(String str) {
        com.bytedance.crash.util.a.v(str);
    }

    public static void setCustomCrashReasonArrayLimit(String str, int i) {
        sCachedDataCenter.U(str, i);
    }

    public static void setDomainName(String str) {
        try {
            com.bytedance.crash.runtime.a.b(new URL(str).getHost());
        } catch (Throwable unused) {
        }
    }

    public static void setDumpAnrAsync(boolean z) {
        D.i(z);
    }

    @Keep
    public static void setEncryptImpl(@NonNull m mVar) {
        com.bytedance.crash.N.h.k(mVar);
    }

    public static void setFixDumpStack(boolean z) {
        com.bytedance.crash.X.a.j(z);
    }

    public static void setIgnoreHandler(com.bytedance.crash.T.a aVar) {
        com.bytedance.crash.crash.d.f(aVar);
    }

    @Deprecated
    public static void setInitAnrAhead(boolean z) {
    }

    @Deprecated
    public static void setLogcatImpl(com.bytedance.crash.runtime.c cVar) {
    }

    public static void setMaxCacheSize(int i) {
        com.bytedance.crash.R.d.q(i);
    }

    public static void setNetworkCallback(com.bytedance.crash.Y.b bVar) {
        C0651f.c(bVar);
    }

    public static void setNpthInitOptEnable(boolean z) {
    }

    public static void setOpenDumpTraceOpt(boolean z) {
    }

    public static void setOpenNewAnrMonitor(boolean z) {
        C0653h.f(z);
    }

    public static void setQueueLimitSize(int i) {
        com.bytedance.crash.R.d.s(i);
    }

    public static void setRequestHeaderProvider(com.bytedance.crash.Y.c cVar) {
        C0651f.d(cVar);
    }

    public static void setRequestIntercept(com.bytedance.crash.upload.d dVar) {
        CrashUploader.l(dVar);
    }

    public static void setRequestPermission(com.bytedance.crash.upload.e eVar) {
    }

    public static void setScriptStackCallback(s sVar) {
        if (D.a.b()) {
            com.bytedance.crash.S.a.d(sVar);
        }
    }

    public static void setTagCacheService(t tVar) {
        I.q(tVar);
        J j = sCachedDataCenter;
        I.h(new HashMap(j.t()), j);
        j.q();
    }

    public static void setTagOpt(boolean z) {
        sCachedDataCenter.W(z);
    }

    public static void setTerminateMonitorDelayTime(long j) {
    }

    public static void setTerminateOpt(boolean z) {
        J.X(z);
    }

    public static void setUploadDelayTime(long j) {
        com.bytedance.crash.upload.f.a(j);
    }

    public static void setUrlConnectionInterceptor(com.bytedance.crash.Y.a aVar) {
        CrashUploader.m(aVar);
    }

    public static void setUseLocalDomain(boolean z) {
        com.bytedance.crash.monitor.b.j(z);
    }

    public static int startOptMtkBuffer(int i) {
        return com.bytedance.crash.X.a.k(i);
    }

    public static void stopAnr() {
        if (D.a.b()) {
            com.bytedance.crash.L.j.r();
        }
    }

    @Deprecated
    public static void stopEnsure() {
    }

    @Deprecated
    public static void stopUpload() {
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        sCachedDataCenter.L(iCrashCallback, crashType);
    }

    public static void unregisterHprofCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        sCachedDataCenter.O(iOOMCallback);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        sCachedDataCenter.P(iOOMCallback);
    }

    public static void unregisterPreANRCallback(q qVar) {
        sCachedDataCenter.Q(qVar);
    }

    @Deprecated
    public static void unregisterPreCrashCallback(r rVar, CrashType crashType) {
        sCachedDataCenter.R(rVar, crashType);
    }

    public static void registerSdk(String str, String str2) {
        sCachedDataCenter.I(str, str2);
    }

    public static void reportBizException(String str, Throwable th, String str2, Map<String, String> map, boolean z) {
        if (str == null || th == null) {
            return;
        }
        com.bytedance.crash.R.b.a().c(str, th, str2, map, null, z);
    }

    public static void reportBizException(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2) {
        if (str == null || th == null) {
            return;
        }
        reportBizException(str, th, str2, map, map2, false);
    }

    public static synchronized void initMiniApp(@NonNull Context context, @NonNull ICommonParams iCommonParams, int i, String str) {
        synchronized (Npth.class) {
            D.h(true);
            D.g(i, str);
            init(context, iCommonParams, true, true, true, true);
        }
    }

    public static void reportBizException(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2, boolean z) {
        if (str == null || th == null) {
            return;
        }
        com.bytedance.crash.R.b.a().c(str, th, str2, map, map2, z);
    }

    public static void reportDartError(String str, @Nullable Map<? extends String, ? extends String> map, @Nullable Map<String, String> map2, @Nullable u uVar) {
        if (D.a.b() && !TextUtils.isEmpty(str)) {
            com.bytedance.crash.P.a.b(str, map, map2, uVar);
        }
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z, z, z2, z3);
        }
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z, z2, z3, z4, 0L);
        }
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (Npth.class) {
            init(null, context, iCommonParams, z, z2, z3, z4, j);
        }
    }

    public static synchronized void init(@Nullable Application application, @NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (Npth.class) {
            init(context, iCommonParams);
        }
    }
}
