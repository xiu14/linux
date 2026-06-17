package com.bytedance.android.input.q;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.input.basic.recognition.api.IRecognizer;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.InterfaceC0817m0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC0817m0 f2989c;
    public static final q a = new q();
    private static final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private static String f2990d = "";

    /* renamed from: e, reason: collision with root package name */
    private static String f2991e = "";

    /* renamed from: f, reason: collision with root package name */
    private static String f2992f = "";

    /* renamed from: g, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Map<String, Object>> f2993g = new ConcurrentHashMap<>();
    private static Map<String, ? extends Object> h = new LinkedHashMap();
    private static final ConcurrentHashMap<String, Long> i = new ConcurrentHashMap<>();

    private q() {
    }

    public final void a(String str) {
        kotlin.s.c.l.f(str, "conversationId");
        f2993g.put(str, kotlin.collections.g.o());
        i.put(str, 0L);
    }

    public final void b() {
        InterfaceC0817m0 interfaceC0817m0 = f2989c;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        f2989c = null;
        IRecognizer.a.b(f2990d);
        f2990d = "";
    }

    public final void c(String str) {
        kotlin.s.c.l.f(str, DBDefinition.PACKAGE_NAME);
        InterfaceC0817m0 interfaceC0817m0 = f2989c;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        f2989c = null;
        IRecognizer.a.b(f2990d);
        f2990d = "";
        if (kotlin.s.c.l.a(f2992f, str)) {
            return;
        }
        f2992f = str;
        StringBuilder M = e.a.a.a.a.M("onStartInputView clear lastConvId,lastpkg:");
        M.append(f2992f);
        M.append(", pak:");
        M.append(str);
        com.bytedance.android.input.r.j.i("ChatIntentGenerate", M.toString());
        i.clear();
        f2991e = "";
        f2993g.clear();
    }
}
