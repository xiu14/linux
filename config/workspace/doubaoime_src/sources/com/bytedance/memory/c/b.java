package com.bytedance.memory.c;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.apm.g;
import java.io.File;

/* loaded from: classes.dex */
public final class b {
    private static volatile b h;
    private final File a;
    private final File b;

    /* renamed from: c, reason: collision with root package name */
    private final File f5367c;

    /* renamed from: d, reason: collision with root package name */
    private final File f5368d;

    /* renamed from: e, reason: collision with root package name */
    private final File f5369e;

    /* renamed from: f, reason: collision with root package name */
    private final File f5370f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5371g;

    private b(@NonNull Context context) {
        String k = com.bytedance.memory.a.a.j().k();
        if (TextUtils.isEmpty(k)) {
            this.f5371g = context.getExternalFilesDir(null).getParentFile().getAbsolutePath();
        } else {
            this.f5371g = new File(k).getAbsolutePath();
        }
        String i = g.i();
        if (i != null) {
            this.f5369e = new File(e.a.a.a.a.K(new StringBuilder(), this.f5371g, "/", "memorywidgets"), i);
            this.f5370f = new File(e.a.a.a.a.K(new StringBuilder(), this.f5371g, "/", "memory"), i);
        } else {
            this.f5369e = new File(e.a.a.a.a.K(new StringBuilder(), this.f5371g, "/", "memorywidgets"), context.getPackageName());
            this.f5370f = new File(e.a.a.a.a.K(new StringBuilder(), this.f5371g, "/", "memory"), context.getPackageName());
        }
        if (!this.f5369e.exists()) {
            this.f5369e.mkdirs();
        }
        if (!this.f5370f.exists()) {
            this.f5370f.mkdirs();
        }
        File file = new File(this.f5369e, "cache");
        this.f5367c = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.a = new File(this.f5369e, "festival.jpg");
        this.b = new File(this.f5369e, "festival.jpg.heap");
        File file2 = new File(this.f5369e, "shrink");
        this.f5368d = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            com.bytedance.memory.b.d.a(new File(this.f5371g, "memorywidget"));
        } catch (Exception unused) {
        }
    }

    public static b c() {
        if (h == null) {
            synchronized (b.class) {
                if (h == null) {
                    h = new b(com.bytedance.memory.a.a.j().h());
                }
            }
        }
        return h;
    }

    public void a() {
        if (this.a.exists()) {
            this.a.delete();
        }
    }

    public File b() {
        return this.f5367c;
    }

    public File d() {
        return this.f5370f;
    }

    public File e() {
        return this.a;
    }

    public File f() {
        return this.b;
    }

    public File g() {
        return this.f5368d;
    }

    public File h() {
        return this.f5369e;
    }

    @Nullable
    public File i() {
        return this.a;
    }

    public boolean j() {
        return new File(this.f5369e, "festival.jpg.heap").exists();
    }
}
