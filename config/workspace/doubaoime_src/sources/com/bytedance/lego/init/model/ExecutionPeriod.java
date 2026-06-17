package com.bytedance.lego.init.model;

/* loaded from: classes.dex */
public enum ExecutionPeriod {
    SPLASH_ON_CREATE,
    SPLASH_ON_START,
    SPLASH_ON_RESUME,
    SPLASH_ON_PAUSE,
    SPLASH_ON_STOP,
    SPLASH_ON_DESTROY,
    SPLASH_ON_ANY,
    MAIN_ON_CREATE,
    MAIN_ON_START,
    MAIN_ON_RESUME,
    MAIN_ON_PAUSE,
    MAIN_ON_STOP,
    MAIN_ON_DESTROY,
    MAIN_ON_ANY;

    public static ExecutionPeriod from(String str) {
        str.hashCode();
        switch (str) {
            case "MAIN_ON_DESTROY":
                return MAIN_ON_DESTROY;
            case "MAIN_ON_ANY":
                return MAIN_ON_ANY;
            case "SPLASH_ON_DESTROY":
                return SPLASH_ON_DESTROY;
            case "SPLASH_ON_STOP":
                return SPLASH_ON_STOP;
            case "MAIN_ON_CREATE":
                return MAIN_ON_CREATE;
            case "SPLASH_ON_PAUSE":
                return SPLASH_ON_PAUSE;
            case "SPLASH_ON_START":
                return SPLASH_ON_START;
            case "MAIN_ON_RESUME":
                return MAIN_ON_RESUME;
            case "SPLASH_ON_CREATE":
                return SPLASH_ON_CREATE;
            case "MAIN_ON_STOP":
                return MAIN_ON_STOP;
            case "SPLASH_ON_ANY":
                return SPLASH_ON_ANY;
            case "MAIN_ON_PAUSE":
                return MAIN_ON_PAUSE;
            case "MAIN_ON_START":
                return MAIN_ON_START;
            case "SPLASH_ON_RESUME":
                return SPLASH_ON_RESUME;
            default:
                return null;
        }
    }
}
