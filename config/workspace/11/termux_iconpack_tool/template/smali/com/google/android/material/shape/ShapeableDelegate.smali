.class public abstract Lcom/google/android/material/shape/ShapeableDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lcom/google/android/material/shape/ShapeAppearanceModel;

.field public d:Landroid/graphics/RectF;

.field public final e:Landroid/graphics/Path;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->b:Z

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->d:Landroid/graphics/RectF;

    .line 15
    .line 16
    new-instance v0, Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->e:Landroid/graphics/Path;

    .line 22
    .line 23
    return-void
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

.method public static a(Lcom/google/android/material/navigation/NavigationView;)Lcom/google/android/material/shape/ShapeableDelegate;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/google/android/material/shape/ShapeableDelegateV33;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/google/android/material/shape/ShapeableDelegateV33;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/16 v1, 0x16

    .line 14
    .line 15
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/google/android/material/shape/ShapeableDelegateV22;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/google/android/material/shape/ShapeableDelegateV22;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    new-instance p0, Lcom/google/android/material/shape/ShapeableDelegateV14;

    .line 24
    .line 25
    invoke-direct {p0}, Lcom/google/android/material/shape/ShapeableDelegateV14;-><init>()V

    .line 26
    .line 27
    .line 28
    return-object p0
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
.method public abstract b(Lcom/google/android/material/navigation/NavigationView;)V
.end method

.method public abstract c()Z
.end method

.method public final d()V
    .locals 6

    .line 1
    iget-object v3, p0, Lcom/google/android/material/shape/ShapeableDelegate;->d:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v0, v3, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    iget v1, v3, Landroid/graphics/RectF;->right:F

    .line 6
    .line 7
    cmpg-float v0, v0, v1

    .line 8
    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    iget v0, v3, Landroid/graphics/RectF;->top:F

    .line 12
    .line 13
    iget v1, v3, Landroid/graphics/RectF;->bottom:F

    .line 14
    .line 15
    cmpg-float v0, v0, v1

    .line 16
    .line 17
    if-gtz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/android/material/shape/ShapeableDelegate;->c:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    sget-object v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider$Lazy;->a:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    .line 24
    .line 25
    iget-object v5, p0, Lcom/google/android/material/shape/ShapeableDelegate;->e:Landroid/graphics/Path;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/high16 v2, 0x3f800000    # 1.0f

    .line 29
    .line 30
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a(Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;Landroid/graphics/Path;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
