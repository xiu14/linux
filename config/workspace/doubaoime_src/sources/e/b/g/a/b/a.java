package e.b.g.a.b;

import android.content.Context;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    protected String a;
    protected b b;

    /* renamed from: c, reason: collision with root package name */
    protected d f9528c;

    /* renamed from: d, reason: collision with root package name */
    private String f9529d;

    /* renamed from: e, reason: collision with root package name */
    private c f9530e;

    /* renamed from: f, reason: collision with root package name */
    private long f9531f;

    /* renamed from: g, reason: collision with root package name */
    private long f9532g;

    /* renamed from: e.b.g.a.b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0434a implements b {
    }

    public interface b {
        String a();

        List<String> b();

        int c();

        long d();
    }

    public interface c {
        boolean a();

        long b();

        boolean c();

        long d();
    }

    public a(Context context, b bVar, c cVar) {
        this.b = bVar;
        this.f9530e = cVar;
        if (bVar == null) {
            throw new IllegalArgumentException("config is null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("responseConfig is null");
        }
        String a = bVar.a();
        this.a = a;
        if (TextUtils.isEmpty(a)) {
            throw new IllegalArgumentException("type is empty.");
        }
        d c2 = d.c(context);
        this.f9528c = c2;
        c2.e(this.a, this);
    }

    public boolean a(String str) {
        byte[] bytes;
        if (str != null) {
            try {
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            if (str.length() > 0) {
                bytes = str.getBytes("UTF-8");
                return this.f9528c.a(this.a, bytes);
            }
        }
        bytes = null;
        return this.f9528c.a(this.a, bytes);
    }

    public long b() {
        return this.f9531f;
    }

    String c() {
        return this.f9529d;
    }

    c d() {
        return this.f9530e;
    }

    public long e() {
        return this.f9532g;
    }

    protected abstract boolean f(String str, byte[] bArr);

    public void g(long j) {
        this.f9531f = j;
    }

    public void h(String str) {
        this.f9529d = str;
    }

    public void i(long j) {
        this.f9532g = j;
    }
}
