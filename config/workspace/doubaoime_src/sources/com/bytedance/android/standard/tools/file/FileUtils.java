package com.bytedance.android.standard.tools.file;

import e.b.a.a.a.a.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class FileUtils {

    public enum ImageType {
        UNKNOWN,
        JPG,
        PNG,
        GIF
    }

    public static boolean a(InputStream inputStream, String str, String str2) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists() && !file.mkdirs()) {
                    try {
                        inputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return false;
                }
                fileOutputStream = new FileOutputStream(new File(file, str2));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            inputStream.close();
                            try {
                                inputStream.close();
                                return true;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                return true;
                            }
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStream2 = fileOutputStream;
                    a.a("FileUtils", "save inputstream error: " + e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        inputStream.close();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        throw th;
                    }
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
