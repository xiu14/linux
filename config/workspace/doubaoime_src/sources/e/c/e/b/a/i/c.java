package e.c.e.b.a.i;

/* loaded from: classes2.dex */
public class c extends e.c.h.l.b {
    private String a;
    private final b b;

    public c(String str, b bVar) {
        this.b = bVar;
        this.a = str;
    }

    @Override // e.c.h.l.b, com.facebook.imagepipeline.producers.Y
    public void e(String str, String str2, boolean z) {
        int i;
        b bVar = this.b;
        if (bVar != null) {
            String str3 = this.a;
            str2.hashCode();
            i = 1;
            switch (str2) {
                case "QualifiedResourceFetchProducer":
                case "LocalResourceFetchProducer":
                case "LocalFileFetchProducer":
                case "VideoThumbnailProducer":
                case "LocalAssetFetchProducer":
                case "DataFetchProducer":
                case "LocalContentUriThumbnailFetchProducer":
                case "LocalContentUriFetchProducer":
                    i = 7;
                    break;
                case "BitmapMemoryCacheGetProducer":
                case "BitmapMemoryCacheProducer":
                case "PostprocessedBitmapMemoryCacheProducer":
                    i = 5;
                    break;
                case "EncodedMemoryCacheProducer":
                    i = 4;
                    break;
                case "NetworkFetchProducer":
                    i = 2;
                    break;
                case "DiskCacheProducer":
                case "PartialDiskCacheProducer":
                    i = 3;
                    break;
            }
            bVar.a(str3, i, z, str2);
        }
    }

    public void m(String str) {
        this.a = str;
    }
}
