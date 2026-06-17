package com.bytedance.android.service.manager.pull;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import e.a.a.a.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PullConfiguration {
    public static final String PROCESS_NAME_MAIN = "main";
    public static final String PROCESS_NAME_PUSH = "push";
    public static final String PROCESS_NAME_SMP = "smp";
    public static final int SCENE_ALLIANCE = 2;
    public static final int SCENE_ONLINE = 1;
    private String did;
    private String fromAid = "";
    private String fromDid = "";
    private boolean isActive;
    private JSONObject mSettingsFromCompose;
    private String processName;
    private int sceneId;

    public PullConfiguration(String str, int i, String str2) {
        this.processName = str;
        this.sceneId = i;
        this.did = str2;
    }

    public String getDid() {
        return this.did;
    }

    public String getFromAid() {
        return this.fromAid;
    }

    public String getFromDid() {
        return this.fromDid;
    }

    public String getProcessName() {
        return this.processName;
    }

    public String getPullAidAndDids() {
        if (!TextUtils.isEmpty(this.fromAid) && !TextUtils.isEmpty(this.fromDid)) {
            return this.fromAid + Constants.COLON_SEPARATOR + this.fromDid;
        }
        if (TextUtils.isEmpty(this.fromAid) && TextUtils.isEmpty(this.fromDid)) {
            return "";
        }
        if (!TextUtils.isEmpty(this.fromAid)) {
            return a.J(new StringBuilder(), this.fromAid, Constants.COLON_SEPARATOR);
        }
        StringBuilder M = a.M(Constants.COLON_SEPARATOR);
        M.append(this.fromDid);
        return M.toString();
    }

    public int getSceneId() {
        return this.sceneId;
    }

    public JSONObject getSettingsFromCompose() {
        return this.mSettingsFromCompose;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public PullConfiguration setDid(String str) {
        this.did = str;
        return this;
    }

    public PullConfiguration setFromAid(String str) {
        this.fromAid = str;
        return this;
    }

    public PullConfiguration setFromDid(String str) {
        this.fromDid = str;
        return this;
    }

    public PullConfiguration setIsActive(boolean z) {
        this.isActive = z;
        return this;
    }

    public PullConfiguration setSettingsFromCompose(JSONObject jSONObject) {
        this.mSettingsFromCompose = jSONObject;
        return this;
    }
}
