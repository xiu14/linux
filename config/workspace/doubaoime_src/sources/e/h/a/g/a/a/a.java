package e.h.a.g.a.a;

import com.bytedance.crash.general.RomInfo;
import com.monitor.cloudmessage.utils.b;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<org.json.JSONObject>] */
/* loaded from: classes2.dex */
public class a {
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("used_memory", ((Runtime.getRuntime().totalMemory() / DownloadConstants.KB) / DownloadConstants.KB) + "MB");
            jSONObject.put("total_memory", ((Runtime.getRuntime().maxMemory() / DownloadConstants.KB) / DownloadConstants.KB) + "MB");
            jSONObject.put("sd_all_size", b.b()[0] + "MB");
            jSONObject.put("sd_avail_size", b.b()[1] + "MB");
            String str = "";
            for (String str2 : b.a()) {
                str = str + str2 + "  ";
            }
            jSONObject.put("cpu_info", str);
            jSONObject.put(RomInfo.KEY_ROM_KERNEL_VERSION, b.c()[0]);
            jSONObject.put("firmware_version", b.c()[1]);
            jSONObject.put("model", b.c()[2]);
            jSONObject.put("system_version", b.c()[3]);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
