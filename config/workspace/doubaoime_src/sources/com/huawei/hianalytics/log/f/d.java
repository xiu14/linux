package com.huawei.hianalytics.log.f;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class d {
    static int a(List<com.huawei.hianalytics.log.f.a.c> list) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (list == null || list.size() == 0) {
            com.huawei.hianalytics.g.b.d("LogHttpClient", "uploadParameterList is empty!");
            return -1;
        }
        Iterator<com.huawei.hianalytics.log.f.a.c> it2 = list.iterator();
        while (it2.hasNext()) {
            com.huawei.hianalytics.log.f.a.c next = it2.next();
            String a = next.a();
            if (TextUtils.isEmpty(a)) {
                return -1;
            }
            URL url = new URL(a);
            String b = next.b();
            Map<String, String> d2 = next.d();
            DataInputStream dataInputStream = null;
            try {
                File[] listFiles = new File(next.c()).listFiles();
                File file = listFiles == null ? null : listFiles[0];
                if (file == null) {
                    com.huawei.hianalytics.g.b.d("LogHttpClient", "not have file in bigzip! No access to the path,upload over");
                    com.huawei.hianalytics.log.e.d.a(7, null);
                    com.huawei.hianalytics.log.e.d.a(8, null);
                    return -1;
                }
                DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(file));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(1024);
                } catch (IOException unused) {
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = null;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = dataInputStream2.read(bArr);
                        if (read == -1) {
                            int a2 = com.huawei.hianalytics.h.b.a(url.toString(), byteArrayOutputStream.toByteArray(), b, d2).a();
                            com.huawei.hianalytics.log.e.d.a(7, dataInputStream2);
                            com.huawei.hianalytics.log.e.d.a(8, byteArrayOutputStream);
                            return a2;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (IOException unused2) {
                    dataInputStream = dataInputStream2;
                    try {
                        com.huawei.hianalytics.g.b.d("LogHttpClient", "upLoadLogPutRequest() file input Stream Exception!");
                        com.huawei.hianalytics.log.e.d.a(7, dataInputStream);
                        com.huawei.hianalytics.log.e.d.a(8, byteArrayOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        com.huawei.hianalytics.log.e.d.a(7, dataInputStream);
                        com.huawei.hianalytics.log.e.d.a(8, byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream = dataInputStream2;
                    com.huawei.hianalytics.log.e.d.a(7, dataInputStream);
                    com.huawei.hianalytics.log.e.d.a(8, byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException unused3) {
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        }
        return -1;
    }
}
