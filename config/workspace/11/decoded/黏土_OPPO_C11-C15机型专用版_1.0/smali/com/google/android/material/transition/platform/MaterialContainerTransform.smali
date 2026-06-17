.class public final Lcom/google/android/material/transition/platform/MaterialContainerTransform;
.super Landroid/transition/Transition;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;,
        Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;,
        Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;,
        Lcom/google/android/material/transition/platform/MaterialContainerTransform$FitMode;,
        Lcom/google/android/material/transition/platform/MaterialContainerTransform$FadeMode;,
        Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDirection;
    }
.end annotation


# static fields
.field public static final q:[Ljava/lang/String;

.field public static final r:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

.field public static final s:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

.field public static final t:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

.field public static final u:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;


# instance fields
.field public h:Z

.field public i:Z

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:Z

.field public final o:F

.field public final p:F


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-string v0, "materialContainerTransition:bounds"

    .line 2
    .line 3
    const-string v1, "materialContainerTransition:shapeAppearance"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->q:[Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 12
    .line 13
    new-instance v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 14
    .line 15
    const/high16 v2, 0x3e800000    # 0.25f

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v1, v3, v2}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 22
    .line 23
    const/high16 v4, 0x3f800000    # 1.0f

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 26
    .line 27
    .line 28
    new-instance v5, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 29
    .line 30
    invoke-direct {v5, v3, v4}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 34
    .line 35
    const/high16 v7, 0x3f400000    # 0.75f

    .line 36
    .line 37
    invoke-direct {v6, v3, v7}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, v2, v5, v6}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->r:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 44
    .line 45
    new-instance v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 46
    .line 47
    new-instance v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 48
    .line 49
    const v2, 0x3f19999a    # 0.6f

    .line 50
    .line 51
    .line 52
    const v5, 0x3f666666    # 0.9f

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 56
    .line 57
    .line 58
    new-instance v6, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 59
    .line 60
    invoke-direct {v6, v3, v4}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 61
    .line 62
    .line 63
    new-instance v7, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 64
    .line 65
    invoke-direct {v7, v3, v5}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 66
    .line 67
    .line 68
    new-instance v8, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 69
    .line 70
    const v9, 0x3e99999a    # 0.3f

    .line 71
    .line 72
    .line 73
    invoke-direct {v8, v9, v5}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, v1, v6, v7, v8}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->s:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 80
    .line 81
    new-instance v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 82
    .line 83
    new-instance v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 84
    .line 85
    const v6, 0x3ecccccd    # 0.4f

    .line 86
    .line 87
    .line 88
    const v7, 0x3dcccccd    # 0.1f

    .line 89
    .line 90
    .line 91
    invoke-direct {v1, v7, v6}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 92
    .line 93
    .line 94
    new-instance v6, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 95
    .line 96
    invoke-direct {v6, v7, v4}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 97
    .line 98
    .line 99
    new-instance v8, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 100
    .line 101
    invoke-direct {v8, v7, v4}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 102
    .line 103
    .line 104
    new-instance v4, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 105
    .line 106
    invoke-direct {v4, v7, v5}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 107
    .line 108
    .line 109
    invoke-direct {v0, v1, v6, v8, v4}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;)V

    .line 110
    .line 111
    .line 112
    sput-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->t:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 113
    .line 114
    new-instance v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 115
    .line 116
    new-instance v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 117
    .line 118
    invoke-direct {v1, v2, v5}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 119
    .line 120
    .line 121
    new-instance v2, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 122
    .line 123
    invoke-direct {v2, v3, v5}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 124
    .line 125
    .line 126
    new-instance v4, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 127
    .line 128
    invoke-direct {v4, v3, v5}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 129
    .line 130
    .line 131
    new-instance v3, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 132
    .line 133
    const v6, 0x3e4ccccd    # 0.2f

    .line 134
    .line 135
    .line 136
    invoke-direct {v3, v6, v5}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 137
    .line 138
    .line 139
    invoke-direct {v0, v1, v2, v4, v3}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;)V

    .line 140
    .line 141
    .line 142
    sput-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->u:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 143
    .line 144
    return-void
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/transition/Transition;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->h:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->i:Z

    .line 8
    .line 9
    const v1, 0x1020002

    .line 10
    .line 11
    .line 12
    iput v1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->j:I

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    iput v1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->k:I

    .line 16
    .line 17
    iput v1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->l:I

    .line 18
    .line 19
    const/high16 v1, 0x52000000

    .line 20
    .line 21
    iput v1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->m:I

    .line 22
    .line 23
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v2, 0x1c

    .line 26
    .line 27
    if-lt v1, v2, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    :cond_0
    iput-boolean v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->n:Z

    .line 31
    .line 32
    const/high16 v0, -0x40800000    # -1.0f

    .line 33
    .line 34
    iput v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->o:F

    .line 35
    .line 36
    iput v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->p:F

    .line 37
    .line 38
    return-void
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public static a(Landroid/transition/TransitionValues;I)V
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 5
    .line 6
    sget-object v2, Lcom/google/android/material/transition/platform/TransitionUtils;->a:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v1, p1}, Lcom/google/android/material/transition/platform/TransitionUtils;->a(Landroid/view/View;I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    iput-object v2, p0, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-object p1, p0, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 23
    .line 24
    sget v1, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    instance-of p1, p1, Landroid/view/View;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 35
    .line 36
    sget v1, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Landroid/view/View;

    .line 43
    .line 44
    iget-object v1, p0, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 45
    .line 46
    sget v2, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 53
    .line 54
    :cond_2
    :goto_1
    iget-object p1, p0, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 55
    .line 56
    sget-object v1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    return-void

    .line 78
    :cond_4
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-nez v1, :cond_5

    .line 83
    .line 84
    sget-object v1, Lcom/google/android/material/transition/platform/TransitionUtils;->a:Landroid/graphics/RectF;

    .line 85
    .line 86
    new-instance v1, Landroid/graphics/RectF;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    int-to-float v2, v2

    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    int-to-float v3, v3

    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    int-to-float v4, v4

    .line 103
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    int-to-float v5, v5

    .line 108
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    invoke-static {p1}, Lcom/google/android/material/transition/platform/TransitionUtils;->b(Landroid/view/View;)Landroid/graphics/RectF;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    :goto_3
    iget-object v2, p0, Landroid/transition/TransitionValues;->values:Ljava/util/Map;

    .line 117
    .line 118
    const-string v3, "materialContainerTransition:bounds"

    .line 119
    .line 120
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    iget-object p0, p0, Landroid/transition/TransitionValues;->values:Ljava/util/Map;

    .line 124
    .line 125
    sget v2, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 126
    .line 127
    invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    instance-of v2, v2, Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 132
    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    sget v0, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    sget v3, Lcom/google/android/material/R$attr;->transitionShapeAppearance:I

    .line 149
    .line 150
    filled-new-array {v3}, [I

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v2, v3}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    const/4 v4, 0x0

    .line 159
    invoke-virtual {v3, v4, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 164
    .line 165
    .line 166
    if-eq v5, v0, :cond_7

    .line 167
    .line 168
    invoke-static {v2, v5, v4}, Lcom/google/android/material/shape/ShapeAppearanceModel;->a(Landroid/content/Context;II)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->a()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    goto :goto_4

    .line 177
    :cond_7
    instance-of v0, p1, Lcom/google/android/material/shape/Shapeable;

    .line 178
    .line 179
    if-eqz v0, :cond_8

    .line 180
    .line 181
    check-cast p1, Lcom/google/android/material/shape/Shapeable;

    .line 182
    .line 183
    invoke-interface {p1}, Lcom/google/android/material/shape/Shapeable;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    goto :goto_4

    .line 188
    :cond_8
    new-instance p1, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 189
    .line 190
    invoke-direct {p1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->a()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    :goto_4
    new-instance v0, Lcom/google/android/material/transition/platform/a;

    .line 198
    .line 199
    invoke-direct {v0, v1}, Lcom/google/android/material/transition/platform/a;-><init>(Landroid/graphics/RectF;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v0}, Lcom/google/android/material/shape/ShapeAppearanceModel;->g(Lcom/google/android/material/shape/ShapeAppearanceModel$CornerSizeUnaryOperator;)Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    const-string v0, "materialContainerTransition:shapeAppearance"

    .line 207
    .line 208
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    return-void
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
.end method


# virtual methods
.method public final captureEndValues(Landroid/transition/TransitionValues;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->l:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->a(Landroid/transition/TransitionValues;I)V

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

.method public final captureStartValues(Landroid/transition/TransitionValues;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->k:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->a(Landroid/transition/TransitionValues;I)V

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

.method public final createAnimator(Landroid/view/ViewGroup;Landroid/transition/TransitionValues;Landroid/transition/TransitionValues;)Landroid/animation/Animator;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_1b

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_14

    .line 13
    .line 14
    :cond_0
    iget-object v4, v0, Landroid/transition/TransitionValues;->values:Ljava/util/Map;

    .line 15
    .line 16
    const-string v5, "materialContainerTransition:bounds"

    .line 17
    .line 18
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    move-object v9, v4

    .line 23
    check-cast v9, Landroid/graphics/RectF;

    .line 24
    .line 25
    iget-object v4, v0, Landroid/transition/TransitionValues;->values:Ljava/util/Map;

    .line 26
    .line 27
    const-string v6, "materialContainerTransition:shapeAppearance"

    .line 28
    .line 29
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    move-object v10, v4

    .line 34
    check-cast v10, Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 35
    .line 36
    const-string v4, "MaterialContainerTransform"

    .line 37
    .line 38
    if-eqz v9, :cond_1a

    .line 39
    .line 40
    if-nez v10, :cond_1

    .line 41
    .line 42
    goto/16 :goto_13

    .line 43
    .line 44
    :cond_1
    iget-object v7, v2, Landroid/transition/TransitionValues;->values:Ljava/util/Map;

    .line 45
    .line 46
    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    move-object v13, v5

    .line 51
    check-cast v13, Landroid/graphics/RectF;

    .line 52
    .line 53
    iget-object v5, v2, Landroid/transition/TransitionValues;->values:Ljava/util/Map;

    .line 54
    .line 55
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    move-object v14, v5

    .line 60
    check-cast v14, Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 61
    .line 62
    if-eqz v13, :cond_19

    .line 63
    .line 64
    if-nez v14, :cond_2

    .line 65
    .line 66
    goto/16 :goto_12

    .line 67
    .line 68
    :cond_2
    iget-object v4, v0, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 69
    .line 70
    iget-object v12, v2, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 71
    .line 72
    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    move-object v0, v12

    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move-object v0, v4

    .line 81
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    iget v5, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->j:I

    .line 86
    .line 87
    if-ne v5, v2, :cond_4

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Landroid/view/View;

    .line 94
    .line 95
    move-object v5, v0

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-static {v0, v5}, Lcom/google/android/material/transition/platform/TransitionUtils;->a(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v5, v3

    .line 102
    :goto_1
    invoke-static {v2}, Lcom/google/android/material/transition/platform/TransitionUtils;->b(Landroid/view/View;)Landroid/graphics/RectF;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    iget v7, v6, Landroid/graphics/RectF;->left:F

    .line 107
    .line 108
    neg-float v7, v7

    .line 109
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 110
    .line 111
    neg-float v6, v6

    .line 112
    if-eqz v5, :cond_5

    .line 113
    .line 114
    invoke-static {v5}, Lcom/google/android/material/transition/platform/TransitionUtils;->b(Landroid/view/View;)Landroid/graphics/RectF;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v5, v7, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    new-instance v5, Landroid/graphics/RectF;

    .line 123
    .line 124
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    int-to-float v8, v8

    .line 129
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    int-to-float v11, v11

    .line 134
    const/4 v15, 0x0

    .line 135
    invoke-direct {v5, v15, v15, v8, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 136
    .line 137
    .line 138
    :goto_2
    invoke-virtual {v9, v7, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v13, v7, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    mul-float v7, v7, v6

    .line 153
    .line 154
    invoke-virtual {v9}, Landroid/graphics/RectF;->width()F

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    invoke-virtual {v9}, Landroid/graphics/RectF;->height()F

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    mul-float v8, v8, v6

    .line 163
    .line 164
    const/4 v6, 0x1

    .line 165
    cmpl-float v7, v7, v8

    .line 166
    .line 167
    if-lez v7, :cond_6

    .line 168
    .line 169
    const/16 v17, 0x1

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    const/4 v7, 0x0

    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    sget v7, Lcom/google/android/material/R$attr;->motionEasingEmphasizedInterpolator:I

    .line 180
    .line 181
    sget-object v8, Lcom/google/android/material/animation/AnimationUtils;->b:Lg1/b;

    .line 182
    .line 183
    if-eqz v7, :cond_7

    .line 184
    .line 185
    invoke-virtual {v1}, Landroid/transition/Transition;->getInterpolator()Landroid/animation/TimeInterpolator;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    if-nez v11, :cond_7

    .line 190
    .line 191
    invoke-static {v0, v7, v8}, Lcom/google/android/material/motion/MotionUtils;->d(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-virtual {v1, v7}, Landroid/transition/Transition;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/transition/Transition;

    .line 196
    .line 197
    .line 198
    :cond_7
    if-eqz v17, :cond_8

    .line 199
    .line 200
    sget v7, Lcom/google/android/material/R$attr;->motionDurationLong2:I

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_8
    sget v7, Lcom/google/android/material/R$attr;->motionDurationMedium4:I

    .line 204
    .line 205
    :goto_4
    if-eqz v7, :cond_9

    .line 206
    .line 207
    invoke-virtual {v1}, Landroid/transition/Transition;->getDuration()J

    .line 208
    .line 209
    .line 210
    move-result-wide v15

    .line 211
    const-wide/16 v18, -0x1

    .line 212
    .line 213
    cmp-long v8, v15, v18

    .line 214
    .line 215
    if-nez v8, :cond_9

    .line 216
    .line 217
    const/4 v8, -0x1

    .line 218
    invoke-static {v0, v7, v8}, Lcom/google/android/material/motion/MotionUtils;->c(Landroid/content/Context;II)I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-eq v7, v8, :cond_9

    .line 223
    .line 224
    int-to-long v7, v7

    .line 225
    invoke-virtual {v1, v7, v8}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    .line 226
    .line 227
    .line 228
    :cond_9
    iget-boolean v7, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->i:Z

    .line 229
    .line 230
    if-nez v7, :cond_f

    .line 231
    .line 232
    sget v7, Lcom/google/android/material/R$attr;->motionPath:I

    .line 233
    .line 234
    if-eqz v7, :cond_f

    .line 235
    .line 236
    new-instance v8, Landroid/util/TypedValue;

    .line 237
    .line 238
    invoke-direct {v8}, Landroid/util/TypedValue;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0, v7, v8, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_e

    .line 250
    .line 251
    iget v0, v8, Landroid/util/TypedValue;->type:I

    .line 252
    .line 253
    const/16 v7, 0x10

    .line 254
    .line 255
    if-ne v0, v7, :cond_c

    .line 256
    .line 257
    iget v0, v8, Landroid/util/TypedValue;->data:I

    .line 258
    .line 259
    if-nez v0, :cond_a

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_a
    if-ne v0, v6, :cond_b

    .line 263
    .line 264
    new-instance v3, Lcom/google/android/material/transition/platform/MaterialArcMotion;

    .line 265
    .line 266
    invoke-direct {v3}, Lcom/google/android/material/transition/platform/MaterialArcMotion;-><init>()V

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_b
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 271
    .line 272
    const-string v3, "Invalid motion path type: "

    .line 273
    .line 274
    invoke-static {v0, v3}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v2

    .line 282
    :cond_c
    const/4 v3, 0x3

    .line 283
    if-ne v0, v3, :cond_d

    .line 284
    .line 285
    iget-object v0, v8, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 286
    .line 287
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    new-instance v3, Landroid/transition/PatternPathMotion;

    .line 292
    .line 293
    invoke-static {v0}, Lq3/a;->x(Ljava/lang/String;)Landroid/graphics/Path;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-direct {v3, v0}, Landroid/transition/PatternPathMotion;-><init>(Landroid/graphics/Path;)V

    .line 298
    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 302
    .line 303
    const-string v2, "Motion path theme attribute must either be an enum value or path data string"

    .line 304
    .line 305
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw v0

    .line 309
    :cond_e
    :goto_5
    if-eqz v3, :cond_f

    .line 310
    .line 311
    invoke-virtual {v1, v3}, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->setPathMotion(Landroid/transition/PathMotion;)V

    .line 312
    .line 313
    .line 314
    :cond_f
    new-instance v3, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;

    .line 315
    .line 316
    invoke-virtual {v1}, Landroid/transition/Transition;->getPathMotion()Landroid/transition/PathMotion;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    const/high16 v0, -0x40800000    # -1.0f

    .line 321
    .line 322
    iget v6, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->o:F

    .line 323
    .line 324
    cmpl-float v8, v6, v0

    .line 325
    .line 326
    if-eqz v8, :cond_10

    .line 327
    .line 328
    :goto_6
    move v11, v6

    .line 329
    goto :goto_7

    .line 330
    :cond_10
    sget-object v6, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 331
    .line 332
    invoke-static {v4}, Lm0/k0;->i(Landroid/view/View;)F

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    goto :goto_6

    .line 337
    :goto_7
    iget v6, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->p:F

    .line 338
    .line 339
    cmpl-float v0, v6, v0

    .line 340
    .line 341
    if-eqz v0, :cond_11

    .line 342
    .line 343
    :goto_8
    move v15, v6

    .line 344
    goto :goto_9

    .line 345
    :cond_11
    sget-object v0, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 346
    .line 347
    invoke-static {v12}, Lm0/k0;->i(Landroid/view/View;)F

    .line 348
    .line 349
    .line 350
    move-result v6

    .line 351
    goto :goto_8

    .line 352
    :goto_9
    sget-object v0, Lcom/google/android/material/transition/platform/FadeModeEvaluators;->a:Lcom/google/android/material/transition/platform/FadeModeEvaluators$1;

    .line 353
    .line 354
    sget-object v6, Lcom/google/android/material/transition/platform/FadeModeEvaluators;->b:Lcom/google/android/material/transition/platform/FadeModeEvaluators$2;

    .line 355
    .line 356
    if-eqz v17, :cond_12

    .line 357
    .line 358
    move-object/from16 v19, v0

    .line 359
    .line 360
    goto :goto_a

    .line 361
    :cond_12
    move-object/from16 v19, v6

    .line 362
    .line 363
    :goto_a
    sget-object v0, Lcom/google/android/material/transition/platform/FitModeEvaluators;->a:Lcom/google/android/material/transition/platform/FitModeEvaluators$1;

    .line 364
    .line 365
    sget-object v6, Lcom/google/android/material/transition/platform/FitModeEvaluators;->b:Lcom/google/android/material/transition/platform/FitModeEvaluators$2;

    .line 366
    .line 367
    invoke-virtual {v9}, Landroid/graphics/RectF;->width()F

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    invoke-virtual {v9}, Landroid/graphics/RectF;->height()F

    .line 372
    .line 373
    .line 374
    move-result v16

    .line 375
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    .line 376
    .line 377
    .line 378
    move-result v18

    .line 379
    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    .line 380
    .line 381
    .line 382
    move-result v20

    .line 383
    mul-float v21, v20, v8

    .line 384
    .line 385
    div-float v21, v21, v18

    .line 386
    .line 387
    mul-float v18, v18, v16

    .line 388
    .line 389
    div-float v18, v18, v8

    .line 390
    .line 391
    if-eqz v17, :cond_13

    .line 392
    .line 393
    cmpl-float v8, v21, v16

    .line 394
    .line 395
    if-ltz v8, :cond_14

    .line 396
    .line 397
    goto :goto_b

    .line 398
    :cond_13
    cmpl-float v8, v18, v20

    .line 399
    .line 400
    if-ltz v8, :cond_14

    .line 401
    .line 402
    :goto_b
    move-object/from16 v20, v0

    .line 403
    .line 404
    goto :goto_c

    .line 405
    :cond_14
    move-object/from16 v20, v6

    .line 406
    .line 407
    :goto_c
    invoke-virtual {v1}, Landroid/transition/Transition;->getPathMotion()Landroid/transition/PathMotion;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    instance-of v6, v0, Landroid/transition/ArcMotion;

    .line 412
    .line 413
    if-nez v6, :cond_15

    .line 414
    .line 415
    instance-of v0, v0, Lcom/google/android/material/transition/platform/MaterialArcMotion;

    .line 416
    .line 417
    if-eqz v0, :cond_16

    .line 418
    .line 419
    :cond_15
    move-object/from16 p1, v2

    .line 420
    .line 421
    move-object/from16 p2, v3

    .line 422
    .line 423
    goto :goto_f

    .line 424
    :cond_16
    if-eqz v17, :cond_17

    .line 425
    .line 426
    sget-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->r:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 427
    .line 428
    goto :goto_d

    .line 429
    :cond_17
    sget-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->s:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 430
    .line 431
    :goto_d
    new-instance v6, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 432
    .line 433
    iget-object v8, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->a:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 434
    .line 435
    move-object/from16 p1, v2

    .line 436
    .line 437
    iget-object v2, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->b:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 438
    .line 439
    move-object/from16 p2, v3

    .line 440
    .line 441
    iget-object v3, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->c:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 442
    .line 443
    iget-object v0, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->d:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 444
    .line 445
    invoke-direct {v6, v8, v2, v3, v0}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;)V

    .line 446
    .line 447
    .line 448
    :goto_e
    move-object/from16 v21, v6

    .line 449
    .line 450
    goto :goto_11

    .line 451
    :goto_f
    if-eqz v17, :cond_18

    .line 452
    .line 453
    sget-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->t:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 454
    .line 455
    goto :goto_10

    .line 456
    :cond_18
    sget-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->u:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 457
    .line 458
    :goto_10
    new-instance v6, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 459
    .line 460
    iget-object v2, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->a:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 461
    .line 462
    iget-object v3, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->b:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 463
    .line 464
    iget-object v8, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->c:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 465
    .line 466
    iget-object v0, v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;->d:Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;

    .line 467
    .line 468
    invoke-direct {v6, v2, v3, v8, v0}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholds;)V

    .line 469
    .line 470
    .line 471
    goto :goto_e

    .line 472
    :goto_11
    iget v0, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->m:I

    .line 473
    .line 474
    iget-boolean v2, v1, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->n:Z

    .line 475
    .line 476
    move-object/from16 v6, p2

    .line 477
    .line 478
    move/from16 v16, v0

    .line 479
    .line 480
    move/from16 v18, v2

    .line 481
    .line 482
    move-object v8, v4

    .line 483
    invoke-direct/range {v6 .. v21}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;-><init>(Landroid/transition/PathMotion;Landroid/view/View;Landroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/view/View;Landroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearanceModel;FIZZLcom/google/android/material/transition/platform/FadeModeEvaluator;Lcom/google/android/material/transition/platform/FitModeEvaluator;Lcom/google/android/material/transition/platform/MaterialContainerTransform$ProgressThresholdsGroup;)V

    .line 484
    .line 485
    .line 486
    move-object v3, v6

    .line 487
    iget v0, v5, Landroid/graphics/RectF;->left:F

    .line 488
    .line 489
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    iget v2, v5, Landroid/graphics/RectF;->top:F

    .line 494
    .line 495
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    iget v6, v5, Landroid/graphics/RectF;->right:F

    .line 500
    .line 501
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 502
    .line 503
    .line 504
    move-result v6

    .line 505
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 506
    .line 507
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    invoke-virtual {v3, v0, v2, v6, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 512
    .line 513
    .line 514
    const/4 v0, 0x2

    .line 515
    new-array v0, v0, [F

    .line 516
    .line 517
    fill-array-data v0, :array_0

    .line 518
    .line 519
    .line 520
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 521
    .line 522
    .line 523
    move-result-object v6

    .line 524
    new-instance v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$1;

    .line 525
    .line 526
    invoke-direct {v0, v3}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$1;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v6, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 530
    .line 531
    .line 532
    new-instance v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform$2;

    .line 533
    .line 534
    move-object/from16 v2, p1

    .line 535
    .line 536
    move-object v5, v12

    .line 537
    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/transition/platform/MaterialContainerTransform$2;-><init>(Lcom/google/android/material/transition/platform/MaterialContainerTransform;Landroid/view/View;Lcom/google/android/material/transition/platform/MaterialContainerTransform$TransitionDrawable;Landroid/view/View;Landroid/view/View;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1, v0}, Landroid/transition/Transition;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;

    .line 541
    .line 542
    .line 543
    return-object v6

    .line 544
    :cond_19
    :goto_12
    const-string v0, "Skipping due to null end bounds. Ensure end view is laid out and measured."

    .line 545
    .line 546
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 547
    .line 548
    .line 549
    return-object v3

    .line 550
    :cond_1a
    :goto_13
    const-string v0, "Skipping due to null start bounds. Ensure start view is laid out and measured."

    .line 551
    .line 552
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 553
    .line 554
    .line 555
    :cond_1b
    :goto_14
    return-object v3

    .line 556
    nop

    .line 557
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
.end method

.method public final getTransitionProperties()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->q:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public final setPathMotion(Landroid/transition/PathMotion;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/transition/Transition;->setPathMotion(Landroid/transition/PathMotion;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/transition/platform/MaterialContainerTransform;->i:Z

    .line 6
    .line 7
    return-void
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
