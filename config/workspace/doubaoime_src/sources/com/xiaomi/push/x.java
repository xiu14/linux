package com.xiaomi.push;

import android.util.Log;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class x {
    private static final HashMap<String, String> a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put("FFD8FF", "jpg");
        hashMap.put("89504E47", "png");
        hashMap.put("47494638", "gif");
        hashMap.put("474946", "gif");
        hashMap.put("424D", "bmp");
    }

    public static long a(File file) {
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                j += listFiles[i].isDirectory() ? a(listFiles[i]) : listFiles[i].length();
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Get folder size error: ");
            M.append(e2.getMessage());
            Log.e("FileUtils", M.toString());
        }
        return j;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m849a(File file) {
        long length;
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists()) {
                return true;
            }
            if (file.isDirectory()) {
                length = a(file);
            } else {
                length = file.length();
            }
            return length < 104857600;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Check if internal file can be written error :");
            M.append(e2.getMessage());
            Log.e("FileUtils", M.toString());
            return false;
        }
    }
}
