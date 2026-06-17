package com.bytedance.memory.shrink;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class f extends e {
    private final OutputStream b;

    /* renamed from: c, reason: collision with root package name */
    private int f5397c;

    /* renamed from: d, reason: collision with root package name */
    private final ByteArrayOutputStream f5398d;

    /* JADX INFO: Access modifiers changed from: private */
    class a extends b {
        private final int a;

        a(int i, int i2, long j) {
            super(null);
            this.a = i;
        }

        @Override // com.bytedance.memory.shrink.b
        public void a() {
            try {
                f.this.b.write(this.a);
                f.this.b.write(f.this.f5398d.toByteArray());
                f.this.f5398d.reset();
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.b
        public void b(int i, c cVar) {
            try {
                f.this.f5398d.write(i);
                f.this.f5398d.write(cVar.a());
                if (i == 1) {
                    g.g(f.this.f5398d, f.this.f5397c);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    public f(OutputStream outputStream) {
        super(null);
        this.f5397c = 0;
        this.f5398d = new ByteArrayOutputStream();
        this.b = outputStream;
    }

    @Override // com.bytedance.memory.shrink.e
    public void a() {
        try {
            this.b.flush();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // com.bytedance.memory.shrink.e
    public void b(String str, int i, long j) {
        try {
            this.f5397c = i;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // com.bytedance.memory.shrink.e
    public b c(int i, int i2, long j) {
        try {
            return new a(i, i2, j);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // com.bytedance.memory.shrink.e
    public void d(int i, c cVar, int i2, c cVar2, int i3, long j) {
        try {
            this.b.write(2);
            this.b.write(cVar.a());
            this.b.write(cVar2.a());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // com.bytedance.memory.shrink.e
    public void e(c cVar, c cVar2, c cVar3, c cVar4, int i, int i2, int i3, long j) {
    }

    @Override // com.bytedance.memory.shrink.e
    public void f(int i, int i2, c[] cVarArr, int i3, long j) {
    }

    @Override // com.bytedance.memory.shrink.e
    public void g(c cVar, String str, int i, long j) {
        try {
            this.b.write(1);
            g.j(this.b, (int) j);
            this.b.write(cVar.a());
            OutputStream outputStream = this.b;
            byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
            outputStream.write(bytes, 0, bytes.length);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // com.bytedance.memory.shrink.e
    public void h(int i, int i2, long j, byte[] bArr) {
        if (i == 44) {
            try {
                this.b.write(i);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }
}
