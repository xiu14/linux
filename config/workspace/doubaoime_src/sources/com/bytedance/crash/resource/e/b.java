package com.bytedance.crash.resource.e;

import android.util.Log;
import com.bytedance.crash.resource.c;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b extends c {
    private String h;
    private final String[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JSONArray jSONArray) {
        super(21, 35, 0);
        this.h = null;
        this.i = new String[]{"enableXasan", DownloadSettingKeys.DEBUG, "maxSimultaneousAlloc", "sampleRate", "monitorAllocSize", "monitorType", "monitorBugType", "soName"};
        if (jSONArray == null || jSONArray.length() >= 10) {
            Log.e("XASAN", "Config Init fail");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            String[] strArr = this.i;
            if (i >= strArr.length) {
                break;
            }
            sb.append(strArr[i]);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(jSONArray.optString(i));
            sb.append("\n");
        }
        this.h = sb.toString();
        StringBuilder M = e.a.a.a.a.M("Config Init:");
        M.append(this.h);
        Log.d("XASAN", M.toString());
    }

    @Override // com.bytedance.crash.resource.c
    public String toString() {
        return this.h;
    }
}
