package com.bytedance.apm6.hub.z;

import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements e.b.b.f.d.b {
    private e.b.b.f.d.a a;

    class a implements com.bytedance.apm6.hub.z.j.b {
        a() {
        }

        @Override // com.bytedance.apm6.hub.z.j.b
        public void a(JSONObject jSONObject, boolean z) {
            c.a(c.this, jSONObject, z);
        }
    }

    public c() {
        com.bytedance.apm6.hub.z.j.a.g().h();
        com.bytedance.apm6.hub.z.j.a.g().i(new a());
    }

    static void a(c cVar, JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        Objects.requireNonNull(cVar);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("disk")) == null) {
            return;
        }
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-Disk", "parseConfig:" + optJSONObject);
        }
        e.b.b.f.d.a aVar = new e.b.b.f.d.a();
        aVar.w(optJSONObject.optInt("enable_upload", 0) == 1);
        if (optJSONObject.optInt("dump_threshold") > 0) {
            aVar.n(optJSONObject.optInt("dump_threshold") * DownloadConstants.KB * DownloadConstants.KB);
        }
        if (optJSONObject.optInt("abnormal_folder_size") > 0) {
            aVar.p(optJSONObject.optInt("abnormal_folder_size") * DownloadConstants.KB * DownloadConstants.KB);
        }
        aVar.o(optJSONObject.optInt("abnormal_file_size", 100) * DownloadConstants.KB);
        if (optJSONObject.optInt("dump_top_count") > 0) {
            aVar.t(optJSONObject.optInt("dump_top_count"));
        }
        aVar.u(optJSONObject.optInt("dump_outdated_count", 50));
        aVar.v(optJSONObject.optInt("dump_top_file_count", 20));
        aVar.s(optJSONObject.optInt("dump_exception_dir_count", 50));
        if (optJSONObject.optInt("outdated_days") > 0) {
            aVar.r(optJSONObject.optInt("outdated_days") * com.heytap.mcssdk.constant.a.f6888f);
        }
        aVar.m(com.bytedance.android.input.k.b.a.t0(optJSONObject, "disk_customed_paths"));
        aVar.q(com.bytedance.android.input.k.b.a.s0(optJSONObject, "ignored_relative_paths"));
        aVar.l(com.bytedance.android.input.k.b.a.s0(optJSONObject, "compliance_relative_paths"));
        cVar.a = aVar;
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-Disk", "parseConfig:" + optJSONObject);
        }
        e.b.b.f.a.d().f(cVar.a);
    }

    @Override // e.b.b.f.d.b
    public e.b.b.f.d.a getConfig() {
        return this.a;
    }
}
