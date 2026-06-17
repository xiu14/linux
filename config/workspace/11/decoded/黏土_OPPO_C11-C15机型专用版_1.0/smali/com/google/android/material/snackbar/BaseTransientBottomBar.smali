.class public abstract Lcom/google/android/material/snackbar/BaseTransientBottomBar;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$Anchor;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$BehaviorDelegate;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$Duration;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$ContentViewCallback;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$BaseCallback;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$AnimationMode;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B:",
        "Lcom/google/android/material/snackbar/BaseTransientBottomBar<",
        "TB;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final A:[I

.field public static final B:Ljava/lang/String;

.field public static final w:Lg1/b;

.field public static final x:Landroid/view/animation/LinearInterpolator;

.field public static final y:Lg1/a;

.field public static final z:Landroid/os/Handler;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Landroid/animation/TimeInterpolator;

.field public final e:Landroid/animation/TimeInterpolator;

.field public final f:Landroid/animation/TimeInterpolator;

.field public final g:Landroid/view/ViewGroup;

.field public final h:Landroid/content/Context;

.field public final i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

.field public final j:Lcom/google/android/material/snackbar/ContentViewCallback;

.field public k:I

.field public l:Lcom/google/android/material/snackbar/BaseTransientBottomBar$Anchor;

.field public final m:Ljava/lang/Runnable;

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public final u:Landroid/view/accessibility/AccessibilityManager;

.field public final v:Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/material/animation/AnimationUtils;->b:Lg1/b;

    .line 2
    .line 3
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->w:Lg1/b;

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/material/animation/AnimationUtils;->a:Landroid/view/animation/LinearInterpolator;

    .line 6
    .line 7
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->x:Landroid/view/animation/LinearInterpolator;

    .line 8
    .line 9
    sget-object v0, Lcom/google/android/material/animation/AnimationUtils;->d:Lg1/a;

    .line 10
    .line 11
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->y:Lg1/a;

    .line 12
    .line 13
    sget v0, Lcom/google/android/material/R$attr;->snackbarStyle:I

    .line 14
    .line 15
    filled-new-array {v0}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->A:[I

    .line 20
    .line 21
    const-string v0, "BaseTransientBottomBar"

    .line 22
    .line 23
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->B:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v0, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$1;

    .line 32
    .line 33
    invoke-direct {v2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$1;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->z:Landroid/os/Handler;

    .line 40
    .line 41
    return-void
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

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/ContentViewCallback;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$2;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$2;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->m:Ljava/lang/Runnable;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;

    .line 17
    .line 18
    if-eqz p3, :cond_4

    .line 19
    .line 20
    if-eqz p4, :cond_3

    .line 21
    .line 22
    iput-object p2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Landroid/view/ViewGroup;

    .line 23
    .line 24
    iput-object p4, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->j:Lcom/google/android/material/snackbar/ContentViewCallback;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->h:Landroid/content/Context;

    .line 27
    .line 28
    sget-object p4, Lcom/google/android/material/internal/ThemeEnforcement;->a:[I

    .line 29
    .line 30
    const-string v0, "Theme.AppCompat"

    .line 31
    .line 32
    invoke-static {p1, p4, v0}, Lcom/google/android/material/internal/ThemeEnforcement;->c(Landroid/content/Context;[ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 36
    .line 37
    .line 38
    move-result-object p4

    .line 39
    sget-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->A:[I

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, -0x1

    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 52
    .line 53
    .line 54
    if-eq v3, v2, :cond_0

    .line 55
    .line 56
    sget v0, Lcom/google/android/material/R$layout;->mtrl_layout_snackbar:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sget v0, Lcom/google/android/material/R$layout;->design_layout_snackbar:I

    .line 60
    .line 61
    :goto_0
    invoke-virtual {p4, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 66
    .line 67
    iput-object p2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 68
    .line 69
    invoke-static {p2, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;->a(Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    .line 70
    .line 71
    .line 72
    instance-of p4, p3, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 73
    .line 74
    if-eqz p4, :cond_2

    .line 75
    .line 76
    move-object p4, p3

    .line 77
    check-cast p4, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 78
    .line 79
    invoke-virtual {p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;->getActionTextColorAlpha()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const/high16 v1, 0x3f800000    # 1.0f

    .line 84
    .line 85
    cmpl-float v1, v0, v1

    .line 86
    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    iget-object v1, p4, Lcom/google/android/material/snackbar/SnackbarContentLayout;->i:Landroid/widget/Button;

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    sget v2, Lcom/google/android/material/R$attr;->colorSurface:I

    .line 96
    .line 97
    invoke-static {p4, v2}, Lcom/google/android/material/color/MaterialColors;->c(Landroid/view/View;I)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-static {v2, v1, v0}, Lcom/google/android/material/color/MaterialColors;->e(IIF)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget-object v1, p4, Lcom/google/android/material/snackbar/SnackbarContentLayout;->i:Landroid/widget/Button;

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 108
    .line 109
    .line 110
    :cond_1
    invoke-virtual {p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;->getMaxInlineActionWidth()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-virtual {p4, v0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->setMaxInlineActionWidth(I)V

    .line 115
    .line 116
    .line 117
    :cond_2
    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    sget-object p3, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 121
    .line 122
    const/4 p3, 0x1

    .line 123
    invoke-virtual {p2, p3}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, p3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, p3}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 130
    .line 131
    .line 132
    new-instance p3, Lcom/google/android/material/snackbar/BaseTransientBottomBar$3;

    .line 133
    .line 134
    invoke-direct {p3, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$3;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    .line 135
    .line 136
    .line 137
    invoke-static {p2, p3}, Lm0/k0;->u(Landroid/view/View;Lm0/w;)V

    .line 138
    .line 139
    .line 140
    new-instance p3, Lcom/google/android/material/snackbar/BaseTransientBottomBar$4;

    .line 141
    .line 142
    invoke-direct {p3, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$4;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    .line 143
    .line 144
    .line 145
    invoke-static {p2, p3}, Lm0/w0;->q(Landroid/view/View;Lm0/b;)V

    .line 146
    .line 147
    .line 148
    const-string p2, "accessibility"

    .line 149
    .line 150
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    check-cast p2, Landroid/view/accessibility/AccessibilityManager;

    .line 155
    .line 156
    iput-object p2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->u:Landroid/view/accessibility/AccessibilityManager;

    .line 157
    .line 158
    sget p2, Lcom/google/android/material/R$attr;->motionDurationLong2:I

    .line 159
    .line 160
    const/16 p3, 0xfa

    .line 161
    .line 162
    invoke-static {p1, p2, p3}, Lcom/google/android/material/motion/MotionUtils;->c(Landroid/content/Context;II)I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    iput p2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c:I

    .line 167
    .line 168
    sget p2, Lcom/google/android/material/R$attr;->motionDurationLong2:I

    .line 169
    .line 170
    const/16 p3, 0x96

    .line 171
    .line 172
    invoke-static {p1, p2, p3}, Lcom/google/android/material/motion/MotionUtils;->c(Landroid/content/Context;II)I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    iput p2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->a:I

    .line 177
    .line 178
    sget p2, Lcom/google/android/material/R$attr;->motionDurationMedium1:I

    .line 179
    .line 180
    const/16 p3, 0x4b

    .line 181
    .line 182
    invoke-static {p1, p2, p3}, Lcom/google/android/material/motion/MotionUtils;->c(Landroid/content/Context;II)I

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    iput p2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b:I

    .line 187
    .line 188
    sget p2, Lcom/google/android/material/R$attr;->motionEasingEmphasizedInterpolator:I

    .line 189
    .line 190
    sget-object p3, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->x:Landroid/view/animation/LinearInterpolator;

    .line 191
    .line 192
    invoke-static {p1, p2, p3}, Lcom/google/android/material/motion/MotionUtils;->d(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    iput-object p2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d:Landroid/animation/TimeInterpolator;

    .line 197
    .line 198
    sget p2, Lcom/google/android/material/R$attr;->motionEasingEmphasizedInterpolator:I

    .line 199
    .line 200
    sget-object p3, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->y:Lg1/a;

    .line 201
    .line 202
    invoke-static {p1, p2, p3}, Lcom/google/android/material/motion/MotionUtils;->d(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    iput-object p2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->f:Landroid/animation/TimeInterpolator;

    .line 207
    .line 208
    sget p2, Lcom/google/android/material/R$attr;->motionEasingEmphasizedInterpolator:I

    .line 209
    .line 210
    sget-object p3, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->w:Lg1/b;

    .line 211
    .line 212
    invoke-static {p1, p2, p3}, Lcom/google/android/material/motion/MotionUtils;->d(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e:Landroid/animation/TimeInterpolator;

    .line 217
    .line 218
    return-void

    .line 219
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 220
    .line 221
    const-string p2, "Transient bottom bar must have non-null callback"

    .line 222
    .line 223
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p1

    .line 227
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 228
    .line 229
    const-string p2, "Transient bottom bar must have non-null content"

    .line 230
    .line 231
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw p1
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
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V

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

.method public final b(I)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/android/material/snackbar/SnackbarManager;->b()Lcom/google/android/material/snackbar/SnackbarManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/material/snackbar/SnackbarManager;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/SnackbarManager;->c(Lcom/google/android/material/snackbar/SnackbarManager$Callback;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lcom/google/android/material/snackbar/SnackbarManager;->a(Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;I)Z

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    iget-object v3, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-object v3, v3, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->a:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-ne v3, v1, :cond_1

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 42
    .line 43
    invoke-virtual {v0, v1, p1}, Lcom/google/android/material/snackbar/SnackbarManager;->a(Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;I)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_1
    monitor-exit v2

    .line 47
    return-void

    .line 48
    :goto_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1
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
.end method

.method public final c()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->l:Lcom/google/android/material/snackbar/BaseTransientBottomBar$Anchor;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Anchor;->i:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    return-object v0
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

.method public final d()Z
    .locals 5

    .line 1
    invoke-static {}, Lcom/google/android/material/snackbar/SnackbarManager;->b()Lcom/google/android/material/snackbar/SnackbarManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/material/snackbar/SnackbarManager;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/SnackbarManager;->c(Lcom/google/android/material/snackbar/SnackbarManager$Callback;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x1

    .line 15
    if-nez v3, :cond_2

    .line 16
    .line 17
    iget-object v0, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->a:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v4, 0x0

    .line 37
    :cond_2
    :goto_1
    monitor-exit v2

    .line 38
    return v4

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw v0
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

.method public final e()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/android/material/snackbar/SnackbarManager;->b()Lcom/google/android/material/snackbar/SnackbarManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/material/snackbar/SnackbarManager;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/SnackbarManager;->c(Lcom/google/android/material/snackbar/SnackbarManager$Callback;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 18
    .line 19
    iget-object v3, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iput-object v3, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 26
    .line 27
    iput-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 28
    .line 29
    iget-object v3, v3, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->a:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lcom/google/android/material/snackbar/SnackbarManager$Callback;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v3}, Lcom/google/android/material/snackbar/SnackbarManager$Callback;->a()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    check-cast v0, Landroid/view/ViewGroup;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw v0
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

.method public final f()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/android/material/snackbar/SnackbarManager;->b()Lcom/google/android/material/snackbar/SnackbarManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/material/snackbar/SnackbarManager;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/SnackbarManager;->c(Lcom/google/android/material/snackbar/SnackbarManager$Callback;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/SnackbarManager;->f(Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v2

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final g(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->l:Lcom/google/android/material/snackbar/BaseTransientBottomBar$Anchor;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Anchor;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Anchor;

    .line 17
    .line 18
    invoke-direct {p1, p0, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Anchor;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, p1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->l:Lcom/google/android/material/snackbar/BaseTransientBottomBar$Anchor;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string v1, "Unable to find anchor view with id: "

    .line 45
    .line 46
    invoke-static {p1, v1}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0
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
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->u:Landroid/view/accessibility/AccessibilityManager;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    :goto_0
    new-instance v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$8;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$8;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->f()V

    .line 41
    .line 42
    .line 43
    return-void
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

.method public final i()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 8
    .line 9
    sget-object v3, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->B:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    const-string v0, "Unable to update margins because layout params are not MarginLayoutParams"

    .line 14
    .line 15
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v2, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;->q:Landroid/graphics/Rect;

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    const-string v0, "Unable to update margins because original view margins are not set"

    .line 24
    .line 25
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget v2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->q:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    iget v2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->n:I

    .line 46
    .line 47
    :goto_0
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 48
    .line 49
    iget-object v3, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;->q:Landroid/graphics/Rect;

    .line 50
    .line 51
    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    .line 52
    .line 53
    add-int/2addr v4, v2

    .line 54
    iget v2, v3, Landroid/graphics/Rect;->left:I

    .line 55
    .line 56
    iget v5, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->o:I

    .line 57
    .line 58
    add-int/2addr v2, v5

    .line 59
    iget v5, v3, Landroid/graphics/Rect;->right:I

    .line 60
    .line 61
    iget v6, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->p:I

    .line 62
    .line 63
    add-int/2addr v5, v6

    .line 64
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 65
    .line 66
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 67
    .line 68
    if-ne v6, v4, :cond_5

    .line 69
    .line 70
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 71
    .line 72
    if-ne v6, v2, :cond_5

    .line 73
    .line 74
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 75
    .line 76
    if-ne v6, v5, :cond_5

    .line 77
    .line 78
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 79
    .line 80
    if-eq v6, v3, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    const/4 v6, 0x0

    .line 84
    goto :goto_2

    .line 85
    :cond_5
    :goto_1
    const/4 v6, 0x1

    .line 86
    :goto_2
    if-eqz v6, :cond_6

    .line 87
    .line 88
    iput v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 89
    .line 90
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 91
    .line 92
    iput v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 93
    .line 94
    iput v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 97
    .line 98
    .line 99
    :cond_6
    if-nez v6, :cond_7

    .line 100
    .line 101
    iget v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->s:I

    .line 102
    .line 103
    iget v2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->r:I

    .line 104
    .line 105
    if-eq v1, v2, :cond_8

    .line 106
    .line 107
    :cond_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 108
    .line 109
    const/16 v2, 0x1d

    .line 110
    .line 111
    if-lt v1, v2, :cond_8

    .line 112
    .line 113
    iget v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->r:I

    .line 114
    .line 115
    if-lez v1, :cond_8

    .line 116
    .line 117
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    instance-of v2, v1, Lz/e;

    .line 122
    .line 123
    if-eqz v2, :cond_8

    .line 124
    .line 125
    check-cast v1, Lz/e;

    .line 126
    .line 127
    iget-object v1, v1, Lz/e;->a:Lz/b;

    .line 128
    .line 129
    instance-of v1, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 130
    .line 131
    if-eqz v1, :cond_8

    .line 132
    .line 133
    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->m:Ljava/lang/Runnable;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 139
    .line 140
    .line 141
    :cond_8
    :goto_3
    return-void
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
