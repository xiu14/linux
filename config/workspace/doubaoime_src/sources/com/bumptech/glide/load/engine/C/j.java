package com.bumptech.glide.load.engine.C;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes.dex */
public final class j {
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1609c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1610d;

    public static final class a {
        final Context a;
        ActivityManager b;

        /* renamed from: c, reason: collision with root package name */
        c f1611c;

        /* renamed from: d, reason: collision with root package name */
        float f1612d;

        public a(Context context) {
            this.f1612d = 1;
            this.a = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.f1611c = new b(context.getResources().getDisplayMetrics());
            if (this.b.isLowRamDevice()) {
                this.f1612d = 0.0f;
            }
        }

        public j a() {
            return new j(this);
        }
    }

    private static final class b implements c {
        private final DisplayMetrics a;

        b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        public int a() {
            return this.a.heightPixels;
        }

        public int b() {
            return this.a.widthPixels;
        }
    }

    interface c {
    }

    j(a aVar) {
        this.f1609c = aVar.a;
        int i = aVar.b.isLowRamDevice() ? 2097152 : 4194304;
        this.f1610d = i;
        int round = Math.round(r1.getMemoryClass() * 1024 * 1024 * (aVar.b.isLowRamDevice() ? 0.33f : 0.4f));
        float b2 = ((b) aVar.f1611c).b() * ((b) aVar.f1611c).a() * 4;
        int round2 = Math.round(aVar.f1612d * b2);
        int round3 = Math.round(b2 * 2.0f);
        int i2 = round - i;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.b = round3;
            this.a = round2;
        } else {
            float f2 = i2 / (aVar.f1612d + 2.0f);
            this.b = Math.round(2.0f * f2);
            this.a = Math.round(f2 * aVar.f1612d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder M = e.a.a.a.a.M("Calculation complete, Calculated memory cache size: ");
            M.append(d(this.b));
            M.append(", pool size: ");
            M.append(d(this.a));
            M.append(", byte array size: ");
            M.append(d(i));
            M.append(", memory class limited? ");
            M.append(i3 > round);
            M.append(", max size: ");
            M.append(d(round));
            M.append(", memoryClass: ");
            M.append(aVar.b.getMemoryClass());
            M.append(", isLowMemoryDevice: ");
            M.append(aVar.b.isLowRamDevice());
            Log.d("MemorySizeCalculator", M.toString());
        }
    }

    private String d(int i) {
        return Formatter.formatFileSize(this.f1609c, i);
    }

    public int a() {
        return this.f1610d;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}
