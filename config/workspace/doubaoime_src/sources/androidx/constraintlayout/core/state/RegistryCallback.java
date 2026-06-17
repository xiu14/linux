package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public interface RegistryCallback {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int i, int i2);

    void onNewMotionScene(String str);

    void onProgress(float f2);

    void setDrawDebug(int i);

    void setLayoutInformationMode(int i);
}
