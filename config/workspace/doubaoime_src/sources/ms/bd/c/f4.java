package ms.bd.c;

import com.bytedance.framwork.core.sdkmonitor.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f4 implements f.k {
    public final /* synthetic */ JSONObject a;
    public final /* synthetic */ String b;

    public f4(JSONObject jSONObject, String str) {
        this.a = jSONObject;
        this.b = str;
    }

    @Override // com.bytedance.framwork.core.sdkmonitor.f.k
    public final Map getCommonParams() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put((String) y2.a(16777217, 0, 0L, "9d1719", new byte[]{39, 112, 71, 81, 29, 43, 59}), (String) (this.a.getBoolean((String) y2.a(16777217, 0, 0L, "ee295f", new byte[]{123, 113, 68, 95, 25, 116, 103})) ? y2.a(16777217, 0, 0L, "8f802d", new byte[]{120}) : y2.a(16777217, 0, 0L, "8d4c00", new byte[]{121})));
        } catch (JSONException unused) {
        }
        hashMap.put((String) y2.a(16777217, 0, 0L, "f43d5c", new byte[]{Byte.MAX_VALUE, 57, 83, 4, 53, 117, 108, 17}), this.b);
        return hashMap;
    }

    @Override // com.bytedance.framwork.core.sdkmonitor.f.k
    public final String getSessionId() {
        return null;
    }
}
