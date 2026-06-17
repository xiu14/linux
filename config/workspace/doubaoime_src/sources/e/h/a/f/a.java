package e.h.a.f;

import com.bytedance.apm.y.d;
import com.monitor.cloudmessage.utils.NetworkUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a implements b {
    private static ConcurrentHashMap<String, Long> a = new ConcurrentHashMap<>();

    private boolean c(e.h.a.e.a aVar) {
        String b = aVar.b();
        if (!a.containsKey(b)) {
            a.put(b, Long.valueOf(System.currentTimeMillis()));
            return true;
        }
        if (System.currentTimeMillis() - a.get(b).longValue() < com.heytap.mcssdk.constant.a.q) {
            return false;
        }
        a.put(b, Long.valueOf(System.currentTimeMillis()));
        return true;
    }

    @Override // e.h.a.f.b
    public synchronized boolean b(e.h.a.e.a aVar) {
        if (!f().equals(aVar.e())) {
            return false;
        }
        try {
            if (!c(aVar) || !d(aVar)) {
                d.b("cloudmessage", "checkCmdInterval false: ignored for now.");
                return false;
            }
            d.b("cloudmessage", "start handle message:" + aVar);
            return g(aVar);
        } catch (e.h.a.e.b e2) {
            h(e2.getMessage(), aVar);
            return false;
        } catch (Exception e3) {
            StringWriter stringWriter = new StringWriter();
            e3.printStackTrace(new PrintWriter(stringWriter));
            h(String.format("系统错误：%s", stringWriter.toString()), aVar);
            return false;
        }
    }

    protected boolean d(e.h.a.e.a aVar) {
        if (!e.h.a.i.a.a().c(aVar.b()) || NetworkUtils.h(e.h.a.a.g().e())) {
            return true;
        }
        com.bytedance.feedbackerlib.a.A0(aVar.b(), "产物超过阈值，等待WiFi环境执行", 0, null);
        return false;
    }

    protected boolean e(JSONObject jSONObject, e.h.a.e.a aVar) {
        if (!jSONObject.optBoolean("wifiOnly", false) || NetworkUtils.h(e.h.a.a.g().e())) {
            return false;
        }
        e.h.a.j.c.b bVar = new e.h.a.j.c.b(0L, false, aVar.b(), null);
        bVar.h(0);
        bVar.i("4G环境下不执行指令");
        e.h.a.j.a.c(bVar);
        return true;
    }

    public abstract String f();

    public abstract boolean g(e.h.a.e.a aVar) throws Exception;

    protected void h(String str, e.h.a.e.a aVar) {
        e.h.a.j.c.b bVar = new e.h.a.j.c.b(0L, false, aVar.b(), null);
        bVar.h(3);
        bVar.i(str);
        e.h.a.j.a.c(bVar);
    }

    protected void i(String str, HashMap<String, String> hashMap, e.h.a.e.a aVar) {
        e.h.a.j.c.b bVar = new e.h.a.j.c.b(0L, false, aVar.b(), hashMap);
        bVar.h(3);
        bVar.i(str);
        e.h.a.j.a.c(bVar);
    }

    protected void j(e.h.a.e.a aVar) {
        e.h.a.j.c.b bVar = new e.h.a.j.c.b(0L, false, aVar.b(), null);
        bVar.h(2);
        e.h.a.j.a.c(bVar);
    }
}
