package com.huawei.hianalytics.log.b;

import java.io.File;

/* loaded from: classes2.dex */
public class a extends com.huawei.hianalytics.global.a {

    /* renamed from: com.huawei.hianalytics.log.b.a$a, reason: collision with other inner class name */
    public static class C0347a {
        public static final String a;
        public static final String b;

        /* renamed from: c, reason: collision with root package name */
        public static final String f7126c;

        /* renamed from: d, reason: collision with root package name */
        public static final String f7127d;

        static {
            StringBuilder sb = new StringBuilder();
            String str = File.separator;
            sb.append(str);
            sb.append("hianalytics");
            sb.append(str);
            sb.append("applog");
            String sb2 = sb.toString();
            a = sb2;
            b = e.a.a.a.a.t(sb2, str, "logs");
            f7126c = e.a.a.a.a.t(sb2, str, "logzips");
            f7127d = e.a.a.a.a.t(sb2, str, "bigzip");
        }
    }
}
