package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class w implements com.facebook.common.memory.h {
    private final com.facebook.common.memory.k a;
    private final u b;

    public w(u uVar, com.facebook.common.memory.k kVar) {
        this.b = uVar;
        this.a = kVar;
    }

    @Override // com.facebook.common.memory.h
    public com.facebook.common.memory.j a() {
        u uVar = this.b;
        return new x(uVar, uVar.r());
    }

    @Override // com.facebook.common.memory.h
    public com.facebook.common.memory.g b(byte[] bArr) {
        x xVar = new x(this.b, bArr.length);
        try {
            try {
                xVar.write(bArr, 0, bArr.length);
                return xVar.d();
            } catch (IOException e2) {
                e.c.c.d.h.j(e2);
                throw new RuntimeException(e2);
            }
        } finally {
            xVar.close();
        }
    }

    @Override // com.facebook.common.memory.h
    public com.facebook.common.memory.g c(InputStream inputStream, int i, String str) throws IOException {
        x xVar = new x(this.b, i);
        try {
            return this.a.b(inputStream, xVar, str) == -1 ? null : xVar.d();
        } finally {
            xVar.close();
        }
    }

    @Override // com.facebook.common.memory.h
    public com.facebook.common.memory.g d(InputStream inputStream) throws IOException {
        u uVar = this.b;
        x xVar = new x(uVar, uVar.r());
        try {
            this.a.a(inputStream, xVar);
            return xVar.d();
        } finally {
            xVar.close();
        }
    }

    @Override // com.facebook.common.memory.h
    public com.facebook.common.memory.g e(InputStream inputStream, int i) throws IOException {
        x xVar = new x(this.b, i);
        try {
            this.a.a(inputStream, xVar);
            return xVar.d();
        } finally {
            xVar.close();
        }
    }

    @Override // com.facebook.common.memory.h
    public com.facebook.common.memory.j f(int i) {
        return new x(this.b, i);
    }
}
