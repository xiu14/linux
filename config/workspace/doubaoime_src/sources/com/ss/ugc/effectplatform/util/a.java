package com.ss.ugc.effectplatform.util;

import bytekn.foundation.io.file.ContentEncoding;
import java.nio.charset.Charset;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.ss.ugc.effectplatform.util.a$a, reason: collision with other inner class name */
    static final class C0396a extends m implements kotlin.s.b.a<Charset> {
        final /* synthetic */ ContentEncoding a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0396a(ContentEncoding contentEncoding) {
            super(0);
            this.a = contentEncoding;
        }

        @Override // kotlin.s.b.a
        public Charset invoke() {
            return this.a.ordinal() != 1 ? kotlin.text.c.a : kotlin.text.c.b;
        }
    }

    public static final String a(byte[] bArr, ContentEncoding contentEncoding) {
        kotlin.s.c.l.g(bArr, "$this$convertToEncoding");
        kotlin.s.c.l.g(contentEncoding, "contentEncoding");
        return new String(bArr, (Charset) new C0396a(contentEncoding).invoke());
    }
}
