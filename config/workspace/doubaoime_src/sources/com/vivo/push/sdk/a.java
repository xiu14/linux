package com.vivo.push.sdk;

import android.content.Intent;
import android.os.Message;
import com.vivo.push.ab;
import com.vivo.push.util.g;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
public final class a extends ab {

    /* renamed from: c, reason: collision with root package name */
    private static a f8892c;

    /* renamed from: d, reason: collision with root package name */
    private String f8893d = "";

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f8892c == null) {
                f8892c = new a();
            }
            aVar = f8892c;
        }
        return aVar;
    }

    public final String b() {
        return this.f8893d;
    }

    @Override // com.vivo.push.ab
    public final void b(Message message) {
        Intent intent = (Intent) message.obj;
        if (intent != null && this.a != null) {
            com.vivo.push.restructure.a.b bVar = new com.vivo.push.restructure.a.b(intent);
            try {
                t.d("CommandWorker", "received msg : ".concat(String.valueOf(bVar.a())));
                g.a().execute(new b(this, bVar));
                return;
            } catch (Exception e2) {
                e.a.a.a.a.h0(e2, new StringBuilder("handle message err : "), "CommandWorker");
                return;
            }
        }
        t.d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.a);
    }

    public final void a(String str) {
        this.f8893d = str;
    }

    public final void a(Intent intent) {
        if (intent != null && this.a != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            a(obtain);
        } else {
            t.d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.a);
        }
    }
}
