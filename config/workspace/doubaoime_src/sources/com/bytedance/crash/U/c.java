package com.bytedance.crash.U;

import android.os.Message;
import androidx.annotation.NonNull;
import com.bytedance.apm.t.h;
import com.bytedance.apm.t.i;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements h {

    /* renamed from: c, reason: collision with root package name */
    private static final c f4522c = new c();
    private final b a = new b();
    private boolean b;

    public static c d() {
        return f4522c;
    }

    public static void e(@NonNull JSONObject jSONObject, File file) {
        f(jSONObject, new File(file, "current.json"));
        f(jSONObject, new File(file, "history.json"));
        f(jSONObject, new File(file, "pending.json"));
        f(jSONObject, new File(file, "block_stack.json"));
    }

    private static void f(@NonNull JSONObject jSONObject, File file) {
        try {
            String C0 = com.bytedance.android.input.k.b.a.C0(file);
            if (C0 != null) {
                com.bytedance.android.input.k.b.a.j(jSONObject, new JSONObject(C0));
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.apm.t.h
    public void a(String str) {
        this.a.c(null);
    }

    @Override // com.bytedance.apm.t.h
    public void b(String str, Message message) {
        this.a.c(message);
    }

    public void c(File file) {
        this.a.b(file);
    }

    public synchronized void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.d();
        i.b();
        i.a(this);
    }

    public void h() {
        this.b = false;
        this.a.e();
        i.a aVar = i.h;
        if (aVar != null) {
            aVar.removeMessageObserver(this);
        }
    }
}
