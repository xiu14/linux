package com.bytedance.feedbackerlib.matisse.internal.loader;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.loader.content.CursorLoader;
import com.bytedance.feedbackerlib.matisse.internal.entity.Album;
import com.ss.android.socialbase.downloader.constants.DBDefinition;

/* loaded from: classes.dex */
public class AlbumMediaLoader extends CursorLoader {
    private static final Uri b = MediaStore.Files.getContentUri("external");

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f4866c = {DBDefinition.ID, "_display_name", "mime_type", "_size", "duration"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f4867d = {String.valueOf(1), String.valueOf(3)};
    private final boolean a;

    private AlbumMediaLoader(Context context, String str, String[] strArr, boolean z) {
        super(context, b, f4866c, str, strArr, "datetaken DESC");
        this.a = z;
    }

    public static CursorLoader a(Context context, Album album, boolean z) {
        String str;
        String[] strArr;
        if (album.f()) {
            strArr = f4867d;
            str = "(media_type=? OR media_type=?) AND _size>0";
        } else {
            z = false;
            str = "(media_type=? OR media_type=?) AND  bucket_id=? AND _size>0";
            strArr = new String[]{String.valueOf(1), String.valueOf(3), album.e()};
        }
        return new AlbumMediaLoader(context, str, strArr, z);
    }

    @Override // androidx.loader.content.Loader
    public void onContentChanged() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.loader.content.CursorLoader, androidx.loader.content.AsyncTaskLoader
    public Cursor loadInBackground() {
        Cursor loadInBackground = super.loadInBackground();
        if (!this.a || !getContext().getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            return loadInBackground;
        }
        MatrixCursor matrixCursor = new MatrixCursor(f4866c);
        matrixCursor.addRow(new Object[]{-1L, "Capture", "", 0, 0});
        return new MergeCursor(new Cursor[]{matrixCursor, loadInBackground});
    }
}
