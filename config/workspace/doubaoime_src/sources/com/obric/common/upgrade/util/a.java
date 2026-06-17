package com.obric.common.upgrade.util;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import kotlin.s.c.l;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.u;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements u {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // okhttp3.u
    public final B a(u.a aVar) {
        okhttp3.F.f.f fVar = (okhttp3.F.f.f) aVar;
        Request i = fVar.i();
        String tVar = i.url().toString();
        l.e(tVar, "httpUrl.toString()");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c.c("Sending request " + tVar);
        try {
            B f2 = fVar.f(i);
            String format = String.format("Received response for %s in %dms", Arrays.copyOf(new Object[]{tVar, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)}, 2));
            l.e(format, "format(format, *args)");
            c.c(format);
            return f2;
        } catch (IOException e2) {
            c.b("Sending request " + tVar);
            throw new IOException("proceed failed", e2);
        }
    }
}
