package com.bytedance.frameworks.baselib.network.g;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static c a;
    private static final Set<String> b;

    /* renamed from: c, reason: collision with root package name */
    private static double f5080c;

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        f5080c = 1.0E-9d;
        hashSet.add("ttnet_high_lvl_conn");
        hashSet.add("multinetwork");
        hashSet.add("mpa_client");
        hashSet.add("ttnet_feedback_detect");
        hashSet.add("ttnet_exception_detect");
        hashSet.add("ttnet_stress_detect");
        hashSet.add("ttnet_polling_detect");
        hashSet.add("long_cost_net_task");
        hashSet.add("ws_all");
        hashSet.add("frontier_all");
        hashSet.add("frontier_msg");
        hashSet.add("user_msg");
        hashSet.add("store_idc");
        hashSet.add("ttnet_route_select");
        hashSet.add("ws_ping");
        hashSet.add("frontier_online");
        hashSet.add("ttnet_all_log");
        hashSet.add("cookie_mismatch");
        hashSet.add("cronet_native_requestlog");
        hashSet.add("ttnet_debug_trace_info");
        hashSet.add("ttnet_http_dns_fail");
        hashSet.add("ttnet_tnc_update_result");
        hashSet.add("cronet_native_requestlog_empty");
        hashSet.add("frontier_qos");
        hashSet.add("ttnet_net_exp");
        hashSet.add("bad_request_diagnosis");
        hashSet.add("ttnet_raw_detect");
        hashSet.add("gna_raw_detect");
        hashSet.add("ttnet_network_environment");
        hashSet.add("game_network");
        hashSet.add("ttnet_zstd_stream");
        hashSet.add("ttnet_zstd_dict_error");
        hashSet.add("ttnet_load");
        hashSet.add("ttnet_insec_rect");
        hashSet.add("ttquiche_native_request_log");
        hashSet.add("otel_log");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db A[Catch: Exception -> 0x01d1, TryCatch #0 {Exception -> 0x01d1, blocks: (B:5:0x000c, B:7:0x001a, B:9:0x0022, B:13:0x0035, B:15:0x003e, B:19:0x0048, B:22:0x005b, B:25:0x006f, B:28:0x0083, B:31:0x0097, B:34:0x00ab, B:37:0x00c0, B:39:0x00cd, B:43:0x00d5, B:45:0x00db, B:47:0x00e5, B:49:0x00e8, B:52:0x00eb, B:55:0x0100, B:58:0x010b, B:59:0x015f, B:61:0x0166, B:63:0x016e, B:66:0x0186, B:68:0x018c, B:72:0x0193, B:74:0x019c, B:76:0x01a2, B:78:0x01a8, B:81:0x01af, B:94:0x002a, B:99:0x01b4, B:102:0x01c5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166 A[Catch: Exception -> 0x01d1, TryCatch #0 {Exception -> 0x01d1, blocks: (B:5:0x000c, B:7:0x001a, B:9:0x0022, B:13:0x0035, B:15:0x003e, B:19:0x0048, B:22:0x005b, B:25:0x006f, B:28:0x0083, B:31:0x0097, B:34:0x00ab, B:37:0x00c0, B:39:0x00cd, B:43:0x00d5, B:45:0x00db, B:47:0x00e5, B:49:0x00e8, B:52:0x00eb, B:55:0x0100, B:58:0x010b, B:59:0x015f, B:61:0x0166, B:63:0x016e, B:66:0x0186, B:68:0x018c, B:72:0x0193, B:74:0x019c, B:76:0x01a2, B:78:0x01a8, B:81:0x01af, B:94:0x002a, B:99:0x01b4, B:102:0x01c5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019c A[Catch: Exception -> 0x01d1, TryCatch #0 {Exception -> 0x01d1, blocks: (B:5:0x000c, B:7:0x001a, B:9:0x0022, B:13:0x0035, B:15:0x003e, B:19:0x0048, B:22:0x005b, B:25:0x006f, B:28:0x0083, B:31:0x0097, B:34:0x00ab, B:37:0x00c0, B:39:0x00cd, B:43:0x00d5, B:45:0x00db, B:47:0x00e5, B:49:0x00e8, B:52:0x00eb, B:55:0x0100, B:58:0x010b, B:59:0x015f, B:61:0x0166, B:63:0x016e, B:66:0x0186, B:68:0x018c, B:72:0x0193, B:74:0x019c, B:76:0x01a2, B:78:0x01a8, B:81:0x01af, B:94:0x002a, B:99:0x01b4, B:102:0x01c5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.frameworks.baselib.network.g.c a(org.json.JSONObject r20, int r21) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.g.d.a(org.json.JSONObject, int):com.bytedance.frameworks.baselib.network.g.c");
    }

    private static boolean b(JSONObject jSONObject, String str, List<String> list) {
        JSONObject optJSONObject;
        if (jSONObject == null || TextUtils.isEmpty(str) || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return false;
        }
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                list.add(next);
            }
        }
        return true;
    }
}
