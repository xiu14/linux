package com.bytedance.android.input.basic.data_storage.api;

import com.bytedance.android.input.basic.data_storage.api.ImeKv;

/* loaded from: classes.dex */
public enum KvRepoStrategy {
    DEFAULT_SINGLE_PROCESS("single_process_common", ImeKv.ProcessMode.SINGLE),
    DEFAULT_MULTI_PROCESS("multi_process_common", ImeKv.ProcessMode.MULTI);

    private final ImeKv.ProcessMode processMode;
    private final String repoName;

    KvRepoStrategy(String str, ImeKv.ProcessMode processMode) {
        this.repoName = str;
        this.processMode = processMode;
    }

    public final ImeKv.ProcessMode getProcessMode() {
        return this.processMode;
    }

    public final String getRepoName() {
        return this.repoName;
    }
}
