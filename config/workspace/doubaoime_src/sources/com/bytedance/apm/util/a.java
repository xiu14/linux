package com.bytedance.apm.util;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class a {
    public static String a;

    public static String a(int i) {
        BufferedReader bufferedReader;
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            try {
                String readLine = bufferedReader.readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    readLine = readLine.trim();
                }
                a = readLine;
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return readLine;
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static boolean b(Context context) {
        String a2 = a(Process.myPid());
        return (a2 == null || !a2.contains(Constants.COLON_SEPARATOR)) && a2 != null && a2.equals(context.getPackageName());
    }
}
