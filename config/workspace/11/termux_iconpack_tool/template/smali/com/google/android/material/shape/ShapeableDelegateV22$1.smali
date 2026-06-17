.class Lcom/google/android/material/shape/ShapeableDelegateV22$1;
.super Landroid/view/ViewOutlineProvider;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/shape/ShapeableDelegateV22;->e(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/shape/ShapeableDelegateV22;


# direct methods
.method public constructor <init>(Lcom/google/android/material/shape/ShapeableDelegateV22;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/shape/ShapeableDelegateV22$1;->a:Lcom/google/android/material/shape/ShapeableDelegateV22;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 8

    .line 1
    iget-object p1, p0, Lcom/google/android/material/shape/ShapeableDelegateV22$1;->a:Lcom/google/android/material/shape/ShapeableDelegateV22;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/material/shape/ShapeableDelegate;->c:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lcom/google/android/material/shape/ShapeableDelegate;->d:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p1, Lcom/google/android/material/shape/ShapeableDelegate;->d:Landroid/graphics/RectF;

    .line 16
    .line 17
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 18
    .line 19
    float-to-int v3, v1

    .line 20
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 21
    .line 22
    float-to-int v4, v1

    .line 23
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 24
    .line 25
    float-to-int v5, v1

    .line 26
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 27
    .line 28
    float-to-int v6, v0

    .line 29
    iget v7, p1, Lcom/google/android/material/shape/ShapeableDelegateV22;->g:F

    .line 30
    .line 31
    move-object v2, p2

    .line 32
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method
