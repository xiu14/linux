package com.bytedance.crash.resource.f;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.resource.NativeResourceMonitor;
import com.bytedance.crash.resource.b;
import java.io.File;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends com.bytedance.crash.resource.b {
    private static a l;
    private int h;
    private boolean i = false;
    private boolean j;
    private com.bytedance.crash.resource.f.b k;

    /* renamed from: com.bytedance.crash.resource.f.a$a, reason: collision with other inner class name */
    class C0215a extends Thread {
        C0215a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i;
            while (true) {
                int i2 = 0;
                if (a.this.h == 5 || a.this.j) {
                    break;
                }
                int i3 = a.this.k.h;
                Objects.requireNonNull(a.this);
                com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", a.this.p() + "Thread running ...");
                int i4 = a.this.h;
                if (i4 == 1) {
                    int g2 = (int) (NativeResourceMonitor.g() / 1048576);
                    if (g2 >= a.this.k.i) {
                        a.j(a.this);
                        a.this.h = 2;
                    } else if (g2 <= a.this.k.i / 4) {
                        i = a.this.k.h;
                        i2 = i * 4;
                    } else if (g2 != 0) {
                        i2 = (a.this.k.h * a.this.k.i) / g2;
                    }
                    i2 = i3;
                } else if (i4 == 2) {
                    a.this.h = 3;
                } else if (i4 != 3) {
                    if (i4 == 4) {
                        if (((int) (NativeResourceMonitor.f() / 65536)) >= a.this.k.j) {
                            a.this.o();
                            a.this.h = 5;
                        } else {
                            a.j(a.this);
                            a.this.h = 3;
                        }
                    }
                    i2 = i3;
                } else {
                    int f2 = (int) (NativeResourceMonitor.f() / 1048576);
                    Objects.requireNonNull(a.this);
                    com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "Tracking leak " + f2 + " MB");
                    if (f2 >= (a.this.k.j * 5) / 4) {
                        a.k(a.this);
                        a.this.h = 4;
                    } else if (f2 < a.this.k.j / 4) {
                        i = a.this.k.h;
                        i2 = i * 4;
                    } else if (f2 != 0) {
                        i2 = (a.this.k.h * a.this.k.j) / f2;
                    }
                    i2 = i3;
                }
                if (i2 > 0) {
                    Objects.requireNonNull(a.this);
                    com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", a.this.p() + "Thread sleeping " + i2 + " seconds ...");
                    SystemClock.sleep((long) (i2 * 1000));
                }
            }
            a.this.i = false;
            if (a.this.j) {
                a.m(a.this);
            }
            ((com.bytedance.crash.resource.b) a.this).f4661e.b();
            com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", a.this.p() + "Thread exit!");
        }
    }

    static class b extends b.a {
        protected b(com.bytedance.crash.monitor.a aVar, @NonNull File file) {
            super(aVar, file);
        }

        @Override // com.bytedance.crash.resource.b.a
        protected void h(Map<String, String> map, b.C0212b c0212b) {
            super.h(map, c0212b);
            map.put("has_dump", "true");
            map.put("is_root", com.bytedance.crash.general.a.i() ? "true" : "false");
            map.put("sdk_version", "4.2.1-rc.8-oime");
            map.put("is_64_runtime", NativeBridge.E() ? "true" : "false");
            map.put("has_native_oom", c0212b.b.isEmpty() ? "false" : "true");
            map.put("native_oom_app", C0652g.g().getPackageName());
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x014e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
        @Override // com.bytedance.crash.resource.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected boolean i(java.io.File r17, com.bytedance.crash.resource.b.C0212b r18) {
            /*
                Method dump skipped, instructions count: 510
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.resource.f.a.b.i(java.io.File, com.bytedance.crash.resource.b$b):boolean");
        }
    }

    static void j(a aVar) {
        Objects.requireNonNull(aVar);
        com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "trackNative");
        int e2 = NativeResourceMonitor.e(1);
        if (e2 != 0) {
            com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "trackNative ret=" + e2);
            aVar.j = true;
        }
    }

    static void k(a aVar) {
        Objects.requireNonNull(aVar);
        com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "waitNative");
        int e2 = NativeResourceMonitor.e(2);
        if (e2 != 0) {
            com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "waitNative ret=" + e2);
            aVar.j = true;
        }
    }

    static void m(a aVar) {
        Objects.requireNonNull(aVar);
        com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "exitNative");
        int e2 = NativeResourceMonitor.e(4);
        if (e2 != 0) {
            com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "exitNative ret=" + e2);
            aVar.j = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String p() {
        int i = this.h;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "[STATEE_UNKNOWN]" : "[STATE_EXIT]" : "[STATE_WAIT]" : "[STATE_TRACK]" : "[STATE_OBSERV]" : "[STATE_PREPARE]" : "[STATE_INIT]";
    }

    public static void q(com.bytedance.crash.resource.f.b bVar) {
        if (l == null) {
            synchronized (a.class) {
                if (l == null) {
                    l = new a();
                }
            }
        }
        a aVar = l;
        aVar.k = bVar;
        aVar.c(bVar);
    }

    public static void r(com.bytedance.crash.monitor.a aVar) {
        try {
            new b(aVar, com.bytedance.crash.resource.i.b.c()).j();
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.D("NativeHeapTracker: ", "upload exception:" + th);
        }
    }

    @Override // com.bytedance.crash.resource.b
    protected void a() {
        if (this.i) {
            com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "execute() Already running!");
            return;
        }
        if (this.h != 0) {
            StringBuilder M = e.a.a.a.a.M("execute() Invalide state ");
            M.append(p());
            com.bytedance.android.input.k.b.a.D("NativeHeapTracker: ", M.toString());
            return;
        }
        this.i = true;
        com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "initNative");
        int e2 = NativeResourceMonitor.e(0);
        if (e2 != 0) {
            com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "initNative failed ret:" + e2);
        }
        if (e2 != 0) {
            return;
        }
        this.h = 1;
        new C0215a("NativeHeapTracker").start();
    }

    @Override // com.bytedance.crash.resource.b
    protected boolean b() {
        this.h = 0;
        this.j = false;
        return true;
    }

    public void o() {
        com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "dumpNative");
        int e2 = NativeResourceMonitor.e(3);
        if (e2 != 0) {
            com.bytedance.android.input.k.b.a.X("NativeHeapTracker: ", "dumpNative ret=" + e2);
            this.j = true;
        }
    }
}
