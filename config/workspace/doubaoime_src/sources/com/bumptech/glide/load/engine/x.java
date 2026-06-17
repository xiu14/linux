package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class x implements com.bumptech.glide.load.d {
    private static final com.bumptech.glide.util.g<Class<?>, byte[]> j = new com.bumptech.glide.util.g<>(50);
    private final com.bumptech.glide.load.engine.B.b b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.d f1688c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.d f1689d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1690e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1691f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f1692g;
    private final com.bumptech.glide.load.f h;
    private final com.bumptech.glide.load.i<?> i;

    x(com.bumptech.glide.load.engine.B.b bVar, com.bumptech.glide.load.d dVar, com.bumptech.glide.load.d dVar2, int i, int i2, com.bumptech.glide.load.i<?> iVar, Class<?> cls, com.bumptech.glide.load.f fVar) {
        this.b = bVar;
        this.f1688c = dVar;
        this.f1689d = dVar2;
        this.f1690e = i;
        this.f1691f = i2;
        this.i = iVar;
        this.f1692g = cls;
        this.h = fVar;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.b.b(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f1690e).putInt(this.f1691f).array();
        this.f1689d.a(messageDigest);
        this.f1688c.a(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.i<?> iVar = this.i;
        if (iVar != null) {
            iVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        com.bumptech.glide.util.g<Class<?>, byte[]> gVar = j;
        byte[] e2 = gVar.e(this.f1692g);
        if (e2 == null) {
            e2 = this.f1692g.getName().getBytes(com.bumptech.glide.load.d.a);
            gVar.i(this.f1692g, e2);
        }
        messageDigest.update(e2);
        this.b.put(bArr);
    }

    @Override // com.bumptech.glide.load.d
    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f1691f == xVar.f1691f && this.f1690e == xVar.f1690e && com.bumptech.glide.util.j.b(this.i, xVar.i) && this.f1692g.equals(xVar.f1692g) && this.f1688c.equals(xVar.f1688c) && this.f1689d.equals(xVar.f1689d) && this.h.equals(xVar.h);
    }

    @Override // com.bumptech.glide.load.d
    public int hashCode() {
        int hashCode = ((((this.f1689d.hashCode() + (this.f1688c.hashCode() * 31)) * 31) + this.f1690e) * 31) + this.f1691f;
        com.bumptech.glide.load.i<?> iVar = this.i;
        if (iVar != null) {
            hashCode = (hashCode * 31) + iVar.hashCode();
        }
        return this.h.hashCode() + ((this.f1692g.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ResourceCacheKey{sourceKey=");
        M.append(this.f1688c);
        M.append(", signature=");
        M.append(this.f1689d);
        M.append(", width=");
        M.append(this.f1690e);
        M.append(", height=");
        M.append(this.f1691f);
        M.append(", decodedResourceClass=");
        M.append(this.f1692g);
        M.append(", transformation='");
        M.append(this.i);
        M.append('\'');
        M.append(", options=");
        M.append(this.h);
        M.append('}');
        return M.toString();
    }
}
