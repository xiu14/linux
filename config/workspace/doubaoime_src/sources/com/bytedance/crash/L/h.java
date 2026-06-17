package com.bytedance.crash.L;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
class h implements FilenameFilter {
    h(j jVar) {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (split.length == 2) {
            try {
                Long.parseLong(split[0]);
                Integer.parseInt(split[1]);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
