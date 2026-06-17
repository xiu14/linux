package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.impl.C0772l;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ttnet.org.chromium.net.impl.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0774n implements y {
    final /* synthetic */ C0772l a;

    C0774n(C0772l c0772l) {
        this.a = c0772l;
    }

    @Override // com.ttnet.org.chromium.net.impl.y
    public void run() throws Exception {
        C0772l.f fVar;
        C0772l.f fVar2;
        List<String> list;
        if (this.a.p == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = "http/1.1";
        int i = 0;
        while (true) {
            String headerFieldKey = this.a.p.getHeaderFieldKey(i);
            if (headerFieldKey == null) {
                break;
            }
            if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                str = this.a.p.getHeaderField(i);
            }
            if (!headerFieldKey.startsWith("X-Android")) {
                arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.a.p.getHeaderField(i)));
            }
            i++;
        }
        int responseCode = this.a.p.getResponseCode();
        this.a.n = new J(new ArrayList(this.a.f8747e), responseCode, this.a.p.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0L);
        if (responseCode >= 300 && responseCode < 400 && (list = this.a.n.a().get("location")) != null) {
            C0772l.E(this.a, list.get(0));
            return;
        }
        this.a.e0();
        if (responseCode < 400) {
            C0772l c0772l = this.a;
            c0772l.m = C0769i.a(c0772l.p.getInputStream());
            fVar = this.a.a;
            J unused = this.a.n;
            fVar.c(new s(fVar));
            return;
        }
        InputStream errorStream = this.a.p.getErrorStream();
        this.a.m = errorStream == null ? null : C0769i.a(errorStream);
        fVar2 = this.a.a;
        J unused2 = this.a.n;
        fVar2.c(new s(fVar2));
    }
}
