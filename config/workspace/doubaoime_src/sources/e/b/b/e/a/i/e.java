package e.b.b.e.a.i;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    private static long a = -1;

    public static long a() {
        if (a == -1) {
            a = (e.b.b.h.c.a.s() << 16) | Process.myPid();
        }
        return a;
    }

    public static JSONObject b(a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (aVar.z() != null) {
                jSONObject = e.b.b.n.b.a(jSONObject, aVar.z());
            }
            if (aVar.l() != null) {
                jSONObject = e.b.b.n.b.a(jSONObject, aVar.l());
            }
            jSONObject.put("version_code", aVar.D());
            jSONObject.put("version_name", aVar.E());
            jSONObject.put("manifest_version_code", aVar.n());
            jSONObject.put("update_version_code", aVar.B());
            jSONObject.put("app_version", aVar.c());
            jSONObject.put(RomInfo.KEY_OS_TYPE, aVar.r());
            jSONObject.put("device_platform", aVar.k());
            jSONObject.put(RomInfo.KEY_ROM_OS_VERSION, aVar.s());
            jSONObject.put(RomInfo.KEY_ROM_OS_API, aVar.b());
            jSONObject.put(HardwareInfo.KEY_HW_VENDOR_MODEL, aVar.j());
            jSONObject.put(HardwareInfo.KEY_HW_VENDOR_BRAND, aVar.g());
            jSONObject.put(HardwareInfo.KEY_HW_VENDOR_MANUFACTURER, aVar.i());
            jSONObject.put("process_name", aVar.v());
            jSONObject.put(WsConstants.KEY_SESSION_ID, aVar.y());
            jSONObject.put("rom_version", aVar.x());
            jSONObject.put("package", aVar.t());
            jSONObject.put(MonitorConstants.EXTRA_MONITOR_VERSION, aVar.o());
            jSONObject.put("channel", aVar.d());
            jSONObject.put(WsConstants.KEY_APP_ID, aVar.a());
            if (!TextUtils.isEmpty(aVar.h())) {
                jSONObject.put("device_id", aVar.h());
            }
            jSONObject.put("uid", aVar.A());
            jSONObject.put("phone_startup_time", aVar.u());
            jSONObject.put("release_build", aVar.w());
            if (aVar.e() != -1) {
                jSONObject.put("config_time", String.valueOf(aVar.e()));
            }
            if (!TextUtils.isEmpty(aVar.C())) {
                jSONObject.put("verify_info", aVar.C());
            }
            jSONObject.put("current_update_version_code", aVar.f());
            if (aVar.q() != -1) {
                jSONObject.put("ntp_time", aVar.q());
            }
            if (aVar.p() != -1) {
                jSONObject.put("ntp_offset", aVar.p());
            }
            if (aVar.m() != null) {
                jSONObject.put("filters", aVar.m());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
