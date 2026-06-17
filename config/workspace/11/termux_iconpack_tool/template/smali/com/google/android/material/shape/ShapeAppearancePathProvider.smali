.class public Lcom/google/android/material/shape/ShapeAppearancePathProvider;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/shape/ShapeAppearancePathProvider$ShapeAppearancePathSpec;,
        Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;,
        Lcom/google/android/material/shape/ShapeAppearancePathProvider$Lazy;
    }
.end annotation


# instance fields
.field public final a:[Lcom/google/android/material/shape/ShapePath;

.field public final b:[Landroid/graphics/Matrix;

.field public final c:[Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/PointF;

.field public final e:Landroid/graphics/Path;

.field public final f:Landroid/graphics/Path;

.field public final g:Lcom/google/android/material/shape/ShapePath;

.field public final h:[F

.field public final i:[F

.field public final j:Landroid/graphics/Path;

.field public final k:Landroid/graphics/Path;

.field public final l:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [Lcom/google/android/material/shape/ShapePath;

    .line 6
    .line 7
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a:[Lcom/google/android/material/shape/ShapePath;

    .line 8
    .line 9
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 10
    .line 11
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->b:[Landroid/graphics/Matrix;

    .line 12
    .line 13
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 14
    .line 15
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->c:[Landroid/graphics/Matrix;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/PointF;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->d:Landroid/graphics/PointF;

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->e:Landroid/graphics/Path;

    .line 30
    .line 31
    new-instance v1, Landroid/graphics/Path;

    .line 32
    .line 33
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->f:Landroid/graphics/Path;

    .line 37
    .line 38
    new-instance v1, Lcom/google/android/material/shape/ShapePath;

    .line 39
    .line 40
    invoke-direct {v1}, Lcom/google/android/material/shape/ShapePath;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->g:Lcom/google/android/material/shape/ShapePath;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    new-array v2, v1, [F

    .line 47
    .line 48
    iput-object v2, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->h:[F

    .line 49
    .line 50
    new-array v1, v1, [F

    .line 51
    .line 52
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->i:[F

    .line 53
    .line 54
    new-instance v1, Landroid/graphics/Path;

    .line 55
    .line 56
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->j:Landroid/graphics/Path;

    .line 60
    .line 61
    new-instance v1, Landroid/graphics/Path;

    .line 62
    .line 63
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->k:Landroid/graphics/Path;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    iput-boolean v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->l:Z

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    :goto_0
    if-ge v1, v0, :cond_0

    .line 73
    .line 74
    iget-object v2, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a:[Lcom/google/android/material/shape/ShapePath;

    .line 75
    .line 76
    new-instance v3, Lcom/google/android/material/shape/ShapePath;

    .line 77
    .line 78
    invoke-direct {v3}, Lcom/google/android/material/shape/ShapePath;-><init>()V

    .line 79
    .line 80
    .line 81
    aput-object v3, v2, v1

    .line 82
    .line 83
    iget-object v2, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->b:[Landroid/graphics/Matrix;

    .line 84
    .line 85
    new-instance v3, Landroid/graphics/Matrix;

    .line 86
    .line 87
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 88
    .line 89
    .line 90
    aput-object v3, v2, v1

    .line 91
    .line 92
    iget-object v2, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->c:[Landroid/graphics/Matrix;

    .line 93
    .line 94
    new-instance v3, Landroid/graphics/Matrix;

    .line 95
    .line 96
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 97
    .line 98
    .line 99
    aput-object v3, v2, v1

    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    return-void
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

.method public static b()Lcom/google/android/material/shape/ShapeAppearancePathProvider;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider$Lazy;->a:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

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


# virtual methods
.method public final a(Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;Landroid/graphics/Path;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 14
    .line 15
    .line 16
    iget-object v6, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->e:Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-virtual {v6}, Landroid/graphics/Path;->rewind()V

    .line 19
    .line 20
    .line 21
    iget-object v7, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->f:Landroid/graphics/Path;

    .line 22
    .line 23
    invoke-virtual {v7}, Landroid/graphics/Path;->rewind()V

    .line 24
    .line 25
    .line 26
    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 27
    .line 28
    invoke-virtual {v7, v3, v8}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 29
    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    :goto_0
    iget-object v10, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->c:[Landroid/graphics/Matrix;

    .line 33
    .line 34
    const/4 v11, 0x2

    .line 35
    iget-object v13, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->h:[F

    .line 36
    .line 37
    const/4 v14, 0x4

    .line 38
    iget-object v15, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a:[Lcom/google/android/material/shape/ShapePath;

    .line 39
    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    iget-object v8, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->b:[Landroid/graphics/Matrix;

    .line 43
    .line 44
    const/4 v12, 0x1

    .line 45
    if-ge v9, v14, :cond_9

    .line 46
    .line 47
    if-eq v9, v12, :cond_2

    .line 48
    .line 49
    if-eq v9, v11, :cond_1

    .line 50
    .line 51
    const/4 v14, 0x3

    .line 52
    if-eq v9, v14, :cond_0

    .line 53
    .line 54
    iget-object v14, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->f:Lcom/google/android/material/shape/CornerSize;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    iget-object v14, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->e:Lcom/google/android/material/shape/CornerSize;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object v14, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->h:Lcom/google/android/material/shape/CornerSize;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iget-object v14, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->g:Lcom/google/android/material/shape/CornerSize;

    .line 64
    .line 65
    :goto_1
    if-eq v9, v12, :cond_5

    .line 66
    .line 67
    if-eq v9, v11, :cond_4

    .line 68
    .line 69
    const/4 v11, 0x3

    .line 70
    if-eq v9, v11, :cond_3

    .line 71
    .line 72
    iget-object v11, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->b:Lcom/google/android/material/shape/CornerTreatment;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-object v11, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->a:Lcom/google/android/material/shape/CornerTreatment;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    iget-object v11, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->d:Lcom/google/android/material/shape/CornerTreatment;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    iget-object v11, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->c:Lcom/google/android/material/shape/CornerTreatment;

    .line 82
    .line 83
    :goto_2
    aget-object v12, v15, v9

    .line 84
    .line 85
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-interface {v14, v3}, Lcom/google/android/material/shape/CornerSize;->a(Landroid/graphics/RectF;)F

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    invoke-virtual {v11, v12, v2, v14}, Lcom/google/android/material/shape/CornerTreatment;->a(Lcom/google/android/material/shape/ShapePath;FF)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v11, v9, 0x1

    .line 96
    .line 97
    rem-int/lit8 v12, v11, 0x4

    .line 98
    .line 99
    mul-int/lit8 v12, v12, 0x5a

    .line 100
    .line 101
    int-to-float v12, v12

    .line 102
    aget-object v14, v8, v9

    .line 103
    .line 104
    invoke-virtual {v14}, Landroid/graphics/Matrix;->reset()V

    .line 105
    .line 106
    .line 107
    iget-object v14, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->d:Landroid/graphics/PointF;

    .line 108
    .line 109
    move-object/from16 v19, v8

    .line 110
    .line 111
    const/4 v8, 0x1

    .line 112
    if-eq v9, v8, :cond_8

    .line 113
    .line 114
    const/4 v8, 0x2

    .line 115
    if-eq v9, v8, :cond_7

    .line 116
    .line 117
    const/4 v8, 0x3

    .line 118
    if-eq v9, v8, :cond_6

    .line 119
    .line 120
    iget v8, v3, Landroid/graphics/RectF;->right:F

    .line 121
    .line 122
    move/from16 v17, v9

    .line 123
    .line 124
    iget v9, v3, Landroid/graphics/RectF;->top:F

    .line 125
    .line 126
    invoke-virtual {v14, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    move/from16 v17, v9

    .line 131
    .line 132
    iget v8, v3, Landroid/graphics/RectF;->left:F

    .line 133
    .line 134
    iget v9, v3, Landroid/graphics/RectF;->top:F

    .line 135
    .line 136
    invoke-virtual {v14, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_7
    move/from16 v17, v9

    .line 141
    .line 142
    iget v8, v3, Landroid/graphics/RectF;->left:F

    .line 143
    .line 144
    iget v9, v3, Landroid/graphics/RectF;->bottom:F

    .line 145
    .line 146
    invoke-virtual {v14, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_8
    move/from16 v17, v9

    .line 151
    .line 152
    iget v8, v3, Landroid/graphics/RectF;->right:F

    .line 153
    .line 154
    iget v9, v3, Landroid/graphics/RectF;->bottom:F

    .line 155
    .line 156
    invoke-virtual {v14, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 157
    .line 158
    .line 159
    :goto_3
    aget-object v8, v19, v17

    .line 160
    .line 161
    iget v9, v14, Landroid/graphics/PointF;->x:F

    .line 162
    .line 163
    iget v14, v14, Landroid/graphics/PointF;->y:F

    .line 164
    .line 165
    invoke-virtual {v8, v9, v14}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 166
    .line 167
    .line 168
    aget-object v8, v19, v17

    .line 169
    .line 170
    invoke-virtual {v8, v12}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 171
    .line 172
    .line 173
    aget-object v8, v15, v17

    .line 174
    .line 175
    iget v9, v8, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 176
    .line 177
    aput v9, v13, v16

    .line 178
    .line 179
    iget v8, v8, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 180
    .line 181
    const/16 v18, 0x1

    .line 182
    .line 183
    aput v8, v13, v18

    .line 184
    .line 185
    aget-object v8, v19, v17

    .line 186
    .line 187
    invoke-virtual {v8, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 188
    .line 189
    .line 190
    aget-object v8, v10, v17

    .line 191
    .line 192
    invoke-virtual {v8}, Landroid/graphics/Matrix;->reset()V

    .line 193
    .line 194
    .line 195
    aget-object v8, v10, v17

    .line 196
    .line 197
    aget v9, v13, v16

    .line 198
    .line 199
    aget v13, v13, v18

    .line 200
    .line 201
    invoke-virtual {v8, v9, v13}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 202
    .line 203
    .line 204
    aget-object v8, v10, v17

    .line 205
    .line 206
    invoke-virtual {v8, v12}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 207
    .line 208
    .line 209
    move v9, v11

    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_9
    move-object/from16 v19, v8

    .line 213
    .line 214
    const/16 v18, 0x1

    .line 215
    .line 216
    const/4 v8, 0x0

    .line 217
    :goto_4
    if-ge v8, v14, :cond_13

    .line 218
    .line 219
    aget-object v9, v15, v8

    .line 220
    .line 221
    iget v11, v9, Lcom/google/android/material/shape/ShapePath;->a:F

    .line 222
    .line 223
    aput v11, v13, v16

    .line 224
    .line 225
    iget v9, v9, Lcom/google/android/material/shape/ShapePath;->b:F

    .line 226
    .line 227
    aput v9, v13, v18

    .line 228
    .line 229
    aget-object v9, v19, v8

    .line 230
    .line 231
    invoke-virtual {v9, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 232
    .line 233
    .line 234
    if-nez v8, :cond_a

    .line 235
    .line 236
    aget v9, v13, v16

    .line 237
    .line 238
    aget v11, v13, v18

    .line 239
    .line 240
    invoke-virtual {v5, v9, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    aget v9, v13, v16

    .line 245
    .line 246
    aget v11, v13, v18

    .line 247
    .line 248
    invoke-virtual {v5, v9, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 249
    .line 250
    .line 251
    :goto_5
    aget-object v9, v15, v8

    .line 252
    .line 253
    aget-object v11, v19, v8

    .line 254
    .line 255
    invoke-virtual {v9, v11, v5}, Lcom/google/android/material/shape/ShapePath;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 256
    .line 257
    .line 258
    if-eqz v4, :cond_b

    .line 259
    .line 260
    aget-object v9, v15, v8

    .line 261
    .line 262
    aget-object v11, v19, v8

    .line 263
    .line 264
    invoke-interface {v4, v9, v11, v8}, Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;->b(Lcom/google/android/material/shape/ShapePath;Landroid/graphics/Matrix;I)V

    .line 265
    .line 266
    .line 267
    :cond_b
    add-int/lit8 v9, v8, 0x1

    .line 268
    .line 269
    rem-int/lit8 v11, v9, 0x4

    .line 270
    .line 271
    aget-object v12, v15, v8

    .line 272
    .line 273
    iget v14, v12, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 274
    .line 275
    aput v14, v13, v16

    .line 276
    .line 277
    iget v12, v12, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 278
    .line 279
    const/16 v18, 0x1

    .line 280
    .line 281
    aput v12, v13, v18

    .line 282
    .line 283
    aget-object v12, v19, v8

    .line 284
    .line 285
    invoke-virtual {v12, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 286
    .line 287
    .line 288
    aget-object v12, v15, v11

    .line 289
    .line 290
    iget v14, v12, Lcom/google/android/material/shape/ShapePath;->a:F

    .line 291
    .line 292
    iget-object v3, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->i:[F

    .line 293
    .line 294
    aput v14, v3, v16

    .line 295
    .line 296
    iget v12, v12, Lcom/google/android/material/shape/ShapePath;->b:F

    .line 297
    .line 298
    aput v12, v3, v18

    .line 299
    .line 300
    aget-object v12, v19, v11

    .line 301
    .line 302
    invoke-virtual {v12, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 303
    .line 304
    .line 305
    aget v12, v13, v16

    .line 306
    .line 307
    aget v14, v3, v16

    .line 308
    .line 309
    sub-float/2addr v12, v14

    .line 310
    move/from16 v20, v9

    .line 311
    .line 312
    move-object v14, v10

    .line 313
    float-to-double v9, v12

    .line 314
    aget v12, v13, v18

    .line 315
    .line 316
    aget v3, v3, v18

    .line 317
    .line 318
    sub-float/2addr v12, v3

    .line 319
    move-object/from16 v21, v14

    .line 320
    .line 321
    move-object v3, v15

    .line 322
    float-to-double v14, v12

    .line 323
    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->hypot(DD)D

    .line 324
    .line 325
    .line 326
    move-result-wide v9

    .line 327
    double-to-float v9, v9

    .line 328
    const v10, 0x3a83126f    # 0.001f

    .line 329
    .line 330
    .line 331
    sub-float/2addr v9, v10

    .line 332
    const/4 v10, 0x0

    .line 333
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    aget-object v12, v3, v8

    .line 338
    .line 339
    iget v14, v12, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 340
    .line 341
    aput v14, v13, v16

    .line 342
    .line 343
    iget v12, v12, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 344
    .line 345
    const/4 v14, 0x1

    .line 346
    aput v12, v13, v14

    .line 347
    .line 348
    aget-object v12, v19, v8

    .line 349
    .line 350
    invoke-virtual {v12, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 351
    .line 352
    .line 353
    if-eq v8, v14, :cond_c

    .line 354
    .line 355
    const/4 v12, 0x3

    .line 356
    if-eq v8, v12, :cond_c

    .line 357
    .line 358
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    .line 359
    .line 360
    .line 361
    move-result v12

    .line 362
    aget v15, v13, v14

    .line 363
    .line 364
    sub-float/2addr v12, v15

    .line 365
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 366
    .line 367
    .line 368
    move-result v12

    .line 369
    goto :goto_6

    .line 370
    :cond_c
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    .line 371
    .line 372
    .line 373
    move-result v12

    .line 374
    aget v14, v13, v16

    .line 375
    .line 376
    sub-float/2addr v12, v14

    .line 377
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 378
    .line 379
    .line 380
    move-result v12

    .line 381
    :goto_6
    const/high16 v14, 0x43870000    # 270.0f

    .line 382
    .line 383
    iget-object v15, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->g:Lcom/google/android/material/shape/ShapePath;

    .line 384
    .line 385
    invoke-virtual {v15, v10, v10, v14, v10}, Lcom/google/android/material/shape/ShapePath;->e(FFFF)V

    .line 386
    .line 387
    .line 388
    const/4 v14, 0x1

    .line 389
    if-eq v8, v14, :cond_f

    .line 390
    .line 391
    const/4 v10, 0x2

    .line 392
    if-eq v8, v10, :cond_e

    .line 393
    .line 394
    const/4 v14, 0x3

    .line 395
    if-eq v8, v14, :cond_d

    .line 396
    .line 397
    iget-object v10, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->j:Lcom/google/android/material/shape/EdgeTreatment;

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_d
    iget-object v10, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->i:Lcom/google/android/material/shape/EdgeTreatment;

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_e
    const/4 v14, 0x3

    .line 404
    iget-object v10, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->l:Lcom/google/android/material/shape/EdgeTreatment;

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_f
    const/4 v14, 0x3

    .line 408
    iget-object v10, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->k:Lcom/google/android/material/shape/EdgeTreatment;

    .line 409
    .line 410
    :goto_7
    invoke-virtual {v10, v9, v12, v2, v15}, Lcom/google/android/material/shape/EdgeTreatment;->c(FFFLcom/google/android/material/shape/ShapePath;)V

    .line 411
    .line 412
    .line 413
    iget-object v9, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->j:Landroid/graphics/Path;

    .line 414
    .line 415
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 416
    .line 417
    .line 418
    aget-object v12, v21, v8

    .line 419
    .line 420
    invoke-virtual {v15, v12, v9}, Lcom/google/android/material/shape/ShapePath;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 421
    .line 422
    .line 423
    iget-boolean v12, v0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->l:Z

    .line 424
    .line 425
    if-eqz v12, :cond_10

    .line 426
    .line 427
    invoke-virtual {v10}, Lcom/google/android/material/shape/EdgeTreatment;->a()Z

    .line 428
    .line 429
    .line 430
    move-result v10

    .line 431
    if-nez v10, :cond_11

    .line 432
    .line 433
    invoke-virtual {v0, v9, v8}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->c(Landroid/graphics/Path;I)Z

    .line 434
    .line 435
    .line 436
    move-result v10

    .line 437
    if-nez v10, :cond_11

    .line 438
    .line 439
    invoke-virtual {v0, v9, v11}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->c(Landroid/graphics/Path;I)Z

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    if-eqz v10, :cond_10

    .line 444
    .line 445
    goto :goto_8

    .line 446
    :cond_10
    const/16 v18, 0x1

    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_11
    :goto_8
    sget-object v10, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 450
    .line 451
    invoke-virtual {v9, v9, v7, v10}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 452
    .line 453
    .line 454
    iget v9, v15, Lcom/google/android/material/shape/ShapePath;->a:F

    .line 455
    .line 456
    aput v9, v13, v16

    .line 457
    .line 458
    iget v9, v15, Lcom/google/android/material/shape/ShapePath;->b:F

    .line 459
    .line 460
    const/16 v18, 0x1

    .line 461
    .line 462
    aput v9, v13, v18

    .line 463
    .line 464
    aget-object v9, v21, v8

    .line 465
    .line 466
    invoke-virtual {v9, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 467
    .line 468
    .line 469
    aget v9, v13, v16

    .line 470
    .line 471
    aget v10, v13, v18

    .line 472
    .line 473
    invoke-virtual {v6, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 474
    .line 475
    .line 476
    aget-object v9, v21, v8

    .line 477
    .line 478
    invoke-virtual {v15, v9, v6}, Lcom/google/android/material/shape/ShapePath;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 479
    .line 480
    .line 481
    goto :goto_a

    .line 482
    :goto_9
    aget-object v9, v21, v8

    .line 483
    .line 484
    invoke-virtual {v15, v9, v5}, Lcom/google/android/material/shape/ShapePath;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 485
    .line 486
    .line 487
    :goto_a
    if-eqz v4, :cond_12

    .line 488
    .line 489
    aget-object v9, v21, v8

    .line 490
    .line 491
    invoke-interface {v4, v15, v9, v8}, Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;->a(Lcom/google/android/material/shape/ShapePath;Landroid/graphics/Matrix;I)V

    .line 492
    .line 493
    .line 494
    :cond_12
    move-object v15, v3

    .line 495
    move/from16 v8, v20

    .line 496
    .line 497
    move-object/from16 v10, v21

    .line 498
    .line 499
    const/4 v14, 0x4

    .line 500
    move-object/from16 v3, p3

    .line 501
    .line 502
    goto/16 :goto_4

    .line 503
    .line 504
    :cond_13
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v6}, Landroid/graphics/Path;->isEmpty()Z

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    if-nez v1, :cond_14

    .line 515
    .line 516
    sget-object v1, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 517
    .line 518
    invoke-virtual {v5, v6, v1}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 519
    .line 520
    .line 521
    :cond_14
    return-void
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
.end method

.method public final c(Landroid/graphics/Path;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->k:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a:[Lcom/google/android/material/shape/ShapePath;

    .line 7
    .line 8
    aget-object v1, v1, p2

    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->b:[Landroid/graphics/Matrix;

    .line 11
    .line 12
    aget-object p2, v2, p2

    .line 13
    .line 14
    invoke-virtual {v1, p2, v0}, Lcom/google/android/material/shape/ShapePath;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/high16 v0, 0x3f800000    # 1.0f

    .line 48
    .line 49
    cmpl-float p1, p1, v0

    .line 50
    .line 51
    if-lez p1, :cond_0

    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    cmpl-float p1, p1, v0

    .line 58
    .line 59
    if-lez p1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 p1, 0x0

    .line 63
    return p1

    .line 64
    :cond_1
    :goto_0
    return v1
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method
