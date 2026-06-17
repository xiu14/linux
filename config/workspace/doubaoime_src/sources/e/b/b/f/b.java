package e.b.b.f;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends com.bytedance.apm6.perf.base.model.a {
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f9410c;

    /* renamed from: d, reason: collision with root package name */
    private long f9411d;

    /* renamed from: e, reason: collision with root package name */
    private long f9412e;

    /* renamed from: f, reason: collision with root package name */
    private long f9413f;

    /* renamed from: g, reason: collision with root package name */
    private long f9414g;
    private long h;
    private double i;
    private JSONArray j;
    private JSONArray k;
    private JSONArray l;
    private JSONArray m;
    private int n = 262144;

    public b(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d2, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4) {
        this.b = j;
        this.f9410c = j2;
        this.f9411d = j3;
        this.f9412e = j4;
        this.f9413f = j5;
        this.f9414g = j6;
        this.h = j7;
        this.i = d2;
        this.j = jSONArray;
        this.k = jSONArray2;
        this.l = jSONArray3;
        this.m = jSONArray4;
    }

    private JSONArray i(JSONArray jSONArray, int i) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            if (jSONObject.getLong(MonitorConstants.SIZE) >= i) {
                JSONArray optJSONArray = jSONObject.optJSONArray("next_disk");
                if (optJSONArray != null) {
                    JSONArray i3 = i(optJSONArray, i);
                    if (i3.length() > 0) {
                        jSONObject.put("next_disk", i3);
                    } else {
                        jSONObject.remove("next_disk");
                    }
                }
                jSONArray2.put(jSONObject);
            }
        }
        return jSONArray2;
    }

    @Override // e.b.b.k.c
    public boolean b() {
        return true;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject d() {
        int i;
        long j;
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray2 = this.j;
            if (jSONArray2 != null) {
                jSONObject.put("top_usage", jSONArray2);
            }
            JSONArray jSONArray3 = this.k;
            if (jSONArray3 != null) {
                jSONObject.put("exception_folders", jSONArray3);
            }
            JSONArray jSONArray4 = this.l;
            if (jSONArray4 != null) {
                jSONObject.put("outdated_files", jSONArray4);
            }
            if (this.m != null) {
                int i2 = 0;
                try {
                    i = jSONObject.toString().getBytes("UTF-8").length;
                } catch (Exception unused) {
                    i = 0;
                }
                this.n = (262144 - i) - 12288;
                JSONArray jSONArray5 = this.m;
                if (jSONArray5 == null) {
                    jSONArray = new JSONArray();
                } else {
                    int i3 = 102400;
                    while (true) {
                        try {
                            j = jSONArray5.toString().getBytes("UTF-8").length;
                        } catch (Exception unused2) {
                            j = 0;
                        }
                        if (j <= this.n || i2 > 10) {
                            break;
                        }
                        try {
                            jSONArray5 = i(jSONArray5, i3);
                        } catch (JSONException unused3) {
                        }
                        i3 *= 2;
                        i2++;
                    }
                    jSONArray = jSONArray5;
                }
                this.m = jSONArray;
                jSONObject.put("disk_info", jSONArray);
            }
        } catch (Exception unused4) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", e.b.b.l.a.a.a().e());
            jSONObject.put("process_name", e.b.b.h.c.a.k());
            jSONObject.put("is_front", false);
            jSONObject.put("is_main_process", e.b.b.h.c.a.y());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            long j = this.b;
            if (j > 0) {
                jSONObject.put(RemoteMessageConst.DATA, j);
            }
            long j2 = this.f9410c;
            if (j2 > 0) {
                jSONObject.put("cache", j2);
            }
            long j3 = this.f9411d;
            if (j3 > 0) {
                jSONObject.put("total", j3);
            }
            long j4 = this.f9412e;
            if (j4 > 0) {
                jSONObject.put("rom_free", j4);
            }
            long j5 = this.f9413f;
            if (j5 > 0) {
                jSONObject.put("app_usage", j5);
            }
            long j6 = this.f9414g;
            if (j6 > 0) {
                jSONObject.put("total_capacity", j6);
            }
            long j7 = this.h;
            if (j7 > 0) {
                jSONObject.put("free_capacity", j7);
            }
            double d2 = this.i;
            if (d2 > 0.0d) {
                jSONObject.put("app_occupied_rate", d2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject g() {
        JSONObject b = e.b.b.l.a.a.a().b();
        try {
            e.b.b.n.b.a(b, e.b.b.l.a.a.a().d());
        } catch (Exception unused) {
        }
        return b;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected String h() {
        return "disk";
    }
}
