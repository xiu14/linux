package com.bytedance.android.input.environment.api;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes.dex */
public interface IProjectMode extends IService {
    void androidLog(int i, String str, String str2, Throwable th);

    Fragment createFragment();

    boolean isProjectMode();

    void openProjectPage(Context context);
}
