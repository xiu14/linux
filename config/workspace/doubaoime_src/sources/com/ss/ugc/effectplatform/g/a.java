package com.ss.ugc.effectplatform.g;

import bytekn.foundation.io.file.ContentEncoding;
import java.nio.charset.Charset;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlin.text.c;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.ss.ugc.effectplatform.g.a$a, reason: collision with other inner class name */
    static final class C0392a extends m implements kotlin.s.b.a<Charset> {
        final /* synthetic */ ContentEncoding a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0392a(ContentEncoding contentEncoding) {
            super(0);
            this.a = contentEncoding;
        }

        @Override // kotlin.s.b.a
        public Charset invoke() {
            return this.a.ordinal() != 1 ? c.a : c.b;
        }
    }

    public static final byte[] a(String str) {
        l.g(str, "$this$toByteArrayExt");
        byte[] bytes = str.getBytes(c.a);
        l.b(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr, int i, int i2, ContentEncoding contentEncoding) {
        l.g(bArr, "$this$toString");
        l.g(contentEncoding, "contentEncoding");
        return new String(bArr, i, i2, new C0392a(contentEncoding).invoke());
    }
}
