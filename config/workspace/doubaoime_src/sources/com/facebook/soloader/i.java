package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class i extends q {

    private final class b extends q.f {
        private final c[] a;

        private final class a extends q.d {
            private int a;

            a(a aVar) {
            }

            @Override // com.facebook.soloader.q.d
            public boolean a() {
                return this.a < b.this.a.length;
            }

            @Override // com.facebook.soloader.q.d
            public q.c d() throws IOException {
                c[] cVarArr = b.this.a;
                int i = this.a;
                this.a = i + 1;
                c cVar = cVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.f6712c);
                try {
                    return new q.e(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r10 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        b(com.facebook.soloader.i r17, com.facebook.soloader.q r18) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.i.b.<init>(com.facebook.soloader.i, com.facebook.soloader.q):void");
        }

        @Override // com.facebook.soloader.q.f
        public q.b a() throws IOException {
            return new q.b(this.a);
        }

        @Override // com.facebook.soloader.q.f
        public q.d d() throws IOException {
            return new a(null);
        }
    }

    private static final class c extends q.a {

        /* renamed from: c, reason: collision with root package name */
        final File f6712c;

        c(String str, String str2, File file) {
            super(str, str2);
            this.f6712c = file;
        }
    }

    public i(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.q
    protected q.f m(byte b2) throws IOException {
        return new b(this, this);
    }
}
