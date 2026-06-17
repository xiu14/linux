.class final Lcom/google/android/apps/muzei/api/provider/MuzeiArtDocumentsProvider$attachInfo$5;
.super Lkotlin/jvm/internal/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Ld5/l;"
    }
.end annotation


# static fields
.field public static final h:Lcom/google/android/apps/muzei/api/provider/MuzeiArtDocumentsProvider$attachInfo$5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/apps/muzei/api/provider/MuzeiArtDocumentsProvider$attachInfo$5;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/apps/muzei/api/provider/MuzeiArtDocumentsProvider$attachInfo$5;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/apps/muzei/api/provider/MuzeiArtDocumentsProvider$attachInfo$5;->h:Lcom/google/android/apps/muzei/api/provider/MuzeiArtDocumentsProvider$attachInfo$5;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/k;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Landroid/content/pm/ProviderInfo;

    .line 2
    .line 3
    const-string v0, "providerInfo"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, Lp4/f;

    .line 11
    .line 12
    invoke-direct {v1, v0, p1}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
