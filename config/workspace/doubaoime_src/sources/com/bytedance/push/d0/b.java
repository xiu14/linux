package com.bytedance.push.d0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    static final Object f5650e = new Object();
    private final com.bytedance.push.third.e a;

    /* renamed from: c, reason: collision with root package name */
    private Context f5651c;
    private int b = 10;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f5652d = new a(com.ss.android.message.e.e().d());

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Objects.requireNonNull(b.this);
            if (message.what == 1) {
                try {
                    int i = message.arg1;
                    boolean z = i != 10 && i == 11;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Send token ");
                    sb.append(z ? "success" : "fail");
                    com.bytedance.push.g0.f.g("SendTokenTask", sb.toString());
                    if (z) {
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private b(Context context, com.bytedance.push.third.e eVar) {
        this.f5651c = context;
        this.a = eVar;
    }

    public static void a(Context context, com.bytedance.push.third.e eVar) {
        StringBuilder M = e.a.a.a.a.M("sendTokenStack:");
        M.append(Log.getStackTraceString(new Throwable()));
        com.bytedance.push.g0.f.c("SendTokenTask", M.toString());
        com.bytedance.common.push.d.b(new b(context, eVar));
    }

    public static String b(Context context, int i) {
        com.bytedance.push.R.g c2 = d.c(context, i);
        if (c2 == null) {
            return null;
        }
        return c2.f5589d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0349 A[Catch: all -> 0x0367, TryCatch #4 {all -> 0x0367, blocks: (B:28:0x0127, B:30:0x0149, B:32:0x014f, B:34:0x015f, B:37:0x01ac, B:39:0x01d0, B:40:0x01d6, B:42:0x0216, B:43:0x0220, B:58:0x0349, B:62:0x034e, B:65:0x0344, B:69:0x030c, B:85:0x0357, B:56:0x0322), top: B:12:0x006d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x034e A[Catch: all -> 0x0367, TryCatch #4 {all -> 0x0367, blocks: (B:28:0x0127, B:30:0x0149, B:32:0x014f, B:34:0x015f, B:37:0x01ac, B:39:0x01d0, B:40:0x01d6, B:42:0x0216, B:43:0x0220, B:58:0x0349, B:62:0x034e, B:65:0x0344, B:69:0x030c, B:85:0x0357, B:56:0x0322), top: B:12:0x006d, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.bytedance.push.e0.a] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.bytedance.push.interfaze.h] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.bytedance.push.interfaze.h] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.bytedance.push.interfaze.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(com.bytedance.push.third.e r26) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.d0.b.c(com.bytedance.push.third.e):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5651c == null || this.a == null) {
            return;
        }
        synchronized (f5650e) {
            c(this.a);
        }
    }
}
