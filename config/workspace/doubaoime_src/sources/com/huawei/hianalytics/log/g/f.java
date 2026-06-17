package com.huawei.hianalytics.log.g;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hianalytics.log.b.a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class f implements e {
    private com.huawei.hianalytics.log.c.a a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7144c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f7145d;

    private static class a implements Serializable, Comparator<File> {
        private a() {
        }

        a(AnonymousClass1 anonymousClass1) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return (int) (file.length() - file2.length());
        }
    }

    public f(com.huawei.hianalytics.log.c.a aVar, Throwable th, String str) {
        this.a = aVar;
        StringBuilder M = e.a.a.a.a.M(str);
        M.append(a.C0347a.b);
        this.f7144c = M.toString();
        this.f7145d = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.Closeable, java.io.OutputStreamWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.Closeable] */
    private void a() {
        FileOutputStream fileOutputStream;
        BufferedWriter bufferedWriter;
        File file = new File(this.f7144c, this.b);
        boolean a2 = com.huawei.hianalytics.log.f.a.a(file);
        ?? r0 = file;
        if (!a2) {
            String a3 = com.huawei.hianalytics.log.e.f.a();
            com.huawei.hianalytics.a.d.c(a3);
            r0 = com.huawei.hianalytics.log.f.a.a(this.f7144c, a3, com.huawei.hianalytics.a.d.f());
        }
        if (r0 == 0) {
            com.huawei.hianalytics.g.b.d("LogWrite", "writerLog():Failed to create file!");
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream((File) r0, true);
                try {
                    r0 = new OutputStreamWriter(fileOutputStream, "UTF-8");
                    try {
                        bufferedWriter = new BufferedWriter(r0);
                    } catch (FileNotFoundException unused) {
                    } catch (UnsupportedEncodingException unused2) {
                    } catch (IOException unused3) {
                    }
                    try {
                        bufferedWriter.append((CharSequence) String.format(Locale.getDefault(), "%s: %s/%s: %s", com.huawei.hianalytics.log.e.f.b(), this.a.a(), this.a.b(), this.a.c() + "\n" + Log.getStackTraceString(this.f7145d)));
                        bufferedWriter.flush();
                        com.huawei.hianalytics.log.e.d.a(9, bufferedWriter);
                        com.huawei.hianalytics.log.e.d.a(10, r0);
                        com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
                    } catch (FileNotFoundException unused4) {
                        bufferedWriter2 = bufferedWriter;
                        com.huawei.hianalytics.g.b.d("LogWrite", "writeLog() No files that need to be written!");
                        com.huawei.hianalytics.log.e.d.a(9, bufferedWriter2);
                        com.huawei.hianalytics.log.e.d.a(10, r0);
                        com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
                    } catch (UnsupportedEncodingException unused5) {
                        bufferedWriter2 = bufferedWriter;
                        com.huawei.hianalytics.g.b.d("LogWrite", "writeLog() OutputStreamWriter - Unsupported coding format");
                        com.huawei.hianalytics.log.e.d.a(9, bufferedWriter2);
                        com.huawei.hianalytics.log.e.d.a(10, r0);
                        com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
                    } catch (IOException unused6) {
                        bufferedWriter2 = bufferedWriter;
                        com.huawei.hianalytics.g.b.d("LogWrite", "writeLog append IO Exception !");
                        com.huawei.hianalytics.log.e.d.a(9, bufferedWriter2);
                        com.huawei.hianalytics.log.e.d.a(10, r0);
                        com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter2 = bufferedWriter;
                        com.huawei.hianalytics.log.e.d.a(9, bufferedWriter2);
                        com.huawei.hianalytics.log.e.d.a(10, r0);
                        com.huawei.hianalytics.log.e.d.a(0, fileOutputStream);
                        throw th;
                    }
                } catch (FileNotFoundException unused7) {
                    r0 = 0;
                } catch (UnsupportedEncodingException unused8) {
                    r0 = 0;
                } catch (IOException unused9) {
                    r0 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException unused10) {
            r0 = 0;
            fileOutputStream = null;
        } catch (UnsupportedEncodingException unused11) {
            r0 = 0;
            fileOutputStream = null;
        } catch (IOException unused12) {
            r0 = 0;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            r0 = 0;
            fileOutputStream = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String a2;
        File file;
        File file2 = new File(this.f7144c);
        if (file2.exists()) {
            String str = this.f7144c;
            String d2 = com.huawei.hianalytics.a.d.d();
            this.b = d2;
            if (TextUtils.isEmpty(d2)) {
                File[] listFiles = new File(str).listFiles();
                com.huawei.hianalytics.log.e.a.a(str);
                if (listFiles == null || listFiles.length == 0) {
                    a2 = com.huawei.hianalytics.log.e.f.a();
                } else {
                    if (listFiles.length == 1) {
                        file = listFiles[0];
                    } else {
                        File[] a3 = com.huawei.hianalytics.log.f.a.a(listFiles);
                        Arrays.sort(a3, new a(null));
                        file = a3[0];
                    }
                    a2 = file.getName();
                }
                this.b = a2;
            }
        } else if (!file2.mkdirs()) {
            com.huawei.hianalytics.g.b.d("LogWrite", "create logsfile fail!");
            return;
        } else {
            String a4 = com.huawei.hianalytics.log.e.f.a();
            this.b = a4;
            com.huawei.hianalytics.a.d.c(a4);
        }
        synchronized (f.class) {
            a();
        }
    }
}
