package e.c.g;

import e.c.c.d.h;
import e.c.g.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static e f9844d;
    private int a;
    private List<d.a> b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a f9845c = new b();

    private e() {
        e();
    }

    public static d a(InputStream inputStream) throws IOException {
        int w0;
        e c2 = c();
        Objects.requireNonNull(c2);
        Objects.requireNonNull(inputStream);
        int i = c2.a;
        byte[] bArr = new byte[i];
        h.a(i >= i);
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                w0 = com.bytedance.feedbackerlib.a.w0(inputStream, bArr, 0, i);
            } finally {
                inputStream.reset();
            }
        } else {
            w0 = com.bytedance.feedbackerlib.a.w0(inputStream, bArr, 0, i);
        }
        List<d.a> list = c2.b;
        if (list != null) {
            Iterator<d.a> it2 = list.iterator();
            while (it2.hasNext()) {
                d b = it2.next().b(bArr, w0);
                if (b != null && b != d.b) {
                    return b;
                }
            }
        }
        d b2 = c2.f9845c.b(bArr, w0);
        return (b2 == null || b2 == d.b) ? d.b : b2;
    }

    public static d b(InputStream inputStream) {
        try {
            return a(inputStream);
        } catch (IOException e2) {
            h.j(e2);
            throw new RuntimeException(e2);
        }
    }

    public static synchronized e c() {
        e eVar;
        synchronized (e.class) {
            if (f9844d == null) {
                f9844d = new e();
            }
            eVar = f9844d;
        }
        return eVar;
    }

    private void e() {
        this.a = this.f9845c.a();
        List<d.a> list = this.b;
        if (list != null) {
            Iterator<d.a> it2 = list.iterator();
            while (it2.hasNext()) {
                this.a = Math.max(this.a, it2.next().a());
            }
        }
    }

    public int d() {
        return this.a;
    }
}
