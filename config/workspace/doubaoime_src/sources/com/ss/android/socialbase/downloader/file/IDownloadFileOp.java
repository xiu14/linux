package com.ss.android.socialbase.downloader.file;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
interface IDownloadFileOp {
    boolean canWrite();

    boolean delete();

    boolean exists();

    String getAbsolutePath();

    String getCanonicalPath() throws IOException;

    String getExtraMsg();

    @Nullable
    File getFile();

    int getFileType();

    File getParentFile();

    String getPath();

    boolean isDirectory();

    long lastModified();

    long length();

    boolean mkdirs();

    FileInputStream obtainInputStream() throws IOException;

    FileOutputStream obtainOutputStream() throws IOException;

    boolean renameTo(DownloadFile downloadFile);

    boolean setLastModified(long j);
}
