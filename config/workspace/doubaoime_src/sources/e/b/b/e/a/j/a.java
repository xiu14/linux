package e.b.b.e.a.j;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private long a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f9395c;

    /* renamed from: d, reason: collision with root package name */
    private File f9396d;

    /* renamed from: e, reason: collision with root package name */
    private List<b> f9397e;

    public a(long j, int i, int i2, List<b> list) {
        this.a = j;
        this.b = i;
        this.f9395c = i2;
        this.f9397e = list;
    }

    public static a a(File file) {
        try {
            byte[] B0 = com.bytedance.android.input.k.b.a.B0(file);
            if (B0 == null) {
                List<String> list = e.b.b.e.a.a.a;
                e.b.b.n.g.b.b("APM-Slardar", "fromFile bytes is null");
                return null;
            }
            a b = b(ByteBuffer.wrap(B0));
            if (b != null) {
                b.f9396d = file;
            } else {
                List<String> list2 = e.b.b.e.a.a.a;
                e.b.b.n.g.b.b("APM-Slardar", "fromMemory bytes is null");
            }
            return b;
        } catch (Throwable th) {
            List<String> list3 = e.b.b.e.a.a.a;
            e.b.b.n.g.b.c("APM-Slardar", "fromFile", th);
            return null;
        }
    }

    public static a b(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.getShort() != 2082) {
                return null;
            }
            long j = byteBuffer.getLong();
            int i = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = byteBuffer.getInt();
                i3 += i5;
                if (i3 > i2) {
                    return null;
                }
                byte[] bArr = new byte[i5];
                byteBuffer.get(bArr);
                arrayList.add(new b(bArr));
            }
            return new a(j, i, i2, arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<b> c() {
        return this.f9397e;
    }

    public File d() {
        return this.f9396d;
    }

    public long e() {
        return this.a;
    }

    public int f() {
        return this.f9395c;
    }

    public int g() {
        return this.b;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("LogFile{startID=");
        M.append(this.a);
        M.append(", totalCount=");
        M.append(this.b);
        M.append(", totalBytes=");
        M.append(this.f9395c);
        M.append(", source=");
        M.append(this.f9396d);
        M.append(", logList=");
        M.append(this.f9397e);
        M.append('}');
        return M.toString();
    }
}
