package e.c.c.i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.FileDescriptor;

/* loaded from: classes2.dex */
public interface b {

    public interface a {
        void a(String str, String str2);
    }

    Bitmap a(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options);
}
