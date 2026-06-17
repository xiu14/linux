package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
class dq {
    private static String a = "/MiPushLog";

    /* renamed from: a, reason: collision with other field name */
    private int f273a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f276a;

    /* renamed from: b, reason: collision with other field name */
    private String f277b;

    /* renamed from: c, reason: collision with root package name */
    private String f9045c;

    /* renamed from: a, reason: collision with other field name */
    @SuppressLint({"SimpleDateFormat"})
    private final SimpleDateFormat f274a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int b = 2097152;

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<File> f275a = new ArrayList<>();

    dq() {
    }

    dq a(Date date, Date date2) {
        if (date.after(date2)) {
            this.f277b = this.f274a.format(date2);
            this.f9045c = this.f274a.format(date);
        } else {
            this.f277b = this.f274a.format(date);
            this.f9045c = this.f274a.format(date2);
        }
        return this;
    }

    void a(int i) {
        if (i != 0) {
            this.b = i;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    dq m252a(File file) {
        if (file.exists()) {
            this.f275a.add(file);
        }
        return this;
    }

    private void a(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) {
        char[] cArr = new char[4096];
        int read = bufferedReader.read(cArr);
        boolean z = false;
        while (read != -1 && !z) {
            String str = new String(cArr, 0, read);
            Matcher matcher = pattern.matcher(str);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= read || !matcher.find(i)) {
                    break;
                }
                int start = matcher.start();
                String substring = str.substring(start, this.f277b.length() + start);
                if (!this.f276a) {
                    if (substring.compareTo(this.f277b) >= 0) {
                        this.f276a = true;
                        i2 = start;
                    }
                } else if (substring.compareTo(this.f9045c) > 0) {
                    z = true;
                    read = start;
                    break;
                }
                int indexOf = str.indexOf(10, start);
                i = indexOf != -1 ? start + indexOf : this.f277b.length() + start;
            }
            if (this.f276a) {
                int i3 = read - i2;
                this.f273a += i3;
                if (z) {
                    bufferedWriter.write(cArr, i2, i3);
                    return;
                } else {
                    bufferedWriter.write(cArr, i2, i3);
                    if (this.f273a > this.b) {
                        return;
                    }
                }
            }
            read = bufferedReader.read(cArr);
        }
    }

    private void a(File file) {
        BufferedReader bufferedReader;
        Pattern compile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        BufferedReader bufferedReader2 = null;
        try {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter.write("model :" + l.a() + "; os :" + k.e() + "; uid :" + com.xiaomi.push.service.bi.m780a() + "; lng :" + Locale.getDefault().toString() + "; sdk :" + com.xiaomi.push.service.f.a() + "; andver :" + Build.VERSION.SDK_INT + "\n");
                    this.f273a = 0;
                    Iterator<File> it2 = this.f275a.iterator();
                    while (it2.hasNext()) {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(it2.next())));
                        try {
                            a(bufferedReader, bufferedWriter, compile);
                            bufferedReader.close();
                            bufferedReader2 = bufferedReader;
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            bufferedReader2 = bufferedWriter;
                            com.xiaomi.channel.commonutils.logger.c.c("LOG: filter error = " + e.getMessage());
                            y.a(bufferedReader2);
                            y.a(bufferedReader);
                            return;
                        } catch (IOException e3) {
                            e = e3;
                            bufferedReader2 = bufferedWriter;
                            com.xiaomi.channel.commonutils.logger.c.c("LOG: filter error = " + e.getMessage());
                            y.a(bufferedReader2);
                            y.a(bufferedReader);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedWriter;
                            y.a(bufferedReader2);
                            y.a(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedWriter.write(ct.a().c());
                    y.a(bufferedWriter);
                    y.a(bufferedReader2);
                } catch (FileNotFoundException e4) {
                    e = e4;
                    bufferedReader = bufferedReader2;
                } catch (IOException e5) {
                    e = e5;
                    bufferedReader = bufferedReader2;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e6) {
            e = e6;
            bufferedReader = null;
        } catch (IOException e7) {
            e = e7;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    File a(Context context, Date date, Date date2, File file) {
        File file2;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            file2 = dp.a(context);
            if (file2 == null) {
                return null;
            }
            m252a(new File(file2, "xmsf.log.1"));
            m252a(new File(file2, "xmsf.log"));
        } else {
            File file3 = new File(context.getFilesDir() + a);
            if (!x.m849a(file3)) {
                return null;
            }
            m252a(new File(file3, "log0.txt"));
            m252a(new File(file3, "log1.txt"));
            file2 = file3;
        }
        if (!file2.isDirectory()) {
            return null;
        }
        File file4 = new File(file, date.getTime() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + date2.getTime() + ".zip");
        if (file4.exists()) {
            return null;
        }
        a(date, date2);
        long currentTimeMillis = System.currentTimeMillis();
        File file5 = new File(file, "log.txt");
        a(file5);
        StringBuilder M = e.a.a.a.a.M("LOG: filter cost = ");
        M.append(System.currentTimeMillis() - currentTimeMillis);
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        if (file5.exists()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            y.a(file4, file5);
            com.xiaomi.channel.commonutils.logger.c.c("LOG: zip cost = " + (System.currentTimeMillis() - currentTimeMillis2));
            file5.delete();
            if (file4.exists()) {
                return file4;
            }
        }
        return null;
    }
}
