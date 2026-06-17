package com.bytedance.common.a;

import android.app.Application;
import android.net.Uri;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ Application a;

    public final String a(String str) {
        String str2;
        Application application = this.a;
        l.f(application, "$application");
        try {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            l.e(str, "it");
            String uri = Uri.parse(aVar.r(application, str, true)).buildUpon().build().toString();
            l.e(uri, "parse(\n                 …     }.build().toString()");
            IAppGlobals.a.j("ImeAbTestManager", "[INetService] url=" + uri);
            Object a = e.b.l.r.a.a(uri, null, String.class);
            l.e(a, "get(url, null, String::class.java)");
            str2 = (String) a;
        } catch (Exception e2) {
            e.a.a.a.a.d0(e2, e.a.a.a.a.M("[INetService] e="), IAppGlobals.a, "ImeAbTestManager");
            str2 = "";
        }
        IAppGlobals.a.j("ImeAbTestManager", "[INetService] result=" + str2);
        return str2;
    }
}
