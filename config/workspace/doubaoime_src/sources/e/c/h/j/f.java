package e.c.h.j;

import e.c.c.d.h;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f9933c;

    /* renamed from: d, reason: collision with root package name */
    private int f9934d;

    /* renamed from: e, reason: collision with root package name */
    private int f9935e;

    /* renamed from: f, reason: collision with root package name */
    private int f9936f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9937g;
    private final com.facebook.common.memory.a h;

    public f(com.facebook.common.memory.a aVar) {
        Objects.requireNonNull(aVar);
        this.h = aVar;
        this.f9933c = 0;
        this.b = 0;
        this.f9934d = 0;
        this.f9936f = 0;
        this.f9935e = 0;
        this.a = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
    
        r11.a = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b7, code lost:
    
        if (r11.a == 6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00bb, code lost:
    
        if (r11.f9935e == r0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.InputStream r12) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.h.j.f.a(java.io.InputStream):boolean");
    }

    public int b() {
        return this.f9936f;
    }

    public int c() {
        return this.f9935e;
    }

    public boolean d() {
        return this.f9937g;
    }

    public boolean e(com.facebook.imagepipeline.image.f fVar) {
        if (this.a == 6 || fVar.I() <= this.f9933c) {
            return false;
        }
        com.facebook.common.memory.f fVar2 = new com.facebook.common.memory.f(fVar.A(), this.h.get(16384), this.h);
        try {
            try {
                com.bytedance.feedbackerlib.a.M0(fVar2, this.f9933c);
                return a(fVar2);
            } catch (IOException e2) {
                h.j(e2);
                throw new RuntimeException(e2);
            }
        } finally {
            e.c.c.d.a.b(fVar2);
        }
    }
}
