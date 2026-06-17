package com.facebook.imagepipeline.memory;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes2.dex */
public class A {
    private final z a;
    private u b;

    /* renamed from: c, reason: collision with root package name */
    private e f6483c;

    /* renamed from: d, reason: collision with root package name */
    private u f6484d;

    /* renamed from: e, reason: collision with root package name */
    private u f6485e;

    /* renamed from: f, reason: collision with root package name */
    private com.facebook.common.memory.h f6486f;

    /* renamed from: g, reason: collision with root package name */
    private com.facebook.common.memory.k f6487g;
    private com.facebook.common.memory.a h;

    public A(z zVar) {
        this.a = zVar;
    }

    private u c(int i) {
        if (i == 0) {
            if (this.f6485e == null) {
                try {
                    this.f6485e = (u) Class.forName("com.facebook.imagepipeline.memory.NativeMemoryChunkPool").getConstructor(com.facebook.common.memory.c.class, B.class, C.class).newInstance(this.a.h(), this.a.f(), this.a.g());
                } catch (ClassNotFoundException e2) {
                    e.c.c.e.a.j("PoolFactory", "", e2);
                    this.f6485e = null;
                } catch (IllegalAccessException e3) {
                    e.c.c.e.a.j("PoolFactory", "", e3);
                    this.f6485e = null;
                } catch (InstantiationException e4) {
                    e.c.c.e.a.j("PoolFactory", "", e4);
                    this.f6485e = null;
                } catch (NoSuchMethodException e5) {
                    e.c.c.e.a.j("PoolFactory", "", e5);
                    this.f6485e = null;
                } catch (InvocationTargetException e6) {
                    e.c.c.e.a.j("PoolFactory", "", e6);
                    this.f6485e = null;
                }
            }
            return this.f6485e;
        }
        if (i == 1) {
            if (this.f6484d == null) {
                try {
                    this.f6484d = (u) Class.forName("com.facebook.imagepipeline.memory.BufferMemoryChunkPool").getConstructor(com.facebook.common.memory.c.class, B.class, C.class).newInstance(this.a.h(), this.a.f(), this.a.g());
                } catch (ClassNotFoundException unused) {
                    this.f6484d = null;
                } catch (IllegalAccessException unused2) {
                    this.f6484d = null;
                } catch (InstantiationException unused3) {
                    this.f6484d = null;
                } catch (NoSuchMethodException unused4) {
                    this.f6484d = null;
                } catch (InvocationTargetException unused5) {
                    this.f6484d = null;
                }
            }
            return this.f6484d;
        }
        if (i != 2) {
            throw new IllegalArgumentException("Invalid MemoryChunkType");
        }
        if (this.b == null) {
            try {
                this.b = (u) Class.forName("com.facebook.imagepipeline.memory.AshmemMemoryChunkPool").getConstructor(com.facebook.common.memory.c.class, B.class, C.class).newInstance(this.a.h(), this.a.f(), this.a.g());
            } catch (ClassNotFoundException unused6) {
                this.b = null;
            } catch (IllegalAccessException unused7) {
                this.b = null;
            } catch (InstantiationException unused8) {
                this.b = null;
            } catch (NoSuchMethodException unused9) {
                this.b = null;
            } catch (InvocationTargetException unused10) {
                this.b = null;
            }
        }
        return this.b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public e a() {
        if (this.f6483c == null) {
            String d2 = this.a.d();
            char c2 = 65535;
            switch (d2.hashCode()) {
                case -1868884870:
                    if (d2.equals("legacy_default_params")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1106578487:
                    if (d2.equals("legacy")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (d2.equals("experimental")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (d2.equals("dummy_with_tracking")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (d2.equals("dummy")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                this.f6483c = new n();
            } else if (c2 == 1) {
                this.f6483c = new o();
            } else if (c2 == 2) {
                Objects.requireNonNull(this.a);
                int a = this.a.a();
                y h = y.h();
                Objects.requireNonNull(this.a);
                this.f6483c = new r(0, a, h, null);
            } else if (c2 != 3) {
                com.facebook.common.memory.c h2 = this.a.h();
                B b = this.a.b();
                C c3 = this.a.c();
                Objects.requireNonNull(this.a);
                this.f6483c = new i(h2, b, c3, false);
            } else {
                com.facebook.common.memory.c h3 = this.a.h();
                B a2 = k.a();
                C c4 = this.a.c();
                Objects.requireNonNull(this.a);
                this.f6483c = new i(h3, a2, c4, false);
            }
        }
        return this.f6483c;
    }

    public int b() {
        return this.a.e().f6489d;
    }

    public com.facebook.common.memory.h d() {
        return e(!e.c.h.g.m.a() ? 1 : 0);
    }

    public com.facebook.common.memory.h e(int i) {
        if (this.f6486f == null) {
            e.c.c.d.h.e(c(i), "failed to get pool for chunk type: " + i);
            this.f6486f = new w(c(i), f());
        }
        return this.f6486f;
    }

    public com.facebook.common.memory.k f() {
        if (this.f6487g == null) {
            this.f6487g = new com.facebook.common.memory.k(g());
        }
        return this.f6487g;
    }

    public com.facebook.common.memory.a g() {
        if (this.h == null) {
            this.h = new q(this.a.h(), this.a.i(), this.a.j());
        }
        return this.h;
    }
}
