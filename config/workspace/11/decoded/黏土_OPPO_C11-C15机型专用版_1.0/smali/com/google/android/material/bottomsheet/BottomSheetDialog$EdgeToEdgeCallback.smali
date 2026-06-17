.class Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;
.super Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/bottomsheet/BottomSheetDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EdgeToEdgeCallback"
.end annotation


# instance fields
.field public final a:Ljava/lang/Boolean;

.field public final b:Lm0/c2;

.field public c:Landroid/view/Window;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Lm0/c2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->b:Lm0/c2;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iget-object p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    iget-object p2, p2, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 15
    .line 16
    iget-object p2, p2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->c:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p2, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-static {p1}, Lm0/k0;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :goto_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-static {p1}, Lcom/google/android/material/color/MaterialColors;->d(I)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->a:Ljava/lang/Boolean;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lcom/google/android/material/drawable/DrawableUtils;->d(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 p2, 0x0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move-object p1, p2

    .line 63
    :goto_1
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p1}, Lcom/google/android/material/color/MaterialColors;->d(I)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->a:Ljava/lang/Boolean;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    iput-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->a:Ljava/lang/Boolean;

    .line 81
    .line 82
    return-void
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
.method public final a(Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->b:Lm0/c2;

    .line 6
    .line 7
    invoke-virtual {v1}, Lm0/c2;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/16 v3, 0x17

    .line 12
    .line 13
    const/16 v4, 0x1a

    .line 14
    .line 15
    const/16 v5, 0x1e

    .line 16
    .line 17
    if-ge v0, v2, :cond_5

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->c:Landroid/view/Window;

    .line 20
    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->a:Ljava/lang/Boolean;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    iget-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->d:Z

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    :goto_0
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    new-instance v7, Lk6/f;

    .line 39
    .line 40
    const/4 v8, 0x2

    .line 41
    invoke-direct {v7, v6, v8}, Lk6/f;-><init>(Landroid/view/View;I)V

    .line 42
    .line 43
    .line 44
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    if-lt v6, v5, :cond_1

    .line 47
    .line 48
    new-instance v3, Lm0/h2;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/google/android/gms/common/api/a;->m(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-direct {v3, v4, v7}, Lm0/h2;-><init>(Landroid/view/WindowInsetsController;Lk6/f;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, v3, Lm0/h2;->o:Landroid/view/Window;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    if-lt v6, v4, :cond_2

    .line 61
    .line 62
    new-instance v3, Lm0/f2;

    .line 63
    .line 64
    invoke-direct {v3, v0, v7}, Lm0/d2;-><init>(Landroid/view/Window;Lk6/f;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    if-lt v6, v3, :cond_3

    .line 69
    .line 70
    new-instance v3, Lm0/e2;

    .line 71
    .line 72
    invoke-direct {v3, v0, v7}, Lm0/d2;-><init>(Landroid/view/Window;Lk6/f;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    new-instance v3, Lm0/d2;

    .line 77
    .line 78
    invoke-direct {v3, v0, v7}, Lm0/d2;-><init>(Landroid/view/Window;Lk6/f;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-virtual {v3, v2}, Lq3/a;->W(Z)V

    .line 82
    .line 83
    .line 84
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {v1}, Lm0/c2;->d()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    sub-int/2addr v1, v2

    .line 97
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_a

    .line 114
    .line 115
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->c:Landroid/view/Window;

    .line 116
    .line 117
    if-eqz v0, :cond_9

    .line 118
    .line 119
    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->d:Z

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    new-instance v6, Lk6/f;

    .line 126
    .line 127
    const/4 v7, 0x2

    .line 128
    invoke-direct {v6, v2, v7}, Lk6/f;-><init>(Landroid/view/View;I)V

    .line 129
    .line 130
    .line 131
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    if-lt v2, v5, :cond_6

    .line 134
    .line 135
    new-instance v2, Lm0/h2;

    .line 136
    .line 137
    invoke-static {v0}, Lcom/google/android/gms/common/api/a;->m(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-direct {v2, v3, v6}, Lm0/h2;-><init>(Landroid/view/WindowInsetsController;Lk6/f;)V

    .line 142
    .line 143
    .line 144
    iput-object v0, v2, Lm0/h2;->o:Landroid/view/Window;

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    if-lt v2, v4, :cond_7

    .line 148
    .line 149
    new-instance v2, Lm0/f2;

    .line 150
    .line 151
    invoke-direct {v2, v0, v6}, Lm0/d2;-><init>(Landroid/view/Window;Lk6/f;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    if-lt v2, v3, :cond_8

    .line 156
    .line 157
    new-instance v2, Lm0/e2;

    .line 158
    .line 159
    invoke-direct {v2, v0, v6}, Lm0/d2;-><init>(Landroid/view/Window;Lk6/f;)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_8
    new-instance v2, Lm0/d2;

    .line 164
    .line 165
    invoke-direct {v2, v0, v6}, Lm0/d2;-><init>(Landroid/view/Window;Lk6/f;)V

    .line 166
    .line 167
    .line 168
    :goto_2
    invoke-virtual {v2, v1}, Lq3/a;->W(Z)V

    .line 169
    .line 170
    .line 171
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    const/4 v3, 0x0

    .line 184
    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 185
    .line 186
    .line 187
    :cond_a
    return-void
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

.method public final b(Landroid/view/Window;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->c:Landroid/view/Window;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->c:Landroid/view/Window;

    .line 7
    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lk6/f;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v1, v0, v2}, Lk6/f;-><init>(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v2, 0x1e

    .line 23
    .line 24
    if-lt v0, v2, :cond_1

    .line 25
    .line 26
    new-instance v0, Lm0/h2;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/google/android/gms/common/api/a;->m(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-direct {v0, v2, v1}, Lm0/h2;-><init>(Landroid/view/WindowInsetsController;Lk6/f;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, Lm0/h2;->o:Landroid/view/Window;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/16 v2, 0x1a

    .line 39
    .line 40
    if-lt v0, v2, :cond_2

    .line 41
    .line 42
    new-instance v0, Lm0/f2;

    .line 43
    .line 44
    invoke-direct {v0, p1, v1}, Lm0/d2;-><init>(Landroid/view/Window;Lk6/f;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/16 v2, 0x17

    .line 49
    .line 50
    if-lt v0, v2, :cond_3

    .line 51
    .line 52
    new-instance v0, Lm0/e2;

    .line 53
    .line 54
    invoke-direct {v0, p1, v1}, Lm0/d2;-><init>(Landroid/view/Window;Lk6/f;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    new-instance v0, Lm0/d2;

    .line 59
    .line 60
    invoke-direct {v0, p1, v1}, Lm0/d2;-><init>(Landroid/view/Window;Lk6/f;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {v0}, Lq3/a;->L()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->d:Z

    .line 68
    .line 69
    :cond_4
    :goto_1
    return-void
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

.method public final onLayout(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->a(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onSlide(Landroid/view/View;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->a(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public final onStateChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialog$EdgeToEdgeCallback;->a(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
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
