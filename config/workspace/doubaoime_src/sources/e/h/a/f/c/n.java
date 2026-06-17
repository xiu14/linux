package e.h.a.f.c;

import com.ss.android.socialbase.downloader.constants.DBDefinition;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n extends e.h.a.f.a {
    private e.h.a.d.g b;

    @Override // e.h.a.f.a
    public String f() {
        return "plugin";
    }

    @Override // e.h.a.f.a
    public boolean g(e.h.a.e.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.c());
        if (this.b == null) {
            return false;
        }
        this.b.f(jSONObject.optString(DBDefinition.PACKAGE_NAME), jSONObject.optInt("versionCode"), jSONObject.optString("url"), jSONObject.optString("md5"), jSONObject.optBoolean("wifiOnly", false));
        e.h.a.e.c c2 = this.b.c();
        if (c2.d()) {
            j(aVar);
            return true;
        }
        i(c2.b(), c2.c(), aVar);
        return true;
    }
}
