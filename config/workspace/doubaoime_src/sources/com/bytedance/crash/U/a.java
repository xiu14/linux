package com.bytedance.crash.U;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static void a(JSONArray jSONArray, JSONObject jSONObject, long j, boolean z) {
        try {
            long optLong = z ? jSONObject.optLong("currentMessageCost") : jSONObject.optLong("duration");
            String str = null;
            if (jSONArray != null) {
                long j2 = optLong + j;
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    long optLong2 = optJSONObject.optLong(CrashHianalyticsData.TIME);
                    if (optLong2 >= j && optLong2 <= j2) {
                        str = optJSONObject.optString("trace");
                        break;
                    }
                    i++;
                }
            }
            if (str != null) {
                com.bytedance.android.input.k.b.a.y0(jSONObject, "block_stack", str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(@NonNull JSONObject jSONObject) {
        long j;
        long j2;
        int i;
        long j3;
        JSONArray optJSONArray = jSONObject.optJSONArray("history_message");
        JSONObject optJSONObject = jSONObject.optJSONObject("current_message");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("history_details");
        String str = "block_stack";
        JSONArray optJSONArray2 = jSONObject.optJSONArray("block_stack");
        if (optJSONObject2 == null) {
            JSONObject jSONObject2 = new JSONObject();
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "longestMsgType", "no_details");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "longestMsg", "no_details");
            com.bytedance.android.input.k.b.a.y0(jSONObject, "history_details", jSONObject2);
            return;
        }
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgType", "no_history");
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsg", "no_history");
            return;
        }
        long optLong = jSONObject.optLong("crash_time");
        long optLong2 = optJSONObject2.optLong("last_wall_time");
        long optLong3 = optJSONObject2.optLong("last_cpu_time");
        long j4 = 0;
        if (optLong == 0 || optLong2 == 0 || optLong3 == 0) {
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgType", "no_last_times");
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsg", "no_last_times");
            return;
        }
        com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgType", "not_found");
        com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsg", "not_found");
        if (optLong > optLong2 && optJSONObject != null) {
            j4 = optJSONObject.optLong("currentMessageCost");
            long j5 = optLong - optLong2;
            if (j5 < j4) {
                j4 = j5;
            }
            a(optJSONArray2, optJSONObject, optLong2, true);
        }
        if (j4 < com.heytap.mcssdk.constant.a.r) {
            long j6 = optLong - optLong2;
            int length = optJSONArray.length() - 1;
            long j7 = j4;
            int i2 = -1;
            while (length >= 0 && j6 < com.heytap.mcssdk.constant.a.q) {
                long j8 = optLong2;
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(length);
                if (optJSONObject3 == null) {
                    j3 = optLong3;
                } else {
                    long optLong4 = optJSONObject3.optLong("duration");
                    j6 += optLong4;
                    j3 = optLong3;
                    a(optJSONArray2, optJSONObject3, optLong - j6, false);
                    if (j6 > 2500 && optLong4 > j7) {
                        i2 = length;
                        j7 = optLong4;
                    }
                }
                length--;
                optLong2 = j8;
                optLong3 = j3;
            }
            j = optLong2;
            j2 = optLong3;
            i = i2;
        } else {
            j = optLong2;
            j2 = optLong3;
            i = -1;
        }
        long j9 = j4;
        if (i < 0) {
            if (optJSONObject != null) {
                com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgWallDuration", Long.valueOf(j9));
                com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMessageCpuDuration", -1);
                com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgStartCpuTime", Long.valueOf(j2));
                com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgEndCpuTime", -1);
                com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgStartWallTime", Long.valueOf(j));
                com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgEndWallTime", Long.valueOf(j + j9));
                com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgType", "current");
                com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsg", optJSONObject.optString("message"));
                com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgBlockStack", optJSONObject.optString("block_stack"));
                return;
            }
            return;
        }
        int length2 = optJSONArray.length() - 1;
        while (length2 >= i) {
            String str2 = str;
            JSONObject optJSONObject4 = optJSONArray.optJSONObject(length2);
            if (optJSONObject4 != null) {
                j -= optJSONObject4.optLong("duration");
                j2 -= optJSONObject4.optLong("cpuDuration");
            }
            length2--;
            str = str2;
        }
        String str3 = str;
        JSONObject optJSONObject5 = optJSONArray.optJSONObject(i);
        if (optJSONObject5 != null) {
            long optLong5 = optJSONObject5.optLong("duration");
            long optLong6 = optJSONObject5.optLong("cpuDuration");
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgWallDuration", Long.valueOf(optLong5));
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMessageCpuDuration", Long.valueOf(optLong6));
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgStartCpuTime", Long.valueOf(j2));
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgEndCpuTime", Long.valueOf(j2 + optLong6));
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgStartWallTime", Long.valueOf(j));
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgEndWallTime", Long.valueOf(j + optLong5));
            int optInt = optJSONObject5.optInt("type");
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgType", optInt == 1 ? optLong6 <= 1 ? "idle" : 2 * optLong6 > optLong5 ? "native_busy" : optLong6 * 10 < optLong5 ? "native_lock" : "native_unknown" : optInt == 8 ? 2 * optLong6 > optLong5 ? "java_busy" : optLong6 * 10 < optLong5 ? "java_lock" : "java_unknown" : "normal");
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsg", optJSONObject5.optString("message"));
            com.bytedance.android.input.k.b.a.y0(optJSONObject2, "longestMsgBlockStack", optJSONObject5.optString(str3));
        }
    }
}
