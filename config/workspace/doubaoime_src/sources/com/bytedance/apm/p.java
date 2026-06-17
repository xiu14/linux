package com.bytedance.apm;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p implements com.bytedance.services.apm.api.j {
    private String a;
    private volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f3466c;

    /* renamed from: d, reason: collision with root package name */
    private long f3467d;

    /* renamed from: e, reason: collision with root package name */
    private String f3468e;

    @Override // com.bytedance.services.apm.api.j
    @Nullable
    public Pair<byte[], String> a() {
        FileOutputStream fileOutputStream = null;
        if (!this.b) {
            this.f3466c = com.bytedance.android.input.k.b.a.B0(new File(e.b.b.n.a.a().getFilesDir(), "monitor_dict"));
            SharedPreferences sharedPreferences = e.b.b.n.a.a().getSharedPreferences("dict_interval", 0);
            this.f3467d = sharedPreferences.getLong("dict_interval", 0L);
            this.f3468e = sharedPreferences.getString("dict_version", null);
            this.b = true;
        }
        byte[] bArr = this.f3466c;
        if (bArr == null || System.currentTimeMillis() - this.f3467d > 604800000) {
            HashMap hashMap = new HashMap(e.b.b.h.c.a.u());
            hashMap.put("slardar_zstd_dict_type", "monitor");
            hashMap.put("zstd_client_code_version", "dynamic");
            hashMap.put(DownloadHelper.CONTENT_TYPE, "application/json; charset=utf-8");
            try {
                com.bytedance.services.apm.api.c e2 = e.b.b.h.c.a.e(e.b.b.n.e.a(this.a, hashMap), hashMap, new JSONObject(hashMap).toString().getBytes());
                if (e2 != null && e2.b() != null) {
                    JSONObject jSONObject = new JSONObject(new String(e2.b()));
                    String string = jSONObject.getString("dict_version");
                    String string2 = jSONObject.getString("dict");
                    if (jSONObject.getInt("code") == 200) {
                        byte[] decode = Base64.decode(string2, 0);
                        File file = new File(e.b.b.n.a.a().getFilesDir(), "monitor_dict");
                        if (decode != null && decode.length != 0) {
                            try {
                                file.getParentFile().mkdirs();
                                try {
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    file.exists();
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                    try {
                                        fileOutputStream2.write(decode);
                                        fileOutputStream2.flush();
                                        fileOutputStream2.close();
                                    } catch (Exception unused) {
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        this.f3468e = string;
                                        this.f3466c = decode;
                                        this.f3467d = System.currentTimeMillis();
                                        e.b.b.n.a.a().getSharedPreferences("dict_interval", 0).edit().putLong("dict_interval", this.f3467d).putString("dict_version", string).commit();
                                        bArr = this.f3466c;
                                        return new Pair<>(bArr, this.f3468e);
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable unused4) {
                            }
                        }
                        this.f3468e = string;
                        this.f3466c = decode;
                        this.f3467d = System.currentTimeMillis();
                        e.b.b.n.a.a().getSharedPreferences("dict_interval", 0).edit().putLong("dict_interval", this.f3467d).putString("dict_version", string).commit();
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            bArr = this.f3466c;
        }
        return new Pair<>(bArr, this.f3468e);
    }

    @Override // com.bytedance.services.apm.api.j
    public void b(String str) {
        this.a = e.a.a.a.a.t("https://", str, "/monitor/collect/zstd_dict/");
    }
}
