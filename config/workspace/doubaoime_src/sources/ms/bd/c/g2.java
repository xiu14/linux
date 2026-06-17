package ms.bd.c;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g2 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f10376e = (String) y2.a(16777217, 0, 0, "2057dc", new byte[]{55});

    /* renamed from: f, reason: collision with root package name */
    public static final String f10377f = (String) y2.a(16777217, 0, 0, "92c2b8", new byte[]{58});

    /* renamed from: g, reason: collision with root package name */
    public static final String f10378g = (String) y2.a(16777217, 0, 0, "3954fd", new byte[]{49});
    public static final String h = (String) y2.a(16777217, 0, 0, "9e7806", new byte[]{46});
    public static final String i = (String) y2.a(16777217, 0, 0, "0dd51b", new byte[]{34});
    public final int a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10379c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f10380d;

    public g2(int i2, String str, String str2, Throwable th) {
        this.a = i2;
        this.b = str;
        this.f10379c = str2;
        this.f10380d = th;
    }

    public final String[] a() {
        String str;
        String str2;
        String str3;
        String valueOf = String.valueOf(this.a);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f10376e, System.currentTimeMillis());
            jSONObject.put(f10377f, this.a);
            if (this.f10380d != null) {
                str2 = f10378g;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f10380d.getMessage());
                StackTraceElement[] stackTrace = this.f10380d.getStackTrace();
                int length = stackTrace.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    int i4 = i3 + 1;
                    if (i3 >= 3) {
                        break;
                    }
                    sb.append("\n");
                    sb.append(stackTraceElement.toString());
                    i2++;
                    i3 = i4;
                }
                str3 = sb.toString();
            } else {
                jSONObject.put(h, this.b);
                str2 = i;
                str3 = this.f10379c;
            }
            jSONObject.put(str2, str3);
            str = Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2);
        } catch (Throwable unused) {
            str = "";
        }
        return new String[]{valueOf, str};
    }
}
