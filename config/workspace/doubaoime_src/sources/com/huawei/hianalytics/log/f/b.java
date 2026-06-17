package com.huawei.hianalytics.log.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.util.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements c {
    private static void b(ZipInputStream zipInputStream, File file) {
        FileOutputStream fileOutputStream;
        boolean z;
        String str;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    com.huawei.hianalytics.log.e.d.a(0, null);
                    return;
                }
                String d2 = d(nextEntry.getName());
                if (TextUtils.isEmpty(d2)) {
                    com.huawei.hianalytics.g.b.c("SendManagerImpl", "File name exception, stop unzip");
                    com.huawei.hianalytics.log.e.d.a(0, null);
                    return;
                }
                File file2 = new File(file.getCanonicalPath() + File.separator + d2);
                if (nextEntry.isDirectory()) {
                    if (file2.mkdirs()) {
                        b(zipInputStream, file);
                        com.huawei.hianalytics.log.e.d.a(0, fileOutputStream2);
                    } else {
                        str = "fileUnZip() Unzip file creation failure";
                        com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", str);
                        com.huawei.hianalytics.log.e.d.a(0, fileOutputStream2);
                    }
                }
                if (!file2.createNewFile()) {
                    str = "fileUnZip() Failure to create new files";
                    com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", str);
                    com.huawei.hianalytics.log.e.d.a(0, fileOutputStream2);
                }
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[2048];
                    int i = 0;
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read != -1) {
                            i += read;
                            if (i > 5242880) {
                                com.huawei.hianalytics.g.b.d("SendManagerImpl", "Single File being unzipped is too big.");
                                if (file2.exists() && file2.delete()) {
                                    com.huawei.hianalytics.g.b.b("SendManagerImpl", "Delete large files successfully");
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        } else {
                            break;
                        }
                    }
                    b(zipInputStream, file);
                    fileOutputStream2 = fileOutputStream;
                    com.huawei.hianalytics.log.e.d.a(0, fileOutputStream2);
                } catch (IOException unused) {
                    fileOutputStream2 = fileOutputStream;
                    com.huawei.hianalytics.g.b.d("SendManagerImpl", "fileUnZip() File creation failure or Stream Exception!");
                    com.huawei.hianalytics.log.e.d.a(0, fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException unused2) {
        }
    }

    private void c(String str) {
        String[] split = str.split("/");
        if ("logs".equals(split[split.length - 2])) {
            a(str.replace(split[split.length - 1], "logzips"), str);
        } else if (new File(str).delete()) {
            com.huawei.hianalytics.g.b.c("SendManagerImpl", "doUnzip() delete srcFilePath file");
        }
    }

    private static String d(String str) {
        String canonicalPath;
        try {
            canonicalPath = new File(str).getCanonicalPath();
        } catch (IOException unused) {
        }
        if (canonicalPath.startsWith(new File(".").getCanonicalPath())) {
            return canonicalPath;
        }
        com.huawei.hianalytics.g.b.d("SendManagerImpl", "File is outside extraction target directory.");
        return "";
    }

    @Override // com.huawei.hianalytics.log.f.c
    public void a(String str, String str2) {
        ZipFile zipFile;
        ZipInputStream zipInputStream = null;
        try {
            try {
                zipFile = new ZipFile(str2);
                try {
                    if (zipFile.size() > 10) {
                        com.huawei.hianalytics.g.b.c("SendManagerImpl", "The number of unzip files is too much.MaxSize: 10");
                        com.huawei.hianalytics.log.e.d.a(4, null);
                        try {
                            zipFile.close();
                            return;
                        } catch (IOException unused) {
                            com.huawei.hianalytics.g.b.c("SendManagerImpl", "ZipFile. Exception when closing the closeable");
                            return;
                        }
                    }
                    ZipInputStream zipInputStream2 = new ZipInputStream(new FileInputStream(str2));
                    try {
                        File file = new File(str);
                        if (!file.exists() && !file.mkdirs()) {
                            com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "Zips directory creation failure");
                        }
                        b(zipInputStream2, file);
                        if (new File(str2).delete()) {
                            com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "Delete unzip file");
                        }
                        com.huawei.hianalytics.log.e.d.a(4, zipInputStream2);
                        try {
                            zipFile.close();
                        } catch (IOException unused2) {
                            com.huawei.hianalytics.g.b.c("SendManagerImpl", "ZipFile. Exception when closing the closeable");
                        }
                    } catch (FileNotFoundException unused3) {
                        zipInputStream = zipInputStream2;
                        com.huawei.hianalytics.g.b.d("SendManagerImpl", " unZip() There is no document!");
                        com.huawei.hianalytics.log.e.d.a(4, zipInputStream);
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused4) {
                                com.huawei.hianalytics.g.b.c("SendManagerImpl", "ZipFile. Exception when closing the closeable");
                            }
                        }
                    } catch (IOException unused5) {
                        zipInputStream = zipInputStream2;
                        com.huawei.hianalytics.g.b.d("SendManagerImpl", "This file is not a compressed file");
                        com.huawei.hianalytics.log.e.d.a(4, zipInputStream);
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused6) {
                                com.huawei.hianalytics.g.b.c("SendManagerImpl", "ZipFile. Exception when closing the closeable");
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        zipInputStream = zipInputStream2;
                        com.huawei.hianalytics.log.e.d.a(4, zipInputStream);
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused7) {
                                com.huawei.hianalytics.g.b.c("SendManagerImpl", "ZipFile. Exception when closing the closeable");
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused8) {
                } catch (IOException unused9) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused10) {
            zipFile = null;
        } catch (IOException unused11) {
            zipFile = null;
        } catch (Throwable th3) {
            th = th3;
            zipFile = null;
        }
    }

    @Override // com.huawei.hianalytics.log.f.c
    public void a(String str, String str2, Key key) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        byte[] a = com.huawei.hianalytics.log.e.b.a();
        Cipher a2 = com.huawei.hianalytics.log.e.b.a(1, key, a);
        if (a2 == null) {
            com.huawei.hianalytics.g.b.d("SendManagerImpl", "get cipher is null!");
            c(str);
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    fileOutputStream = new FileOutputStream(str2);
                } catch (FileNotFoundException unused) {
                    fileOutputStream = null;
                } catch (IOException unused2) {
                    fileOutputStream = null;
                } catch (BadPaddingException unused3) {
                    fileOutputStream = null;
                } catch (IllegalBlockSizeException unused4) {
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused5) {
            fileOutputStream = null;
        } catch (IOException unused6) {
            fileOutputStream = null;
        } catch (BadPaddingException unused7) {
            fileOutputStream = null;
        } catch (IllegalBlockSizeException unused8) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(a);
            byte[] bArr = new byte[2048];
            while (fileInputStream.read(bArr) != -1) {
                fileOutputStream.write(a2.doFinal(bArr));
            }
            com.huawei.hianalytics.log.e.d.a(1, fileInputStream);
            com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
        } catch (FileNotFoundException unused9) {
            fileInputStream2 = fileInputStream;
            com.huawei.hianalytics.g.b.d("SendManagerImpl", " encrypt(): There is no document!");
            com.huawei.hianalytics.log.e.d.a(1, fileInputStream2);
            com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
        } catch (IOException unused10) {
            fileInputStream2 = fileInputStream;
            com.huawei.hianalytics.g.b.d("SendManagerImpl", "Exception by stream read or write in the encrypt()!");
            c(str);
            com.huawei.hianalytics.log.e.d.a(1, fileInputStream2);
            com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
        } catch (BadPaddingException unused11) {
            fileInputStream2 = fileInputStream;
            com.huawei.hianalytics.g.b.d("SendManagerImpl", " encrypt(): diFinal - False filling parameters!");
            c(str);
            com.huawei.hianalytics.log.e.d.a(1, fileInputStream2);
            com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
        } catch (IllegalBlockSizeException unused12) {
            fileInputStream2 = fileInputStream;
            com.huawei.hianalytics.g.b.d("SendManagerImpl", "encrypt(): doFinal - The provided block is not filled with !");
            c(str);
            com.huawei.hianalytics.log.e.d.a(1, fileInputStream2);
            com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            com.huawei.hianalytics.log.e.d.a(1, fileInputStream2);
            com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
            throw th;
        }
    }

    @Override // com.huawei.hianalytics.log.f.c
    public boolean a(String str, String str2, Context context) {
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            str3 = "SendManagerImpl";
            z = false;
            str4 = "send log path or key is empty!";
        } else {
            String c2 = com.huawei.hianalytics.a.d.c();
            String b = com.huawei.hianalytics.a.d.b();
            if (TextUtils.isEmpty(b) || TextUtils.isEmpty(c2)) {
                str3 = "SendManagerImpl";
                z = false;
                str4 = "logClintID or logClintKey is empty! Do not send file!";
            } else {
                f fVar = new f();
                String concat = "{url}/v2/getServerDomain".replace("{url}", com.huawei.hianalytics.a.d.i()).concat("?appID=").concat(b);
                String a = com.huawei.hianalytics.log.e.e.a(context);
                try {
                    JSONObject jSONObject = new JSONObject(com.huawei.hianalytics.h.b.a(concat, a, com.huawei.hianalytics.log.a.a.a(concat, a, c2)).b());
                    String string = jSONObject.getString("resCode");
                    com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "logserver first request resCode :" + string);
                    if (!"0".equals(string)) {
                        return false;
                    }
                    String optString = jSONObject.optString("serverDomain", "");
                    String optString2 = jSONObject.optString("accessToken", "");
                    String str7 = "https://" + optString;
                    if (!h.a(str7)) {
                        com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "url non conformity");
                        return false;
                    }
                    String concat2 = "{url}/v2/getUploadInfo".replace("{url}", str7).concat("?appID=").concat(b);
                    String a2 = fVar.a(a, fVar.a(str, str2));
                    try {
                        JSONObject jSONObject2 = new JSONObject(com.huawei.hianalytics.h.b.a(concat2, a2, com.huawei.hianalytics.log.a.a.a(concat2, a2, optString2)).b());
                        String string2 = jSONObject2.getString("resCode");
                        com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "Request file to report URL interface serverResCode :" + string2);
                        if (!"0".equals(string2)) {
                            return false;
                        }
                        com.huawei.hianalytics.log.e.f.a(context, jSONObject2.getString("policy"));
                        String optString3 = jSONObject2.optString("fileUniqueFlag");
                        String optString4 = jSONObject2.optString("currentTime");
                        int a3 = d.a(fVar.a(jSONObject2.getJSONArray("uploadInfoList"), str));
                        com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "upLoadLogPut response code: " + a3);
                        if (200 != a3) {
                            str5 = "SendManagerImpl";
                            try {
                                com.huawei.hianalytics.g.b.c(str5, "File upload failure");
                                return false;
                            } catch (IOException unused) {
                                str6 = "sendLog get logServerUrl Exception,The Exception is IO!";
                                com.huawei.hianalytics.g.b.d(str5, str6);
                                return false;
                            } catch (JSONException unused2) {
                                str6 = "sendLog(reauest) get logServerUrl Exception,The Exception is json!";
                                com.huawei.hianalytics.g.b.d(str5, str6);
                                return false;
                            }
                        }
                        com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "upLoadLogPut success");
                        com.huawei.hianalytics.log.e.c.a(com.huawei.hianalytics.log.e.c.b(context), "autocheck_starttime", Long.valueOf(System.currentTimeMillis()));
                        String concat3 = "{url}/v2/notifyUploadSucc".replace("{url}", str7).concat("?appID=").concat(b);
                        String concat4 = a.concat("&fileUniqueFlag=").concat(optString3).concat("&uploadTime=").concat(optString4);
                        com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "upload_notify_succ: " + new JSONObject(com.huawei.hianalytics.h.b.a(concat3, concat4, com.huawei.hianalytics.log.a.a.a(concat3, concat4, optString2)).b()).getString("resCode"));
                        return true;
                    } catch (IOException unused3) {
                        str5 = "SendManagerImpl";
                    } catch (JSONException unused4) {
                        str5 = "SendManagerImpl";
                    }
                } catch (IOException unused5) {
                    str5 = "SendManagerImpl";
                } catch (JSONException unused6) {
                    str5 = "SendManagerImpl";
                }
            }
        }
        com.huawei.hianalytics.g.b.c(str3, str4);
        return z;
    }

    @Override // com.huawei.hianalytics.log.f.c
    public boolean a(String str, String str2, String str3) {
        File[] a = a.a(str);
        if (a.length <= 0) {
            com.huawei.hianalytics.g.b.d("SendManagerImpl", "There is no log file when creating a compressed package");
            return false;
        }
        File file = new File(e.a.a.a.a.s(str3, str2));
        for (int i = 0; i < 2; i++) {
            if (com.huawei.hianalytics.log.e.f.a(a, file)) {
                com.huawei.hianalytics.log.e.a.a(new File(str));
                return true;
            }
            if (i == 1) {
                com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "Packaging failure!");
                if (file.exists() && file.delete()) {
                    com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "Bad zip file delete ok");
                }
            }
        }
        return false;
    }
}
