.class public final synthetic Lcom/google/android/material/transition/a;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/material/shape/ShapeAppearanceModel$CornerSizeUnaryOperator;


# instance fields
.field public final synthetic h:Landroid/graphics/RectF;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/transition/a;->h:Landroid/graphics/RectF;

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final b(Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/CornerSize;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/material/transition/TransitionUtils;->a:Landroid/graphics/RectF;

    .line 2
    .line 3
    instance-of v0, p1, Lcom/google/android/material/shape/RelativeCornerSize;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lcom/google/android/material/shape/RelativeCornerSize;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v0, Lcom/google/android/material/shape/RelativeCornerSize;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/material/transition/a;->h:Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-interface {p1, v1}, Lcom/google/android/material/shape/CornerSize;->a(Landroid/graphics/RectF;)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    div-float/2addr p1, v1

    .line 31
    invoke-direct {v0, p1}, Lcom/google/android/material/shape/RelativeCornerSize;-><init>(F)V

    .line 32
    .line 33
    .line 34
    return-object v0
    .line 35
    .line 36
    .line 37
.end method
