package com.bytedance.crash.resource.j;

import androidx.exifinterface.media.ExifInterface;
import com.bytedance.crash.N.h;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.vivo.push.PushClient;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d extends com.bytedance.crash.resource.c {
    private int h;
    private int i;
    protected int j;
    protected int k;
    protected final int l;
    protected boolean m;
    protected boolean n;
    private String o;
    private String p;
    private String q;
    private String r;

    public d(int i, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4) {
        super(23, 35, 3);
        int parseInt;
        this.h = 350;
        this.i = 650;
        this.j = 3000;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.o = "test";
        this.p = "0";
        this.q = "0";
        this.r = "0";
        if (h.g()) {
            this.l = 3;
            this.h = 0;
            this.i = 200;
            this.j = 1000;
            this.o = "new_test";
            this.q = ExifInterface.GPS_MEASUREMENT_3D;
            this.r = "5";
            this.k = 32;
            this.n = true;
            this.m = true;
            return;
        }
        this.l = i;
        if (jSONArray != null && jSONArray.length() == 2) {
            this.h = jSONArray.optInt(0);
            this.i = jSONArray.optInt(1);
        }
        if (jSONArray2 != null && jSONArray2.length() == 5) {
            int i2 = 0;
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                String optString = jSONArray2.optString(i3);
                if (i3 == 0) {
                    this.o = optString;
                } else if (i3 != 1) {
                    if (i3 == 2) {
                        parseInt = Integer.parseInt(optString) << 0;
                    } else if (i3 == 3) {
                        parseInt = Integer.parseInt(optString) << 1;
                    } else if (i3 == 4) {
                        this.r = optString;
                    }
                    i2 |= parseInt;
                } else {
                    String str = null;
                    if (optString != null) {
                        try {
                            Long valueOf = optString.endsWith("M") ? Long.valueOf(Long.parseLong(optString.substring(0, optString.indexOf("M"))) * DownloadConstants.KB * DownloadConstants.KB) : optString.endsWith("G") ? Long.valueOf(Long.parseLong(optString.substring(0, optString.indexOf("G"))) * DownloadConstants.KB * DownloadConstants.KB * DownloadConstants.KB) : optString.endsWith("K") ? Long.valueOf(Long.parseLong(optString.substring(0, optString.indexOf("K"))) * DownloadConstants.KB) : null;
                            if (valueOf != null) {
                                str = valueOf.toString();
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    this.p = str;
                }
            }
            this.q = String.valueOf(i2);
        }
        if (jSONArray3 != null) {
            this.k = 0;
            for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                this.k |= 1 << jSONArray3.optInt(i4);
            }
        }
        if (jSONArray4 == null || jSONArray4.length() != 2) {
            return;
        }
        for (int i5 = 0; i5 < jSONArray4.length(); i5++) {
            String optString2 = jSONArray4.optString(i5);
            if (i5 == 0) {
                this.n = PushClient.DEFAULT_REQUEST_ID.equals(optString2);
            } else if (i5 == 1 && this.n) {
                this.o = optString2;
            }
        }
    }

    public long b() {
        return this.i * DownloadConstants.KB;
    }

    public long c() {
        return this.h * DownloadConstants.KB;
    }

    @Override // com.bytedance.crash.resource.c
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("monitorType=");
        M.append(this.l);
        M.append("\nwaterLineMB=");
        M.append(this.h);
        M.append("\ndumpSizeMB=");
        M.append(this.i);
        M.append("\nmprotectProts=");
        M.append(this.k);
        M.append("\nmemType=");
        M.append(this.o);
        M.append("\nmemSize=");
        M.append(this.p);
        M.append("\nbacktraceRules=");
        M.append(this.q);
        M.append("\nmonitorRules=");
        M.append(this.r);
        M.append("\nsleepTime=");
        M.append(this.j);
        M.append("\ndebug=");
        M.append(this.m);
        M.append("\npEnable=");
        M.append(this.n);
        M.append("\n");
        return M.toString();
    }
}
