package com.bytedance.crash.dumper.j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
class e implements d {
    private final FileOutputStream a;

    private e(String str) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
        } catch (IOException unused) {
            fileOutputStream = null;
        }
        this.a = fileOutputStream;
    }

    public static e e(String str) {
        return new e(str);
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void a(int i) {
        b(Integer.toString(i));
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void b(String str) {
        FileOutputStream fileOutputStream = this.a;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.write(str.getBytes());
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void c(char[] cArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(cArr);
        b(sb.toString());
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void d(long j) {
        b(Long.toString(j));
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void flush() {
        FileOutputStream fileOutputStream = this.a;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bytedance.crash.dumper.j.d
    public void release() {
        FileOutputStream fileOutputStream = this.a;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
