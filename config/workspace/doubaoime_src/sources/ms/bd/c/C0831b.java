package ms.bd.c;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: ms.bd.c.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0831b {
    public final Context a;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue(1);

    /* renamed from: c, reason: collision with root package name */
    public final ServiceConnectionC0830a f10351c = new ServiceConnectionC0830a(this);

    public C0831b(Context context) {
        this.a = context;
    }
}
