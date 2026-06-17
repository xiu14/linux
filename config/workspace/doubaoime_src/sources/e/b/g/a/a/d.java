package e.b.g.a.a;

import android.content.Context;
import e.b.g.a.a.h.a;
import java.util.LinkedList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements a.c {
    private c a;

    /* renamed from: d, reason: collision with root package name */
    private String f9514d;
    private final LinkedList<e.b.g.a.a.f.a> b = new LinkedList<>();

    /* renamed from: c, reason: collision with root package name */
    private long f9513c = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9515e = true;

    public d(Context context, String str) {
        this.a = c.c(context);
        this.f9514d = str;
    }

    public void a(String str, String str2, JSONObject jSONObject) {
        if (this.f9515e) {
            e.b.g.a.a.f.a aVar = new e.b.g.a.a.f.a(this.f9514d, str, str2, jSONObject.toString(), System.currentTimeMillis());
            if (this.b.size() >= 2000) {
                this.b.poll();
            }
            this.b.add(aVar);
        }
    }

    public boolean b(long j, boolean z) {
        LinkedList linkedList;
        int size = this.b.size();
        if (size <= 0) {
            return false;
        }
        if (!z && size < 5 && j - this.f9513c <= 120000) {
            return false;
        }
        this.f9513c = j;
        synchronized (this.b) {
            linkedList = new LinkedList(this.b);
            this.b.clear();
        }
        if (com.bytedance.feedbackerlib.a.U(linkedList)) {
            return true;
        }
        try {
            this.a.h(this.f9514d, linkedList);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public void c(boolean z) {
        this.f9515e = z;
    }

    @Override // e.b.g.a.a.h.a.c
    public void onTimeEvent(long j) {
        if (this.f9515e) {
            b(j, false);
        }
    }
}
