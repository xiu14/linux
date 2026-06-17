package com.bytedance.push.pull;

import com.bytedance.android.service.manager.push.PushExternalService;

/* loaded from: classes2.dex */
public enum PullScene {
    SCENE_COLD_LAUNCH(PushExternalService.SIGNAL_SCENE_APP_LAUNCH),
    SCENE_SWITCH_TO_BACKGROUND("switch_to_background"),
    SCENE_SWITCH_TO_FOREGROUND("switch_to_foreground");

    public String sceneStr;

    PullScene(String str) {
        this.sceneStr = str;
    }
}
