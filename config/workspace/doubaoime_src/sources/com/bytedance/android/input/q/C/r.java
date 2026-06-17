package com.bytedance.android.input.q.C;

import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class r {
    private static String b = "";

    /* renamed from: d, reason: collision with root package name */
    private static com.bytedance.android.input.basic.recognition.api.a f2967d;
    public static final r a = new r();

    /* renamed from: c, reason: collision with root package name */
    private static final List<Object> f2966c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, List<String>> f2968e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final CopyOnWriteArrayList<String> f2969f = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private static final kotlin.e f2970g = kotlin.a.c(a.a);

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<Boolean> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Boolean invoke() {
            return Boolean.valueOf(IInputSettings.a.b().h());
        }
    }

    private r() {
    }

    public static final void a(String str) {
        kotlin.s.c.l.f(str, RemoteMessageConst.DATA);
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f2969f;
        synchronized (copyOnWriteArrayList) {
            if (kotlin.text.a.s(str)) {
                return;
            }
            copyOnWriteArrayList.addIfAbsent(str);
        }
    }

    public final void b() {
        b = "";
        f2969f.clear();
    }

    public final void c() {
        f2967d = null;
        f2966c.clear();
    }
}
