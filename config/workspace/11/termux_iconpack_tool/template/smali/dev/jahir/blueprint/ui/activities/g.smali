.class public final synthetic Ldev/jahir/blueprint/ui/activities/g;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/p;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldev/jahir/blueprint/ui/activities/g;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/ui/activities/g;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lt4/h;

    .line 7
    .line 8
    check-cast p2, Lt4/f;

    .line 9
    .line 10
    const-string v0, "acc"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "element"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2}, Lt4/f;->getKey()Lt4/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Lt4/h;->minusKey(Lt4/g;)Lt4/h;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v0, Lt4/i;->h:Lt4/i;

    .line 29
    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    sget-object v1, Lt4/d;->h:Lt4/d;

    .line 34
    .line 35
    invoke-interface {p1, v1}, Lt4/h;->get(Lt4/g;)Lt4/f;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lt4/e;

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    new-instance v0, Lt4/b;

    .line 44
    .line 45
    invoke-direct {v0, p2, p1}, Lt4/b;-><init>(Lt4/f;Lt4/h;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    move-object p2, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-interface {p1, v1}, Lt4/h;->minusKey(Lt4/g;)Lt4/h;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_2

    .line 55
    .line 56
    new-instance p1, Lt4/b;

    .line 57
    .line 58
    invoke-direct {p1, v2, p2}, Lt4/b;-><init>(Lt4/f;Lt4/h;)V

    .line 59
    .line 60
    .line 61
    move-object p2, p1

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v0, Lt4/b;

    .line 64
    .line 65
    new-instance v1, Lt4/b;

    .line 66
    .line 67
    invoke-direct {v1, p2, p1}, Lt4/b;-><init>(Lt4/f;Lt4/h;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v2, v1}, Lt4/b;-><init>(Lt4/f;Lt4/h;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_1
    return-object p2

    .line 75
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 76
    .line 77
    check-cast p2, Lt4/f;

    .line 78
    .line 79
    const-string v0, "acc"

    .line 80
    .line 81
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v0, "element"

    .line 85
    .line 86
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_3

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p1, ", "

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_2
    return-object p1

    .line 121
    :pswitch_1
    check-cast p1, Ls5/y;

    .line 122
    .line 123
    check-cast p2, Lt4/f;

    .line 124
    .line 125
    instance-of v0, p2, Ls5/v;

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    check-cast p2, Ls5/v;

    .line 130
    .line 131
    iget-object v0, p1, Ls5/y;->a:Lt4/h;

    .line 132
    .line 133
    invoke-virtual {p2, v0}, Ls5/v;->e(Lt4/h;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v1, p1, Ls5/y;->b:[Ljava/lang/Object;

    .line 138
    .line 139
    iget v2, p1, Ls5/y;->d:I

    .line 140
    .line 141
    aput-object v0, v1, v2

    .line 142
    .line 143
    iget-object v0, p1, Ls5/y;->c:[Ls5/v;

    .line 144
    .line 145
    add-int/lit8 v1, v2, 0x1

    .line 146
    .line 147
    iput v1, p1, Ls5/y;->d:I

    .line 148
    .line 149
    aput-object p2, v0, v2

    .line 150
    .line 151
    :cond_4
    return-object p1

    .line 152
    :pswitch_2
    check-cast p1, Ls5/v;

    .line 153
    .line 154
    check-cast p2, Lt4/f;

    .line 155
    .line 156
    if-eqz p1, :cond_5

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    instance-of p1, p2, Ls5/v;

    .line 160
    .line 161
    if-eqz p1, :cond_6

    .line 162
    .line 163
    move-object p1, p2

    .line 164
    check-cast p1, Ls5/v;

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_6
    const/4 p1, 0x0

    .line 168
    :goto_3
    return-object p1

    .line 169
    :pswitch_3
    check-cast p2, Lt4/f;

    .line 170
    .line 171
    instance-of v0, p2, Ls5/v;

    .line 172
    .line 173
    if-eqz v0, :cond_a

    .line 174
    .line 175
    instance-of v0, p1, Ljava/lang/Integer;

    .line 176
    .line 177
    if-eqz v0, :cond_7

    .line 178
    .line 179
    check-cast p1, Ljava/lang/Integer;

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_7
    const/4 p1, 0x0

    .line 183
    :goto_4
    const/4 v0, 0x1

    .line 184
    if-eqz p1, :cond_8

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    goto :goto_5

    .line 191
    :cond_8
    const/4 p1, 0x1

    .line 192
    :goto_5
    if-nez p1, :cond_9

    .line 193
    .line 194
    move-object p1, p2

    .line 195
    goto :goto_6

    .line 196
    :cond_9
    add-int/2addr p1, v0

    .line 197
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    :cond_a
    :goto_6
    return-object p1

    .line 202
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    check-cast p2, Lt4/f;

    .line 209
    .line 210
    add-int/lit8 p1, p1, 0x1

    .line 211
    .line 212
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    return-object p1

    .line 217
    :pswitch_5
    check-cast p1, Lt4/h;

    .line 218
    .line 219
    check-cast p2, Lt4/f;

    .line 220
    .line 221
    invoke-interface {p1, p2}, Lt4/h;->plus(Lt4/h;)Lt4/h;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    return-object p1

    .line 226
    :pswitch_6
    check-cast p1, Lt4/h;

    .line 227
    .line 228
    check-cast p2, Lt4/f;

    .line 229
    .line 230
    invoke-interface {p1, p2}, Lt4/h;->plus(Lt4/h;)Lt4/h;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    return-object p1

    .line 235
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 238
    .line 239
    .line 240
    check-cast p2, Lt4/f;

    .line 241
    .line 242
    return-object p1

    .line 243
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    check-cast p2, Ldev/jahir/frames/data/models/Wallpaper;

    .line 250
    .line 251
    invoke-static {p1, p2}, Ldev/jahir/frames/ui/adapters/WallpapersAdapter;->a(ZLdev/jahir/frames/data/models/Wallpaper;)Lp4/k;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    return-object p1

    .line 256
    :pswitch_9
    check-cast p1, Ldev/jahir/frames/data/models/Wallpaper;

    .line 257
    .line 258
    check-cast p2, Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;

    .line 259
    .line 260
    invoke-static {p1, p2}, Ldev/jahir/frames/ui/adapters/WallpapersAdapter;->b(Ldev/jahir/frames/data/models/Wallpaper;Ldev/jahir/frames/ui/viewholders/WallpaperViewHolder;)Lp4/k;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    return-object p1

    .line 265
    :pswitch_a
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 266
    .line 267
    check-cast p2, Landroidx/fragment/app/q0;

    .line 268
    .line 269
    invoke-static {p1, p2}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->o(Lcom/google/android/material/card/MaterialCardView;Landroidx/fragment/app/q0;)Lb0/j;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    return-object p1

    .line 274
    :pswitch_b
    check-cast p1, Landroid/content/DialogInterface;

    .line 275
    .line 276
    check-cast p2, Ljava/lang/Integer;

    .line 277
    .line 278
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    invoke-static {p1, p2}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->v(Landroid/content/DialogInterface;I)Lp4/k;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    return-object p1

    .line 287
    :pswitch_c
    check-cast p1, Landroid/content/DialogInterface;

    .line 288
    .line 289
    check-cast p2, Ljava/lang/Integer;

    .line 290
    .line 291
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    invoke-static {p1, p2}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->l(Landroid/content/DialogInterface;I)Lp4/k;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    return-object p1

    .line 300
    :pswitch_d
    check-cast p1, Landroid/content/DialogInterface;

    .line 301
    .line 302
    check-cast p2, Ljava/lang/Integer;

    .line 303
    .line 304
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result p2

    .line 308
    invoke-static {p1, p2}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->c(Landroid/content/DialogInterface;I)Lp4/k;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    return-object p1

    .line 313
    :pswitch_e
    check-cast p1, Landroid/content/DialogInterface;

    .line 314
    .line 315
    check-cast p2, Ljava/lang/Integer;

    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 318
    .line 319
    .line 320
    move-result p2

    .line 321
    invoke-static {p1, p2}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->q(Landroid/content/DialogInterface;I)Lp4/k;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    return-object p1

    .line 326
    :pswitch_f
    check-cast p1, Landroid/content/DialogInterface;

    .line 327
    .line 328
    check-cast p2, Ljava/lang/Integer;

    .line 329
    .line 330
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result p2

    .line 334
    invoke-static {p1, p2}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->r(Landroid/content/DialogInterface;I)Lp4/k;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    return-object p1

    .line 339
    :pswitch_10
    check-cast p1, Landroid/content/DialogInterface;

    .line 340
    .line 341
    check-cast p2, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result p2

    .line 347
    invoke-static {p1, p2}, Ldev/jahir/frames/extensions/fragments/MaterialDialogKt;->e(Landroid/content/DialogInterface;I)Lp4/k;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    return-object p1

    .line 352
    :pswitch_11
    check-cast p1, Landroid/content/DialogInterface;

    .line 353
    .line 354
    check-cast p2, Ljava/lang/Integer;

    .line 355
    .line 356
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 357
    .line 358
    .line 359
    move-result p2

    .line 360
    invoke-static {p1, p2}, Ldev/jahir/blueprint/ui/activities/IconsCategoryActivity;->v(Landroid/content/DialogInterface;I)Lp4/k;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    return-object p1

    .line 365
    :pswitch_12
    check-cast p1, Landroid/content/DialogInterface;

    .line 366
    .line 367
    check-cast p2, Ljava/lang/Integer;

    .line 368
    .line 369
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 370
    .line 371
    .line 372
    move-result p2

    .line 373
    invoke-static {p1, p2}, Ldev/jahir/blueprint/ui/activities/BlueprintActivity;->s0(Landroid/content/DialogInterface;I)Lp4/k;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    return-object p1

    .line 378
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
