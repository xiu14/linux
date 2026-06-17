package com.ttnet.org.chromium.net.impl;

import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ttnet.org.chromium.net.impl.C0772l.g;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ttnet.org.chromium.net.impl.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0776p implements y {
    final /* synthetic */ C0772l a;

    C0776p(C0772l c0772l) {
        this.a = c0772l;
    }

    @Override // com.ttnet.org.chromium.net.impl.y
    public void run() throws Exception {
        AtomicInteger atomicInteger;
        String str;
        String str2;
        Executor executor;
        String str3;
        atomicInteger = this.a.f8748f;
        if (atomicInteger.get() == 8) {
            return;
        }
        URL url = new URL(this.a.l);
        if (this.a.p != null) {
            this.a.p.disconnect();
            this.a.p = null;
        }
        this.a.p = (HttpURLConnection) url.openConnection();
        this.a.p.setInstanceFollowRedirects(false);
        if (!this.a.f8746d.containsKey(DownloadConstants.USER_AGENT)) {
            Map map = this.a.f8746d;
            str3 = this.a.f8745c;
            map.put(DownloadConstants.USER_AGENT, str3);
        }
        for (Map.Entry entry : this.a.f8746d.entrySet()) {
            this.a.p.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        str = this.a.i;
        if (str == null) {
            this.a.i = "GET";
        }
        HttpURLConnection httpURLConnection = this.a.p;
        str2 = this.a.i;
        httpURLConnection.setRequestMethod(str2);
        if (this.a.j == null) {
            Objects.requireNonNull(this.a);
            this.a.p.connect();
            C0772l.Y(this.a);
        } else {
            C0772l c0772l = this.a;
            executor = c0772l.k;
            c0772l.q = c0772l.new g(executor, this.a.b, this.a.p, this.a.j);
            this.a.q.s(this.a.f8747e.size() == 1);
        }
    }
}
