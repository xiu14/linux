package ms.bd.c;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c4 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile c4 f10359d;

    /* renamed from: e, reason: collision with root package name */
    public static final JSONObject f10360e = new JSONObject();
    public final Context a;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public z3 f10361c;

    public c4(Context context) {
        this.a = context.getApplicationContext();
    }

    public final synchronized void a() {
        Context context;
        try {
            if (this.b && (context = this.a) != null && Build.VERSION.SDK_INT >= 35) {
                this.f10361c = new z3();
                ((WindowManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "bcda3f", new byte[]{100, 104, 25, 17, 3, 102}))).addScreenRecordingCallback(this.a.getMainExecutor(), this.f10361c);
            }
        } catch (Throwable unused) {
        }
    }

    public final void finalize() {
        synchronized (this) {
            if (this.b && Build.VERSION.SDK_INT >= 35) {
                if (this.f10361c != null) {
                    ((WindowManager) this.a.getSystemService((String) y2.a(16777217, 0, 0L, "5ad100", new byte[]{51, 106, 25, 65, 0, 48}))).removeScreenRecordingCallback(this.f10361c);
                }
                this.b = false;
            }
        }
        super.finalize();
    }
}
