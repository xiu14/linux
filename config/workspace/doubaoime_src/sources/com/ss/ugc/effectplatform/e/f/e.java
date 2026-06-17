package com.ss.ugc.effectplatform.e.f;

import java.io.FileOutputStream;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class e extends bytekn.foundation.io.file.e {
    private final bytekn.foundation.io.file.e b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.s.b.a<o> f8480c;

    public e(bytekn.foundation.io.file.e eVar, kotlin.s.b.a<o> aVar) {
        l.g(eVar, "out");
        l.g(aVar, "hasErrorCallback");
        this.b = eVar;
        this.f8480c = aVar;
        FileOutputStream fileOutputStream = eVar.a;
        if (fileOutputStream == null) {
            l.l("outputStream");
            throw null;
        }
        l.g(fileOutputStream, "<set-?>");
        this.a = fileOutputStream;
    }

    @Override // bytekn.foundation.io.file.e
    public void a() {
        try {
            this.b.a();
        } catch (Exception unused) {
            this.f8480c.invoke();
        }
    }

    @Override // bytekn.foundation.io.file.e
    public void b(byte[] bArr, int i, int i2) {
        l.g(bArr, "buffer");
        try {
            this.b.b(bArr, i, i2);
        } catch (Exception unused) {
            this.f8480c.invoke();
        }
    }

    @Override // bytekn.foundation.io.file.e, bytekn.foundation.io.file.h
    public void close() {
        try {
            this.b.close();
        } catch (Exception unused) {
            this.f8480c.invoke();
        }
    }
}
