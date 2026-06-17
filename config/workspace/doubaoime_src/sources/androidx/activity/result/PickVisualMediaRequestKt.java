package androidx.activity.result;

import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class PickVisualMediaRequestKt {
    public static final PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        l.f(visualMediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(visualMediaType).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, Object obj) {
        if ((i & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType);
    }
}
