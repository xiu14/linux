package e.b.b.l.a;

import android.os.Debug;
import android.text.TextUtils;
import com.bytedance.apm.util.e;
import com.bytedance.apm.util.h;
import e.b.b.m.c;
import e.b.b.m.h.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f9486g;
    private CopyOnWriteArraySet<String> a = new CopyOnWriteArraySet<>();
    private ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private long f9487c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9488d;

    /* renamed from: e, reason: collision with root package name */
    private long f9489e;

    /* renamed from: f, reason: collision with root package name */
    private long f9490f;

    private a() {
    }

    public static a a() {
        if (f9486g == null) {
            synchronized (a.class) {
                if (f9486g == null) {
                    f9486g = new a();
                }
            }
        }
        return f9486g;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("RealRefreshRate", String.valueOf(h.d()));
            jSONObject.put("RealMaxRefreshRate", String.valueOf(h.d()));
            if (z) {
                e.g().b(jSONObject);
                e.g().a(jSONObject, false);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.f9487c = Debug.getNativeHeapAllocatedSize() / 1048576;
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long freeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            this.f9489e = maxMemory / 1048576;
            long j2 = j - freeMemory;
            this.f9490f = j2 / 1048576;
            this.f9488d = ((float) j2) > ((float) maxMemory) * 0.95f;
            jSONObject.put("apm_native_heap_size", this.f9487c);
            jSONObject.put("apm_java_heap_leak", this.f9488d);
            jSONObject.put("apm_java_heap_used", this.f9490f);
            jSONObject.put("apm_java_heap_max", this.f9489e);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String e() {
        String e2 = com.bytedance.android.input.k.b.a.e(this.a.toArray(), "#");
        if (!TextUtils.isEmpty(e2)) {
            return e2;
        }
        e.b.b.m.g.a aVar = (e.b.b.m.g.a) c.a(e.b.b.m.g.a.class);
        return aVar != null ? aVar.c() : "";
    }
}
