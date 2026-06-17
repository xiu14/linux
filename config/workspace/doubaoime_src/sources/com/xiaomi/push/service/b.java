package com.xiaomi.push.service;

import android.os.Bundle;
import android.util.SparseArray;
import com.xiaomi.push.service.ao;

/* loaded from: classes2.dex */
public class b {
    private static final SparseArray<ao.a<String, String, String>> a = new SparseArray<ao.a<String, String, String>>(6) { // from class: com.xiaomi.push.service.b.1
        {
            put(1, ao.f9315g);
            put(2, ao.f9314f);
            put(4, ao.f9313e);
            put(8, ao.b);
            put(16, ao.f9311c);
            put(32, ao.h);
        }
    };

    public static int a(String str, int i) {
        return ao.a(com.xiaomi.push.t.m841a(), str, null, a.get(i));
    }

    private static Bundle a(String str) {
        return ao.a(com.xiaomi.push.t.m841a(), str, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:7:0x0003, B:9:0x0009, B:12:0x001a, B:14:0x0027, B:17:0x002e, B:19:0x003a, B:22:0x0045, B:23:0x0048, B:25:0x0054, B:28:0x005f, B:29:0x0062, B:31:0x006e, B:34:0x007d, B:36:0x007f, B:38:0x008b, B:41:0x009a, B:43:0x009c, B:45:0x00a8, B:48:0x00b7, B:50:0x00b9, B:52:0x00c5, B:55:0x00d4, B:59:0x00d7, B:61:0x00dd, B:63:0x00e6, B:65:0x00ec, B:67:0x00f5, B:69:0x00fb, B:71:0x0104, B:73:0x010a, B:75:0x0113, B:77:0x0119, B:79:0x0122, B:81:0x0128, B:85:0x012e, B:88:0x011f, B:90:0x0110, B:92:0x0101, B:94:0x00f2, B:96:0x00e3, B:97:0x0015, B:3:0x0131), top: B:6:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:7:0x0003, B:9:0x0009, B:12:0x001a, B:14:0x0027, B:17:0x002e, B:19:0x003a, B:22:0x0045, B:23:0x0048, B:25:0x0054, B:28:0x005f, B:29:0x0062, B:31:0x006e, B:34:0x007d, B:36:0x007f, B:38:0x008b, B:41:0x009a, B:43:0x009c, B:45:0x00a8, B:48:0x00b7, B:50:0x00b9, B:52:0x00c5, B:55:0x00d4, B:59:0x00d7, B:61:0x00dd, B:63:0x00e6, B:65:0x00ec, B:67:0x00f5, B:69:0x00fb, B:71:0x0104, B:73:0x010a, B:75:0x0113, B:77:0x0119, B:79:0x0122, B:81:0x0128, B:85:0x012e, B:88:0x011f, B:90:0x0110, B:92:0x0101, B:94:0x00f2, B:96:0x00e3, B:97:0x0015, B:3:0x0131), top: B:6:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:7:0x0003, B:9:0x0009, B:12:0x001a, B:14:0x0027, B:17:0x002e, B:19:0x003a, B:22:0x0045, B:23:0x0048, B:25:0x0054, B:28:0x005f, B:29:0x0062, B:31:0x006e, B:34:0x007d, B:36:0x007f, B:38:0x008b, B:41:0x009a, B:43:0x009c, B:45:0x00a8, B:48:0x00b7, B:50:0x00b9, B:52:0x00c5, B:55:0x00d4, B:59:0x00d7, B:61:0x00dd, B:63:0x00e6, B:65:0x00ec, B:67:0x00f5, B:69:0x00fb, B:71:0x0104, B:73:0x010a, B:75:0x0113, B:77:0x0119, B:79:0x0122, B:81:0x0128, B:85:0x012e, B:88:0x011f, B:90:0x0110, B:92:0x0101, B:94:0x00f2, B:96:0x00e3, B:97:0x0015, B:3:0x0131), top: B:6:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:7:0x0003, B:9:0x0009, B:12:0x001a, B:14:0x0027, B:17:0x002e, B:19:0x003a, B:22:0x0045, B:23:0x0048, B:25:0x0054, B:28:0x005f, B:29:0x0062, B:31:0x006e, B:34:0x007d, B:36:0x007f, B:38:0x008b, B:41:0x009a, B:43:0x009c, B:45:0x00a8, B:48:0x00b7, B:50:0x00b9, B:52:0x00c5, B:55:0x00d4, B:59:0x00d7, B:61:0x00dd, B:63:0x00e6, B:65:0x00ec, B:67:0x00f5, B:69:0x00fb, B:71:0x0104, B:73:0x010a, B:75:0x0113, B:77:0x0119, B:79:0x0122, B:81:0x0128, B:85:0x012e, B:88:0x011f, B:90:0x0110, B:92:0x0101, B:94:0x00f2, B:96:0x00e3, B:97:0x0015, B:3:0x0131), top: B:6:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:7:0x0003, B:9:0x0009, B:12:0x001a, B:14:0x0027, B:17:0x002e, B:19:0x003a, B:22:0x0045, B:23:0x0048, B:25:0x0054, B:28:0x005f, B:29:0x0062, B:31:0x006e, B:34:0x007d, B:36:0x007f, B:38:0x008b, B:41:0x009a, B:43:0x009c, B:45:0x00a8, B:48:0x00b7, B:50:0x00b9, B:52:0x00c5, B:55:0x00d4, B:59:0x00d7, B:61:0x00dd, B:63:0x00e6, B:65:0x00ec, B:67:0x00f5, B:69:0x00fb, B:71:0x0104, B:73:0x010a, B:75:0x0113, B:77:0x0119, B:79:0x0122, B:81:0x0128, B:85:0x012e, B:88:0x011f, B:90:0x0110, B:92:0x0101, B:94:0x00f2, B:96:0x00e3, B:97:0x0015, B:3:0x0131), top: B:6:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.b.a(android.content.Context, java.lang.String):int");
    }
}
