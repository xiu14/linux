package com.xiaomi.push;

import com.xiaomi.push.jl;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class jv extends jl {
    private static int b = 10000;

    /* renamed from: c, reason: collision with root package name */
    private static int f9299c = 10000;

    /* renamed from: d, reason: collision with root package name */
    private static int f9300d = 10000;

    /* renamed from: e, reason: collision with root package name */
    private static int f9301e = 10485760;

    /* renamed from: f, reason: collision with root package name */
    private static int f9302f = 104857600;

    public static class a extends jl.a {
        public a() {
            super(false, true);
        }

        @Override // com.xiaomi.push.jl.a, com.xiaomi.push.jr
        public jp a(jz jzVar) {
            jv jvVar = new jv(jzVar, ((jl.a) this).f914a, this.b);
            int i = ((jl.a) this).a;
            if (i != 0) {
                jvVar.b(i);
            }
            return jvVar;
        }

        public a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }
    }

    public jv(jz jzVar, boolean z, boolean z2) {
        super(jzVar, z, z2);
    }

    @Override // com.xiaomi.push.jl, com.xiaomi.push.jp
    /* renamed from: a */
    public jo mo641a() {
        byte a2 = a();
        byte a3 = a();
        int mo637a = mo637a();
        if (mo637a <= b) {
            return new jo(a2, a3, mo637a);
        }
        throw new jq(3, e.a.a.a.a.k("Thrift map size ", mo637a, " out of range!"));
    }

    @Override // com.xiaomi.push.jl, com.xiaomi.push.jp
    /* renamed from: a */
    public jn mo640a() {
        byte a2 = a();
        int mo637a = mo637a();
        if (mo637a <= f9299c) {
            return new jn(a2, mo637a);
        }
        throw new jq(3, e.a.a.a.a.k("Thrift list size ", mo637a, " out of range!"));
    }

    @Override // com.xiaomi.push.jl, com.xiaomi.push.jp
    /* renamed from: a */
    public jt mo642a() {
        byte a2 = a();
        int mo637a = mo637a();
        if (mo637a <= f9300d) {
            return new jt(a2, mo637a);
        }
        throw new jq(3, e.a.a.a.a.k("Thrift set size ", mo637a, " out of range!"));
    }

    @Override // com.xiaomi.push.jl, com.xiaomi.push.jp
    /* renamed from: a */
    public String mo644a() {
        int mo637a = mo637a();
        if (mo637a <= f9301e) {
            if (((jp) this).a.b() >= mo637a) {
                try {
                    String str = new String(((jp) this).a.a(), ((jp) this).a.a_(), mo637a, "UTF-8");
                    ((jp) this).a.a(mo637a);
                    return str;
                } catch (UnsupportedEncodingException unused) {
                    throw new jj("JVM DOES NOT SUPPORT UTF-8");
                }
            }
            return a(mo637a);
        }
        throw new jq(3, e.a.a.a.a.k("Thrift string size ", mo637a, " out of range!"));
    }

    @Override // com.xiaomi.push.jl, com.xiaomi.push.jp
    /* renamed from: a */
    public ByteBuffer mo645a() {
        int mo637a = mo637a();
        if (mo637a <= f9302f) {
            c(mo637a);
            if (((jp) this).a.b() >= mo637a) {
                ByteBuffer wrap = ByteBuffer.wrap(((jp) this).a.a(), ((jp) this).a.a_(), mo637a);
                ((jp) this).a.a(mo637a);
                return wrap;
            }
            byte[] bArr = new byte[mo637a];
            ((jp) this).a.b(bArr, 0, mo637a);
            return ByteBuffer.wrap(bArr);
        }
        throw new jq(3, e.a.a.a.a.k("Thrift binary size ", mo637a, " out of range!"));
    }
}
