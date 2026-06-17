package com.xiaomi.push.service.logupload;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.push.bz;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class b {
    private int a = 306;

    /* renamed from: a, reason: collision with other field name */
    private final Context f1112a;

    private static class a extends Exception {
        private final int a;

        public a(int i, String str) {
            super(str);
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    public b(Context context) {
        this.f1112a = context;
    }

    /* renamed from: a, reason: collision with other method in class */
    public int m795a() {
        return this.a;
    }

    public File a(String str, long j, long j2, bz bzVar) {
        File file;
        this.a = 306;
        if (TextUtils.isEmpty(str) || j <= 0) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "retrievalId or timestamp is empty when compressLogs");
            this.a = 301;
            return null;
        }
        if (j2 <= 0) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "invalid maxSize: " + j2 + "when compressLogs");
            this.a = 301;
            return null;
        }
        List<String> a2 = a();
        if (a2.isEmpty()) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "log paths are empty when compressLogs");
            this.a = 303;
            return null;
        }
        File cacheDir = this.f1112a.getCacheDir();
        if (cacheDir == null || !cacheDir.exists()) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "cache directory not available when compressLogs");
            this.a = 308;
            return null;
        }
        File file2 = new File(cacheDir, "push_log_upload");
        if (!file2.exists() && !file2.mkdirs()) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "failed to create upload dir when compressLogs");
            this.a = 308;
            return null;
        }
        a(file2);
        File file3 = new File(file2, str + BundleUtil.UNDERLINE_TAG + j + ".zip");
        try {
            if (a2.size() == 1) {
                a(a2.get(0), file3);
                file = file3;
            } else {
                file = file3;
                try {
                    a(a2, j, file2, file3, bzVar);
                } catch (a e2) {
                    e = e2;
                    StringBuilder M = e.a.a.a.a.M("compress failed with code ");
                    M.append(e.a());
                    M.append(": ");
                    M.append(e.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.c("LogFileProcessor", M.toString());
                    if (file.exists()) {
                        file.delete();
                    }
                    this.a = e.a();
                    return null;
                } catch (Exception e3) {
                    e = e3;
                    StringBuilder M2 = e.a.a.a.a.M("compress failed with unexpected exception: ");
                    M2.append(e.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.c("LogFileProcessor", M2.toString());
                    if (file.exists()) {
                        file.delete();
                    }
                    this.a = 306;
                    return null;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    StringBuilder M3 = e.a.a.a.a.M("compress OOM: ");
                    M3.append(e.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.c("LogFileProcessor", M3.toString());
                    if (file.exists()) {
                        file.delete();
                    }
                    this.a = 306;
                    return null;
                }
            }
            if (!file.exists()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "zip file not created");
                this.a = 306;
                return null;
            }
            long length = file.length();
            if (length == 0) {
                com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "zip file is zero byte");
                file.delete();
                this.a = 306;
                return null;
            }
            bzVar.b(3006);
            if (length <= j2) {
                return file;
            }
            com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "zip exceeds limit: " + length + " > " + j2);
            file.delete();
            this.a = 307;
            return null;
        } catch (a e5) {
            e = e5;
            file = file3;
        } catch (Exception e6) {
            e = e6;
            file = file3;
        } catch (OutOfMemoryError e7) {
            e = e7;
            file = file3;
        }
    }

    private void a(String str, File file) {
        File[] listFiles;
        File file2 = new File(str);
        if (file2.exists()) {
            if (file2.isDirectory() && ((listFiles = file2.listFiles()) == null || listFiles.length == 0)) {
                com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "No files in directory when compressSinglePath: " + str);
                throw new a(304, e.a.a.a.a.s("No files in source directory: ", str));
            }
            try {
                com.xiaomi.push.service.logupload.a.a(file2, file);
                return;
            } catch (Exception e2) {
                StringBuilder M = e.a.a.a.a.M("Zip directory failed: ");
                M.append(e2.getMessage());
                throw new a(306, M.toString());
            }
        }
        throw new a(303, e.a.a.a.a.s("Source not exist: ", str));
    }

    private void a(List<String> list, long j, File file, File file2, bz bzVar) {
        if (list != null && !list.isEmpty()) {
            File file3 = new File(file, e.a.a.a.a.n("temp_", j));
            try {
                try {
                    if (file3.mkdirs()) {
                        int i = 0;
                        int i2 = 0;
                        for (String str : list) {
                            File file4 = new File(str);
                            if (file4.exists()) {
                                i++;
                                try {
                                    com.xiaomi.push.service.logupload.a.b(file4, file3);
                                    i2++;
                                } catch (Exception e2) {
                                    com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "copy failed, skipped: " + str + ", error: " + e2.getMessage());
                                }
                            } else {
                                com.xiaomi.channel.commonutils.logger.c.m16a("LogFileProcessor", "source not exist when compressMultiplePaths: " + str);
                            }
                        }
                        if (i == 0) {
                            throw new a(304, "All source paths not exist when compressMultiplePaths");
                        }
                        if (i2 != 0) {
                            File[] listFiles = file3.listFiles();
                            if (listFiles != null) {
                                if (listFiles.length != 0) {
                                    if (bzVar != null) {
                                        try {
                                            bzVar.b(3005);
                                        } catch (RemoteException e3) {
                                            com.xiaomi.channel.commonutils.logger.c.c("LogFileProcessor", "report status failed when compressMultiplePaths: " + e3.getMessage());
                                        }
                                    }
                                    try {
                                        com.xiaomi.push.service.logupload.a.a(file3, file2);
                                        return;
                                    } catch (Exception e4) {
                                        throw new a(306, "Zip directory failed: " + e4.getMessage());
                                    }
                                }
                                throw new a(304, "After copying, no files in temp dir, copiedCount: " + i2);
                            }
                            throw new a(308, "Cannot access to temp dir: " + file3.getAbsolutePath());
                        }
                        throw new a(305, "Failed to copy to temp dir when compressMultiplePaths. copiedCount: " + i2);
                    }
                    throw new a(305, "Failed to create temp dir: " + file3.getAbsolutePath());
                } catch (a e5) {
                    throw e5;
                } catch (Exception e6) {
                    throw new a(305, "Compress multiple paths failed: " + e6.getMessage());
                }
            } finally {
                com.xiaomi.push.service.logupload.a.b(file3);
            }
        }
        throw new a(303, "paths is empty when compressMultiplePaths.");
    }

    private List<String> a() {
        int i;
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            string = this.f1112a.getSharedPreferences("mipush_log_upload_config", 0).getString("log_paths", null);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("read log paths from SP failed: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("LogFileProcessor", M.toString());
        }
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        JSONArray jSONArray = new JSONArray(string);
        for (i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
            }
        }
        return arrayList;
    }

    private void a(File file) {
        com.xiaomi.push.service.logupload.a.a(file);
    }
}
