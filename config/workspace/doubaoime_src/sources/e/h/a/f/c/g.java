package e.h.a.f.c;

import android.os.Debug;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g extends e.h.a.f.a implements e.h.a.j.b.a {
    private File b = null;

    /* renamed from: c, reason: collision with root package name */
    private long f9952c = 0;

    @Override // e.h.a.j.b.a
    public List<String> a() {
        ArrayList arrayList = new ArrayList(1);
        File file = this.b;
        if (file != null) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    @Override // e.h.a.f.a
    public String f() {
        return "heap_oom";
    }

    @Override // e.h.a.f.a
    public boolean g(e.h.a.e.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.c());
        if (e(jSONObject, aVar)) {
            return true;
        }
        if (System.currentTimeMillis() - this.f9952c < 300000) {
            return false;
        }
        this.f9952c = System.currentTimeMillis();
        boolean optBoolean = jSONObject.optBoolean("isTryToCatch", false);
        String f2 = e.h.a.a.f();
        if (TextUtils.isEmpty(f2)) {
            h("本地未设置dumpFileName", aVar);
            return true;
        }
        if (optBoolean) {
            try {
                Debug.dumpHprofData(f2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        File file = new File(f2);
        String str = TextUtils.isEmpty(f2) ? "本地未设置dumpFileName" : null;
        if (!file.exists()) {
            str = "dumpFile不存在";
        }
        if (!TextUtils.isEmpty(str)) {
            h(str, aVar);
            return true;
        }
        this.b = file;
        e.h.a.j.c.a aVar2 = new e.h.a.j.c.a("log_heap_oom", 0L, false, aVar.b(), this, null);
        aVar2.r(true);
        e.h.a.j.a.b(aVar2);
        return true;
    }
}
