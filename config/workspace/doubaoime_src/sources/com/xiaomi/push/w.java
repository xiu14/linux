package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class w implements Runnable {
    private Context a;

    /* renamed from: a, reason: collision with other field name */
    private File f1179a;

    /* renamed from: a, reason: collision with other field name */
    private Runnable f1180a;

    public static void a(Context context, File file, final Runnable runnable) {
        new w(context, file) { // from class: com.xiaomi.push.w.1
            @Override // com.xiaomi.push.w
            protected void a(Context context2) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }.run();
    }

    protected abstract void a(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = null;
        try {
            try {
                if (this.f1179a == null) {
                    this.f1179a = new File(this.a.getFilesDir(), "default_locker");
                }
                vVar = v.a(this.a, this.f1179a);
                Runnable runnable = this.f1180a;
                if (runnable != null) {
                    runnable.run();
                }
                a(this.a);
                if (vVar == null) {
                    return;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                if (vVar == null) {
                    return;
                }
            }
            vVar.a();
        } catch (Throwable th) {
            if (vVar != null) {
                vVar.a();
            }
            throw th;
        }
    }

    private w(Context context, File file) {
        this.a = context;
        this.f1179a = file;
    }
}
