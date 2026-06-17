package e.b.k.d;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements Runnable {
    public static boolean b = false;
    private InterfaceC0441a a;

    /* renamed from: e.b.k.d.a$a, reason: collision with other inner class name */
    public interface InterfaceC0441a {
        void a(int i, String str);

        void b(String str);
    }

    public a(InterfaceC0441a interfaceC0441a) {
        this.a = interfaceC0441a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            HashMap hashMap = new HashMap();
            String g2 = com.bytedance.praisedialoglib.manager.a.j().g();
            if (TextUtils.isEmpty(g2)) {
                return;
            }
            hashMap.put(Constants.PACKAGE_NAME, com.bytedance.praisedialoglib.manager.a.j().r());
            hashMap.put("app_id", com.bytedance.praisedialoglib.manager.a.j().c());
            hashMap.put("token", "WGzRHALelikNBSunxKOJhZyBWtAqZCEAcZYTuXzpLRX");
            hashMap.put("source", "window");
            String a = com.bytedance.praisedialoglib.manager.a.j().a(20480, g2 + "/zebra/praise/url", hashMap);
            Log.d("GetXiaomiDeeplinkThread", "response is " + a);
            if (TextUtils.isEmpty(a)) {
                this.a.a(-1, "http response is null");
                return;
            }
            JSONObject jSONObject = new JSONObject(a);
            int optInt = jSONObject.optInt("code");
            String optString = jSONObject.optString("message");
            if (optInt != 0) {
                this.a.a(optInt, optString);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA);
            String optString2 = optJSONObject != null ? optJSONObject.optString("deep_link") : "";
            if (TextUtils.isEmpty(optString2)) {
                this.a.a(optInt, optString);
            } else {
                this.a.b(optString2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            this.a.a(-1, "meet exception");
        }
    }
}
