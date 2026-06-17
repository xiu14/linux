package com.bytedance.crash;

import com.bytedance.crash.Npth;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class x {
    private static x a;

    public interface a {
    }

    x() {
        a = this;
    }

    public static void a(a aVar) {
        x xVar = a;
        if (xVar != null) {
            Npth.addAttachUserData(new w((Npth.b) xVar, aVar), CrashType.ALL);
        }
    }

    public static void b(Map<String, String> map) {
        x xVar = a;
        if (xVar != null) {
            Objects.requireNonNull((Npth.b) xVar);
            Npth.addTags(map);
        }
    }

    public static String c() {
        x xVar = a;
        if (xVar == null) {
            return "";
        }
        Objects.requireNonNull((Npth.b) xVar);
        return com.bytedance.crash.dumper.b.d();
    }

    public static void d() {
        x xVar = a;
        if (xVar != null) {
            Objects.requireNonNull(xVar);
        }
    }
}
