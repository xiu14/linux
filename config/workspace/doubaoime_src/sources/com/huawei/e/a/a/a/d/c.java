package com.huawei.e.a.a.a.d;

/* loaded from: classes2.dex */
public class c {
    private byte[] a = null;

    private c() {
    }

    public static c b(String str, String str2, String str3, String str4) {
        c cVar = new c();
        byte[] Q = com.bytedance.feedbackerlib.a.Q(str4);
        d.b("RootKeyUtil", "initRootKey: sha256");
        cVar.a = a.c(str, str2, str3, Q, 16, true);
        return cVar;
    }

    public byte[] a() {
        return (byte[]) this.a.clone();
    }
}
