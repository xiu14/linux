package com.facebook.imagepipeline.image;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class d implements Closeable, h, g, j {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f6470c = {"encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config"};
    protected e.c.g.d a;
    private Map<String, Object> b = new HashMap();

    @Override // com.facebook.imagepipeline.image.j
    public void a() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        e.c.c.e.a.d("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.image.g
    public Map<String, Object> getExtras() {
        return this.b;
    }

    public e.c.g.d h() {
        e.c.g.d dVar = this.a;
        return dVar == null ? e.c.g.d.b : dVar;
    }

    public abstract boolean isClosed();

    public k l() {
        return i.f6481d;
    }

    public abstract int o();

    public boolean p() {
        return false;
    }

    public void r(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (String str : f6470c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.b.put(str, obj);
            }
        }
    }
}
