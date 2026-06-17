package com.obric.oui.window.bean;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MINUS_ERROR_SIZE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class WindowSizeClass {
    private static final /* synthetic */ WindowSizeClass[] $VALUES;
    public static final WindowSizeClass FLOATING_WINDOW;
    public static final WindowSizeClass LARGE;
    public static final WindowSizeClass MINUS_ERROR_SIZE;
    public static final WindowSizeClass NORMAL;
    public static final WindowSizeClass OVERSIZE;
    public static final WindowSizeClass SMALL;
    public static final WindowSizeClass SMALLER_ANDROID_SCREEN;
    public static final WindowSizeClass SMALL_SPLIT_SCREEN;
    public static final WindowSizeClass STANDARD;
    private final b baseGridConfig;
    private final int dpSize;

    static {
        float f2 = 0;
        WindowSizeClass windowSizeClass = new WindowSizeClass("MINUS_ERROR_SIZE", 0, -1, new b("MINUS_ERROR_SIZE", new a(1), new c(e.a.a.a.a.e0("Resources.getSystem()", 1, f2)), new d(e.a.a.a.a.e0("Resources.getSystem()", 1, f2))));
        MINUS_ERROR_SIZE = windowSizeClass;
        float f3 = 12;
        WindowSizeClass windowSizeClass2 = new WindowSizeClass("FLOATING_WINDOW", 1, 0, new b("FLOATING_WINDOW", new a(12), new c(e.a.a.a.a.e0("Resources.getSystem()", 1, 11)), new d(e.a.a.a.a.e0("Resources.getSystem()", 1, f3))));
        FLOATING_WINDOW = windowSizeClass2;
        WindowSizeClass windowSizeClass3 = new WindowSizeClass("SMALL_SPLIT_SCREEN", 2, 375, new b("SMALL_SPLIT_SCREEN", new a(12), new c(e.a.a.a.a.e0("Resources.getSystem()", 1, f3)), new d(e.a.a.a.a.e0("Resources.getSystem()", 1, f3))));
        SMALL_SPLIT_SCREEN = windowSizeClass3;
        float f4 = 16;
        WindowSizeClass windowSizeClass4 = new WindowSizeClass("SMALLER_ANDROID_SCREEN", 3, 516, new b("SMALLER_ANDROID_SCREEN", new a(12), new c(e.a.a.a.a.e0("Resources.getSystem()", 1, f3)), new d(e.a.a.a.a.e0("Resources.getSystem()", 1, f4))));
        SMALLER_ANDROID_SCREEN = windowSizeClass4;
        WindowSizeClass windowSizeClass5 = new WindowSizeClass("SMALL", 4, 640, new b("SMALL", new a(12), new c(e.a.a.a.a.e0("Resources.getSystem()", 1, f3)), new d(e.a.a.a.a.e0("Resources.getSystem()", 1, f4))));
        SMALL = windowSizeClass5;
        float f5 = 24;
        WindowSizeClass windowSizeClass6 = new WindowSizeClass("STANDARD", 5, 768, new b("STANDARD", new a(12), new c(e.a.a.a.a.e0("Resources.getSystem()", 1, f3)), new d(e.a.a.a.a.e0("Resources.getSystem()", 1, f5))));
        STANDARD = windowSizeClass6;
        WindowSizeClass windowSizeClass7 = new WindowSizeClass("NORMAL", 6, 834, new b("NORMAL", new a(12), new c(e.a.a.a.a.e0("Resources.getSystem()", 1, f3)), new d(e.a.a.a.a.e0("Resources.getSystem()", 1, f5))));
        NORMAL = windowSizeClass7;
        float f6 = 32;
        WindowSizeClass windowSizeClass8 = new WindowSizeClass("LARGE", 7, 1024, new b("LARGE", new a(20), new c(e.a.a.a.a.e0("Resources.getSystem()", 1, f4)), new d(e.a.a.a.a.e0("Resources.getSystem()", 1, f6))));
        LARGE = windowSizeClass8;
        WindowSizeClass windowSizeClass9 = new WindowSizeClass("OVERSIZE", 8, 1366, new b("OVERSIZE", new a(24), new c(e.a.a.a.a.e0("Resources.getSystem()", 1, f4)), new d(e.a.a.a.a.e0("Resources.getSystem()", 1, f6))));
        OVERSIZE = windowSizeClass9;
        $VALUES = new WindowSizeClass[]{windowSizeClass, windowSizeClass2, windowSizeClass3, windowSizeClass4, windowSizeClass5, windowSizeClass6, windowSizeClass7, windowSizeClass8, windowSizeClass9};
    }

    private WindowSizeClass(String str, int i, int i2, b bVar) {
        this.dpSize = i2;
        this.baseGridConfig = bVar;
    }

    public static WindowSizeClass valueOf(String str) {
        return (WindowSizeClass) Enum.valueOf(WindowSizeClass.class, str);
    }

    public static WindowSizeClass[] values() {
        return (WindowSizeClass[]) $VALUES.clone();
    }

    public final b getBaseGridConfig() {
        return this.baseGridConfig;
    }

    public final int getDpSize() {
        return this.dpSize;
    }
}
