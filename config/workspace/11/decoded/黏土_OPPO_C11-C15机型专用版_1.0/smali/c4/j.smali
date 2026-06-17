.class public final Lc4/j;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final h:Landroid/graphics/PointF;

.field public final synthetic i:Lcom/ortiz/touchview/TouchImageView;


# direct methods
.method public constructor <init>(Lcom/ortiz/touchview/TouchImageView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc4/j;->i:Lcom/ortiz/touchview/TouchImageView;

    .line 5
    .line 6
    new-instance p1, Landroid/graphics/PointF;

    .line 7
    .line 8
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lc4/j;->h:Landroid/graphics/PointF;

    .line 12
    .line 13
    return-void
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
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc4/j;->i:Lcom/ortiz/touchview/TouchImageView;

    .line 12
    .line 13
    iget-object v1, v0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    sget-object p1, Lc4/b;->h:Lc4/b;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lcom/ortiz/touchview/TouchImageView;->e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_0
    iget-boolean v2, v0, Lcom/ortiz/touchview/TouchImageView;->k:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-object v2, v0, Lcom/ortiz/touchview/TouchImageView;->O:Landroid/view/ScaleGestureDetector;

    .line 33
    .line 34
    invoke-virtual {v2, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, v0, Lcom/ortiz/touchview/TouchImageView;->P:Landroid/view/GestureDetector;

    .line 38
    .line 39
    invoke-virtual {v2, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 40
    .line 41
    .line 42
    new-instance v2, Landroid/graphics/PointF;

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 53
    .line 54
    .line 55
    iget-object v3, v0, Lcom/ortiz/touchview/TouchImageView;->q:Lc4/b;

    .line 56
    .line 57
    sget-object v4, Lc4/b;->h:Lc4/b;

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    if-eq v3, v4, :cond_2

    .line 61
    .line 62
    sget-object v6, Lc4/b;->i:Lc4/b;

    .line 63
    .line 64
    if-eq v3, v6, :cond_2

    .line 65
    .line 66
    sget-object v6, Lc4/b;->k:Lc4/b;

    .line 67
    .line 68
    if-ne v3, v6, :cond_9

    .line 69
    .line 70
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    iget-object v6, p0, Lc4/j;->h:Landroid/graphics/PointF;

    .line 75
    .line 76
    if-eqz v3, :cond_7

    .line 77
    .line 78
    if-eq v3, v5, :cond_6

    .line 79
    .line 80
    const/4 v7, 0x2

    .line 81
    if-eq v3, v7, :cond_3

    .line 82
    .line 83
    const/4 v2, 0x6

    .line 84
    if-eq v3, v2, :cond_6

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    iget-object v3, v0, Lcom/ortiz/touchview/TouchImageView;->q:Lc4/b;

    .line 88
    .line 89
    sget-object v4, Lc4/b;->i:Lc4/b;

    .line 90
    .line 91
    if-ne v3, v4, :cond_9

    .line 92
    .line 93
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 94
    .line 95
    iget v4, v6, Landroid/graphics/PointF;->x:F

    .line 96
    .line 97
    sub-float/2addr v3, v4

    .line 98
    iget v4, v2, Landroid/graphics/PointF;->y:F

    .line 99
    .line 100
    iget v7, v6, Landroid/graphics/PointF;->y:F

    .line 101
    .line 102
    sub-float/2addr v4, v7

    .line 103
    iget v7, v0, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 104
    .line 105
    int-to-float v7, v7

    .line 106
    invoke-static {v0}, Lcom/ortiz/touchview/TouchImageView;->d(Lcom/ortiz/touchview/TouchImageView;)F

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    const/4 v9, 0x0

    .line 111
    cmpg-float v7, v8, v7

    .line 112
    .line 113
    if-gtz v7, :cond_4

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    :cond_4
    iget v7, v0, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 117
    .line 118
    int-to-float v7, v7

    .line 119
    invoke-static {v0}, Lcom/ortiz/touchview/TouchImageView;->b(Lcom/ortiz/touchview/TouchImageView;)F

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    cmpg-float v7, v8, v7

    .line 124
    .line 125
    if-gtz v7, :cond_5

    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    :cond_5
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/ortiz/touchview/TouchImageView;->h()V

    .line 132
    .line 133
    .line 134
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 135
    .line 136
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 137
    .line 138
    invoke-virtual {v6, v3, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_6
    invoke-static {v0, v4}, Lcom/ortiz/touchview/TouchImageView;->e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_7
    invoke-virtual {v6, v2}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 147
    .line 148
    .line 149
    iget-object v2, v0, Lcom/ortiz/touchview/TouchImageView;->A:Lc4/h;

    .line 150
    .line 151
    if-eqz v2, :cond_8

    .line 152
    .line 153
    iget-object v3, v2, Lc4/h;->k:Lcom/ortiz/touchview/TouchImageView;

    .line 154
    .line 155
    invoke-static {v3, v4}, Lcom/ortiz/touchview/TouchImageView;->e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V

    .line 156
    .line 157
    .line 158
    iget-object v2, v2, Lc4/h;->h:La1/q;

    .line 159
    .line 160
    iget-object v2, v2, La1/q;->i:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, Landroid/widget/OverScroller;

    .line 163
    .line 164
    invoke-virtual {v2, v5}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 165
    .line 166
    .line 167
    :cond_8
    sget-object v2, Lc4/b;->i:Lc4/b;

    .line 168
    .line 169
    invoke-static {v0, v2}, Lcom/ortiz/touchview/TouchImageView;->e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V

    .line 170
    .line 171
    .line 172
    :cond_9
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v0, Lcom/ortiz/touchview/TouchImageView;->R:Landroid/view/View$OnTouchListener;

    .line 176
    .line 177
    if-eqz v0, :cond_a

    .line 178
    .line 179
    invoke-interface {v0, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 180
    .line 181
    .line 182
    :cond_a
    return v5
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
.end method
