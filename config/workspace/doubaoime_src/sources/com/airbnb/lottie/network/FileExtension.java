package com.airbnb.lottie.network;

/* loaded from: classes.dex */
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");

    public final String extension;

    FileExtension(String str) {
        this.extension = str;
    }

    public static FileExtension forFile(String str) {
        FileExtension[] values = values();
        for (int i = 0; i < 2; i++) {
            FileExtension fileExtension = values[i];
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        com.airbnb.lottie.y.d.c("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        StringBuilder M = e.a.a.a.a.M(".temp");
        M.append(this.extension);
        return M.toString();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
