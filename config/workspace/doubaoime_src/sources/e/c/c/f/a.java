package e.c.c.f;

import e.c.c.d.f;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    public static final Map<String, String> a = f.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    public static boolean a(String str) {
        return str != null && str.startsWith("video/");
    }
}
