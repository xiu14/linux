.class public final Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion$brightnessFloatProp$1;
.super Ldev/jahir/frames/ui/animations/FloatProp;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldev/jahir/frames/ui/animations/FloatProp<",
        "Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "darken"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ldev/jahir/frames/ui/animations/FloatProp;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
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
.method public get(Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;)F
    .locals 1

    const-string v0, "o"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->getBrightnessFraction()F

    move-result p1

    return p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)F
    .locals 0

    .line 1
    check-cast p1, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;

    invoke-virtual {p0, p1}, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion$brightnessFloatProp$1;->get(Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;)F

    move-result p1

    return p1
.end method

.method public set(Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;F)V
    .locals 1

    const-string v0, "o"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->setBrightnessFraction(F)V

    return-void
.end method

.method public bridge synthetic set(Ljava/lang/Object;F)V
    .locals 0

    .line 1
    check-cast p1, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion$brightnessFloatProp$1;->set(Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;F)V

    return-void
.end method
