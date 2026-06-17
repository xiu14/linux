package e.h.a.j.c;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class b {
    protected long a;
    protected boolean b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    protected String f9957c;

    /* renamed from: d, reason: collision with root package name */
    protected int f9958d = 2;

    /* renamed from: e, reason: collision with root package name */
    protected String f9959e = "no error";

    /* renamed from: f, reason: collision with root package name */
    protected long f9960f;

    /* renamed from: g, reason: collision with root package name */
    protected HashMap<String, String> f9961g;

    public b(long j, boolean z, String str, HashMap<String, String> hashMap) {
        this.f9960f = 0L;
        this.f9961g = null;
        this.a = j;
        this.b = z;
        this.f9957c = str;
        this.f9960f = System.currentTimeMillis();
        this.f9961g = hashMap;
    }

    public int a() {
        return this.f9958d;
    }

    @NonNull
    public String b() {
        return this.f9957c;
    }

    public String c() {
        return this.f9959e;
    }

    public long d() {
        return this.a;
    }

    public long e() {
        return this.f9960f;
    }

    public HashMap<String, String> f() {
        return this.f9961g;
    }

    public boolean g() {
        return this.b;
    }

    public void h(int i) {
        this.f9958d = i;
    }

    public void i(String str) {
        this.f9959e = str;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("UploadInfo{lastUploadTime=");
        M.append(this.a);
        M.append(", isUploading=");
        M.append(this.b);
        M.append(", commandId='");
        e.a.a.a.a.G0(M, this.f9957c, '\'', ", cloudMsgResponseCode=");
        M.append(this.f9958d);
        M.append(", errorMsg='");
        e.a.a.a.a.G0(M, this.f9959e, '\'', ", operateTime=");
        M.append(this.f9960f);
        M.append(", specificParams=");
        M.append(this.f9961g);
        M.append('}');
        return M.toString();
    }
}
