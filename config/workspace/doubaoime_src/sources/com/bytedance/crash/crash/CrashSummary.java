package com.bytedance.crash.crash;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.l;
import com.bytedance.crash.upload.CrashUploader;
import com.bytedance.services.apm.api.IApmAgent;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public abstract class CrashSummary implements Comparable {
    protected static final String SUFFIX = ".summary";
    private static final String UPLOAD_STATE = "upload_state.inf";
    protected final long mCrashTime;
    protected final CrashType mCrashType;
    protected final File mDirectory;
    protected final int mPid;
    protected final String mProcessName;
    protected String mStackTrace;
    protected final long mStartTime;
    protected final String mThreadName;
    protected final int mTid;
    protected final long sAppStartUpTime;

    static class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(CrashSummary.SUFFIX);
        }
    }

    static class b implements Comparator<CrashSummary> {
        b() {
        }

        @Override // java.util.Comparator
        public int compare(CrashSummary crashSummary, CrashSummary crashSummary2) {
            return crashSummary2.compareTo(crashSummary);
        }
    }

    protected CrashSummary(File file, CrashType crashType, long j, long j2, long j3, String str, String str2, int i, int i2) {
        this.mDirectory = file;
        this.mCrashType = crashType;
        this.mStartTime = j;
        this.sAppStartUpTime = j2;
        this.mCrashTime = j3;
        this.mProcessName = str;
        this.mThreadName = str2;
        this.mPid = i;
        this.mTid = i2;
    }

    private void afterUpload(JSONObject jSONObject, boolean z, boolean z2) {
        if (z) {
            try {
                com.bytedance.crash.K.a.d(this.mProcessName, this.mStartTime, this.mCrashTime, this.mCrashType);
                com.bytedance.crash.upload.a.c(this.mCrashType, jSONObject);
            } catch (Throwable unused) {
                return;
            }
        }
        if (z || z2) {
            deleteDirectory();
            com.bytedance.crash.O.b.a();
        }
    }

    private static void assemblyCrashBodyAfterFilter(JSONObject jSONObject, File file) {
        BufferedReader bufferedReader;
        String readLine;
        NativeBridge.K(file.getAbsolutePath());
        File file2 = new File(file, "maps_size.txt");
        if (file2.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file2));
                readLine = bufferedReader.readLine();
            } catch (Throwable unused) {
            }
            if (readLine == null) {
                return;
            }
            String[] split = readLine.trim().split(" ");
            if (split.length < 2) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            while (true) {
                String readLine2 = bufferedReader.readLine();
                if (readLine2 == null) {
                    break;
                }
                String[] split2 = readLine2.trim().split(" ");
                if (split2.length == split.length) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (int i = 0; i < split.length; i++) {
                        jSONObject2.put(split[i], split2[i]);
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            bufferedReader.close();
            jSONObject.put("tagged_maps_size", jSONArray);
            com.bytedance.crash.util.a.b(file2);
        }
    }

    private boolean beforeUpload(@NonNull com.bytedance.crash.monitor.a aVar, JSONObject jSONObject) {
        l h;
        IApmAgent iApmAgent;
        if (aVar.j().p(this.mCrashType, jSONObject)) {
            return true;
        }
        JSONObject originalBody = getOriginalBody(jSONObject);
        CrashType crashType = this.mCrashType;
        long j = this.mCrashTime;
        CrashType crashType2 = CrashType.ANR;
        boolean isEmpty = crashType == crashType2 ? true ^ TextUtils.isEmpty(originalBody.optString("anr_info")) : false;
        String w = com.bytedance.crash.a0.a.w(originalBody);
        try {
            h = C0652g.h();
        } catch (Exception unused) {
        }
        if (h == null) {
            iApmAgent = (IApmAgent) com.bytedance.news.common.service.manager.c.a(IApmAgent.class);
            if (iApmAgent == null) {
                g.c(this.mCrashType, this.mDirectory, originalBody, jSONObject.optJSONObject("header"));
                return false;
            }
        } else {
            iApmAgent = null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("app_exit_metrics", crashType.getName());
        if (!TextUtils.isEmpty(w)) {
            jSONObject2.put("scene", w);
        }
        if (crashType == crashType2) {
            jSONObject2.put("has_anr_info", isEmpty);
        }
        jSONObject2.put("crash_time", j);
        if (h != null) {
            h.monitorEvent("hmd_app_exit_reason", jSONObject2, null, null);
        } else {
            iApmAgent.monitorEvent("hmd_app_exit_reason", jSONObject2, null, null);
        }
        g.c(this.mCrashType, this.mDirectory, originalBody, jSONObject.optJSONObject("header"));
        return false;
    }

    private void deleteDirectory() {
        StringBuilder M = e.a.a.a.a.M("delete directory=");
        M.append(this.mDirectory.getAbsolutePath());
        com.bytedance.android.input.k.b.a.W(M.toString());
        com.bytedance.android.input.k.b.a.s(this.mDirectory);
        if (this.mDirectory.exists()) {
            com.bytedance.android.input.k.b.a.o(this.mDirectory, UPLOAD_STATE);
        }
    }

    @Nullable
    static CrashSummary loadFromDirectory(File file) {
        File[] listFiles = file.listFiles(new a());
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            NativeCrashSummary load = NativeCrashSummary.load(file2);
            if (load != null) {
                arrayList.add(load);
            }
            e a2 = e.a(file2);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList, new b());
        return (CrashSummary) arrayList.get(0);
    }

    private void setInnerAid(@NonNull JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        com.bytedance.android.input.k.b.a.y0(jSONObject.optJSONObject("filters"), WsConstants.KEY_APP_ID, optJSONObject != null ? String.valueOf(optJSONObject.opt(WsConstants.KEY_APP_ID)) : "");
        com.bytedance.android.input.k.b.a.y0(optJSONObject, WsConstants.KEY_APP_ID, 2010);
    }

    protected abstract void appendSpecialFilter(JSONObject jSONObject);

    public com.bytedance.crash.entity.a assemblyCrashBody(@NonNull com.bytedance.crash.monitor.a aVar) {
        Header a2 = Header.a(aVar, this.mStartTime, this.mCrashTime, this.mCrashType, this.mPid, this.mDirectory);
        com.bytedance.crash.entity.a aVar2 = new com.bytedance.crash.entity.a();
        try {
            aVar2.d("pid", Integer.valueOf(this.mPid));
            aVar2.d("tid", Integer.valueOf(this.mTid));
            aVar2.d("crash_time", Long.valueOf(this.mCrashTime));
            aVar2.d("crash_thread_name", this.mThreadName);
            aVar2.d("process_name", this.mProcessName);
            aVar2.d("app_start_time", Long.valueOf(this.mStartTime));
            aVar2.d("app_start_up_time", Long.valueOf(this.sAppStartUpTime));
            aVar2.d("jiffy", Long.valueOf(a2.d()));
            aVar2.d("has_dump", "true");
            com.bytedance.android.input.k.b.a.y0(aVar2.c(), "business", C0652g.e());
            aVar2.d(RemoteMessageConst.DATA, this.mStackTrace);
            aVar2.d("crash_md5", com.bytedance.android.input.k.b.a.N(this.mStackTrace));
            aVar2.d("launch_mode", Integer.valueOf(com.bytedance.crash.a0.a.x()));
            aVar2.d("launch_time", Long.valueOf(com.bytedance.crash.a0.a.y()));
            aVar2.d("session_id", a2.e().opt("session_id"));
            loadCrashInfo(aVar2.c(), a2.e(), this.mDirectory);
            com.bytedance.crash.entity.b.a(a2.e(), aVar2.c(), this.mDirectory);
            assemblyCrashBodyAfterFilter(aVar2.c(), this.mDirectory);
            assemblySpecialCrashBody(aVar2, a2);
            appendSpecialFilter(aVar2.c());
        } catch (Throwable th) {
            com.bytedance.android.input.k.b.a.W(th);
            com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
        }
        aVar2.e(a2);
        return aVar2;
    }

    public Header assemblyCrashHeader(@NonNull com.bytedance.crash.monitor.a aVar) {
        return Header.a(aVar, this.mStartTime, this.mCrashTime, this.mCrashType, this.mPid, this.mDirectory);
    }

    protected abstract void assemblySpecialCrashBody(com.bytedance.crash.entity.a aVar, Header header);

    boolean checkIfNeedUpload() {
        int i;
        File file = new File(this.mDirectory, UPLOAD_STATE);
        int i2 = 0;
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                i = fileInputStream.read();
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                i = 0;
            }
            if (i < 0 || i >= 2) {
                if (i >= 2) {
                    com.bytedance.crash.Q.b.e(e.a.a.a.a.k("upload failed, retry count is", i, "."), new Exception());
                }
                return false;
            }
            i2 = i + 1;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(i2);
            fileOutputStream.close();
        } catch (Exception unused3) {
        }
        return true;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = this.mCrashTime - ((CrashSummary) obj).mCrashTime;
        if (j > 0) {
            return -1;
        }
        return j < 0 ? 1 : 0;
    }

    @NonNull
    List<File> getAttachmentFileList() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.mDirectory.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                if (!name.endsWith(SUFFIX) && !name.endsWith(".json") && !name.endsWith(".inf")) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public long getCrashTime() {
        return this.mCrashTime;
    }

    public CrashType getCrashType() {
        return this.mCrashType;
    }

    protected JSONObject getOriginalBody(JSONObject jSONObject) {
        return jSONObject;
    }

    public int getPid() {
        return this.mPid;
    }

    public String getProcessName() {
        return this.mProcessName;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public String getThreadName() {
        return this.mThreadName;
    }

    public int getTid() {
        return this.mTid;
    }

    protected void loadCrashInfo(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        com.bytedance.crash.dumper.e c2;
        com.bytedance.crash.dumper.a.t(jSONObject, file);
        com.bytedance.crash.U.c.e(jSONObject, file);
        com.bytedance.crash.W.a.d(jSONObject, file);
        com.bytedance.android.input.k.b.a.x0(jSONObject, file);
        com.bytedance.crash.dumper.a.s(jSONObject, file);
        com.bytedance.crash.a0.a.B(jSONObject, file);
        String C0 = com.bytedance.android.input.k.b.a.C0(new File(file, "all_thread_stacks.json"));
        if (C0 != null) {
            try {
                com.bytedance.android.input.k.b.a.j(jSONObject, new JSONObject(C0));
            } catch (Throwable unused) {
            }
        }
        Scraps.pushTo(jSONObject, file);
        com.bytedance.crash.monitor.a e2 = com.bytedance.crash.monitor.l.e();
        if (e2 != null && (c2 = e2.c()) != null) {
            c2.d(jSONObject, jSONObject2, file);
        }
        String h = e.a.a.a.a.h(file, "custom.json");
        if (h != null) {
            try {
                com.bytedance.android.input.k.b.a.j(jSONObject, new JSONObject(h));
            } catch (Throwable unused2) {
            }
        }
    }

    @NonNull
    protected abstract String loadStackTrace();

    public boolean upload(@NonNull com.bytedance.crash.monitor.a aVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        boolean z;
        Throwable th;
        boolean z2;
        boolean z3 = false;
        if (!checkIfNeedUpload()) {
            deleteDirectory();
            return false;
        }
        File file = new File(this.mDirectory, "upload.json");
        String C0 = com.bytedance.android.input.k.b.a.C0(file);
        JSONObject jSONObject4 = null;
        if (C0 != null) {
            try {
                jSONObject2 = new JSONObject(C0);
                try {
                    jSONObject4 = jSONObject2.optJSONObject("header");
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                jSONObject2 = null;
            }
            jSONObject3 = jSONObject4;
            jSONObject4 = jSONObject2;
        } else {
            jSONObject3 = null;
        }
        if (jSONObject4 == null || jSONObject3 == null) {
            try {
                com.bytedance.crash.entity.a assemblyCrashBody = assemblyCrashBody(aVar);
                jSONObject4 = assemblyCrashBody.c();
                jSONObject3 = assemblyCrashBody.b();
                JSONObject J2 = com.bytedance.android.input.k.b.a.J(jSONObject4, "filters");
                if (jSONObject != null) {
                    com.bytedance.android.input.k.b.a.j(J2, jSONObject);
                }
                z = true;
            } catch (Throwable th2) {
                th = th2;
                z2 = false;
                com.bytedance.android.input.k.b.a.P0(th);
                com.bytedance.crash.Q.b.e("upload exception", th);
                afterUpload(jSONObject4, z3, z2);
                StringBuilder M = e.a.a.a.a.M("uploadOne:");
                M.append(this.mDirectory.getAbsolutePath());
                M.append(", success=");
                M.append(z3);
                com.bytedance.android.input.k.b.a.W(M.toString());
                return z3;
            }
        } else {
            z = false;
        }
        z2 = beforeUpload(aVar, jSONObject4);
        if (!z2) {
            try {
                String jSONObject5 = jSONObject4.toString();
                if (z) {
                    try {
                        com.bytedance.crash.util.a.x(file, jSONObject5, false);
                    } catch (Exception unused3) {
                    }
                }
                String j = CrashUploader.j(this.mCrashType, jSONObject3);
                com.bytedance.android.input.k.b.a.W("uploadOne: " + this.mCrashType + " :" + j);
                z3 = CrashUploader.p(this.mCrashType.getName(), j, jSONObject5, getAttachmentFileList()).d();
            } catch (Throwable th3) {
                th = th3;
                com.bytedance.android.input.k.b.a.P0(th);
                com.bytedance.crash.Q.b.e("upload exception", th);
                afterUpload(jSONObject4, z3, z2);
                StringBuilder M2 = e.a.a.a.a.M("uploadOne:");
                M2.append(this.mDirectory.getAbsolutePath());
                M2.append(", success=");
                M2.append(z3);
                com.bytedance.android.input.k.b.a.W(M2.toString());
                return z3;
            }
        }
        afterUpload(jSONObject4, z3, z2);
        StringBuilder M22 = e.a.a.a.a.M("uploadOne:");
        M22.append(this.mDirectory.getAbsolutePath());
        M22.append(", success=");
        M22.append(z3);
        com.bytedance.android.input.k.b.a.W(M22.toString());
        return z3;
    }
}
