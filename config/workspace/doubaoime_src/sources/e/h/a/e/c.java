package e.h.a.e;

import java.util.HashMap;

/* loaded from: classes2.dex */
public class c {
    private boolean a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f9948c;

    private c(boolean z, String str, HashMap<String, String> hashMap) {
        this.a = z;
        this.b = str;
        this.f9948c = hashMap;
    }

    public static c a(boolean z, String str, HashMap<String, String> hashMap) {
        return new c(z, str, hashMap);
    }

    public String b() {
        return this.b;
    }

    public HashMap<String, String> c() {
        return this.f9948c;
    }

    public boolean d() {
        return this.a;
    }
}
