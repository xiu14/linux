package e.b.b.e.a.i;

import android.util.Log;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private volatile boolean a;
    private File b;

    class a implements FileFilter {
        a(d dVar) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            boolean z = true;
            try {
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(".bin");
                if (lastIndexOf != -1) {
                    String substring = name.substring(0, lastIndexOf);
                    long currentTimeMillis = System.currentTimeMillis();
                    long parseLong = Long.parseLong(substring);
                    if (currentTimeMillis - (parseLong >= 0 ? parseLong >> 16 : 0L) < 604800000) {
                        z = false;
                    }
                }
            } catch (Throwable unused) {
            }
            if (z) {
                if (e.b.b.n.a.b()) {
                    List<String> list = e.b.b.e.a.a.a;
                    StringBuilder M = e.a.a.a.a.M("deleteExpireHeader:");
                    M.append(file.getName());
                    e.b.b.n.g.b.a("APM-Slardar", M.toString());
                }
                com.bytedance.android.input.k.b.a.t(file);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static final d a = new d();
    }

    private synchronized void c() {
        if (this.a) {
            return;
        }
        try {
            File file = new File(e.b.b.e.a.b.e(), "header");
            this.b = file;
            if (!file.exists()) {
                this.b.mkdirs();
            }
        } catch (Throwable th) {
            e.b.b.n.g.b.b("APM", "header store init error " + th.toString());
        }
        this.a = true;
    }

    void a() {
        c();
        File file = this.b;
        if (file == null) {
            return;
        }
        file.listFiles(new a(this));
    }

    e.b.b.e.a.i.a b(String str) {
        byte[] B0;
        c();
        if (this.b == null || (B0 = com.bytedance.android.input.k.b.a.B0(new File(this.b, e.a.a.a.a.s(str, ".bin")))) == null) {
            return null;
        }
        try {
            e.b.b.e.a.i.a aVar = new e.b.b.e.a.i.a();
            JSONObject jSONObject = new JSONObject(new String(B0));
            aVar.i0(e.b.b.n.b.g(jSONObject, "version_code"));
            aVar.j0(e.b.b.n.b.g(jSONObject, "version_name"));
            aVar.S(e.b.b.n.b.g(jSONObject, "manifest_version_code"));
            aVar.g0(e.b.b.n.b.g(jSONObject, "update_version_code"));
            aVar.H(e.b.b.n.b.g(jSONObject, "app_version"));
            aVar.W(e.b.b.n.b.g(jSONObject, RomInfo.KEY_OS_TYPE));
            aVar.P(e.b.b.n.b.g(jSONObject, "device_platform"));
            aVar.X(e.b.b.n.b.g(jSONObject, RomInfo.KEY_ROM_OS_VERSION));
            aVar.G(e.b.b.n.b.e(jSONObject, RomInfo.KEY_ROM_OS_API));
            aVar.O(e.b.b.n.b.g(jSONObject, HardwareInfo.KEY_HW_VENDOR_MODEL));
            aVar.L(e.b.b.n.b.g(jSONObject, HardwareInfo.KEY_HW_VENDOR_BRAND));
            aVar.N(e.b.b.n.b.g(jSONObject, HardwareInfo.KEY_HW_VENDOR_MANUFACTURER));
            aVar.a0(e.b.b.n.b.g(jSONObject, "process_name"));
            aVar.d0(e.b.b.n.b.f(jSONObject, WsConstants.KEY_SESSION_ID));
            aVar.c0(e.b.b.n.b.g(jSONObject, "rom_version"));
            aVar.Y(e.b.b.n.b.g(jSONObject, "package"));
            aVar.T(e.b.b.n.b.g(jSONObject, MonitorConstants.EXTRA_MONITOR_VERSION));
            aVar.I(e.b.b.n.b.g(jSONObject, "channel"));
            aVar.F(e.b.b.n.b.e(jSONObject, WsConstants.KEY_APP_ID));
            aVar.M(e.b.b.n.b.g(jSONObject, "device_id"));
            aVar.Z(e.b.b.n.b.f(jSONObject, "phone_startup_time"));
            aVar.b0(e.b.b.n.b.g(jSONObject, "release_build"));
            aVar.f0(e.b.b.n.b.f(jSONObject, "uid"));
            aVar.h0(e.b.b.n.b.g(jSONObject, "verify_info"));
            aVar.K(e.b.b.n.b.g(jSONObject, "current_update_version_code"));
            if (jSONObject.has("config_time")) {
                aVar.J(e.b.b.n.b.e(jSONObject, "config_time"));
            }
            try {
                aVar.R(new JSONObject((String) jSONObject.remove("filters")));
            } catch (Exception unused) {
            }
            aVar.e0(jSONObject);
            return aVar;
        } catch (Exception unused2) {
            return null;
        }
    }

    void d(String str, e.b.b.e.a.i.a aVar) {
        JSONObject b2;
        c();
        if (this.b == null || (b2 = e.b(aVar)) == null) {
            return;
        }
        File file = new File(this.b, e.a.a.a.a.s(str, ".bin"));
        FileChannel fileChannel = null;
        try {
            fileChannel = new FileOutputStream(file).getChannel();
            fileChannel.write(ByteBuffer.wrap(b2.toString().getBytes()));
        } catch (Throwable th) {
            try {
                Log.e("APM", "header couldn't write file" + th.getMessage());
                if (fileChannel == null) {
                    return;
                }
            } catch (Throwable th2) {
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
        try {
            fileChannel.close();
        } catch (Throwable unused2) {
        }
    }
}
