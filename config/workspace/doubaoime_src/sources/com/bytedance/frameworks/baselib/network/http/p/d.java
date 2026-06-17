package com.bytedance.frameworks.baselib.network.http.p;

import java.io.IOException;

/* loaded from: classes.dex */
public class d extends IOException {
    public d(int i, long j) {
        super("Download file too large: " + j + " exceed maxsize: " + i);
    }
}
