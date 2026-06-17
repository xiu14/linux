package com.bytedance.android.service.manager.permission.boot;

import android.app.Activity;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PermissionBootRequestParam {
    private Activity curActivity;
    private JSONObject dialogFormData;
    private IPermissionBootDialog permissionBootDialogAbility;
    private String sceneCategory;
    private String scenes;

    public PermissionBootRequestParam(String str, String str2) {
        this.scenes = str;
        this.sceneCategory = str2;
    }

    public Activity getCurActivity() {
        return this.curActivity;
    }

    public JSONObject getDialogFormData() {
        return this.dialogFormData;
    }

    public IPermissionBootDialog getPermissionBootDialogAbility() {
        return this.permissionBootDialogAbility;
    }

    public String getSceneCategory() {
        return this.sceneCategory;
    }

    public String getScenes() {
        return this.scenes;
    }

    public PermissionBootRequestParam setCurActivity(Activity activity) {
        this.curActivity = activity;
        return this;
    }

    public PermissionBootRequestParam setDialogFormData(JSONObject jSONObject) {
        this.dialogFormData = jSONObject;
        return this;
    }

    public PermissionBootRequestParam setPermissionBootDialogAbility(IPermissionBootDialog iPermissionBootDialog) {
        this.permissionBootDialogAbility = iPermissionBootDialog;
        return this;
    }

    public PermissionBootRequestParam setSceneCategory(String str) {
        this.sceneCategory = str;
        return this;
    }

    public PermissionBootRequestParam setScenes(String str) {
        this.scenes = str;
        return this;
    }
}
