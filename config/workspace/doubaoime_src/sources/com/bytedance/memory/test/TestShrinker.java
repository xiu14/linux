package com.bytedance.memory.test;

import com.bytedance.memory.shrink.d;
import com.bytedance.memory.shrink.e;
import com.bytedance.memory.shrink.f;
import e.a.a.a.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class TestShrinker {
    public static void main(String[] strArr) throws IOException {
        FileInputStream fileInputStream;
        File file = new File("/Users/Liuzhao.Future/Downloads/线上Hprof文件/helo/dump.hprof");
        File file2 = new File("/Users/Liuzhao.Future/Downloads/线上Hprof文件/helo/dump1211shrink2.hprof");
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    new d(new BufferedInputStream(fileInputStream)).a(new e(new f(bufferedOutputStream2)));
                    try {
                        bufferedOutputStream2.close();
                    } catch (Throwable unused) {
                    }
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    PrintStream printStream = System.out;
                    StringBuilder M = a.M("origin length ");
                    M.append((file.length() / 1000) / 1000);
                    M.append(" shrinklength ");
                    M.append((file2.length() / 1000) / 1000);
                    printStream.println(M.toString());
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (fileInputStream == null) {
                        throw th;
                    }
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }
}
