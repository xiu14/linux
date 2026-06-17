.class final Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/transition/platform/MaterialContainerTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TransitionDrawable"
.end annotation


# instance fields
.field public final A:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

.field public final B:Lcom/google/android/material/transition/platform/FadeModeEvaluator;

.field public final C:Lcom/google/android/material/transition/platform/FitModeEvaluator;

.field public D:Lcom/google/android/material/transition/platform/FadeModeResult;

.field public E:Lcom/google/android/material/transition/platform/FitModeResult;

.field public F:Landroid/graphics/RectF;

.field public G:F

.field public H:F

.field public I:F

.field public final a:Landroid/view/View;

.field public final b:Landroid/graphics/RectF;

.field public final c:Lcom/google/android/material/shape/ShapeAppearanceModel;

.field public final d:F

.field public final e:Landroid/view/View;

.field public final f:Landroid/graphics/RectF;

.field public final g:Lcom/google/android/material/shape/ShapeAppearanceModel;

.field public final h:F

.field public final i:Landroid/graphics/Paint;

.field public final j:Landroid/graphics/Paint;

.field public final k:Landroid/graphics/Paint;

.field public final l:Landroid/graphics/Paint;

.field public final m:Landroid/graphics/Paint;

.field public final n:Lcom/google/android/material/transition/platform/MaskEvaluator;

.field public final o:Landroid/graphics/PathMeasure;

.field public final p:F

.field public final q:[F

.field public final r:Z

.field public final s:F

.field public final t:F

.field public final u:Z

.field public final v:Lcom/google/android/material/shape/MaterialShapeDrawable;

.field public final w:Landroid/graphics/RectF;

.field public final x:Landroid/graphics/RectF;

.field public final y:Landroid/graphics/RectF;

.field public final z:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/transition/PathMotion;Landroid/view/View;Landroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/view/View;Landroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearanceModel;FIZZLcom/google/android/material/transition/platform/FadeModeEvaluator;Lcom/google/android/material/transition/platform/FitModeEvaluator;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;)V
    .locals 9

    move-object/from16 v0, p7

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->i:Landroid/graphics/Paint;

    .line 3
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->j:Landroid/graphics/Paint;

    .line 4
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->k:Landroid/graphics/Paint;

    .line 5
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->l:Landroid/graphics/Paint;

    .line 6
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->m:Landroid/graphics/Paint;

    .line 7
    new-instance v5, Lcom/google/android/material/transition/platform/MaskEvaluator;

    invoke-direct {v5}, Lcom/google/android/material/transition/platform/MaskEvaluator;-><init>()V

    iput-object v5, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->n:Lcom/google/android/material/transition/platform/MaskEvaluator;

    const/4 v5, 0x2

    .line 8
    new-array v5, v5, [F

    iput-object v5, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->q:[F

    .line 9
    new-instance v6, Lcom/google/android/material/shape/MaterialShapeDrawable;

    invoke-direct {v6}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>()V

    iput-object v6, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->v:Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 10
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 11
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 12
    iput-object p2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->a:Landroid/view/View;

    .line 13
    iput-object p3, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->b:Landroid/graphics/RectF;

    .line 14
    iput-object p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->c:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 15
    iput p5, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->d:F

    .line 16
    iput-object p6, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->e:Landroid/view/View;

    .line 17
    iput-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->f:Landroid/graphics/RectF;

    move-object/from16 p4, p8

    .line 18
    iput-object p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->g:Lcom/google/android/material/shape/ShapeAppearanceModel;

    move/from16 p4, p9

    .line 19
    iput p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->h:F

    move/from16 p4, p11

    .line 20
    iput-boolean p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->r:Z

    move/from16 p4, p12

    .line 21
    iput-boolean p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->u:Z

    move-object/from16 p4, p13

    .line 22
    iput-object p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->B:Lcom/google/android/material/transition/platform/FadeModeEvaluator;

    move-object/from16 p4, p14

    .line 23
    iput-object p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->C:Lcom/google/android/material/transition/platform/FitModeEvaluator;

    move-object/from16 p4, p15

    .line 24
    iput-object p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->A:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 25
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string p4, "window"

    invoke-virtual {p2, p4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    .line 26
    new-instance p4, Landroid/util/DisplayMetrics;

    invoke-direct {p4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 27
    invoke-interface {p2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2, p4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 28
    iget p2, p4, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float p2, p2

    iput p2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->s:F

    .line 29
    iget p2, p4, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float p2, p2

    iput p2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->t:F

    const/4 p2, 0x0

    .line 30
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 32
    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p4

    invoke-virtual {v6, p4}, Lcom/google/android/material/shape/MaterialShapeDrawable;->l(Landroid/content/res/ColorStateList;)V

    .line 34
    invoke-virtual {v6}, Lcom/google/android/material/shape/MaterialShapeDrawable;->o()V

    .line 35
    iput-boolean p2, v6, Lcom/google/android/material/shape/MaterialShapeDrawable;->D:Z

    const p4, -0x777778

    .line 36
    invoke-virtual {v6, p4}, Lcom/google/android/material/shape/MaterialShapeDrawable;->n(I)V

    .line 37
    new-instance p4, Landroid/graphics/RectF;

    invoke-direct {p4, p3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    iput-object p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->w:Landroid/graphics/RectF;

    .line 38
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, p4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    iput-object v1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->x:Landroid/graphics/RectF;

    .line 39
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, p4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    iput-object v1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->y:Landroid/graphics/RectF;

    .line 40
    new-instance p4, Landroid/graphics/RectF;

    invoke-direct {p4, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    iput-object p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->z:Landroid/graphics/RectF;

    .line 41
    new-instance p4, Landroid/graphics/PointF;

    invoke-virtual {p3}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iget v2, p3, Landroid/graphics/RectF;->top:F

    invoke-direct {p4, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 42
    new-instance v1, Landroid/graphics/PointF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-direct {v1, v2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 43
    iget v0, p4, Landroid/graphics/PointF;->x:F

    iget p4, p4, Landroid/graphics/PointF;->y:F

    iget v2, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, v0, p4, v2, v1}, Landroid/transition/PathMotion;->getPath(FFFF)Landroid/graphics/Path;

    move-result-object p1

    .line 44
    new-instance p4, Landroid/graphics/PathMeasure;

    invoke-direct {p4, p1, p2}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    iput-object p4, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->o:Landroid/graphics/PathMeasure;

    .line 45
    invoke-virtual {p4}, Landroid/graphics/PathMeasure;->getLength()F

    move-result p1

    iput p1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->p:F

    .line 46
    invoke-virtual {p3}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    aput p1, v5, p2

    const/4 p1, 0x1

    .line 47
    iget p2, p3, Landroid/graphics/RectF;->top:F

    aput p2, v5, p1

    .line 48
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 49
    sget-object p1, Lcom/google/android/material/transition/platform/TransitionUtils;->a:Landroid/graphics/RectF;

    .line 50
    new-instance p2, Landroid/graphics/LinearGradient;

    const/4 p1, 0x0

    sget-object p3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 p4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    move/from16 v2, p10

    move-object/from16 p9, p3

    move/from16 p7, p10

    move/from16 p8, v2

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    const/4 p6, 0x0

    invoke-direct/range {p2 .. p9}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 51
    invoke-virtual {v4, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 52
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 p1, 0x41200000    # 10.0f

    .line 53
    invoke-virtual {v7, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 p1, 0x0

    .line 54
    invoke-virtual {p0, p1}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->d(F)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->k:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->y:Landroid/graphics/RectF;

    .line 11
    .line 12
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 13
    .line 14
    iget v4, v0, Landroid/graphics/RectF;->top:F

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->E:Lcom/google/android/material/transition/platform/FitModeResult;

    .line 17
    .line 18
    iget v5, v0, Lcom/google/android/material/transition/platform/FitModeResult;->b:F

    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->D:Lcom/google/android/material/transition/platform/FadeModeResult;

    .line 21
    .line 22
    iget v6, v0, Lcom/google/android/material/transition/platform/FadeModeResult;->b:I

    .line 23
    .line 24
    new-instance v7, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable$2;

    .line 25
    .line 26
    invoke-direct {v7, p0}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable$2;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;)V

    .line 27
    .line 28
    .line 29
    move-object v1, p1

    .line 30
    invoke-static/range {v1 .. v7}, Lcom/google/android/material/transition/platform/TransitionUtils;->f(Landroid/graphics/Canvas;Landroid/graphics/Rect;FFFILcom/google/android/material/canvas/CanvasCompat$CanvasOperation;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final b(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->j:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->w:Landroid/graphics/RectF;

    .line 11
    .line 12
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 13
    .line 14
    iget v4, v0, Landroid/graphics/RectF;->top:F

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->E:Lcom/google/android/material/transition/platform/FitModeResult;

    .line 17
    .line 18
    iget v5, v0, Lcom/google/android/material/transition/platform/FitModeResult;->a:F

    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->D:Lcom/google/android/material/transition/platform/FadeModeResult;

    .line 21
    .line 22
    iget v6, v0, Lcom/google/android/material/transition/platform/FadeModeResult;->a:I

    .line 23
    .line 24
    new-instance v7, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable$1;

    .line 25
    .line 26
    invoke-direct {v7, p0}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable$1;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;)V

    .line 27
    .line 28
    .line 29
    move-object v1, p1

    .line 30
    invoke-static/range {v1 .. v7}, Lcom/google/android/material/transition/platform/TransitionUtils;->f(Landroid/graphics/Canvas;Landroid/graphics/Rect;FFFILcom/google/android/material/canvas/CanvasCompat$CanvasOperation;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/graphics/Paint;->getAlpha()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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

.method public final d(F)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    iput v2, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->I:F

    .line 6
    .line 7
    iget-boolean v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->r:Z

    .line 8
    .line 9
    const/high16 v3, 0x437f0000    # 255.0f

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-static {v9, v3, v2}, Lcom/google/android/material/transition/platform/TransitionUtils;->c(FFF)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {v3, v9, v2}, Lcom/google/android/material/transition/platform/TransitionUtils;->c(FFF)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_0
    float-to-int v1, v1

    .line 24
    iget-object v3, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->m:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 27
    .line 28
    .line 29
    iget v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->p:F

    .line 30
    .line 31
    mul-float v3, v1, v2

    .line 32
    .line 33
    iget-object v4, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->o:Landroid/graphics/PathMeasure;

    .line 34
    .line 35
    iget-object v5, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->q:[F

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-virtual {v4, v3, v5, v6}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    aget v7, v5, v3

    .line 43
    .line 44
    const/4 v8, 0x1

    .line 45
    aget v10, v5, v8

    .line 46
    .line 47
    const/high16 v11, 0x3f800000    # 1.0f

    .line 48
    .line 49
    cmpl-float v12, v2, v11

    .line 50
    .line 51
    if-gtz v12, :cond_2

    .line 52
    .line 53
    cmpg-float v13, v2, v9

    .line 54
    .line 55
    if-gez v13, :cond_1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    :goto_1
    move v12, v10

    .line 59
    move v10, v7

    .line 60
    goto :goto_4

    .line 61
    :cond_2
    :goto_2
    if-lez v12, :cond_3

    .line 62
    .line 63
    sub-float v12, v2, v11

    .line 64
    .line 65
    const v13, 0x3c23d700    # 0.00999999f

    .line 66
    .line 67
    .line 68
    div-float/2addr v12, v13

    .line 69
    const v13, 0x3f7d70a4    # 0.99f

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    const v13, 0x3c23d70a    # 0.01f

    .line 74
    .line 75
    .line 76
    div-float v12, v2, v13

    .line 77
    .line 78
    const/high16 v14, -0x40800000    # -1.0f

    .line 79
    .line 80
    mul-float v12, v12, v14

    .line 81
    .line 82
    :goto_3
    mul-float v1, v1, v13

    .line 83
    .line 84
    invoke-virtual {v4, v1, v5, v6}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 85
    .line 86
    .line 87
    aget v1, v5, v3

    .line 88
    .line 89
    aget v3, v5, v8

    .line 90
    .line 91
    invoke-static {v7, v1, v12, v7}, Landroidx/appcompat/app/b;->f(FFFF)F

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    invoke-static {v10, v3, v12, v10}, Landroidx/appcompat/app/b;->f(FFFF)F

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    goto :goto_1

    .line 100
    :goto_4
    iget-object v13, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->A:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 101
    .line 102
    iget-object v1, v13, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->b:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 103
    .line 104
    iget-object v14, v13, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->a:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 105
    .line 106
    iget-object v15, v13, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->c:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 107
    .line 108
    iget v3, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->a:F

    .line 109
    .line 110
    iget-object v1, v13, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->b:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 111
    .line 112
    iget v4, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->b:F

    .line 113
    .line 114
    iget-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->b:Landroid/graphics/RectF;

    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    iget-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->f:Landroid/graphics/RectF;

    .line 125
    .line 126
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    iget-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->C:Lcom/google/android/material/transition/platform/FitModeEvaluator;

    .line 135
    .line 136
    invoke-interface/range {v1 .. v8}, Lcom/google/android/material/transition/platform/FitModeEvaluator;->a(FFFFFFF)Lcom/google/android/material/transition/platform/FitModeResult;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->E:Lcom/google/android/material/transition/platform/FitModeResult;

    .line 141
    .line 142
    iget v2, v1, Lcom/google/android/material/transition/platform/FitModeResult;->c:F

    .line 143
    .line 144
    const/high16 v7, 0x40000000    # 2.0f

    .line 145
    .line 146
    div-float/2addr v2, v7

    .line 147
    sub-float v3, v10, v2

    .line 148
    .line 149
    add-float/2addr v2, v10

    .line 150
    iget v1, v1, Lcom/google/android/material/transition/platform/FitModeResult;->d:F

    .line 151
    .line 152
    add-float/2addr v1, v12

    .line 153
    iget-object v8, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->w:Landroid/graphics/RectF;

    .line 154
    .line 155
    invoke-virtual {v8, v3, v12, v2, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->E:Lcom/google/android/material/transition/platform/FitModeResult;

    .line 159
    .line 160
    iget v2, v1, Lcom/google/android/material/transition/platform/FitModeResult;->e:F

    .line 161
    .line 162
    div-float/2addr v2, v7

    .line 163
    sub-float v3, v10, v2

    .line 164
    .line 165
    add-float/2addr v2, v10

    .line 166
    iget v1, v1, Lcom/google/android/material/transition/platform/FitModeResult;->f:F

    .line 167
    .line 168
    add-float/2addr v1, v12

    .line 169
    iget-object v4, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->y:Landroid/graphics/RectF;

    .line 170
    .line 171
    invoke-virtual {v4, v3, v12, v2, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 172
    .line 173
    .line 174
    iget-object v10, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->x:Landroid/graphics/RectF;

    .line 175
    .line 176
    invoke-virtual {v10, v8}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 177
    .line 178
    .line 179
    iget-object v12, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->z:Landroid/graphics/RectF;

    .line 180
    .line 181
    invoke-virtual {v12, v4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 182
    .line 183
    .line 184
    iget v3, v15, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->a:F

    .line 185
    .line 186
    iget v4, v15, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->b:F

    .line 187
    .line 188
    iget-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->E:Lcom/google/android/material/transition/platform/FitModeResult;

    .line 189
    .line 190
    iget-object v15, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->C:Lcom/google/android/material/transition/platform/FitModeEvaluator;

    .line 191
    .line 192
    invoke-interface {v15, v1}, Lcom/google/android/material/transition/platform/FitModeEvaluator;->b(Lcom/google/android/material/transition/platform/FitModeResult;)Z

    .line 193
    .line 194
    .line 195
    move-result v16

    .line 196
    if-eqz v16, :cond_4

    .line 197
    .line 198
    move-object v1, v10

    .line 199
    goto :goto_5

    .line 200
    :cond_4
    move-object v1, v12

    .line 201
    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/4 v6, 0x0

    .line 204
    move-object v5, v1

    .line 205
    const/4 v1, 0x0

    .line 206
    move-object v7, v5

    .line 207
    const/high16 v22, 0x40000000    # 2.0f

    .line 208
    .line 209
    move/from16 v5, p1

    .line 210
    .line 211
    invoke-static/range {v1 .. v6}, Lcom/google/android/material/transition/platform/TransitionUtils;->d(FFFFFZ)F

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v16, :cond_5

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_5
    sub-float v1, v11, v1

    .line 219
    .line 220
    :goto_6
    iget-object v2, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->E:Lcom/google/android/material/transition/platform/FitModeResult;

    .line 221
    .line 222
    invoke-interface {v15, v7, v1, v2}, Lcom/google/android/material/transition/platform/FitModeEvaluator;->c(Landroid/graphics/RectF;FLcom/google/android/material/transition/platform/FitModeResult;)V

    .line 223
    .line 224
    .line 225
    new-instance v1, Landroid/graphics/RectF;

    .line 226
    .line 227
    iget v2, v10, Landroid/graphics/RectF;->left:F

    .line 228
    .line 229
    iget v3, v12, Landroid/graphics/RectF;->left:F

    .line 230
    .line 231
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    iget v3, v10, Landroid/graphics/RectF;->top:F

    .line 236
    .line 237
    iget v4, v12, Landroid/graphics/RectF;->top:F

    .line 238
    .line 239
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    iget v4, v10, Landroid/graphics/RectF;->right:F

    .line 244
    .line 245
    iget v5, v12, Landroid/graphics/RectF;->right:F

    .line 246
    .line 247
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    iget v5, v10, Landroid/graphics/RectF;->bottom:F

    .line 252
    .line 253
    iget v6, v12, Landroid/graphics/RectF;->bottom:F

    .line 254
    .line 255
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 260
    .line 261
    .line 262
    iput-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->F:Landroid/graphics/RectF;

    .line 263
    .line 264
    iget-object v1, v13, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->d:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 265
    .line 266
    iget-object v7, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->n:Lcom/google/android/material/transition/platform/MaskEvaluator;

    .line 267
    .line 268
    iget-object v13, v7, Lcom/google/android/material/transition/platform/MaskEvaluator;->c:Landroid/graphics/Path;

    .line 269
    .line 270
    iget-object v15, v7, Lcom/google/android/material/transition/platform/MaskEvaluator;->b:Landroid/graphics/Path;

    .line 271
    .line 272
    iget v4, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->a:F

    .line 273
    .line 274
    iget v5, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->b:F

    .line 275
    .line 276
    iget-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->c:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 277
    .line 278
    cmpg-float v2, p1, v4

    .line 279
    .line 280
    if-gez v2, :cond_6

    .line 281
    .line 282
    move/from16 v2, p1

    .line 283
    .line 284
    move-object v4, v12

    .line 285
    const/high16 v23, 0x3f800000    # 1.0f

    .line 286
    .line 287
    goto/16 :goto_9

    .line 288
    .line 289
    :cond_6
    iget-object v2, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->g:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 290
    .line 291
    cmpl-float v3, p1, v5

    .line 292
    .line 293
    if-lez v3, :cond_7

    .line 294
    .line 295
    move-object v1, v2

    .line 296
    move-object v4, v12

    .line 297
    const/high16 v23, 0x3f800000    # 1.0f

    .line 298
    .line 299
    move/from16 v2, p1

    .line 300
    .line 301
    goto/16 :goto_9

    .line 302
    .line 303
    :cond_7
    move-object v3, v1

    .line 304
    new-instance v1, Lcom/google/android/material/transition/platform/TransitionUtils$1;

    .line 305
    .line 306
    move-object v6, v12

    .line 307
    move-object v12, v2

    .line 308
    move-object v2, v8

    .line 309
    move-object v8, v3

    .line 310
    move-object v3, v6

    .line 311
    move/from16 v6, p1

    .line 312
    .line 313
    invoke-direct/range {v1 .. v6}, Lcom/google/android/material/transition/platform/TransitionUtils$1;-><init>(Landroid/graphics/RectF;Landroid/graphics/RectF;FFF)V

    .line 314
    .line 315
    .line 316
    move-object v4, v3

    .line 317
    move-object v3, v2

    .line 318
    move v2, v6

    .line 319
    iget-object v5, v8, Lcom/google/android/material/shape/ShapeAppearanceModel;->e:Lcom/google/android/material/shape/CornerSize;

    .line 320
    .line 321
    iget-object v6, v8, Lcom/google/android/material/shape/ShapeAppearanceModel;->h:Lcom/google/android/material/shape/CornerSize;

    .line 322
    .line 323
    const/16 v16, 0x0

    .line 324
    .line 325
    iget-object v9, v8, Lcom/google/android/material/shape/ShapeAppearanceModel;->g:Lcom/google/android/material/shape/CornerSize;

    .line 326
    .line 327
    const/high16 v23, 0x3f800000    # 1.0f

    .line 328
    .line 329
    iget-object v11, v8, Lcom/google/android/material/shape/ShapeAppearanceModel;->f:Lcom/google/android/material/shape/CornerSize;

    .line 330
    .line 331
    invoke-interface {v5, v3}, Lcom/google/android/material/shape/CornerSize;->a(Landroid/graphics/RectF;)F

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    cmpl-float v5, v5, v16

    .line 336
    .line 337
    if-nez v5, :cond_9

    .line 338
    .line 339
    invoke-interface {v11, v3}, Lcom/google/android/material/shape/CornerSize;->a(Landroid/graphics/RectF;)F

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    cmpl-float v5, v5, v16

    .line 344
    .line 345
    if-nez v5, :cond_9

    .line 346
    .line 347
    invoke-interface {v9, v3}, Lcom/google/android/material/shape/CornerSize;->a(Landroid/graphics/RectF;)F

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    cmpl-float v5, v5, v16

    .line 352
    .line 353
    if-nez v5, :cond_9

    .line 354
    .line 355
    invoke-interface {v6, v3}, Lcom/google/android/material/shape/CornerSize;->a(Landroid/graphics/RectF;)F

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    cmpl-float v3, v3, v16

    .line 360
    .line 361
    if-eqz v3, :cond_8

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_8
    move-object v3, v12

    .line 365
    goto :goto_8

    .line 366
    :cond_9
    :goto_7
    move-object v3, v8

    .line 367
    :goto_8
    invoke-virtual {v3}, Lcom/google/android/material/shape/ShapeAppearanceModel;->f()Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    iget-object v5, v8, Lcom/google/android/material/shape/ShapeAppearanceModel;->e:Lcom/google/android/material/shape/CornerSize;

    .line 372
    .line 373
    iget-object v8, v12, Lcom/google/android/material/shape/ShapeAppearanceModel;->e:Lcom/google/android/material/shape/CornerSize;

    .line 374
    .line 375
    invoke-virtual {v1, v5, v8}, Lcom/google/android/material/transition/platform/TransitionUtils$1;->a(Lcom/google/android/material/shape/CornerSize;Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/AbsoluteCornerSize;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    iput-object v5, v3, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->e:Lcom/google/android/material/shape/CornerSize;

    .line 380
    .line 381
    iget-object v5, v12, Lcom/google/android/material/shape/ShapeAppearanceModel;->f:Lcom/google/android/material/shape/CornerSize;

    .line 382
    .line 383
    invoke-virtual {v1, v11, v5}, Lcom/google/android/material/transition/platform/TransitionUtils$1;->a(Lcom/google/android/material/shape/CornerSize;Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/AbsoluteCornerSize;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    iput-object v5, v3, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->f:Lcom/google/android/material/shape/CornerSize;

    .line 388
    .line 389
    iget-object v5, v12, Lcom/google/android/material/shape/ShapeAppearanceModel;->h:Lcom/google/android/material/shape/CornerSize;

    .line 390
    .line 391
    invoke-virtual {v1, v6, v5}, Lcom/google/android/material/transition/platform/TransitionUtils$1;->a(Lcom/google/android/material/shape/CornerSize;Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/AbsoluteCornerSize;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    iput-object v5, v3, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->h:Lcom/google/android/material/shape/CornerSize;

    .line 396
    .line 397
    iget-object v5, v12, Lcom/google/android/material/shape/ShapeAppearanceModel;->g:Lcom/google/android/material/shape/CornerSize;

    .line 398
    .line 399
    invoke-virtual {v1, v9, v5}, Lcom/google/android/material/transition/platform/TransitionUtils$1;->a(Lcom/google/android/material/shape/CornerSize;Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/AbsoluteCornerSize;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    iput-object v1, v3, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->g:Lcom/google/android/material/shape/CornerSize;

    .line 404
    .line 405
    invoke-virtual {v3}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->a()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    :goto_9
    iput-object v1, v7, Lcom/google/android/material/transition/platform/MaskEvaluator;->e:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 410
    .line 411
    iget-object v3, v7, Lcom/google/android/material/transition/platform/MaskEvaluator;->d:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    .line 412
    .line 413
    const/high16 v18, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/16 v20, 0x0

    .line 416
    .line 417
    move-object/from16 v17, v1

    .line 418
    .line 419
    move-object/from16 v16, v3

    .line 420
    .line 421
    move-object/from16 v19, v10

    .line 422
    .line 423
    move-object/from16 v21, v15

    .line 424
    .line 425
    invoke-virtual/range {v16 .. v21}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a(Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;Landroid/graphics/Path;)V

    .line 426
    .line 427
    .line 428
    move-object/from16 v1, v21

    .line 429
    .line 430
    iget-object v3, v7, Lcom/google/android/material/transition/platform/MaskEvaluator;->d:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    .line 431
    .line 432
    iget-object v5, v7, Lcom/google/android/material/transition/platform/MaskEvaluator;->e:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 433
    .line 434
    move-object/from16 v16, v3

    .line 435
    .line 436
    move-object/from16 v19, v4

    .line 437
    .line 438
    move-object/from16 v17, v5

    .line 439
    .line 440
    move-object/from16 v21, v13

    .line 441
    .line 442
    invoke-virtual/range {v16 .. v21}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a(Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;Landroid/graphics/Path;)V

    .line 443
    .line 444
    .line 445
    move-object/from16 v3, v21

    .line 446
    .line 447
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 448
    .line 449
    const/16 v5, 0x17

    .line 450
    .line 451
    if-lt v4, v5, :cond_a

    .line 452
    .line 453
    iget-object v4, v7, Lcom/google/android/material/transition/platform/MaskEvaluator;->a:Landroid/graphics/Path;

    .line 454
    .line 455
    sget-object v5, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 456
    .line 457
    invoke-virtual {v4, v1, v3, v5}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 458
    .line 459
    .line 460
    :cond_a
    iget v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->d:F

    .line 461
    .line 462
    iget v3, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->h:F

    .line 463
    .line 464
    invoke-static {v1, v3, v2}, Lcom/google/android/material/transition/platform/TransitionUtils;->c(FFF)F

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    iput v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->G:F

    .line 469
    .line 470
    iget-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->F:Landroid/graphics/RectF;

    .line 471
    .line 472
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    iget v3, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->s:F

    .line 477
    .line 478
    div-float v3, v3, v22

    .line 479
    .line 480
    div-float/2addr v1, v3

    .line 481
    sub-float v1, v1, v23

    .line 482
    .line 483
    const v3, 0x3e99999a    # 0.3f

    .line 484
    .line 485
    .line 486
    mul-float v1, v1, v3

    .line 487
    .line 488
    iget-object v3, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->F:Landroid/graphics/RectF;

    .line 489
    .line 490
    iget v4, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->t:F

    .line 491
    .line 492
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    div-float/2addr v3, v4

    .line 497
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 498
    .line 499
    mul-float v3, v3, v4

    .line 500
    .line 501
    iget v4, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->G:F

    .line 502
    .line 503
    mul-float v1, v1, v4

    .line 504
    .line 505
    float-to-int v1, v1

    .line 506
    int-to-float v1, v1

    .line 507
    mul-float v3, v3, v4

    .line 508
    .line 509
    float-to-int v3, v3

    .line 510
    int-to-float v3, v3

    .line 511
    iput v3, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->H:F

    .line 512
    .line 513
    iget-object v5, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->l:Landroid/graphics/Paint;

    .line 514
    .line 515
    const/high16 v6, 0x2d000000

    .line 516
    .line 517
    invoke-virtual {v5, v4, v1, v3, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 518
    .line 519
    .line 520
    iget v1, v14, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->a:F

    .line 521
    .line 522
    iget v3, v14, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;->b:F

    .line 523
    .line 524
    iget-object v4, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->B:Lcom/google/android/material/transition/platform/FadeModeEvaluator;

    .line 525
    .line 526
    invoke-interface {v4, v2, v1, v3}, Lcom/google/android/material/transition/platform/FadeModeEvaluator;->a(FFF)Lcom/google/android/material/transition/platform/FadeModeResult;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    iput-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->D:Lcom/google/android/material/transition/platform/FadeModeResult;

    .line 531
    .line 532
    iget-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->j:Landroid/graphics/Paint;

    .line 533
    .line 534
    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    if-eqz v2, :cond_b

    .line 539
    .line 540
    iget-object v2, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->D:Lcom/google/android/material/transition/platform/FadeModeResult;

    .line 541
    .line 542
    iget v2, v2, Lcom/google/android/material/transition/platform/FadeModeResult;->a:I

    .line 543
    .line 544
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 545
    .line 546
    .line 547
    :cond_b
    iget-object v1, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->k:Landroid/graphics/Paint;

    .line 548
    .line 549
    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    .line 550
    .line 551
    .line 552
    move-result v2

    .line 553
    if-eqz v2, :cond_c

    .line 554
    .line 555
    iget-object v2, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->D:Lcom/google/android/material/transition/platform/FadeModeResult;

    .line 556
    .line 557
    iget v2, v2, Lcom/google/android/material/transition/platform/FadeModeResult;->b:I

    .line 558
    .line 559
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 560
    .line 561
    .line 562
    :cond_c
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 563
    .line 564
    .line 565
    return-void
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->m:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->u:Z

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->n:Lcom/google/android/material/transition/platform/MaskEvaluator;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->G:F

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    cmpl-float v0, v0, v2

    .line 26
    .line 27
    if-lez v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, Lcom/google/android/material/transition/platform/MaskEvaluator;->a:Landroid/graphics/Path;

    .line 33
    .line 34
    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 35
    .line 36
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 37
    .line 38
    .line 39
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v2, 0x1c

    .line 42
    .line 43
    if-le v0, v2, :cond_2

    .line 44
    .line 45
    iget-object v0, v1, Lcom/google/android/material/transition/platform/MaskEvaluator;->e:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 46
    .line 47
    iget-object v2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->F:Landroid/graphics/RectF;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lcom/google/android/material/shape/ShapeAppearanceModel;->e(Landroid/graphics/RectF;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v3, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->l:Landroid/graphics/Paint;

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    iget-object v0, v0, Lcom/google/android/material/shape/ShapeAppearanceModel;->e:Lcom/google/android/material/shape/CornerSize;

    .line 58
    .line 59
    iget-object v2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->F:Landroid/graphics/RectF;

    .line 60
    .line 61
    invoke-interface {v0, v2}, Lcom/google/android/material/shape/CornerSize;->a(Landroid/graphics/RectF;)F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v2, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->F:Landroid/graphics/RectF;

    .line 66
    .line 67
    invoke-virtual {p1, v2, v0, v0, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, v1, Lcom/google/android/material/transition/platform/MaskEvaluator;->a:Landroid/graphics/Path;

    .line 72
    .line 73
    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->F:Landroid/graphics/RectF;

    .line 78
    .line 79
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 80
    .line 81
    float-to-int v2, v2

    .line 82
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 83
    .line 84
    float-to-int v3, v3

    .line 85
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 86
    .line 87
    float-to-int v4, v4

    .line 88
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 89
    .line 90
    float-to-int v0, v0

    .line 91
    iget-object v5, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->v:Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 92
    .line 93
    invoke-virtual {v5, v2, v3, v4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 94
    .line 95
    .line 96
    iget v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->G:F

    .line 97
    .line 98
    invoke-virtual {v5, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->k(F)V

    .line 99
    .line 100
    .line 101
    iget v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->H:F

    .line 102
    .line 103
    float-to-int v0, v0

    .line 104
    invoke-virtual {v5, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->p(I)V

    .line 105
    .line 106
    .line 107
    iget-object v0, v1, Lcom/google/android/material/transition/platform/MaskEvaluator;->e:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 108
    .line 109
    invoke-virtual {v5, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setShapeAppearanceModel(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 116
    .line 117
    .line 118
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 119
    .line 120
    const/16 v2, 0x17

    .line 121
    .line 122
    if-lt v0, v2, :cond_4

    .line 123
    .line 124
    iget-object v0, v1, Lcom/google/android/material/transition/platform/MaskEvaluator;->a:Landroid/graphics/Path;

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    iget-object v0, v1, Lcom/google/android/material/transition/platform/MaskEvaluator;->b:Landroid/graphics/Path;

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 133
    .line 134
    .line 135
    iget-object v0, v1, Lcom/google/android/material/transition/platform/MaskEvaluator;->c:Landroid/graphics/Path;

    .line 136
    .line 137
    sget-object v1, Landroid/graphics/Region$Op;->UNION:Landroid/graphics/Region$Op;

    .line 138
    .line 139
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 140
    .line 141
    .line 142
    :goto_1
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->i:Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->D:Lcom/google/android/material/transition/platform/FadeModeResult;

    .line 148
    .line 149
    iget-boolean v0, v0, Lcom/google/android/material/transition/platform/FadeModeResult;->c:Z

    .line 150
    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0, p1}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->b(Landroid/graphics/Canvas;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, p1}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->a(Landroid/graphics/Canvas;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_5
    invoke-virtual {p0, p1}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->a(Landroid/graphics/Canvas;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p1}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;->b(Landroid/graphics/Canvas;)V

    .line 164
    .line 165
    .line 166
    return-void
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
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

.method public final setAlpha(I)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Setting alpha on is not supported"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
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

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Setting a color filter is not supported"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
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
