.class public final Lg2/o;
.super Le6/d;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final g:Landroid/graphics/Path;

.field public final h:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/graphics/Path;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg2/o;->g:Landroid/graphics/Path;

    .line 10
    .line 11
    new-instance v1, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lg2/o;->h:Landroid/graphics/Matrix;

    .line 17
    .line 18
    new-instance v2, Landroid/graphics/PathMeasure;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, p1, v3}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/graphics/PathMeasure;->getLength()F

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v5, 0x2

    .line 29
    new-array v5, v5, [F

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-virtual {v2, v4, v5, v6}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 33
    .line 34
    .line 35
    aget v4, v5, v3

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    aget v8, v5, v7

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    invoke-virtual {v2, v9, v5, v6}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 42
    .line 43
    .line 44
    aget v2, v5, v3

    .line 45
    .line 46
    aget v3, v5, v7

    .line 47
    .line 48
    cmpl-float v5, v2, v4

    .line 49
    .line 50
    if-nez v5, :cond_1

    .line 51
    .line 52
    cmpl-float v5, v3, v8

    .line 53
    .line 54
    if-eqz v5, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    const-string v0, "pattern must not end at the starting point"

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_1
    :goto_0
    neg-float v5, v2

    .line 66
    neg-float v6, v3

    .line 67
    invoke-virtual {v1, v5, v6}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 68
    .line 69
    .line 70
    sub-float/2addr v4, v2

    .line 71
    sub-float/2addr v8, v3

    .line 72
    mul-float v2, v4, v4

    .line 73
    .line 74
    mul-float v3, v8, v8

    .line 75
    .line 76
    add-float/2addr v3, v2

    .line 77
    float-to-double v2, v3

    .line 78
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    double-to-float v2, v2

    .line 83
    const/high16 v3, 0x3f800000    # 1.0f

    .line 84
    .line 85
    div-float/2addr v3, v2

    .line 86
    invoke-virtual {v1, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 87
    .line 88
    .line 89
    float-to-double v2, v8

    .line 90
    float-to-double v4, v4

    .line 91
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    neg-double v2, v2

    .line 96
    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    double-to-float v2, v2

    .line 101
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 105
    .line 106
    .line 107
    return-void
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


# virtual methods
.method public final r(FFFF)Landroid/graphics/Path;
    .locals 3

    .line 1
    sub-float/2addr p3, p1

    .line 2
    sub-float/2addr p4, p2

    .line 3
    mul-float v0, p3, p3

    .line 4
    .line 5
    mul-float v1, p4, p4

    .line 6
    .line 7
    add-float/2addr v1, v0

    .line 8
    float-to-double v0, v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    double-to-float v0, v0

    .line 14
    float-to-double v1, p4

    .line 15
    float-to-double p3, p3

    .line 16
    invoke-static {v1, v2, p3, p4}, Ljava/lang/Math;->atan2(DD)D

    .line 17
    .line 18
    .line 19
    move-result-wide p3

    .line 20
    iget-object v1, p0, Lg2/o;->h:Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 23
    .line 24
    .line 25
    invoke-static {p3, p4}, Ljava/lang/Math;->toDegrees(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide p3

    .line 29
    double-to-float p3, p3

    .line 30
    invoke-virtual {v1, p3}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 34
    .line 35
    .line 36
    new-instance p1, Landroid/graphics/Path;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Lg2/o;->g:Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-virtual {p2, v1, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 44
    .line 45
    .line 46
    return-object p1
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
    .line 163
    .line 164
    .line 165
    .line 166
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
.end method
