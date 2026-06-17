package com.bytedance.crash.Z;

import android.app.ApplicationExitInfo;
import android.text.TextUtils;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.l;
import com.bytedance.crash.upload.CrashUploader;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static boolean a = false;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static File f4537c = null;

    /* renamed from: d, reason: collision with root package name */
    private static File f4538d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f4539e = false;

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, List<b>> f4540f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private static List<ApplicationExitInfo> f4541g;

    private static class b {
        int a;
        CrashType b;

        /* renamed from: c, reason: collision with root package name */
        long f4542c;

        private b() {
        }

        b(a aVar) {
        }
    }

    private static CrashType a(int i) {
        return i == 6 ? CrashType.ANR : i == 5 ? CrashType.NATIVE : i == 4 ? CrashType.JAVA : CrashType.UNKNOWN;
    }

    public static String b() {
        d();
        File file = f4538d;
        return file == null ? "" : file.getAbsolutePath();
    }

    public static void c() {
        if ((b ? c.a() : false) && !a) {
            a = true;
            d();
            if (!new File(f4537c, "lastReasonTime").exists()) {
                h();
                return;
            }
            List<ApplicationExitInfo> b2 = c.b();
            if (b2 == null) {
                return;
            }
            f4541g = new ArrayList();
            d();
            File file = new File(f4537c, "lastReasonTime");
            long j = -1;
            if (file.exists()) {
                try {
                    j = Long.decode(com.bytedance.crash.util.a.p(file)).longValue();
                } catch (Throwable unused) {
                }
            }
            for (ApplicationExitInfo applicationExitInfo : b2) {
                if (applicationExitInfo.getTimestamp() < j) {
                    break;
                } else {
                    f4541g.add(applicationExitInfo);
                }
            }
            h();
        }
    }

    public static void d() {
        if ((b ? c.a() : false) && !f4539e) {
            f4539e = true;
            if (f4537c == null) {
                f4537c = new File(C0652g.k(), "crash_exit_history");
            }
            if (!f4537c.exists()) {
                f4537c.mkdirs();
            }
            if (f4538d == null) {
                f4538d = new File(f4537c, "history_crash_list");
            }
            if (f4538d.exists()) {
                return;
            }
            f4538d.mkdirs();
        }
    }

    public static String e(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        if (inputStream == null) {
            return "";
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable unused) {
        }
        try {
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 8192);
                if (read <= 0) {
                    break;
                }
                sb.append(new String(bArr, 0, read));
            }
            String sb2 = sb.toString();
            try {
                inputStream.close();
            } catch (Throwable unused2) {
            }
            try {
                bufferedInputStream.close();
            } catch (Throwable unused3) {
            }
            return sb2;
        } catch (Throwable unused4) {
            bufferedInputStream2 = bufferedInputStream;
            try {
                inputStream.close();
            } catch (Throwable unused5) {
            }
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (Throwable unused6) {
                }
            }
            return "";
        }
    }

    public static void f(boolean z) {
        b = z;
    }

    public static void g(CrashType crashType, String str, int i, long j) {
        List<ApplicationExitInfo> list = f4541g;
        if (list == null || list.size() == 0) {
            return;
        }
        try {
            b bVar = new b(null);
            if (crashType == CrashType.LAUNCH) {
                bVar.b = CrashType.JAVA;
            } else {
                bVar.b = crashType;
            }
            bVar.a = i;
            bVar.f4542c = j;
            List<b> list2 = f4540f.containsKey(str) ? f4540f.get(str) : null;
            if (list2 == null) {
                list2 = new ArrayList<>();
                f4540f.put(str, list2);
            }
            list2.add(bVar);
        } catch (Throwable unused) {
        }
    }

    private static void h() {
        try {
            com.bytedance.crash.util.a.x(new File(f4537c, "lastReasonTime"), String.valueOf(System.currentTimeMillis()), false);
        } catch (Throwable unused) {
        }
    }

    public static void i() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<ApplicationExitInfo> it2 = f4541g.iterator();
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                ApplicationExitInfo next = it2.next();
                if (next.getReason() == 6 || next.getReason() == 4 || next.getReason() == 5) {
                    List<b> list = f4540f.get(next.getProcessName());
                    if (list == null) {
                        arrayList.add(next);
                    } else {
                        Iterator<b> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z = false;
                                break;
                            }
                            b next2 = it3.next();
                            long timestamp = next.getTimestamp() - next2.f4542c;
                            if (a(next.getReason()).getName().equals(next2.b.getName()) && next.getPid() == next2.a && timestamp > 0 && timestamp < 30000) {
                                break;
                            }
                        }
                        if (!z) {
                            arrayList.add(next);
                        }
                    }
                }
            }
            h();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) it4.next();
                int ordinal = a(applicationExitInfo.getReason()).ordinal();
                if (ordinal == 1) {
                    k(applicationExitInfo);
                } else if (ordinal == 2) {
                    l(applicationExitInfo);
                } else if (ordinal == 5) {
                    j(applicationExitInfo);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void j(ApplicationExitInfo applicationExitInfo) {
        if (c.a()) {
            Header c2 = Header.c(l.e(), applicationExitInfo.getTimestamp(), CrashType.ANR, applicationExitInfo.getPid());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            com.bytedance.android.input.k.b.a.y0(jSONObject, "header", c2.e());
            try {
                jSONObject.put("filters", jSONObject2);
            } catch (Throwable unused) {
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject, "is_anr", 1);
            com.bytedance.android.input.k.b.a.y0(jSONObject, "crash_time", Long.valueOf(applicationExitInfo.getTimestamp()));
            com.bytedance.android.input.k.b.a.y0(jSONObject, "has_dump", "true");
            String description = applicationExitInfo.getDescription();
            if (TextUtils.isEmpty(description)) {
                description = "invalid";
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject, "anr_info", description);
            com.bytedance.android.input.k.b.a.y0(jSONObject, "app_start_time", Long.valueOf(applicationExitInfo.getTimestamp()));
            com.bytedance.android.input.k.b.a.y0(jSONObject, "jiffy", Long.valueOf(com.bytedance.crash.general.a.d()));
            JSONObject jSONObject3 = new JSONObject();
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "thread_number", 1);
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "mainStackFromTrace", "at ApplicationExit InvalidStack.NoStackAvailable(Invalid.java:1).\n");
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "pid", Integer.valueOf(applicationExitInfo.getPid()));
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "package", applicationExitInfo.getProcessName());
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "invalid", Boolean.FALSE);
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "is_new_stack", 10);
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "not_current", 1);
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "is_remote_process", 0);
            com.bytedance.android.input.k.b.a.y0(jSONObject, RemoteMessageConst.DATA, jSONObject3.toString());
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "sdk_version", "4.2.1-rc.8-oime");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_64_runtime", NativeBridge.E() ? "true" : "false");
            String optString = c2.e().optString(HardwareInfo.KEY_HW_CPU_ABI);
            if (!TextUtils.isEmpty(optString)) {
                boolean contains = optString.contains("64");
                com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_x86_devices", Boolean.valueOf(optString.contains("86")));
                com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_64_devices", Boolean.valueOf(contains));
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_root", com.bytedance.crash.general.a.i() ? "true" : "false");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, RomInfo.KEY_ROM_KERNEL_VERSION, c2.e().optString(RomInfo.KEY_ROM_KERNEL_VERSION));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_hm_os", String.valueOf(com.bytedance.crash.util.f.a()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "exit_reason", String.valueOf(applicationExitInfo.getReason()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "exit_status", String.valueOf(applicationExitInfo.getStatus()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "crash_from", "app_exit_history");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, com.heytap.mcssdk.constant.b.i, String.valueOf(applicationExitInfo.getDescription()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "importance", String.valueOf(applicationExitInfo.getImportance()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "pss", String.valueOf(applicationExitInfo.getPss()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "rss", String.valueOf(applicationExitInfo.getRss()));
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject.put(MonitorConstants.CUSTOM, jSONObject4);
            } catch (Throwable unused2) {
            }
            String description2 = applicationExitInfo.getDescription();
            if (description2 != null) {
                com.bytedance.android.input.k.b.a.y0(jSONObject2, com.heytap.mcssdk.constant.b.i, description2);
                com.bytedance.android.input.k.b.a.y0(jSONObject4, com.heytap.mcssdk.constant.b.i, description2);
                if (description2.contains("bg anr")) {
                    com.bytedance.android.input.k.b.a.y0(jSONObject, "is_background", Boolean.TRUE);
                } else {
                    com.bytedance.android.input.k.b.a.y0(jSONObject, "is_background", Boolean.FALSE);
                }
                if (description2.contains("Input dispatching timed out")) {
                    com.bytedance.android.input.k.b.a.y0(jSONObject2, "anr_reason", "Input dispatching timed out");
                    int indexOf = description2.indexOf("Activity");
                    int i = indexOf;
                    while (i > 0 && '/' != description2.charAt(i)) {
                        i--;
                    }
                    if (indexOf != i) {
                        String str = description2.substring(i + 1, indexOf) + "Activity";
                        com.bytedance.android.input.k.b.a.y0(jSONObject2, "last_resume_activity", str);
                        com.bytedance.android.input.k.b.a.y0(jSONObject2, "anr_tag", str);
                    }
                } else if (description2.contains("executing service")) {
                    com.bytedance.android.input.k.b.a.y0(jSONObject2, "anr_reason", "executing service");
                    int indexOf2 = description2.indexOf("Service");
                    int i2 = indexOf2;
                    while (i2 > 0 && '/' != description2.charAt(i2)) {
                        i2--;
                    }
                    if (indexOf2 != i2) {
                        com.bytedance.android.input.k.b.a.y0(jSONObject2, "anr_tag", description2.substring(i2 + 1, indexOf2) + "Service");
                    }
                } else if (description2.contains("Broadcast of Intent")) {
                    com.bytedance.android.input.k.b.a.y0(jSONObject2, "anr_reason", "Broadcast of Intent");
                    int indexOf3 = description2.indexOf("{");
                    int indexOf4 = description2.indexOf("}");
                    if (indexOf3 != -1 && indexOf4 != -1) {
                        com.bytedance.android.input.k.b.a.y0(jSONObject2, "anr_tag", description2.substring(indexOf3 + 1, indexOf4).trim());
                    }
                }
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject4, "importance", String.valueOf(applicationExitInfo.getImportance()));
            com.bytedance.android.input.k.b.a.y0(jSONObject4, "pss", String.valueOf(applicationExitInfo.getPss()));
            com.bytedance.android.input.k.b.a.y0(jSONObject4, "rss", String.valueOf(applicationExitInfo.getRss()));
            com.bytedance.android.input.k.b.a.y0(jSONObject4, "app_info_description", applicationExitInfo.toString());
            String str2 = null;
            try {
                str2 = e(applicationExitInfo.getTraceInputStream());
            } catch (Throwable unused3) {
            }
            if (str2 != null) {
                com.bytedance.android.input.k.b.a.y0(jSONObject4, "anr_trace_description", str2);
            }
            CrashType crashType = CrashType.ANR;
            String j = CrashUploader.j(crashType, c2.e());
            ArrayList arrayList = new ArrayList();
            arrayList.add(f4537c);
            CrashUploader.p(crashType.getName(), j, jSONObject.toString(), arrayList);
        }
    }

    private static void k(ApplicationExitInfo applicationExitInfo) {
        if (c.a()) {
            Header c2 = Header.c(l.e(), applicationExitInfo.getTimestamp(), CrashType.JAVA, applicationExitInfo.getPid());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            com.bytedance.android.input.k.b.a.y0(jSONObject, "header", c2.e());
            try {
                jSONObject.put("filters", jSONObject2);
            } catch (Throwable unused) {
            }
            String str = null;
            try {
                str = e(applicationExitInfo.getTraceInputStream());
            } catch (Throwable unused2) {
            }
            if (TextUtils.isEmpty(str) || str.contains("failed to read status response from tombstoned:")) {
                str = "at ApplicationExit InvalidStack.NoStackAvailable(Invalid.java:1).\n";
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject, "isJava", 1);
            com.bytedance.android.input.k.b.a.y0(jSONObject, "crash_time", Long.valueOf(applicationExitInfo.getTimestamp()));
            com.bytedance.android.input.k.b.a.y0(jSONObject, "has_dump", "true");
            com.bytedance.android.input.k.b.a.y0(jSONObject, "jiffy", Long.valueOf(com.bytedance.crash.general.a.d()));
            com.bytedance.android.input.k.b.a.y0(jSONObject, RemoteMessageConst.DATA, TextUtils.isEmpty(str) ? "at ApplicationExit InvalidStack.NoStackAvailable(Invalid.java:1).\n" : str);
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "sdk_version", "4.2.1-rc.8-oime");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_64_runtime", NativeBridge.E() ? "true" : "false");
            String optString = c2.e().optString(HardwareInfo.KEY_HW_CPU_ABI);
            if (!TextUtils.isEmpty(optString)) {
                boolean contains = optString.contains("64");
                com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_x86_devices", Boolean.valueOf(optString.contains("86")));
                com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_64_devices", Boolean.valueOf(contains));
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_root", com.bytedance.crash.general.a.i() ? "true" : "false");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, RomInfo.KEY_ROM_KERNEL_VERSION, c2.e().optString(RomInfo.KEY_ROM_KERNEL_VERSION));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_hm_os", String.valueOf(com.bytedance.crash.util.f.a()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_root", com.bytedance.crash.general.a.i() ? "true" : "false");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "exit_reason", String.valueOf(applicationExitInfo.getReason()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "exit_status", String.valueOf(applicationExitInfo.getStatus()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "crash_from", "app_exit_history");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, com.heytap.mcssdk.constant.b.i, String.valueOf(applicationExitInfo.getDescription()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "importance", String.valueOf(applicationExitInfo.getImportance()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "pss", String.valueOf(applicationExitInfo.getPss()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "rss", String.valueOf(applicationExitInfo.getRss()));
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject.put(MonitorConstants.CUSTOM, jSONObject3);
            } catch (Throwable unused3) {
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "app_info_description", applicationExitInfo.toString());
            CrashType crashType = CrashType.JAVA;
            String j = CrashUploader.j(crashType, c2.e());
            ArrayList arrayList = new ArrayList();
            arrayList.add(f4537c);
            CrashUploader.p(crashType.getName(), j, jSONObject.toString(), arrayList);
        }
    }

    private static void l(ApplicationExitInfo applicationExitInfo) {
        if (c.a()) {
            Header c2 = Header.c(l.e(), applicationExitInfo.getTimestamp(), CrashType.NATIVE, applicationExitInfo.getPid());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            com.bytedance.android.input.k.b.a.y0(jSONObject, "header", c2.e());
            try {
                jSONObject.put("filters", jSONObject2);
            } catch (Throwable unused) {
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject, "is_native_crash", 1);
            com.bytedance.android.input.k.b.a.y0(jSONObject, "crash_time", Long.valueOf(applicationExitInfo.getTimestamp()));
            com.bytedance.android.input.k.b.a.y0(jSONObject, "has_dump", "true");
            com.bytedance.android.input.k.b.a.y0(jSONObject, "jiffy", Long.valueOf(com.bytedance.crash.general.a.d()));
            com.bytedance.android.input.k.b.a.y0(jSONObject, RemoteMessageConst.DATA, "Signal 111(CRASH_FROM_EXIT)\n\n");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "sdk_version", "4.2.1-rc.8-oime");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_64_runtime", NativeBridge.E() ? "true" : "false");
            String optString = c2.e().optString(HardwareInfo.KEY_HW_CPU_ABI);
            if (!TextUtils.isEmpty(optString)) {
                boolean contains = optString.contains("64");
                com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_x86_devices", Boolean.valueOf(optString.contains("86")));
                com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_64_devices", Boolean.valueOf(contains));
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_root", com.bytedance.crash.general.a.i() ? "true" : "false");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, RomInfo.KEY_ROM_KERNEL_VERSION, c2.e().optString(RomInfo.KEY_ROM_KERNEL_VERSION));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_hm_os", String.valueOf(com.bytedance.crash.util.f.a()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_root", com.bytedance.crash.general.a.i() ? "true" : "false");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "exit_reason", String.valueOf(applicationExitInfo.getReason()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "exit_status", String.valueOf(applicationExitInfo.getStatus()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "crash_from", "app_exit_history");
            com.bytedance.android.input.k.b.a.y0(jSONObject2, com.heytap.mcssdk.constant.b.i, String.valueOf(applicationExitInfo.getDescription()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "importance", String.valueOf(applicationExitInfo.getImportance()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "pss", String.valueOf(applicationExitInfo.getPss()));
            com.bytedance.android.input.k.b.a.y0(jSONObject2, "rss", String.valueOf(applicationExitInfo.getRss()));
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject.put(MonitorConstants.CUSTOM, jSONObject3);
            } catch (Throwable unused2) {
            }
            com.bytedance.android.input.k.b.a.y0(jSONObject3, "app_info_description", applicationExitInfo.toString());
            String str = null;
            try {
                str = e(applicationExitInfo.getTraceInputStream());
            } catch (Throwable unused3) {
            }
            if (!TextUtils.isEmpty(str) && !str.contains("failed to read status response from tombstoned:")) {
                com.bytedance.android.input.k.b.a.y0(jSONObject3, "native_crash_trace", str);
            }
            CrashType crashType = CrashType.NATIVE;
            String j = CrashUploader.j(crashType, c2.e());
            ArrayList arrayList = new ArrayList();
            arrayList.add(f4537c);
            CrashUploader.p(crashType.getName(), j, jSONObject.toString(), arrayList);
        }
    }
}
