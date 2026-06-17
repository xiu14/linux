package com.diggo.sdk;

import android.app.Application;
import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DigGo {
    private static final String CONFIG_FILE = "digGo_config";
    private static final IDigGo digGo = null;
    private static final IMessageHandler handler = new IMessageHandler() { // from class: com.diggo.sdk.DigGo.1
        @Override // com.diggo.sdk.IMessageHandler
        public void onError(String str) {
        }

        @Override // com.diggo.sdk.IMessageHandler
        public void onMessage(String str) {
        }

        @Override // com.diggo.sdk.IMessageHandler
        public void onProgress(String str, int i) {
        }
    };
    public static int version = 1;

    static class DefaultProperties implements IDigGo {
        DefaultProperties() {
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo addFlipperPlugin(String str) {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo addFlipperPlugin(String str, JSONObject jSONObject) {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo addLensHookPlugin(String str, String[] strArr) {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo disableAutoRun(boolean z) {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo enableFlipper(boolean z) {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo enableLens(boolean z) {
            return this;
        }

        @Override // com.diggo.sdk.ILens
        public int getDiggoVersion() {
            return 0;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public void init() {
        }

        @Override // com.diggo.sdk.IDigGoInit
        public void init(boolean z) {
        }

        @Override // com.diggo.sdk.IDigGoInit
        public boolean isInitialized() {
            return false;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo setAutoRunDelayTime(int i) {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo setBuiltInMode() {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo setDescriptor(IObjectDescriptor iObjectDescriptor) {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo setLaunchEndViewId(int i) {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo setLaunchEndViewIds(int[] iArr) {
            return this;
        }

        @Override // com.diggo.sdk.IDigGoInit
        public IDigGo setViewDebugger(IViewDebug iViewDebug) {
            return this;
        }

        @Override // com.diggo.sdk.ILens
        public void showLens(Context context) {
        }

        @Override // com.diggo.sdk.ILens
        public void watchLifecycle() {
        }

        @Override // com.diggo.sdk.ILens
        public void watchObject(String str, Object obj) {
        }
    }

    public static IDigGoInit config(Application application, boolean z, boolean z2) {
        return new DefaultProperties();
    }

    public static IMessageHandler getMessageHandler() {
        return handler;
    }

    public static boolean isInitialized() {
        return false;
    }

    public static void showLens(Context context) {
    }

    public static void watchObject(String str, Object obj) {
    }

    public int getShellVersion() {
        return 0;
    }
}
