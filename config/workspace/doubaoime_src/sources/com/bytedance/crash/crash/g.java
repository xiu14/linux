package com.bytedance.crash.crash;

import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Q.b;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.general.AppInfo;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {
    private static void a(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(e.a.a.a.a.s("err_empty_", str2), 1);
            } catch (JSONException unused) {
            }
        }
    }

    private static void b(Object obj, String str, JSONObject jSONObject) {
        if (obj == null) {
            try {
                jSONObject.put(e.a.a.a.a.s("err_null_", str), 1);
            } catch (JSONException unused) {
            }
        }
    }

    public static void c(CrashType crashType, File file, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        com.bytedance.android.input.k.b.a.y0(jSONObject3, CrashHianalyticsData.CRASH_TYPE, crashType.getName());
        if (file != null) {
            if (!e.a.a.a.a.Q0(file, "logcat.txt")) {
                try {
                    jSONObject3.put("has_logcat_file_false", 1);
                } catch (JSONException unused) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "maps.txt")) {
                try {
                    jSONObject3.put("has_maps_file_false", 1);
                } catch (JSONException unused2) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "threads.txt")) {
                try {
                    jSONObject3.put("has_threads_file_false", 1);
                } catch (JSONException unused3) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "fds.txt")) {
                try {
                    jSONObject3.put("has_fds_file_false", 1);
                } catch (JSONException unused4) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "meminfo.txt")) {
                try {
                    jSONObject3.put("has_meminfo_file_false", 1);
                } catch (JSONException unused5) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "viewTree.txt")) {
                try {
                    jSONObject3.put("has_view_tree_false", 1);
                } catch (JSONException unused6) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "pthread_key_info.txt")) {
                try {
                    jSONObject3.put("has_pthread_key_file_false", 1);
                } catch (JSONException unused7) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "pthread_key_map.txt")) {
                try {
                    jSONObject3.put("has_pthread_key_map_file_false", 1);
                } catch (JSONException unused8) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "malloc.txt")) {
                try {
                    jSONObject3.put("has_malloc_file_false", 1);
                } catch (JSONException unused9) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "pthreads.txt")) {
                try {
                    jSONObject3.put("has_pthreads_file_false", 1);
                } catch (JSONException unused10) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "setpriority.txt")) {
                try {
                    jSONObject3.put("has_setpriority_file_false", 1);
                } catch (JSONException unused11) {
                }
            }
            if (!e.a.a.a.a.Q0(file, "leak_heap.txt")) {
                try {
                    jSONObject3.put("has_heaptrack_file_false", 1);
                } catch (JSONException unused12) {
                }
            }
        }
        b(jSONObject.opt("miniapp_info"), "miniapp_info", jSONObject3);
        b(jSONObject.opt("plugin_info"), "plugin_info", jSONObject3);
        b(jSONObject.opt("process_name"), "process_name", jSONObject3);
        b(jSONObject.opt(Scraps.BATTERY), Scraps.BATTERY, jSONObject3);
        b(jSONObject.opt("logcat"), "logcat", jSONObject3);
        b(jSONObject.opt("crash_time"), "crash_time", jSONObject3);
        b(jSONObject.opt(Scraps.STORAGE), Scraps.STORAGE, jSONObject3);
        b(jSONObject.opt("filters"), "filters", jSONObject3);
        b(jSONObject.opt("patch_info"), "patch_info", jSONObject3);
        b(jSONObject.opt("pid"), "pid", jSONObject3);
        b(jSONObject.opt("is_background"), "is_background", jSONObject3);
        b(jSONObject.opt("activity_trace"), "activity_trace", jSONObject3);
        b(jSONObject.opt("custom_long"), "custom_long", jSONObject3);
        b(jSONObject.opt(MonitorConstants.CUSTOM), MonitorConstants.CUSTOM, jSONObject3);
        if (jSONObject.optJSONObject("custom_long") != null) {
            b(jSONObject.optJSONObject("custom_long").opt("activity_track"), "activity_track", jSONObject3);
        }
        if (jSONObject.opt("filters") != null) {
            b(jSONObject.optJSONObject("filters").opt("sdk_version"), "filters:sdk_version", jSONObject3);
            b(jSONObject.optJSONObject("filters").opt(AppInfo.KEY_NPTH_VERSION_NAME), "filters:sdk_version_name", jSONObject3);
            b(jSONObject.optJSONObject("filters").opt("is_root"), "filters:is_root", jSONObject3);
            b(jSONObject.optJSONObject("filters").opt("is_x86_devices"), "filters:is_x86_devices", jSONObject3);
            b(jSONObject.optJSONObject("filters").opt("is_64_runtime"), "filters:is_64_runtime", jSONObject3);
            b(jSONObject.optJSONObject("filters").opt(RomInfo.KEY_ROM_KERNEL_VERSION), "filters:kernel_version", jSONObject3);
        }
        if (jSONObject2 != null) {
            a(jSONObject2.optString(AppInfo.KEY_NPTH_VERSION_NAME), AppInfo.KEY_NPTH_VERSION_NAME, jSONObject3);
            a(jSONObject2.optString("sdk_version"), "sdk_version", jSONObject3);
            String optString = jSONObject2.optString(RomInfo.KEY_OS_TYPE);
            if ("Android" != optString && !"Android".equals(optString)) {
                try {
                    jSONObject3.put("err_os_not_Android", 1);
                } catch (JSONException unused13) {
                }
            }
            a(jSONObject2.optString(RomInfo.KEY_ROM_OS_VERSION), RomInfo.KEY_ROM_OS_VERSION, jSONObject3);
            a(jSONObject2.optString(RomInfo.KEY_ROM_OS_API), RomInfo.KEY_ROM_OS_API, jSONObject3);
            a(jSONObject2.optString(HardwareInfo.KEY_HW_VENDOR_MODEL), HardwareInfo.KEY_HW_VENDOR_MODEL, jSONObject3);
            a(jSONObject2.optString(HardwareInfo.KEY_HW_VENDOR_BRAND), HardwareInfo.KEY_HW_VENDOR_BRAND, jSONObject3);
            a(jSONObject2.optString(HardwareInfo.KEY_HW_VENDOR_MANUFACTURER), HardwareInfo.KEY_HW_VENDOR_MANUFACTURER, jSONObject3);
            a(jSONObject2.optString(HardwareInfo.KEY_HW_CPU_ABI), HardwareInfo.KEY_HW_CPU_ABI, jSONObject3);
            a(jSONObject2.optString("unique_key"), "unique_key", jSONObject3);
        }
        new b.C0199b("crash_data_check", jSONObject3).d();
    }
}
