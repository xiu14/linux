package com.bytedance.android.input.common.t.a;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.ies.common.IESAppLogger;
import com.mammon.audiosdk.BuildConfig;
import java.util.Objects;
import kotlin.e;
import kotlin.s.c.m;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    public static final c a = null;
    private static boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static final e f2216c = kotlin.a.c(b.a);

    public static final class a implements IESAppLogger.a {
        @Override // com.bytedance.ies.common.IESAppLogger.a
        public void a(String str, JSONObject jSONObject, String str2) {
            if (str == null || jSONObject == null) {
                return;
            }
            IAppLog.a.t(str, jSONObject);
        }
    }

    static final class b extends m implements kotlin.s.b.a<a> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public a invoke() {
            return new a();
        }
    }

    public static final void a() {
        if (b) {
            return;
        }
        b = true;
        IAppGlobals.a aVar = IAppGlobals.a;
        com.bytedance.common.utility.j.a.a(aVar.getContext(), "iesapplogger");
        com.bytedance.common.utility.j.a.a(aVar.getContext(), BuildConfig.LIBNAME);
        IESAppLogger.a aVar2 = (IESAppLogger.a) f2216c.getValue();
        if (aVar2 != null) {
            IESAppLogger sharedInstance = IESAppLogger.sharedInstance();
            Objects.requireNonNull(aVar);
            sharedInstance.setAppLogCallback("401734", aVar2, true);
        }
    }
}
